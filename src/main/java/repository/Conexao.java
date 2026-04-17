package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/loja_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Joao23@01*";
    private static Connection conn = null;
    
    public void conexao(){
    }
    
    public static synchronized Connection conectar() {
        try{
            if(conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}

