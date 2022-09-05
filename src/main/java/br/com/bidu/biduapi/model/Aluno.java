package br.com.bidu.biduapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomealuno;

    private Curso curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nomealuno;
    }

    public void setNome(String nome) {
        this.nomealuno = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
