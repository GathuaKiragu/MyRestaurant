package com.epicodus.myrestaurants.models;

<<<<<<< HEAD
=======


>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Restaurant {
    String name;
    String phone;
    String website;
<<<<<<< HEAD
=======
    private String pushId;
    String index;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    double rating;
    String imageUrl;
    List<String> address = new ArrayList<>();
    double latitude;
    double longitude;
    List<String> categories = new ArrayList<>();
<<<<<<< HEAD
    private String pushId;
    String index;

    public Restaurant() {}

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> address,
                      double latitude, double longitude, ArrayList<String> categories) {
=======

    // empty constructor needed by the Parceler library
    public Restaurant(){}

    public Restaurant(String name, String phone, String website,
                      double rating, String imageUrl, ArrayList<String> address,double latitude,double longitude,
                     ArrayList<String> categories) {
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        this.name = name;
        this.phone = phone;
        this.website = website;
        this.rating = rating;
<<<<<<< HEAD
        this.imageUrl = getLargeImageUrl(imageUrl);
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.categories = categories;
        this.index = "not_specified";
=======
        this.imageUrl = imageUrl;
        this.address = address;
        this.index="not_specified";
        this.latitude = latitude;
        this.longitude = longitude;
        this.categories = categories;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return  website;
    }

    public double getRating() {
        return rating;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public List<String> getAddress() {
        return address;
    }
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

<<<<<<< HEAD
    public List<String> getCategories() {
        return categories;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 6).concat("o.jpg");
        return largeImageUrl;
    }

=======
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    public String getPushId(){
        return pushId;
    }

    public void setPushId(String pushId){
        this.pushId = pushId;
    }
<<<<<<< HEAD

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
=======
    public List<String> getCategories() {
        return categories;
    }

    public String getLargeImageUrl(String imageUrl) {
        String largeImageUrl = imageUrl.substring(0, imageUrl.length() - 5).concat("o.jpg");
        return largeImageUrl;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }
}
