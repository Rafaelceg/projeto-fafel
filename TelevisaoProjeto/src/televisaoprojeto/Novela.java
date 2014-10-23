/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisaoprojeto;

/**
 *
 * @author Aluno
 */
public class Novela {
    /*Título, período de duração (data do primeiro capítulo e data do
último capítulo), horário de exibição, autor da novela, emissora que 
transmite a novela e pontuação média do ibope, se apresenta cenas 
e violência (SIM/Não), sexo(Sim/Não) e drogas(Sim/Não).*/
    private String titulo, duracao, horario, autor, emissora;
    private Double ibope;
    private Boolean violencia, sexo, drogas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public Boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(Boolean violencia) {
        this.violencia = violencia;
    }

    public Boolean isSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(Boolean drogas) {
        this.drogas = drogas;
    }
    public String getClassificacao(){
        String coisa = " ";
        if(violencia==false && sexo==false && drogas==false)
        {
            coisa = "Livre";
        }else if(violencia==true && sexo==false && drogas==false){
            coisa = "14 anos";
        }else if(violencia==true && sexo==true||sexo==false && drogas==true ){
            coisa = "16 anos";
        }else if(violencia==true && sexo==true&& drogas==true ){
            coisa = "18 anos";
        }
        return coisa;
    }
    public Double getQtdPessoa(){
        Double total = 0.0;
        total = ibope*10000;
        return total;
    }
}
