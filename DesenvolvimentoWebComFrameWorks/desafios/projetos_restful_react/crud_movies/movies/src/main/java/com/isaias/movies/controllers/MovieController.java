package com.isaias.movies.controllers;


import com.isaias.movies.models.Movie;
import com.isaias.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List<Movie> listAll() {
        return movieRepository.findAll();
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie) {

        return movieRepository.save(movie);
    }

    @PutMapping()
    public Movie updateMovie(@RequestBody Movie movie){

        if (movieRepository.existsById(movie.getId())){
            return movieRepository.save(movie);

        }
        else {

            throw new ResourceNotFoundException("esse livro nem existe mah");

        }
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable("id") Long id){
       movieRepository.deleteById(id);
    }
}
