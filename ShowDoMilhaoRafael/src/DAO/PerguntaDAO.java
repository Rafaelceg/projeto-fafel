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
import modelo.Pergunta;

/**
 *
 * @author Aluno
 */
public class PerguntaDAO {
    public Boolean inseir(Pergunta pergunta){
       Boolean retorno = null;
       String sql = "INSERT INTO pergunta(enunciado,a,b,c,d,nivel,certo)" + "VALUES(?,?,?,?,?,?,?)";
       
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       
       
        try {
            pst.setString(1, pergunta.getEnunciado());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(4, pergunta.getC());
            pst.setString(5, pergunta.getD());
            pst.setString(6, pergunta.getNivel().toString());
            pst.setString(7, pergunta.getCerta());
            
            pst.executeUpdate();
            } catch (Exception ex) {
            ex.printStackTrace();
         
         retorno = false;
        }
        return retorno;
        }
    
    public List<Pergunta> listarnv1()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "Select * FROM pergunta where nivel = 1 order by random()";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Pergunta a = new Pergunta();
                a.setA(res.getString("A"));
                a.setB(res.getString("B"));
                a.setC(res.getString("C"));
                a.setD(res.getString("D"));
                a.setEnunciado(res.getString("Enunciado"));
                a.setNivel(res.getInt("Nivel"));
                a.setCerta(res.getString("Certa"));
                a.setId(res.getInt("Id"));
                lista.add(a);
            }
        } catch (SQLException e) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
    
 }
    
     public List<Pergunta> listar()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "Select * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Pergunta a = new Pergunta();
                a.setA(res.getString("A"));
                a.setB(res.getString("B"));
                a.setC(res.getString("C"));
                a.setD(res.getString("D"));
                a.setEnunciado(res.getString("Enunciado"));
                a.setNivel(res.getInt("Nivel"));
                a.setCerta(res.getString("Certa"));
                a.setId(res.getInt("Id"));
                lista.add(a);
            }
        } catch (SQLException e) {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
    
 }
}
