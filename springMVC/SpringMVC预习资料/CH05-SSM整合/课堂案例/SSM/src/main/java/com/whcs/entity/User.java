package com.whcs.entity;

public class User {
    private Integer uid;
    private String uname;
    private String upwd;
    private Integer uage;
    private String uaddress;

    public User() {
    }

    public User(String uname, String upwd, Integer uage, String uaddress) {
        this.uname = uname;
        this.upwd = upwd;
        this.uage = uage;
        this.uaddress = uaddress;
    }

    public User(Integer uid, String uname, String upwd, Integer uage, String uaddress) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.uage = uage;
        this.uaddress = uaddress;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uid != null ? !uid.equals(user.uid) : user.uid != null) return false;
        if (uname != null ? !uname.equals(user.uname) : user.uname != null) return false;
        if (upwd != null ? !upwd.equals(user.upwd) : user.upwd != null) return false;
        if (uage != null ? !uage.equals(user.uage) : user.uage != null) return false;
        return uaddress != null ? uaddress.equals(user.uaddress) : user.uaddress == null;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upwd != null ? upwd.hashCode() : 0);
        result = 31 * result + (uage != null ? uage.hashCode() : 0);
        result = 31 * result + (uaddress != null ? uaddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uage=" + uage +
                ", uaddress='" + uaddress + '\'' +
                '}';
    }
}