package com.ptfl.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Folio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String job;
    private String picture;
    @Column(length = 255)
    private String presentation;
    @OneToMany
    private Collection<Skills> skill;
    @OneToMany
    private Collection<Project> project;
    @OneToMany
    private Collection<Media> media;
}
