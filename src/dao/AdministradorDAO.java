package dao;

import connect.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Administrador;

public class AdministradorDAO {
    public static void inserir(Administrador a) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement("INSERT INTO ADMINISTRADOR (nome_completo_a,usuario_a,senha_a) values (?,?,?);");
            ps.setString(1, a.getNome_completo());
            ps.setString(2, a.getUsuario());
            ps.setString(3, a.getSenha());
            ps.executeUpdate();//usa ele para o grud
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão: Cadastro não realizado!");

        }finally{
            ConexaoBD.fechaConexao(ps, con);
        }
    }
    
}
