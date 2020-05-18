package com.isaias.movies.controllers;

import com.isaias.movies.models.Vote;
import com.isaias.movies.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/votacao")

public class VoteController {

    @Autowired
    private VoteRepository voteRepository;

    @GetMapping
    public List<Vote> listAll(){

        return voteRepository.findAll();
    }

    @PostMapping
    public Vote setVote(@RequestBody Vote vote){

        return voteRepository.save(vote);
    }

}
