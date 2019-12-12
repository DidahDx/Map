package com.didahdx.googlemaps.models;

import android.net.Uri;

public class PlacesInfo {

    private String name;
    private String address;
    private String phoneNumber;
    private String id;
    private String attributions;
    private Uri websiteuri;
    private float rating;

    public PlacesInfo(String name, String address, String phoneNumber, String id,
                      String attributions, Uri websiteuri, float rating) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.attributions = attributions;
        this.websiteuri = websiteuri;
        this.rating = rating;
    }

     public PlacesInfo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }

    public Uri getWebsiteuri() {
        return websiteuri;
    }

    public void setWebsiteuri(Uri websiteuri) {
        this.websiteuri = websiteuri;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "PlacesInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id='" + id + '\'' +
                ", attributions='" + attributions + '\'' +
                ", websiteuri=" + websiteuri +
                ", rating=" + rating +
                '}';
    }
}
