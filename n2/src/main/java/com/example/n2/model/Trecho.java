package com.example.n2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trechos")
public class Trecho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chave;

    private String coluna1;
    private String coluna2;

    public Trecho() {}

    public Trecho(String coluna1, String coluna2) {
        this.coluna1 = coluna1;
        this.coluna2 = coluna2;
    }

    public int getChave() {
        return chave;
    }

    public String getColuna1() {
        return coluna1;
    }

    public String getColuna2() {
        return coluna2;
    }
}