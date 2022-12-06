package com.hans.soccer.bet.mstournament.serv;

import com.hans.soccer.bet.mstournament.dao.TournamentDao;
import com.hans.soccer.bet.mstournament.ent.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentDao tournamentDao;

    @Override
    public List<Tournament> findAll() {
        return tournamentDao.findAll();
    }

    @Override
    public Tournament save(Tournament entity) {
        return tournamentDao.save(entity);
    }
}
