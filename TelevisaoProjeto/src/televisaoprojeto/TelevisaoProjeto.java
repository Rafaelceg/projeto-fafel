/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisaoprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelevisaoProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ator a = new Ator();
        Integer aux;
        
        a.setNome(JOptionPane.showInputDialog("Informe o nome do ator "));
        a.setNomea(JOptionPane.showInputDialog("Informe o nome artistico "));
        a.setEmail(JOptionPane.showInputDialog("Informe o email do ator"));
        a.setNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do ator "));
        a.setEndereco(JOptionPane.showInputDialog("Informe o endereço do ator "));
        a.setBairro(JOptionPane.showInputDialog("Informe o bairro onde mora o ator "));
        a.setCidade(JOptionPane.showInputDialog("Informe a cidade onde vive o ator "));
        a.setEstado(JOptionPane.showInputDialog("Informe o estado onde vive o ator "));
        a.setSalariom (Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do ator ")));
        a.setCacheev(Double.parseDouble(JOptionPane.showInputDialog("Informe o cache por evento do ator ")));
        a.setQtdnovela(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de novelas que participou o ator ")));
        a.setQtdevento(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de novelas que participou o ator ")));
        aux = (Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eventos que o ator participou no mês: ")));
        if(aux>=3){
            JOptionPane.showMessageDialog(null,"Informações\nNome Artístico: " +a.getNomea() +"\nData de nascimento: " +a.getNascimento() +"\nEmail: " +a.getEmail() +"\nQuantidade de novelas: " +a.getQtdnovela() +"\nStatus: " +a.obterStatus() +"\nGanhos Mensais: " +a.calcularGanhos(aux));
        }else{
            JOptionPane.showMessageDialog(null,"Informações\nNome Artístico: " +a.getNomea() +"\nData de nascimento: " +a.getNascimento() +"\nEmail: " +a.getEmail() +"\nQuantidade de novelas: " +a.getQtdnovela() +"\nStatus: " +a.obterStatus());
        }
        
        Novela n = new Novela();
        String verifica;
        
        n.setTitulo(JOptionPane.showInputDialog("Informe o titulo da novela: "));
        n.setAutor(JOptionPane.showInputDialog("Informe o autor da novela: "));
        n.setDuracao(JOptionPane.showInputDialog("Informe a duração: data do primeiro e do ultimo capitulo "));
        n.setEmissora(JOptionPane.showInputDialog("Informe a emissora que transmite a novela: "));
        n.setHorario(JOptionPane.showInputDialog("Informe o horario da novela"));
        n.setIbope(Double.parseDouble(JOptionPane.showInputDialog("Informe o ibope da novela")));
        verifica=JOptionPane.showInputDialog("A novela possui cenas de violência? S/N");
        if(verifica.equals("S")){
            n.setViolencia(true);
        }else{
            n.setViolencia(false);
        }
        verifica=JOptionPane.showInputDialog("A novela possui cenas de sexo? S/N");
        if(verifica.equals("S")){
            n.setSexo(true);
        }else{
            n.setSexo(false);
        }
        verifica=JOptionPane.showInputDialog("A novela possui cenas de uso de drogas? S/N");
        if(verifica.equals("S")){
            n.setDrogas(true);
        }else{
            n.setDrogas(false);
        }
        JOptionPane.showMessageDialog(null, "Informações Novela: \nTÍtulo: " +n.getTitulo() +"\nEmissora: " +n.getEmissora() +"\nAutor: " +n.getAutor() +"\nHorário: " +n.getHorario() +"\nDuração: " +n.getDuracao() +"\nClassificação: " +n.getClassificacao() +"\nIbope: " +n.getIbope() +"\nNº de pessoas que assistem: " +n.getQtdPessoa());
        
        Emissora e = new Emissora();
        String quale;
        e.setNome(JOptionPane.showInputDialog("Informe o nome da emissora: "));
        e.setEndereco(JOptionPane.showInputDialog("Informe o endereço da emissora: "));
        quale = JOptionPane.showInputDialog("A emissora transmite em tv aberta ou fechada?: A/F");
        if(quale.equals("A")){
            e.setTipo(false);
        }else{
            e.setTipo(true);
        }
        JOptionPane.showMessageDialog(null, "Informações: \nNome da emissora: " +e.getNome() +"\nEndereço: " +e.getEndereco()+"\nTV fechada ou aberta? true fechada false aberta" +e.isTipo()) ;
    }
    
}
