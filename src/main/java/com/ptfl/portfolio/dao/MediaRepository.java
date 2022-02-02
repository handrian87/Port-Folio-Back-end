package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MediaRepository extends JpaRepository<Media, Long> {
}
