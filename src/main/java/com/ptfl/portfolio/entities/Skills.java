package com.ptfl.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Skills {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String language;
    private String logo;
    private int level;
}
