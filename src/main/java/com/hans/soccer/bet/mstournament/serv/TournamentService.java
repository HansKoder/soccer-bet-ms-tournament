package com.hans.soccer.bet.mstournament.serv;

import com.hans.soccer.bet.mstournament.ent.Tournament;

import java.util.List;

public interface TournamentService {
    List<Tournament> findAll();
    Tournament save(Tournament entity);
}
