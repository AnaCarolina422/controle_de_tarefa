/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Tarefa {
   //Variaveis 
    private String tarefa, descricao, status;
    private int id;
    private LocalTime horainicio, horafim;
    private LocalDate dataTarefa;
   
  
    
    
    
  // metodo get e set   
public String getTarefa(){
    return tarefa;

}
public void setTarefa(String tarefa){

this.tarefa = tarefa;

}
public String getDescricao(){

    return descricao;

}

public void setDescricao(String descricao){

this.descricao = descricao;

}
public LocalDate getDataTarefa(){

    return dataTarefa;

}

public void setDataTarefa(LocalDate dataTarefa){

this.dataTarefa = dataTarefa;

}
public LocalTime getHorainicio(){

    return horainicio;

}

public void setHorainicio(LocalTime horainicio){

this.horainicio = horainicio;

}
public LocalTime getHoraFim(){

    return horafim;

}

public void setHoraFim(LocalTime horafim){

this.horafim = horafim;

}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    public  String getStatus(){

    return status;

}

public void setStatus(String status){

this.status = status;

}
    

}
