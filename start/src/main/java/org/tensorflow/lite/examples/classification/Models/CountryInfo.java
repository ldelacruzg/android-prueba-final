package org.tensorflow.lite.examples.classification.Models;

public class CountryInfo {
    String StatusMsg;
    Country Results;
    Integer StatusCode;

    public CountryInfo() {
    }

    public CountryInfo(String statusMsg, Country results, Integer statusCode) {
        StatusMsg = statusMsg;
        Results = results;
        StatusCode = statusCode;
    }

    public String getStatusMsg() {
        return StatusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        StatusMsg = statusMsg;
    }

    public Country getResults() {
        return Results;
    }

    public void setResults(Country results) {
        Results = results;
    }

    public Integer getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(Integer statusCode) {
        StatusCode = statusCode;
    }
}
