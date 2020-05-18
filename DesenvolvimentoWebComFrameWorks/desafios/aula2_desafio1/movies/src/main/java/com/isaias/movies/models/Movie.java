package com.isaias.movies.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Movie {

    @Id
    @GeneratedValue
    long id;

    String name;
    String sinopse;
    String genero;
    Date anoDeLancamento;
    String nomeProtagonista;

    public String getNomeProtagonista() {
        return nomeProtagonista;
    }

    public void setNomeProtagonista(String nomeProtagonista) {
        this.nomeProtagonista = nomeProtagonista;
    }

    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }

    String nomeProdutor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Date anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }



}
