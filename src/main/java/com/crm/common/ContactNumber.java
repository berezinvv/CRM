package com.crm.common;

public class ContactNumber {

    private String countryCode;
    private String cityCode;
    private String number;
    private TypeContactNumber type;

    public ContactNumber(String countryCode, String cityCode, String number, TypeContactNumber type) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
        this.type = type;
    }

    public ContactNumber() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TypeContactNumber getType() {
        return type;
    }

    public void setType(TypeContactNumber type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContactNumber{" +
                ", type=" + type +
                ", number='" + countryCode + cityCode + number +
                '}';
    }
}
