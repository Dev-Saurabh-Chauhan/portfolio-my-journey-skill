package com.portfolio.my_skill.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public class MySkillsResponseDTO {

    private int id;

    private String icon;

    private String name;

    private String description;

    private String techType;

    private int skillKnowledge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public int getSkillKnowledge() {
        return skillKnowledge;
    }

    public void setSkillKnowledge(int skillKnowledge) {
        this.skillKnowledge = skillKnowledge;
    }
}
