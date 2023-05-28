package com.schoolapp.school.model;

import com.schoolapp.lib.model.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class School extends BaseModel {
    @Getter
    @Setter
    @Column(unique = true)
    private String name;

    @Getter
    @Setter
    private String physicalAddress;

    @Getter
    @Setter
    @Column(unique = true)
    private String emailAddress;

    @Getter
    @Setter
    @Column(unique = true)
    private String phoneNumber;
}
