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
public class ExemploHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArquivoVideo arquivoV = new ArquivoVideo();
        
        arquivoV.setNome("VIdeos engraçados e inteligentes montagem hd pfv se inscreva no canal");
        arquivoV.setTipo("mp4");
        arquivoV.setTamanho("23GB");
        arquivoV.setAutor("luquinhas02"); 
        arquivoV.setDuracao("23 min");
        
        System.out.println(arquivoV.retornarInformacao());
        
        
               }
    
}
