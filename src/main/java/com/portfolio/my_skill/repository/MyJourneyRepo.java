package com.portfolio.my_skill.repository;

import com.portfolio.my_skill.entity.MyJourney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJourneyRepo extends JpaRepository<MyJourney, Integer> {
}
