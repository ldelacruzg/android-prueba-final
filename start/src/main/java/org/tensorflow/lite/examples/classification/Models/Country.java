package org.tensorflow.lite.examples.classification.Models;

import java.util.ArrayList;

public class Country {
    String Name;
    Capital Capital;
    GeoRectangle GeoRectangle;
    Integer SeqID;
    ArrayList<Double> GeoPt;
    Integer TelPref;
    CountryCodes CountryCodes;
    String CountryInfo;

    public Country() {
    }

    public Country(String name, org.tensorflow.lite.examples.classification.Models.Capital capital, org.tensorflow.lite.examples.classification.Models.GeoRectangle geoRectangle, Integer seqID, ArrayList<Double> geoPt, Integer telPref, org.tensorflow.lite.examples.classification.Models.CountryCodes countryCodes, String countryInfo) {
        Name = name;
        Capital = capital;
        GeoRectangle = geoRectangle;
        SeqID = seqID;
        GeoPt = geoPt;
        TelPref = telPref;
        CountryCodes = countryCodes;
        CountryInfo = countryInfo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public org.tensorflow.lite.examples.classification.Models.Capital getCapital() {
        return Capital;
    }

    public void setCapital(org.tensorflow.lite.examples.classification.Models.Capital capital) {
        Capital = capital;
    }

    public org.tensorflow.lite.examples.classification.Models.GeoRectangle getGeoRectangle() {
        return GeoRectangle;
    }

    public void setGeoRectangle(org.tensorflow.lite.examples.classification.Models.GeoRectangle geoRectangle) {
        GeoRectangle = geoRectangle;
    }

    public Integer getSeqID() {
        return SeqID;
    }

    public void setSeqID(Integer seqID) {
        SeqID = seqID;
    }

    public ArrayList<Double> getGeoPt() {
        return GeoPt;
    }

    public void setGeoPt(ArrayList<Double> geoPt) {
        GeoPt = geoPt;
    }

    public Integer getTelPref() {
        return TelPref;
    }

    public void setTelPref(Integer telPref) {
        TelPref = telPref;
    }

    public org.tensorflow.lite.examples.classification.Models.CountryCodes getCountryCodes() {
        return CountryCodes;
    }

    public void setCountryCodes(org.tensorflow.lite.examples.classification.Models.CountryCodes countryCodes) {
        CountryCodes = countryCodes;
    }

    public String getCountryInfo() {
        return CountryInfo;
    }

    public void setCountryInfo(String countryInfo) {
        CountryInfo = countryInfo;
    }
}
