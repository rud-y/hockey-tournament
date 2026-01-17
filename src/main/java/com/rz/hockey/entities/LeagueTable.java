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
    private CompetitionType competitionType;

    @Column
    private String seasonYear;

    public LeagueTable() {}

    public LeagueTable(List<TableRow> rows, CompetitionType competitionType, String season) {
        this.rows = rows;
        this.competitionType = competitionType;
        this.seasonYear = season;
    }

    public LeagueTable(CompetitionType competitionType, String season) {
        this.competitionType = competitionType;
        this.seasonYear = season;
    }

    public CompetitionType getCompetitionType() {
        return competitionType;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public CompetitionType getCompetitonType() {
        return competitionType;
    }

    public List<TableRow> getRows() {
        return rows;
    }

    public Long getId() {
        return id;
    }

    public void setRows(List<TableRow> rows) {
        this.rows = rows;
    }

    public void setCompetitonType(CompetitionType competitonType) {
        this.competitionType = competitonType;
    }

    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }
}
