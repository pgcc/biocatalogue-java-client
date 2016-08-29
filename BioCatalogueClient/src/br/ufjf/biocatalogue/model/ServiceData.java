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

import br.ufjf.biocatalogue.model.MonitoringStatus;
import java.util.ArrayList;

/**
 *
 * @author phillipe
 */
public class ServiceData {
    private String name;
    private String description;
    private String submitter;
    private String createdAt;
    private String updatedAt;
    private String archivedAt;
    private ArrayList technologyType;
    private String self;
    private MonitoringStatus serviceLastStatus;
    private ServiceVariants serviceVariants;

    /**
     * @return the name
     */
    
    public ServiceData(){
        serviceLastStatus = new MonitoringStatus();
        serviceVariants = new ServiceVariants();
        technologyType = new ArrayList<>();
    }
    
    /**
     * return the service name
     * @return 
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
     * @return it returns the service description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return it returns the service submitter
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * @param submitter the submitter to set
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * @return it returns the date that the service was created
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return it returns the date that the service was updated
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return it returns the date that the service was archived
     */
    public String getArchivedAt() {
        return archivedAt;
    }

    /**
     * @param archivedAt the archivedAt to set
     */
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
    }

    /**
     * @return the serviceLastStatus
     */
    public MonitoringStatus getServiceLastStatus() {
        return serviceLastStatus;
    }

    /**
     * @param serviceLastStatus the serviceLastStatus to set
     */
    public void setServiceLastStatus(MonitoringStatus serviceLastStatus) {
        this.serviceLastStatus = serviceLastStatus;
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
     * @return it returns a arrayList that contains the technology type was used 
     * (e.g.: SOAP, REST)
     */
    public ArrayList getTechnologyType() {
        return technologyType;
    }

    /**
     * @param technologyType the technologyType to set
     */
    public void setTechnologyType(ArrayList technologyType) {
        this.technologyType = technologyType;
    }

    /**
     * @return the serviceVariants
     */
    public ServiceVariants getServiceVariants() {
        return serviceVariants;
    }

    /**
     * @param serviceVariants the serviceVariants to set
     */
    public void setServiceVariants(ServiceVariants serviceVariants) {
        this.serviceVariants = serviceVariants;
    }
}
