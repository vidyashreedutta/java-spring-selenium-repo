package com.jpa.example.jpademo.dto;

public class PersonDTO {

    private String fname;
    private String career;
    private boolean datapresent;

    public boolean isDatapresent() {
        return datapresent;
    }

    public void setDatapresent(boolean datapresent) {
        this.datapresent = datapresent;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
