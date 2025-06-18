/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.*;
/**
 *
 * @author Senac
 */
public class ConexaoSQL {
    // variaveis que recebe a conexão
   public Connection conn;
   
   public static Connection conectar() throws ClassNotFoundException{
   
       Connection conn = null;
       
       String driverName = "com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/bd_controletarefas";
       String userName = "root";
       String password = "Senha@123";
       
       try {
           Class.forName(driverName);
           conn = DriverManager.getConnection(url, userName, password);
           System.out.println("Conexao OK!");
           return conn;
       } catch (SQLException ex) {
           System.out.println("Conexao Falhou...");
           return null;
       }
       
   }
   public PreparedStatement criarPreparedStatement(String pSQL, int RETURN_GENERATED_KEYS){
       try {
           return conn.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
       } catch (SQLException ex) {
           ex.printStackTrace();
           return null;
       }
       
   }
   public boolean desconectar(){
       try {
           if (!this.conn.isClosed()) {
               this.conn.close();
               
           }
       } catch (SQLException ex) {
           System.err.println(ex.getMessage());
           return false;
       }
       return true;
   }
   

 
}
