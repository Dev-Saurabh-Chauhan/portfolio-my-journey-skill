package com.portfolio.my_skill.entity;

import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String projectName;

    @Column(nullable = false, length = 255)
    private String type;

    @Column(nullable = false, length = 255)
    private String serviceType;

    @Column(nullable = false)
    @Lob
    private String description;

    private ArrayList<MySkills> skills = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
