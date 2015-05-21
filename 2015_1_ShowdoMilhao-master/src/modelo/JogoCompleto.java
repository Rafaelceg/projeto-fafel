/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author marcelosiedler
 */
public class JogoCompleto {
    private Jogador jogador;
    private Integer pular;
    private Integer cartas;
    private Integer placas;
    private Double ganhos;
    
    public JogoCompleto()
    {
        this.jogador = null;
        this.cartas = 1;
        this.ganhos = 0.0;
        this.placas = 1;
        this.pular = 1;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getPular() {
        return pular;
    }

    public void setPular(Integer pular) {
        this.pular = pular;
    }

    public Integer getCartas() {
        return cartas;
    }

    public void setCartas(Integer cartas) {
        this.cartas = cartas;
    }

    public Integer getPlacas() {
        return placas;
    }

    public void setPlacas(Integer placas) {
        this.placas = placas;
    }

    public Double getGanhos() {
        return ganhos;
    }

    public void setGanhos(Double ganhos) {
        this.ganhos = ganhos;
    }
    
    
    
            
    
    
}
