/*
 * The MIT License
 *
 * Copyright 2016 Pós-Graduação em Ciência da Computação UFJF.
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
package br.ufjf.biocatalogue.sample;

import br.ufjf.biocatalogue.core.BioCatalogueClient;
import br.ufjf.biocatalogue.model.ServiceData;

/**
 *
 * @author phillipe
 */
public class ServiceSample {

    public static void main(String[] args) {

        BioCatalogueClient client = new BioCatalogueClient();
        client.setBaseUri("https://www.biocatalogue.org");

        try {
            //String id = "2736";
            String id = "2602";
            ServiceData serviceData = client.serviceData(id);
            System.out.println(serviceData.getArchivedAt());
            System.out.println(serviceData.getCreatedAt());
            System.out.println(serviceData.getDescription());
            System.out.println(serviceData.getName());
            System.out.println(serviceData.getSelf());
            System.out.println(serviceData.getServiceLastStatus().getLabel());
            System.out.println(serviceData.getServiceLastStatus().getSymbol());
            System.out.println(serviceData.getServiceLastStatus().getSmall_symbol());
            System.out.println(serviceData.getServiceLastStatus().getLast_checked());            
            System.out.println(serviceData.getSubmitter());
            System.out.println(serviceData.getTechnologyType().get(0).toString());
            System.out.println(serviceData.getUpdatedAt());
            System.out.println(serviceData.getServiceVariants().getCreatedAt());            
            System.out.println(serviceData.getServiceVariants().getDescription());            
            System.out.println(serviceData.getServiceVariants().getDocumentationUrl());            
            System.out.println(serviceData.getServiceVariants().getName());            
            System.out.println(serviceData.getServiceVariants().getResource());
            System.out.println(serviceData.getServiceVariants().getSubmitter());
            System.out.println(serviceData.getServiceVariants().getWsdlLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
