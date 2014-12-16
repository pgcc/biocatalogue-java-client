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
public class Search {
    
    private String search_query;
    private Integer current_page;
    private Integer per_page;
    private Integer pages;
    private Integer total;
    private ArrayList<Result> results;

    /**
     * @return the search_query
     */
    public String getSearch_query() {
        return search_query;
    }

    /**
     * @param search_query the search_query to set
     */
    public void setSearch_query(String search_query) {
        this.search_query = search_query;
    }

    /**
     * @return the current_page
     */
    public Integer getCurrent_page() {
        return current_page;
    }

    /**
     * @param current_page the current_page to set
     */
    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    /**
     * @return the per_page
     */
    public Integer getPer_page() {
        return per_page;
    }

    /**
     * @param per_page the per_page to set
     */
    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    /**
     * @return the pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return the results
     */
    public ArrayList<Result> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }
    
}
