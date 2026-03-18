package com.ifsp.mateus;

public class Personagem {
    private String nome;
    private int nivel;
    private String classe;
    private int vida;
    private boolean premium;


    public Personagem(){}

    public Personagem(String nome, int nivel, String classe, int vida, boolean premium) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.vida = vida;
        this.premium = premium;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}