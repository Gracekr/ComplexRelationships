package com.Lab3_08.ComplexRelationships.ej1.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private String memberStatus;

    private LocalDate renewal_date;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter_id;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public LocalDate getRenewal_date() {
        return renewal_date;
    }

    public void setRenewal_date(LocalDate renewal_date) {
        this.renewal_date = renewal_date;
    }

    public Chapter getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Chapter chapter_id) {
        this.chapter_id = chapter_id;
    }
}
