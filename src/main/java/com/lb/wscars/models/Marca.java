package com.lb.wscars.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_marca", length = 30)
    private String nome_marca;

    public Marca() {
    }

    public Marca(Long id, String nome_marca) {
        this.id = id;
        this.nome_marca = nome_marca;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_marca() {
        return this.nome_marca;
    }

    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Marca)) {
            return false;
        }
        Marca marca = (Marca) obj;
        return Objects.equals(id, marca.id) && Objects.equals(nome_marca, marca.nome_marca);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

}
