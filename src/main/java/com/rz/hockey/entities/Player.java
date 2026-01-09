package com.rz.hockey.entities;

import jakarta.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    private Team team;

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
}
