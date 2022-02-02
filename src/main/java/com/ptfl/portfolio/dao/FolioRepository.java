package com.ptfl.portfolio.dao;

import com.ptfl.portfolio.entities.Folio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FolioRepository extends JpaRepository<Folio,Long> {
}
