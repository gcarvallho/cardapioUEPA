package dao;

import connect.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Lanchonete;

public class LanchoneteDAO {
    public static void inserir(Lanchonete l) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement ps = null;
        
        try{                                                  //COLOCAR AQUI OS NOMES DO CAMPOS DA TABELA   //AQUI CADA ? E REFERENTE A UM CAMPO
            ps = con.prepareStatement("INSERT INTO LANCHONETE (nome_l,cnpj_l,responsavel_l) values (?,?,?);");
            ps.setString(1, l.getNome_l());
            ps.setString(2, l.getCnpj_l());
            ps.setString(3, l.getResponsavel_l());
            ps.executeUpdate();//usa ele para o grud
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão: Cadastro não realizado!");

        }finally{
            ConexaoBD.fechaConexao(ps, con);
        }
    }
    
}
