package com.santosh.collectionsfam.sort;


public class Coutry {

    private String countryCode;
    private Integer populations;

    public Coutry(String countryCode, Integer populations) {
        this.countryCode = countryCode;
        this.populations = populations;
    }

    public Coutry() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getPopulations() {
        return populations;
    }

    public void setPopulations(Integer populations) {
        this.populations = populations;
    }

    @Override
    public String toString() {
        return "Coutry{" +
                "countryCode='" + countryCode + '\'' +
                ", populations=" + populations +
                '}';
    }
}
