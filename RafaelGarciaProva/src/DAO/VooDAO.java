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
import modelo.Voo;
/**
 *
 * @author Aluno
 */
public class VooDAO {
    
    public Boolean inserir(Voo voo){
       Boolean retorno = null;
       String sql = "INSERT INTO voo(numero, origem, destino, paradas)" + "VALUES(?,?,?,?)";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       
        try {
            //insere
            pst.setString(1, voo.getNumero().toString());
            pst.setString(2, voo.getOrigem());
            pst.setString(3, voo.getDestino());
            pst.setString(4, voo.getParadas().toString());
             //executa e manda pro banco
            pst.executeUpdate();
        
        } catch (Exception ex) {
            
         ex.printStackTrace();
         retorno = false;
        }
       return retorno;
    }
public Boolean excluir(Voo voo){
       Boolean retorno = null;
       String sql = "DELETE FROM voo WHERE numero = ?";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       
        try {
            //insere
            pst.setString(1, voo.getNumero().toString());
            
             //executa e manda pro banco
            pst.executeUpdate();
        
        } catch (Exception ex) {
            
         ex.printStackTrace();
         retorno = false;
        }
       return retorno;
    }
  
    public List<Voo> listar()
    {
        List<Voo> lista = new ArrayList<Voo>();
        String sql = "Select * FROM voo";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Voo a = new Voo();
                a.setNumero(res.getInt("Numero do vôo"));
                a.setOrigem(res.getString("Origem"));
                a.setDestino(res.getString("Destino"));
                a.setParadas(res.getInt("Paradas"));
            }
        } catch (SQLException e) {
            Logger.getLogger(VooDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
        
 }
}
