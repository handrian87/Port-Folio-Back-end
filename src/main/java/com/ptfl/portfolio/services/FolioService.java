package com.ptfl.portfolio.services;

import com.ptfl.portfolio.entities.Folio;
import com.ptfl.portfolio.entities.Project;
import com.ptfl.portfolio.entities.Skills;

import java.util.Collection;

public interface FolioService {
    public Folio saveFolio(Folio folio);
    public void addSkillsToFolio(Collection<Skills>skills);
    public void addProjectToFolio(Collection<Project>project);
    public void updateFolio(Folio updatedFolio);
    public void deleteFolio(Folio deleteFolio);
}
