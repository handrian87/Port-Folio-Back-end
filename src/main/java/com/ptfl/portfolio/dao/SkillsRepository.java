package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
