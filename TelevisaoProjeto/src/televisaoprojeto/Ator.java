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
public class Ator {
   
    private String nome, nascimento, email,  nomea, cidade, endereco, bairro, estado;
    private Integer qtdnovela, qtdevento;

    public Integer getQtdevento() {
        return qtdevento;
    }

    public void setQtdevento(Integer qtdevento) {
        this.qtdevento = qtdevento;
    }
    private Double salariom, cacheev;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getQtdnovela() {
        return qtdnovela;
    }

    public void setQtdnovela(Integer qtdnovela) {
        this.qtdnovela = qtdnovela;
    }

    public Double getSalariom() {
        return salariom;
    }

    public void setSalariom(Double salariom) {
        this.salariom = salariom;
    }

    public Double getCacheev() {
        return cacheev;
    }

    public void setCacheev(Double cacheev) {
        this.cacheev = cacheev;
    }
    
   
    /*public void setEventos(Integer eventos){
        this.qtdevento = eventos;
    }
    public Integer getEventos(){
        return qtdevento;
    }*/
    public String obterStatus(){
        String retorno = " ";
        if(qtdnovela<=3 && salariom < 5000.00){
            retorno = "Calouro";
        }else if (qtdnovela<=6){
            retorno = "Revelação";
        }else if(qtdnovela<=6 && salariom > 30000.00){
            retorno = "Joia";
        }else if (qtdnovela> 9 && salariom < 30000.00){
            retorno = "Elenco de Apoio";
        }else if(salariom>= 30000.00 && salariom <= 100000.00){
            retorno = "Elenco Principal";
        }else if (salariom > 1000000.00){
            retorno = "Estrela";
        }else{
            retorno = "Figurante";
        }
        return retorno;
    }
    public Double calcularGanhos(Integer qtdeventos){
        Double total = 0.0;
        total =  salariom+(qtdeventos*cacheev);
        return total;
    }
    
    
}
