package com.yeahsir.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Yegz on 2017/9/13.
 */
public class User {
    @NotEmpty(message = "{username.not.empty}")
    private String username;
    private String password;
    private Integer age;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)/*yyyy-MM-dd*/
    private Date birthday;
    private PhoneNumberModel phoneNumberModel;

    public User() {
    }

    public User(String username, String password, Integer age, Date birthday) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }

    public User(String username, String password, Integer age, Date birthday, PhoneNumberModel phoneNumberModel) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.phoneNumberModel = phoneNumberModel;
    }

    public PhoneNumberModel getPhoneNumberModel() {
        return phoneNumberModel;
    }

    public void setPhoneNumberModel(PhoneNumberModel phoneNumberModel) {
        this.phoneNumberModel = phoneNumberModel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        return phoneNumberModel != null ? phoneNumberModel.equals(user.phoneNumberModel) : user.phoneNumberModel == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phoneNumberModel != null ? phoneNumberModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", phoneNumberModel=" + phoneNumberModel +
                '}';
    }
}
