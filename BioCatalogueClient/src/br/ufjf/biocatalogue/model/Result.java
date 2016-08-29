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
package br.ufjf.biocatalogue.model;

import java.util.ArrayList;

/**
 *
 * @author vitorfs
 */
public class Result {

    private String name;
    private String description;
    private String submitter;
    private String created_at;
    private String archived_at;
    private String parameter_order;
    private ArrayList<String> service_technology_types;
    private MonitoringStatus latest_monitoring_status;
    private String resource;
    private double rating;
    private double time;
    private double ranking;    

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
     * @return the description
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
     * @return the submitter
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
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the archived_at
     */
    public String getArchived_at() {
        return archived_at;
    }

    /**
     * @param archived_at the archived_at to set
     */
    public void setArchived_at(String archived_at) {
        this.archived_at = archived_at;
    }

    /**
     * @return the service_technology_types
     */
    public ArrayList<String> getService_technology_types() {
        return service_technology_types;
    }

    /**
     * @param service_technology_types the service_technology_types to set
     */
    public void setService_technology_types(ArrayList<String> service_technology_types) {
        this.service_technology_types = service_technology_types;
    }

    /**
     * @return the resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * @param resource the resource to set
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * @return the latest_monitoring_status
     */
    public MonitoringStatus getLatest_monitoring_status() {
        return latest_monitoring_status;
    }

    /**
     * @param latest_monitoring_status the latest_monitoring_status to set
     */
    public void setLatest_monitoring_status(MonitoringStatus latest_monitoring_status) {
        this.latest_monitoring_status = latest_monitoring_status;
    }

    /**
     * @return the parameter_order
     */
    public String getParameter_order() {
        return parameter_order;
    }

    /**
     * @param parameter_order the parameter_order to set
     */
    public void setParameter_order(String parameter_order) {
        this.parameter_order = parameter_order;
    }

    /**
     * @return the rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * @return the ranking
     */
    public double getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
    
}
