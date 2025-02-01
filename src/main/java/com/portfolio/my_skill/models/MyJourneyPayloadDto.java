package com.portfolio.my_skill.models;

import com.portfolio.my_skill.entity.MySkills;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

public class MyJourneyPayloadDto {
    @NotNull(message = "Company can not be null.")
    private String company;

    @NotNull(message = "Role can not be null.")
    private String role;

    @NotNull(message = "From Date can not be null.")
    private String fromDate;

    @NotNull(message = "To date can not be null.")
    private String toDate;

    private ArrayList<MySkills> skills = new ArrayList<>();

    public @NotNull(message = "Company can not be null.") String getCompany() {
        return company;
    }

    public void setCompany(@NotNull(message = "Company can not be null.") String company) {
        this.company = company;
    }

    public @NotNull(message = "Role can not be null.") String getRole() {
        return role;
    }

    public void setRole(@NotNull(message = "Role can not be null.") String role) {
        this.role = role;
    }

    public @NotNull(message = "From Date can not be null.") String getFromDate() {
        return fromDate;
    }

    public void setFromDate(@NotNull(message = "From Date can not be null.") String fromDate) {
        this.fromDate = fromDate;
    }

    public @NotNull(message = "To date can not be null.") String getToDate() {
        return toDate;
    }

    public void setToDate(@NotNull(message = "To date can not be null.") String toDate) {
        this.toDate = toDate;
    }

    public ArrayList<MySkills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<MySkills> skills) {
        this.skills = skills;
    }
}
