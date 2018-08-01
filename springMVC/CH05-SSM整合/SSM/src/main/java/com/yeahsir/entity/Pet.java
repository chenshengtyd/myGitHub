package com.yeahsir.entity;

import java.util.Date;

public class Pet {
    private Integer id;

    private Integer masterid;

    private String name;

    private Integer typeid;

    private Integer health;

    private Integer love;

    private Date adopttime;

    private String status;

    public Pet() {
    }

    public Pet(Integer id, Integer masterid, String name, Integer typeid, Integer health, Integer love, Date adopttime, String status) {
        this.id = id;
        this.masterid = masterid;
        this.name = name;
        this.typeid = typeid;
        this.health = health;
        this.love = love;
        this.adopttime = adopttime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMasterid() {
        return masterid;
    }

    public void setMasterid(Integer masterid) {
        this.masterid = masterid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public Date getAdopttime() {
        return adopttime;
    }

    public void setAdopttime(Date adopttime) {
        this.adopttime = adopttime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (id != null ? !id.equals(pet.id) : pet.id != null) return false;
        if (masterid != null ? !masterid.equals(pet.masterid) : pet.masterid != null) return false;
        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        if (typeid != null ? !typeid.equals(pet.typeid) : pet.typeid != null) return false;
        if (health != null ? !health.equals(pet.health) : pet.health != null) return false;
        if (love != null ? !love.equals(pet.love) : pet.love != null) return false;
        if (adopttime != null ? !adopttime.equals(pet.adopttime) : pet.adopttime != null) return false;
        return status != null ? status.equals(pet.status) : pet.status == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (masterid != null ? masterid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (health != null ? health.hashCode() : 0);
        result = 31 * result + (love != null ? love.hashCode() : 0);
        result = 31 * result + (adopttime != null ? adopttime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", masterid=" + masterid +
                ", name='" + name + '\'' +
                ", typeid=" + typeid +
                ", health=" + health +
                ", love=" + love +
                ", adopttime=" + adopttime +
                ", status='" + status + '\'' +
                '}';
    }
}