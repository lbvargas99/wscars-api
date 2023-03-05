package com.lb.wscars.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "timestamp_cadastro")
    private Date timestamp_cadastro;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo_id;

    @Column(name = "ano")
    private Date ano;

    @Column(name = "combustivel")
    private int combustivel;

    @Column(name = "num_portas")
    private int num_portas;

    @Column(name = "cor")
    private String cor;

    public Carro() {
    }

    public Carro(Long id, Date timestamp_cadastro, Modelo modelo_id, Date ano, int combustivel, int num_portas,
            String cor) {
        this.id = id;
        this.timestamp_cadastro = timestamp_cadastro;
        this.modelo_id = modelo_id;
        this.ano = ano;
        this.combustivel = combustivel;
        this.num_portas = num_portas;
        this.cor = cor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp_cadastro() {
        return this.timestamp_cadastro;
    }

    public void setTimestamp_cadastro(Date timestamp_cadastro) {
        this.timestamp_cadastro = timestamp_cadastro;
    }

    public Modelo getModelo_id() {
        return this.modelo_id;
    }

    public void setModelo_id(Modelo modelo_id) {
        this.modelo_id = modelo_id;
    }

    public Date getAno() {
        return this.ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getNum_portas() {
        return this.num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carro)) {
            return false;
        }
        Carro carro = (Carro) o;
        return Objects.equals(id, carro.id) && Objects.equals(timestamp_cadastro, carro.timestamp_cadastro)
                && Objects.equals(modelo_id, carro.modelo_id) && Objects.equals(ano, carro.ano)
                && combustivel == carro.combustivel && num_portas == carro.num_portas && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

}
