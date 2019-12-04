package connect;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws SQLException {
        
        JOptionPane.showMessageDialog(null, "CONECTADO!");
        
        ConexaoBD.fechaConexao();
    }
}
