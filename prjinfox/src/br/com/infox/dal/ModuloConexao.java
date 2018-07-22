package br.com.infox.dal;

import java.sql.*; // * vai trazer tudo a ser utilizado

/**
 *
 * @author claud
 */
public class ModuloConexao { //Módulo responsável por estabelecer a conexão com o BD
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";            // chama o drive
        String url = "jdbc:mysql://localhost:3306/dbinfox?useTimezone=true&serverTimezone=UTC"; //armazena informações ao bd
        String user = "root";
        String password = "";
        try{
            Class.forName(driver);  //obtém e retorna a conexão
                    conexao = DriverManager.getConnection(url, user, password);
                    return conexao;
        }catch (Exception e){
            //System.out.println(e);
           return null;
        }
    }
}
