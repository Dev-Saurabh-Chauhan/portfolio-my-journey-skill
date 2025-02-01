package com.portfolio.my_skill.repository;

import com.portfolio.my_skill.entity.MySkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MYSkillRepo extends JpaRepository<MySkills, Integer> {
}
