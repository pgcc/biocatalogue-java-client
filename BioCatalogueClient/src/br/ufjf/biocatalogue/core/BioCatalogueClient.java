/*
 * The MIT License
 *
 * Copyright 2014 Pós-Graduação em Ciência da Computação UFJF.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.ufjf.biocatalogue.core;

import br.ufjf.biocatalogue.exception.BioCatalogueException;
import br.ufjf.biocatalogue.model.Search;
import br.ufjf.biocatalogue.model.SearchResult;
import br.ufjf.biocatalogue.model.ServiceData;
import br.ufjf.biocatalogue.model.User;
import com.google.gson.Gson;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author vitorfs
 */
public class BioCatalogueClient extends BioCatalogueBaseClient implements BioCatalogueServices,Serializable {

    @Override
    public Search search(String q) throws BioCatalogueException {
        String url = "/search?q=" + q;
        HttpURLConnection response = request(url, "GET", 200, "application/json");
        String content = parseResponse(response);
        SearchResult result = new Gson().fromJson(content, SearchResult.class);
        return result.getSearch();
    }
    
    /**
     * From a serviceId returns data from a web service
     * @param serviceId
     * @return
     * @throws BioCatalogueException
     * @throws ParseException 
     */
    public ServiceData serviceData(String serviceId) throws BioCatalogueException, ParseException{
        String url = "/services/" + serviceId;
        HttpURLConnection response = request(url, "GET", 200, "application/json");
        String content = parseResponse(response);
        JSONObject jsonPrimaryLevel = null;
        try {
            jsonPrimaryLevel = (JSONObject) new JSONParser().parse(content);
        } catch (ParseException ex) {
            Logger.getLogger(BioCatalogueClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //adding service data
        Object serviceData = jsonPrimaryLevel.get("service");
        JSONObject jsonSecondLevel = (JSONObject) serviceData;
        ServiceData sD = new ServiceData();        
        sD.setSubmitter((String) jsonSecondLevel.get("submitter"));
        sD.setTechnologyType((ArrayList) jsonSecondLevel.get("service_technology_types"));
        sD.setArchivedAt((String) jsonSecondLevel.get("archived_at"));        
        sD.setName((String) jsonSecondLevel.get("name"));
        sD.setDescription((String) jsonSecondLevel.get("description"));
        sD.setCreatedAt((String) jsonSecondLevel.get("created_at"));
        sD.setSelf((String) jsonSecondLevel.get("self"));
        
        //adding variants data
        Object variantsData = jsonSecondLevel.get("variants");
        if(variantsData != null){
            JSONArray jsonVariantsDataArray = (JSONArray) variantsData;
            JSONObject jsonVariantsData = (JSONObject) jsonVariantsDataArray.get(0);
            sD.getServiceVariants().setSubmitter((String) jsonVariantsData.get("submitter"));
            sD.getServiceVariants().setResource((String) jsonVariantsData.get("resource"));
            sD.getServiceVariants().setName((String) jsonVariantsData.get("name"));
            sD.getServiceVariants().setDescription((String) jsonVariantsData.get("description"));
            sD.getServiceVariants().setCreatedAt((String) jsonVariantsData.get("created_at"));
            sD.getServiceVariants().setWsdlLocation((String) jsonVariantsData.get("wsdl_location"));
            sD.getServiceVariants().setDocumentationUrl((String) jsonVariantsData.get("documentation_url"));
        }
        
        //adding last status data
        Object statusData = jsonSecondLevel.get("latest_monitoring_status");
        JSONObject jsonLatestStatus = (JSONObject) statusData;
        sD.getServiceLastStatus().setLabel((String) jsonLatestStatus.get("label"));
        sD.getServiceLastStatus().setSymbol((String) jsonLatestStatus.get("symbol"));
        sD.getServiceLastStatus().setLast_checked((String) jsonLatestStatus.get("last_checked"));
        sD.getServiceLastStatus().setSmall_symbol((String) jsonLatestStatus.get("small_symbol"));
        return sD;
    }
    
    /**
     *  Details about a specific bio-catalogue repositoy user
     * @param userId the user id
     * @return
     * @throws BioCatalogueException 
     */
    public User userData(String userId) throws BioCatalogueException, ParseException, org.json.simple.parser.ParseException {
        String url = "/users/" + userId;
        HttpURLConnection response = request(url, "GET", 200, "application/json");
        String content = parseResponse(response);
        JSONObject jsonPrimaryLevel = (JSONObject) new JSONParser().parse(content);
        
        //adding user data
        Object userData = jsonPrimaryLevel.get("user");
        JSONObject jsonSecondLevel = (JSONObject) userData; 
        User user = new User();        
        user.setName((String) jsonSecondLevel.get("name"));
        user.setAffiliation((String) jsonSecondLevel.get("affiliation"));
        user.setPublicEmail((String) jsonSecondLevel.get("public_email"));
        user.setJoined((String) jsonSecondLevel.get("joined"));        
        user.setSelf((String) jsonSecondLevel.get("self"));
        
        //adding location data
        Object userLocationData = jsonSecondLevel.get("location");
        JSONObject jsonLocationLevel = (JSONObject) userLocationData;
        user.getUserLocation().setCity((String) jsonLocationLevel.get("city"));
        user.getUserLocation().setCountry((String) jsonLocationLevel.get("country"));
        user.getUserLocation().setCountryCode((String) jsonLocationLevel.get("country_code"));
        user.getUserLocation().setFlagImagePNG(((String) jsonLocationLevel.get("flag")));
        return user;
    }
}