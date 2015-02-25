/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rafaelpessoa;

import Modelo.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class RafaelPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     
     while(pessoa.getCodigo()==null)
     {
       try
       {
           pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo: ")));
       
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "ERRO 2347/2 \n Os caracteres devem ser apenas numéricos.");
      }
    }

     pessoa.setNome(JOptionPane.showInputDialog("Digite o seu Nome: "));
     pessoa.setSexo(JOptionPane.showInputDialog("Digite o seu Sexo: "));
     
     JOptionPane.showMessageDialog(null, " Code: " +pessoa.getCodigo() + "\n Nome: " + pessoa.getNome() + "\n Sexo: " + pessoa.getSexo());
    }
    
}
