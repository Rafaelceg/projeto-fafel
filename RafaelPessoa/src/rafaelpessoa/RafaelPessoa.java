/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rafaelpessoa;
import javax.swing.JOptionPane;
import modelo.Pessoa;
/**
 *
 * @author Aluno
 */
public class RafaelPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        //tratamento de erros inesperados
        while(p.getCodigo()==null)
        {
            try
            {
                //aqui é o q estou executando
                p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite codigo: ")));
            }catch(Exception ex){
                //aqui é o q quero fazer quando der erro
                JOptionPane.showMessageDialog(null, "Informe apenas numeros" );
            }
        }
        
       
        p.setNome(JOptionPane.showInputDialog("Digite nome: "));
        p.setSexo(JOptionPane.showInputDialog("Digite sexo: "));
        
        JOptionPane.showMessageDialog(null, "Informações: \nCódigo: " +p.getCodigo() +"\nNome: "
                                            +p.getNome() +"\nSexo: "
                                            +p.getSexo());
    }
    
}
