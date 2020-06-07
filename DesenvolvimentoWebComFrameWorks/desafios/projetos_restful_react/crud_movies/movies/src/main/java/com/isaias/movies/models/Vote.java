package com.isaias.movies.models;

import javax.persistence.*;

@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"cpf" , "movie_id"})})

@Entity
public class Vote {

    @Id
    @GeneratedValue
    long id;
    String nomePessoa;
    String comentario;
    int nota;
    String cpf;

    @ManyToOne
    Movie movie;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


}
