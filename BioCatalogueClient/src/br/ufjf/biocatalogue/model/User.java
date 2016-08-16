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
package br.ufjf.biocatalogue.model;

/**
 *
 * @author phillipe
 */
public class User {
    private String name;
    private String affiliation;
    private String publicEmail;
    private String joined;
    private String self;
    private UserLocation userLocation;

    public User(){
        userLocation = new UserLocation();
        userLocation.setCountry("Uninformed");
        userLocation.setCity("Uninformed");
        userLocation.setCountryCode("Uninformed");
        userLocation.setFlagImagePNG("Uninformed");
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the affiliation
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * @param affiliation the affiliation to set
     */
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    /**
     * @return the public_email
     */
    public String getPublicEmail() {
        return publicEmail;
    }

    /**
     * @param public_email the public_email to set
     */
    public void setPublicEmail(String public_email) {
        this.publicEmail = public_email;
    }

    /**
     * @return the joined
     */
    public String getJoined() {
        return joined;
    }

    /**
     * @param joined the joined to set
     */
    public void setJoined(String joined) {
        this.joined = joined;
    }

    /**
     * @return the self
     */
    public String getSelf() {
        return self;
    }

    /**
     * @param self the self to set
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * @return the userLocation
     */
    public UserLocation getUserLocation() {
        return userLocation;
    }

    /**
     * @param userLocation the userLocation to set
     */
    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }
}
