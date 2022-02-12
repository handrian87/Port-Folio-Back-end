package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Skills;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SkillsRepository extends CrudRepository<Skills, Long> {
//    @Modifying
//    Skills save(Skills skill);
//    void deleteById(Long id);
//    List<Skills> findAll();

    @Query("SELECT * FROM skills skl WHERE skl.name = :name")
    Skills findSkillsByName(String name);

    @Modifying
//    @Query("UPDATE skills skl SET skl.language = :skillToUpdate.language, " +
//            "skl.logo = :skillToUpdate.logo, skl.level = :skillToUpdate.level")
    void updateSelectedSkill(Long id, Skills skillToUpdate);
}
