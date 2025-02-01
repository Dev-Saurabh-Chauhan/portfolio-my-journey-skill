package com.portfolio.my_skill.models;

import com.portfolio.my_skill.entity.MySkills;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;

import java.util.ArrayList;

public class ProjectResponse {

    private int id;

    private String projectName;

    private String type;

    private String serviceType;

    private String description;

    private ArrayList<MySkills> skills = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<MySkills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<MySkills> skills) {
        this.skills = skills;
    }
}
