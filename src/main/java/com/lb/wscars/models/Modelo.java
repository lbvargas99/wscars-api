package com.lb.wscars.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Modelo")
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "marca_id")
    private Long marca_id;

    @Column(name = "nome", length = 60)
    private String nome;

    @Column(name = "valor_fipe")
    private Long valor_fipe;

    public Modelo() {
    }

    public Modelo(Long id, Long marca_id, String nome, Long valor_fipe) {
        this.id = id;
        this.marca_id = marca_id;
        this.nome = nome;
        this.valor_fipe = valor_fipe;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarca_id() {
        return this.marca_id;
    }

    public void setMarca_id(Long marca_id) {
        this.marca_id = marca_id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getValor_fipe() {
        return this.valor_fipe;
    }

    public void setValor_fipe(Long valor_fipe) {
        this.valor_fipe = valor_fipe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Modelo)) {
            return false;
        }
        Modelo modelo = (Modelo) o;
        return Objects.equals(id, modelo.id) && Objects.equals(marca_id, modelo.marca_id)
                && Objects.equals(nome, modelo.nome) && Objects.equals(valor_fipe, modelo.valor_fipe);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

}
