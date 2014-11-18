/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploherança;

/**
 *
 * @author Rafael
 */
public class Arquivo {
    private String nome, tipo, tamanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String RetornarInformações(){
        String retorno;
        retorno = this.nome +", " +this.tipo +", " +this.tamanho +".";
        return retorno;
    }
            
    
}
