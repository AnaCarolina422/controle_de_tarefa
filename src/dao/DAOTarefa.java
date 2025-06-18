
package dao;

import model.Tarefa;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexaoSQL;
/**
 *
 * @author Senac
 */
public class DAOTarefa extends ConexaoSQL{

    public int salvarTarefaDAO(Tarefa pTarefa) {
        try {
            conn = ConexaoSQL.conectar(); //tentar conectar

            String sql = "INSERT INTO tb_tarefas ("
                    + "tarefa, "
                    + "descricao, "
                    + "data_tarefa, "
                    + "hora_inicio, "
                    + "hora_fim, "
                    + "status"
                    + ") VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstm = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){

             pstm.setString(1, pTarefa.getTarefa());
             pstm.setString( 2, pTarefa.getDescricao());
             pstm.setDate(3, java.sql.Date.valueOf(pTarefa.getDataTarefa()));
             pstm.setTime(4, java.sql.Time.valueOf(pTarefa.getHorainicio()));
             pstm.setTime(5,java.sql.Time.valueOf(pTarefa.getHoraFim()));
             pstm.setString(6, pTarefa.getStatus());
             pstm.executeUpdate();

             try (ResultSet rs = pstm.getGeneratedKeys()) {

                 if (rs.next()) {
                     int idGerado = rs.getInt(1);
                     pTarefa.setId(idGerado);
                     return idGerado;
                 }
            }
        } catch (Exception e){
              e.printStackTrace();
                 return 0;
} finally {
this.desconectar();
}

             } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

        }

     public ArrayList<Tarefa> listarTarefaDAO(){
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        try {
            conn = ConexaoSQL.conectar();

            String sql = "SELECT * FROM tb_tarefas";
            try(PreparedStatement pstm = criarPreparedStatement(sql, 0);
                    ResultSet rs = pstm.executeQuery();) {

                while (rs.next()) {
                    Tarefa pTarefa = new Tarefa();
                    pTarefa.setId(rs.getInt("id"));
                    pTarefa.setTarefa(rs.getString("tarefa"));
                    pTarefa.setDescricao(rs.getString("descricao"));
                    pTarefa.setDataTarefa(rs.getDate("data_tarefa").toLocalDate());
                    pTarefa.setHorainicio(rs.getTime("hora_inicio").toLocalTime());
                    pTarefa.setHoraFim(rs.getTime("hora_fim").toLocalTime());
                    pTarefa.setStatus(rs.getString("status"));
                    listaTarefas.add(pTarefa);

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.desconectar();
            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaTarefas;
    }
       public boolean editarTArefaDAO(Tarefa pTarefa){

        try {
            conn = ConexaoSQL.conectar();

            String sql = ("UPDATE tb_tarefas SET tarefa = ?,"
                    + "descricao = ?,"
                    + "data_tarefa = ?,"
                    + "hora_inicio = ?,"
                    + "hora_fim = ?,"
                    + "status = ? WHERE id = ?");

            try(PreparedStatement pstm = criarPreparedStatement(sql, 0)) {
                pstm.setString(1, pTarefa.getTarefa());
                pstm.setString(2, pTarefa.getDescricao());
                pstm.setDate(3, java.sql.Date.valueOf(pTarefa.getDataTarefa()));
                pstm.setTime(4, java.sql.Time.valueOf(pTarefa.getHorainicio()));
                pstm.setTime(5, java.sql.Time.valueOf(pTarefa.getHoraFim()));
                pstm.setString(6, pTarefa.getStatus());
                pstm.setInt(7, pTarefa.getId());
                pstm.executeUpdate();
                int linhaAfetadas = pstm.executeUpdate();
                return linhaAfetadas > 0;

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.desconectar();
                return true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    public boolean excluirTarefaDAO(int id) {

        try {
            conn = ConexaoSQL.conectar();
            String sql = "DELETE FROM tb_tarefas WHERE id = ?;";

            try (PreparedStatement pstm = criarPreparedStatement(sql, 0)){
               pstm.setInt(1, id);
               int linhasAfetadas = pstm.executeUpdate();
             return linhasAfetadas >0;

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                this.desconectar();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * METODO RETORNA DATAS DAS TAREFAS
     */
    public ArrayList<LocalDate>listarDatasTarefasDAO(){
    ArrayList<LocalDate> lista = new ArrayList();
    
        try {
            conn = ConexaoSQL.conectar();
            String sql = "SELECT DISTINCT data_tarefa FROM tb_tarefas ORDER BY data_tarefa ";
            
            try (PreparedStatement pstm = conn.prepareStatement(sql);
                    ResultSet rs = pstm.executeQuery()){
                while (rs.next()) {
                   lista.add(rs.getDate("data_tarefa").toLocalDate());
                    
                }
             conn.close();
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<Tarefa> listarTarefasDataDAO(LocalDate data) {
      ArrayList<Tarefa> lista = new ArrayList<>();
        try {
            conn = ConexaoSQL.conectar();
            
            String sql = "SELECT * FROM tb_tarefas WHERE data_tarefa = ? ORDER BY hora_inicio";
            
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setDate(1, java.sql.Date.valueOf (data));
            
                try (ResultSet rs = pstm.executeQuery()){
                    while (rs.next()) {
                        Tarefa t = new Tarefa();
                        t.setId(rs.getInt("id"));
                        t.setTarefa(rs.getString("tarefa"));
                        t.setDescricao(rs.getString("descricao"));
                        t.setDataTarefa(rs.getDate("data_tarefa").toLocalDate());
                        t.setHorainicio(rs.getTime("hora_inicio").toLocalTime());
                        t.setHoraFim(rs.getTime("hora_fim").toLocalTime());
                        t.setStatus(rs.getString("status"));
                        
                        lista.add(t);
                        
                        
                    }
 
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            } catch (Exception e) {
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    
    public ArrayList<Tarefa> listarTarefasPorIntervalo(LocalDate dataInicio, LocalDate dataFim) {
      ArrayList<Tarefa> lista = new ArrayList<>();
      
        try {
             conn = ConexaoSQL.conectar();
             String sql = "SELECT * FROM tb_tarefas WHERE data_tarefa BETWEEN ? AND ? ORDER BY data_tarefa, hora_inicio";
             try (PreparedStatement pstm = conn.prepareStatement(sql)) {
             pstm.setDate(1, java.sql.Date.valueOf(dataInicio));
             pstm.setDate(2, java.sql.Date.valueOf(dataFim));
             
             try (ResultSet rs = pstm.executeQuery()) {
             while (rs.next()){
             Tarefa tarefa = new Tarefa ();
             tarefa.setId(rs.getInt("Id"));
             tarefa.setTarefa(rs.getString ("tarefa"));
             tarefa.setTarefa(rs.getString ("descricao"));
             tarefa.setDataTarefa(rs.getDate("data_tarefa").toLocalDate());
             tarefa.setHorainicio(rs.getTime("hora_inicio").toLocalTime());
             tarefa.setHoraFim(rs.getTime("hora_fim").toLocalTime());
             tarefa.setStatus(rs.getString("status"));
             
             lista.add(tarefa);
             }
             }
             conn.close();  
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOTarefa.class.getName()).log(Level.SEVERE,null , ex);
        }
        return lista;
      
    }
 
    }




