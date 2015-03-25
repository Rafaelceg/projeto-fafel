
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class TesteBancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inserir();
        List<Jogador> lista = listar();
        for (Jogador jogador : lista) {
            System.out.println(jogador.getLogin() + "\n");

        }

        // TODO code application logic here
    }

    public static List<Jogador> listar()

    {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        try {
            String sql = "SELECT * FROM jogador";
            PreparedStatement pst
                    = Conexao.getPreparedStatement(sql);
            ResultSet res = pst.executeQuery();
            while (res.next()) {

                Jogador jog = new Jogador();
                jog.setLogin(res.getString("login"));
                jog.setSenha(res.getString("senha"));
                jog.setEmail(res.getString("email"));

                jogadores.add(jog);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TesteBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jogadores;

    }

    public static void Inserir() {
        String login, email, senha;
        login = JOptionPane.showInputDialog("LOGIN:");
        senha = JOptionPane.showInputDialog("SENHA:");
        email = JOptionPane.showInputDialog("EMAIL:");
        
        String sql;
        sql = "INSET INTO jogador(login, senha, email)" + "VALUES (?,?,?)";
        PreparedStatement pst
                    = Conexao.getPreparedStatement(sql);
        try{
            pst.setString(1, login);
            pst.setString(2, senha);
            pst.setString(3, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }

                
    }
}
