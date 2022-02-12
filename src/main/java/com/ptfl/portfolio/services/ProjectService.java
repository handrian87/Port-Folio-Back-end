package com.ptfl.portfolio.services;

import com.ptfl.portfolio.entities.Project;

public interface ProjectService {
    public void addTechnologies(String techno);
    public void deleteTechnologies(String techno);
    public Project updateProject(Project updatedProject);
}
