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
public class ArquivoVideo extends Arquivo{
    private String duracao, autor;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String retornarInformacao(){
        String retorno;
        retorno = super.RetornarInformações() +"."
        +" - " +this.getAutor() +"/" +this.getDuracao();
        return retorno;
    }
}
