/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
/**
 *
 * @author Aluno
 */
public class JogadorDAO {
    
    public Boolean inserir(Jogador jogador){
       Boolean retorno = null;
       String sql = "INSERT INTO jogador(login,senha,email)" + "VALUES(?,?,?)";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       
        try {
            //insere
            pst.setString(1, jogador.getLogin());
            pst.setString(2, jogador.getSenha());
            pst.setString(3, jogador.getEmail());
             //executa e manda pro banco
            pst.executeUpdate();
        
        } catch (Exception ex) {
            
         ex.printStackTrace();
         retorno = false;
        }
       return retorno;
    }
    
     public Boolean excluir(Jogador jogador){
       Boolean retorno = null;
       String sql = "DELETE FROM jogador WHERE login = ?";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       
        try {
            //insere
            pst.setString(1, jogador.getLogin());
            
             //executa e manda pro banco
            pst.executeUpdate();
        
        } catch (Exception ex) {
            
         ex.printStackTrace();
         retorno = false;
        }
       return retorno;
    }
  
    public List<Jogador> listar()
    {
        List<Jogador> lista = new ArrayList<Jogador>();
        String sql = "Select * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Jogador jogador = new Jogador();
                jogador.setLogin(res.getString("Login"));
                jogador.setSenha(res.getString("Senha"));
                jogador.setEmail(res.getString("Email"));
            }
        } catch (SQLException e) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
        
 }
}