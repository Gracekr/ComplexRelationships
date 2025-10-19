package com.Lab3_08.ComplexRelationships.ej2.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private int presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private List<Conference> speakers;

    public Speaker() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public List<Conference> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Conference> speakers) {
        this.speakers = speakers;
    }
}
