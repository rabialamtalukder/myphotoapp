package com.example.myphotoapp.model;

public class User {

    private int slNo;
    private String name;
    private String description;
    private String coverPicUrl;

    public User(String name, String description, String coverPicUrl) {
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
    }

    public int getSlNo() {
        return slNo;
    }

    public void setSlNo(int slNo) {
        this.slNo = slNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
