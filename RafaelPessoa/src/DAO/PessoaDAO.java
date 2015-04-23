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
import modelo.Pessoa;

/**
 *
 * @author Jiovana
 */
public class PessoaDAO {
    
    //monta sql de insert na tabela

    public Boolean inserir(Pessoa pessoa) {
        Boolean retorno;
        String sql = "INSERT INTO pessoa(pesnome,pessexo)" + "VALUES(?,?)";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setString(1, pessoa.getNome());
            pst.setString(2, pessoa.getSexo());
            //executa sql no banco
            pst.executeUpdate();
            retorno = true;

        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Pessoa> listar(){
        //cirar lista de pessoas
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM pessoa";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //executa sql e joga em um resultSet
            ResultSet res = pst.executeQuery();
            //enquanto tiver registro vai relacionar com a classe pessoa e adicionar na lista
            while(res.next()){
                Pessoa p= new Pessoa();
                p.setCodigo(Integer.parseInt(res.getString("id")));
                p.setNome(res.getString("pesnome"));
                p.setSexo(res.getString("pessexo"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public Boolean excluir(Pessoa pessoa) {
        Boolean retorno;
        //monta sl e inseren na tabela
        String sql = "DELETE FROM pessoa WHERE id=?";
        //prepara conexao
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            //insere parametros
            pst.setInt(1,pessoa.getCodigo());
            
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
