package com.whcs.entity;

/**
 * Created by Yegz on 2017/7/24.
 */
public class Address {
    private String location1;
    private String location2;

    public Address() {
    }

    public Address(String location1, String location2) {
        this.location1 = location1;
        this.location2 = location2;
    }

    public String getLocation1() {
        return location1;
    }

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (location1 != null ? !location1.equals(address.location1) : address.location1 != null) return false;
        return location2 != null ? location2.equals(address.location2) : address.location2 == null;
    }

    @Override
    public int hashCode() {
        int result = location1 != null ? location1.hashCode() : 0;
        result = 31 * result + (location2 != null ? location2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location1='" + location1 + '\'' +
                ", location2='" + location2 + '\'' +
                '}';
    }
}
