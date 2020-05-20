package com.isaias.movies.repositories;

import com.isaias.movies.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
        //@Query("your custom query here")
        Vote findByCpfAndMovieId(String cpf,long movieId);

}
