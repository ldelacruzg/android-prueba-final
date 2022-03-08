package org.tensorflow.lite.examples.classification.Models;

public class GeoRectangle {
    Double West;
    Double East;
    Double North;
    Double South;

    public GeoRectangle() {
    }

    public GeoRectangle(Double west, Double east, Double north, Double south) {
        West = west;
        East = east;
        North = north;
        South = south;
    }

    public Double getWest() {
        return West;
    }

    public void setWest(Double west) {
        West = west;
    }

    public Double getEast() {
        return East;
    }

    public void setEast(Double east) {
        East = east;
    }

    public Double getNorth() {
        return North;
    }

    public void setNorth(Double north) {
        North = north;
    }

    public Double getSouth() {
        return South;
    }

    public void setSouth(Double south) {
        South = south;
    }
}
