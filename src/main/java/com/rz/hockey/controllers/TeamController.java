package com.rz.hockey.controllers;
import com.rz.hockey.entities.Team;
import com.rz.hockey.enums.CompetitionType;
import com.rz.hockey.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

//    @GetMapping
//    public ResponseEntity<List<Team>> getAllPlayers(
//        @RequestParam(required = false) CompetitionType competitionName, String seasonYear) {
//            return ResponseEntity.ok(teamService.getPlayers(competitionName, seasonYear));
//        }
    }
