package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Project;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Query("SELECT * FROM projet pj WHERE pj.name = :name")
    Project findByName(String name);

    @Query("SELECT * FROM projet pj WHERE pj.technologies = :techName")
    Project findProjectByTechnologies(String techName);

    @Query("SELECT pj.technologies FROM projet pj")
    List<String>listTechnologies();
}
