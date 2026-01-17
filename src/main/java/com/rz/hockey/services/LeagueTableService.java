package com.rz.hockey.services;
import com.rz.hockey.entities.LeagueTable;
import com.rz.hockey.entities.TableRow;
import com.rz.hockey.entities.Team;
import com.rz.hockey.enums.CompetitionType;
import com.rz.hockey.repositories.LeagueTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueTableService {

    private final LeagueTableRepository leagueTableRepository;

    public LeagueTableService(LeagueTableRepository leagueTableRepository) {
        this.leagueTableRepository = leagueTableRepository;
    }

    public List<TableRow> getStandings(Long leagueTableId) {
        LeagueTable table = leagueTableRepository.findById(leagueTableId)
                .orElseThrow(() -> new RuntimeException("League table not found"));

        return table.getRows();
    }

    public List<Team> getTeamsByCompetition(
            CompetitionType competitionType,
            String seasonYear
    ) {
        LeagueTable table = leagueTableRepository
                .findByCompetitionTypeAndSeasonYear(competitionType, seasonYear)
                .orElseThrow(() -> new RuntimeException("The league table was not found.."));


        return table.getRows().stream()
                .map(TableRow::getTeam)
                .toList();
    }

}
