package com.hans.soccer.bet.mstournament.api;

import com.hans.soccer.bet.mstournament.ent.Tournament;
import com.hans.soccer.bet.mstournament.serv.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/tournaments")
public class TournamentApi {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/")
    ResponseEntity<List<Tournament>> getTournaments() {
        return ResponseEntity.ok(tournamentService.findAll());
    }

    @PostMapping("/")
    ResponseEntity<Tournament> saveTournament (@RequestBody Tournament entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tournamentService.save(entity));
    }
}
