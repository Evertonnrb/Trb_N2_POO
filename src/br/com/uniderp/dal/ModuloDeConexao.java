package br.com.uniderp.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ModuloDeConexao {

    /**
     * @Param conector metodo responsavel por estabelecer a conexao com bd
     *
     */
    public static Connection conector() {
        //criando a variavel de conxao, atraves do pacote java SQL
        java.sql.Connection conexao = null;
        //chamando o driver do MySql
        String driver = "com.mysql.jdbc.Driver";
        //Parametros de conexao
        String url = "jdbc:mysql://localhost:3306/db_controle";
        String user = "root";
        String senha = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ");
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return null;
    }
}
