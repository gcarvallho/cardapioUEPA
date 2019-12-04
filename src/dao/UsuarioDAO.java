package dao;

import connect.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDAO {
    public static void inserir(Usuario u) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement("INSERT INTO usuario (nome_completo,usuario,telefone,senha) values (?,?,?,?);");
            ps.setString(1, u.getNome_completo());
            ps.setString(2, u.getUsuario());
            ps.setString(3, u.getTelefone());
            ps.setString(4, u.getSenha());
            ps.executeUpdate();//usa ele para o grud
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão: Cadastro não realizado!");

        }finally{
            ConexaoBD.fechaConexao(ps, con);
        }
    }
    
}
