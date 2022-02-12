package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Folio;
import com.ptfl.portfolio.entities.Project;
import com.ptfl.portfolio.entities.Skills;
import org.springframework.data.repository.CrudRepository;



public interface FolioRepository extends CrudRepository<Folio,Long> {
    Iterable<Folio> findAllByFolioRef(String folioRef);
    Iterable<Skills>findAllSkillsByFolioRef(String folioRef);
    Iterable<Project>findAllProjectByFolioRef(String folioRef);
}
