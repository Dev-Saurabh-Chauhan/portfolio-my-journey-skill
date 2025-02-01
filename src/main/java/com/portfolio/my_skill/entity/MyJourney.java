package com.portfolio.my_skill.entity;
import jakarta.persistence.*;
import java.util.ArrayList;


@Entity
public class MyJourney {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false, length = 255)
    private String role;

    @Column(nullable = false)
    private String fromDate;

    @Column(nullable = false)
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
