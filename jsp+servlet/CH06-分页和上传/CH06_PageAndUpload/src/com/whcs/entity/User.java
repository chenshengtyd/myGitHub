package com.whcs.entity;

public class User {

	private Integer uid;
	private String uname;
	private String upwd;
	private Integer uage;
	private String uaddress;

	public User() {
		super();
	}

	public User(String uname, String upwd, Integer uage, String uaddress) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.uage = uage;
		this.uaddress = uaddress;
	}

	public User(Integer uid, String uname, String upwd, Integer uage, String uaddress) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.uage = uage;
		this.uaddress = uaddress;
	}

	public Integer getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public Integer getUage() {
		return uage;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uaddress == null) ? 0 : uaddress.hashCode());
		result = prime * result + ((uage == null) ? 0 : uage.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + ((upwd == null) ? 0 : upwd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uaddress == null) {
			if (other.uaddress != null)
				return false;
		} else if (!uaddress.equals(other.uaddress))
			return false;
		if (uage == null) {
			if (other.uage != null)
				return false;
		} else if (!uage.equals(other.uage))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (upwd == null) {
			if (other.upwd != null)
				return false;
		} else if (!upwd.equals(other.upwd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", uage=" + uage + ", uaddress=" + uaddress
				+ "]";
	}

}
