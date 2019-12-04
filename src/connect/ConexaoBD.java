package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public static Connection getConnection() {//chama o metodo que abre a conexão com o BD
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/cardapioUEPA","root","usbw");
        }catch(ClassNotFoundException e ){//trata o erro do driver jdbc
            JOptionPane.showMessageDialog(null,"ERRO: Driver JBDC Não Encontrado");
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null, "ERRO: Problema na conexão com o BD");
        }
        return null;
    }
    
    public static void fechaConexao(){
        try{
            getConnection().close();
            JOptionPane.showMessageDialog(null,"Conexão Finalizada com Sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO: Não foi possivel fechar a conexão");
        }
    }
    
    public static void fechaConexao(PreparedStatement ps, Connection con){
        try{
            JOptionPane.showMessageDialog(null, "Conexão Liberada!");
            con.close();
            JOptionPane.showMessageDialog(null,"Conexão Finalizada com Sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO: Não foi possivel fechar a conexão");
        }
    }
}
