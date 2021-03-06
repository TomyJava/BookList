package com.example.thomyrchanca.retrofitlist.model;

/**
 * Created by thomyrchanca on 25/05/2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SaleInfo {

    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("saleability")
    @Expose
    public String saleability;
    @SerializedName("isEbook")
    @Expose
    public boolean isEbook;
    @SerializedName("listPrice")
    @Expose
    public ListPrice listPrice;
    @SerializedName("retailPrice")
    @Expose
    public RetailPrice retailPrice;
    @SerializedName("buyLink")
    @Expose
    public String buyLink;
    @SerializedName("offers")
    @Expose
    public List<Offer> offers = null;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean ebook) {
        isEbook = ebook;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "country='" + country + '\'' +
                ", saleability='" + saleability + '\'' +
                ", isEbook=" + isEbook +
                ", listPrice=" + listPrice +
                ", retailPrice=" + retailPrice +
                ", buyLink='" + buyLink + '\'' +
                ", offers=" + offers +
                '}';
    }
}