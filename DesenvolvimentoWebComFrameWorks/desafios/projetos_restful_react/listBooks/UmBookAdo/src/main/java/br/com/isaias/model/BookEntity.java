package br.com.isaias.model;
import javax.persistence.*;

@Table(name = "Book")
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String titulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo( String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor( String autor) {
        this.autor = autor;
    }


    public String getResumo() {
        return resumo;
    }

    public void setResumo( String resumo) {
        this.resumo = resumo;
    }


    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento( String lancamento) {
        this.lancamento = lancamento;
    }


    private String autor;

    private String resumo;

    private String lancamento;
}

