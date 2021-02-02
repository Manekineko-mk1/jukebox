package com.scalepad.jukebox.model;

public abstract class Media {
    private String title;
    private int year;
    private double length;
    private double rating;
    
    private double costDistributer;
    private double priceOwner;

    private String distributor;
    private int remainingPlay;

    public abstract void showMetaData();    
}
