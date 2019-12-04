package dao;

import connect.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Pratos;

public class PratosDAO {
    public static void inserir(Pratos p) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement ps = null;
        
        try{                                                  //COLOCAR AQUI OS NOMES DO CAMPOS DA TABELA   //AQUI CADA ? E REFERENTE A UM CAMPO
            ps = con.prepareStatement("INSERT INTO PRATOS (nome_p) values (?);");
            ps.setString(1, p.getNome_p());
            ps.executeUpdate();//usa ele para o grud
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão: Cadastro não realizado!");

        }finally{
            ConexaoBD.fechaConexao(ps, con);
        }
    }
    
}