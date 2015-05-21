package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

public class PerguntaDAO {
    
    public Boolean inserir (Pergunta pergunta)
    {
        Boolean retorno;
        
        String sql = "INSERT INTO Pergunta (enunciado, a, b, c, d, nivel, certa) VALUES  (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setString(1, pergunta.getEnunciado());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(4, pergunta.getC());
            pst.setString(5, pergunta.getD());
            pst.setInt(6, pergunta.getNivel());
            pst.setString(7, pergunta.getCerta());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<Pergunta> listarNivel1()
    {
    
    List <Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM PERGUNTA where nivel = 1 order by random() limit 3";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            //Enquanto tiver registro eu vou relacionar com minha classe Jogador e adicionar na lista
            while (res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setId(res.getInt("id"));
                pergunta.setEnunciado(res.getString("enunciado"));
                pergunta.setA(res.getString("a"));
                pergunta.setB(res.getString("b"));
                pergunta.setC(res.getString("c"));
                pergunta.setD(res.getString("d"));
                pergunta.setNivel(res.getInt("nivel"));
                pergunta.setCerta(res.getString("certa"));
                lista.add(pergunta);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public List<Pergunta> listarNivel2()
    {
    
    List <Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM PERGUNTA where nivel = 2 order by random() limit 3";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            //Enquanto tiver registro eu vou relacionar com minha classe Jogador e adicionar na lista
            while (res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setId(res.getInt("id"));
                pergunta.setEnunciado(res.getString("enunciado"));
                pergunta.setA(res.getString("a"));
                pergunta.setB(res.getString("b"));
                pergunta.setC(res.getString("c"));
                pergunta.setD(res.getString("d"));
                pergunta.setNivel(res.getInt("nivel"));
                pergunta.setCerta(res.getString("certa"));
                lista.add(pergunta);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
    
    
    public List<Pergunta> listar()
    {
        List <Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        { 
            //Executo o sql e jogo em um resultset
            ResultSet res = pst.executeQuery();
            //Enquanto tiver registro eu vou relacionar com minha classe Jogador e adicionar na lista
            while (res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setId(res.getInt("id"));
                pergunta.setEnunciado(res.getString("enunciado"));
                pergunta.setA(res.getString("a"));
                pergunta.setB(res.getString("b"));
                pergunta.setC(res.getString("c"));
                pergunta.setD(res.getString("d"));
                pergunta.setNivel(res.getInt("nivel"));
                pergunta.setCerta(res.getString("certa"));
                lista.add(pergunta);
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean remover (Pergunta pergunta)
    {
        Boolean retorno;
        
        String sql = "DELETE FROM pergunta WHERE id = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try
        {
            pst.setInt(1, pergunta.getId());
         
            pst.executeUpdate();
            retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
}
