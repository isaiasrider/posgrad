package com.UmBookado.UmBookado.Entity;


import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livros {

    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String titulo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NonNull String titulo) {
        this.titulo = titulo;
    }

    @NonNull
    public String getAutor() {
        return autor;
    }

    public void setAutor(@NonNull String autor) {
        this.autor = autor;
    }

    @NonNull
    public String getResumo() {
        return resumo;
    }

    public void setResumo(@NonNull String resumo) {
        this.resumo = resumo;
    }

    @NonNull
    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(@NonNull String lancamento) {
        this.lancamento = lancamento;
    }

    @NonNull
    private String autor;
    @NonNull
    private String resumo;
    @NonNull
    private String lancamento;
}
