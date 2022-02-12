package com.ptfl.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Folio {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String folioRef;
    private String firstName;
    private String job;
    private String picture;
    @Column(length = 255)
    private String presentation;
    @OneToMany
    private Collection<Skills> skills;
    @OneToMany
    private Collection<Project> project;
    @OneToMany
    private Collection<Media> media;
}
