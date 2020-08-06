package com.bogdan.tourguideapplication.ui.main;

public class Place {

    private String placeTitle;
    private String placeAddress;
    private String placeTypeKitchen;
    private String placeWorkTime;
    private String placeNumber;
    private String placeWebSite;
    private int placeImageResourceId;
    private String placePrice;


    public Place(String title, String address, String typeKitchen, String workTime, String number, String webSite, String price, int imageResourceId) {
        this.placeTitle = title;
        this.placePrice = price;
        this.placeAddress = address;
        this.placeTypeKitchen = typeKitchen;
        this.placeWorkTime = workTime;
        this.placeNumber = number;
        this.placeWebSite = webSite;
        this.placeImageResourceId = imageResourceId;
    }

    public Place(String title, String address, int imageResourceId, String number) {
        this.placeNumber = number;
        this.placeTitle = title;
        this.placeAddress = address;
        this.placeImageResourceId = imageResourceId;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlaceTypeKitchen() {
        return placeTypeKitchen;
    }

    public String getPlaceWorkTime() {
        return placeWorkTime;
    }

    public String getPlaceNumber() {
        return placeNumber;
    }

    public String getPlaceWebSite() {
        return placeWebSite;
    }

    public int getPlaceImageResourceId() {
        return placeImageResourceId;
    }

    public String getPlacePrice() {
        return placePrice;
    }
}
