package com.portfolio.my_skill.entity;

import jakarta.persistence.*;

@Entity
public class MySkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String icon;

    @Column(nullable = false , length = 30)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false,length = 30)
    private String techType;

    @Column(nullable = false)
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
