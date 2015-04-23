/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//objeto de acesso a dados = dao
package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;

/**
 *
 * @author Jiovana
 */
public class CidadeDAO {
    
    //monta sql de insert na tabela

    public Boolean inserir(Cidade cidade) {
        Boolean retorno;
        String sql = "INSERT INTO cidade(cidnome)" + "VALUES(?)";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setString(1, cidade.getNome());
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Cidade> listar(){
        //cirar lista de cidades
        List<Cidade> lista = new ArrayList<Cidade>();
        String sql = "SELECT * FROM cidade";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe cidade e adicionar na lista
            while(res.next()){
                Cidade c= new Cidade();
                c.setCodigo(Integer.parseInt(res.getString("id")));
                c.setNome(res.getString("cidnome"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public Boolean excluir(Cidade cidade) {
        Boolean retorno;
        //monta sl e inseren na tabela
        String sql = "DELETE FROM cidade WHERE id=?";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setInt(1,cidade.getCodigo());
            
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }

}

