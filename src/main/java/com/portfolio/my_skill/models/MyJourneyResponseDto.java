package com.portfolio.my_skill.models;

import com.portfolio.my_skill.entity.MySkills;

import java.util.ArrayList;

public class MyJourneyResponseDto {

    private int id;

    private String company;

    private String role;

    private String fromDate;

    private String toDate;

    private ArrayList<MySkills> skills = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ArrayList<MySkills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<MySkills> skills) {
        this.skills = skills;
    }
}
