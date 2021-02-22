package Manage;

import java.io.Serializable;

public class Services implements Serializable {
    private int id;
    private String nameServices;
    private double prices;

    public Services() {
    }

    public Services(int id, String nameServices, double prices) {
        this.id = id;
        this.nameServices = nameServices;
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
}