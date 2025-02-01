package com.portfolio.my_skill.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MySkillsPayloadDTO {

    @NotBlank(message = "Icon cannot be blank")
    @Size(max = 255, message = "Icon Name 255 characters")
    private String icon;
    @NotBlank(message = "Name cannot be blank")
    @Size(max = 30, message = "Name 255 characters")
    private String name;
    @NotBlank(message = "Description cannot be blank")
    @Size(max = 255, message = "Description 255 characters")
    private String description;
    @NotBlank(message = "TechType cannot be blank")
    @Size(max = 30, message = "TechType 30 characters")
    private String techType;
    @NotBlank(message = "SkillKnowledge cannot be blank")
    @Size(max = 3, message = "SkillKnowledge 255 characters")
    private int skillKnowledge;

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
