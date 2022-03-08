package org.tensorflow.lite.examples.classification.Models;

import java.util.ArrayList;

public class Capital {
    String DLST;
    Integer TD;
    Integer Flg;
    String Name;
    ArrayList<Double> GeoPt;

    public Capital() {
    }

    public Capital(String DLST, Integer TD, Integer flg, String name, ArrayList<Double> geoPt) {
        this.DLST = DLST;
        this.TD = TD;
        Flg = flg;
        Name = name;
        GeoPt = geoPt;
    }

    public String getDLST() {
        return DLST;
    }

    public void setDLST(String DLST) {
        this.DLST = DLST;
    }

    public Integer getTD() {
        return TD;
    }

    public void setTD(Integer TD) {
        this.TD = TD;
    }

    public Integer getFlg() {
        return Flg;
    }

    public void setFlg(Integer flg) {
        Flg = flg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Double> getGeoPt() {
        return GeoPt;
    }

    public void setGeoPt(ArrayList<Double> geoPt) {
        GeoPt = geoPt;
    }
}
