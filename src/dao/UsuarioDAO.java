package dao;

import connect.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDAO {
    public static void inserir(Usuario u) {
        Connection con = ConexaoBD.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement("INSERT INTO USUARIO (nome_completo_u,usuario_u,telefone_u,senha_u) values (?,?,?,?);");
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
    
    //Metodo Consultar
    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
        String sql;
        try {
            Connection conn = ConexaoBD.getConnection();

            sql = "SELECT id, username, senha, acesso FROM usuarios WHERE username=? and senha=?";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next()) {
                //Acesso = rs.getString("acesso");
                //id = rs.getInt("idUser");
                autenticado = true;
            } else {
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(this, ex);
        }
        return autenticado;
    }
    
    
}
