package com.estate.real.ui;

import android.net.Uri;

public class Item {
    private String name, price, publisher, area, time;
    private Uri thumbnail, publisherLogo;

    public Item(String name, String price, String publisher, String area, String time) {
        this.name = name;
        this.price = price;
        this.publisher = publisher;
        this.area = area;
        this.time = time;
    }

    public Item(String name, String price, String publisher, String area, String time, Uri thumbnail, Uri publisherLogo) {
        this.name = name;
        this.price = price;
        this.publisher = publisher;
        this.area = area;
        this.time = time;
        this.thumbnail = thumbnail;
        this.publisherLogo = publisherLogo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Uri getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Uri thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Uri getPublisherLogo() {
        return publisherLogo;
    }

    public void setPublisherLogo(Uri publisherLogo) {
        this.publisherLogo = publisherLogo;
    }
}
