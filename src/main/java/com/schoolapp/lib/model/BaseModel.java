package com.schoolapp.lib.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Getter
    @Setter
    @Column(updatable = false)
    private Date timeCreated = new Date();

    @Getter
    @Setter
    private Date timeLastUpdated = new Date();
}
