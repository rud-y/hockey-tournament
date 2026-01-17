package com.rz.hockey.services;

import com.rz.hockey.entities.LeagueTable;
import com.rz.hockey.entities.TableRow;
import com.rz.hockey.entities.Team;
import com.rz.hockey.enums.CompetitionType;
import com.rz.hockey.repositories.LeagueTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final LeagueTableRepository leagueTableRepository;

    public TeamService(LeagueTableRepository leagueTableRepository) {
        this.leagueTableRepository = leagueTableRepository;
    }
}
