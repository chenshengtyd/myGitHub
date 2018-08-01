package com.yeahsir.entity;

/**
 * Created by Yegz on 2017/9/13.
 */
public class PhoneNumberModel {

    private String areaCode;//区号
    private String phoneNumber;//电话号码

    public PhoneNumberModel() {
    }

    public PhoneNumberModel(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumberModel that = (PhoneNumberModel) o;

        if (areaCode != null ? !areaCode.equals(that.areaCode) : that.areaCode != null) return false;
        return phoneNumber != null ? phoneNumber.equals(that.phoneNumber) : that.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = areaCode != null ? areaCode.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumberModel{" +
                "areaCode='" + areaCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
