package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import modelo.Jogador;

/**
 *
 * @author Aluno
 */
public class JogoCompleto {
    private Jogador jogador;
    private Integer placas;
    private Integer cartas;
    private Integer pular;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getPlacas() {
        return placas;
    }

    public void setPlacas(Integer placas) {
        this.placas = placas;
    }

    public Integer getCartas() {
        return cartas;
    }

    public void setCartas(Integer cartas) {
        this.cartas = cartas;
    }

    public Integer getPular() {
        return pular;
    }

    public void setPular(Integer pular) {
        this.pular = pular;
    }

    public Double getGanhos() {
        return ganhos;
    }

    public void setGanhos(Double ganhos) {
        this.ganhos = ganhos;
    }
    private Double ganhos;
}
