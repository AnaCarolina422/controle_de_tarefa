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
public class TestaConexao {
 public static void main(String[] args) throws ClassNotFoundException {
               
        try {
            Connection conn =  ConexaoSQL.conectar();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexao aberta.");
               
        }
            ConexaoSQL conexao = new ConexaoSQL();
            conexao.conn = conn;
            boolean desconectou = conexao.desconectar();
            if (desconectou && conn.isClosed()) {
                System.out.println("Conexao Fechada.");
            } else {
                System.out.println("Falha ao Eechar");
            }
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }   
}
