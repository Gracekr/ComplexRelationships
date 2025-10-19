package com.Lab3_08.ComplexRelationships.ej2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conference extends Event{
    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakerList;

}
