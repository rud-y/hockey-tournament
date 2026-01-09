package com.rz.hockey.entities;
import com.rz.hockey.enums.CompetitionType;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class LeagueTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "leagueTable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TableRow> rows;

    @Enumerated(EnumType.STRING)
    private CompetitionType competitonType;

    @Column
    private String seasonYear;

    public LeagueTable() {}

    public LeagueTable(List<TableRow> rows, CompetitionType competitonType, String season) {
        this.rows = rows;
        this.competitonType = competitonType;
        this.seasonYear = season;
    }

    public CompetitionType getCompetitonType() {
        return competitonType;
    }

    public String getSeasonYear() {
        return seasonYear;
    }
}
