package com.rz.hockey.controllers;

import com.rz.hockey.entities.Team;
import com.rz.hockey.enums.CompetitionType;
import com.rz.hockey.services.LeagueTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/league-tables")
public class LeagueTableController {

    private final LeagueTableService leagueTableService;

    public LeagueTableController(LeagueTableService leagueTableService) {
        this.leagueTableService = leagueTableService;
    }

    @GetMapping("/teams")
    public List<Team> getTeams(
            @RequestParam CompetitionType competitionType,
            @RequestParam String seasonYear
    ) {
        return leagueTableService
                .getTeamsByCompetition(competitionType, seasonYear);
    }
}