package com.hans.soccer.bet.mstournament.dao;

import com.hans.soccer.bet.mstournament.ent.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentDao extends JpaRepository<Tournament, Long> {
}
