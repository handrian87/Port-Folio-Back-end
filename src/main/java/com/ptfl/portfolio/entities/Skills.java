package com.ptfl.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="skills")
public class Skills {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String language;
    private String logo;
    private int level;
}
