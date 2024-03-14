package com.example.postgresql;

public class Demandante extends persona {
    //int idDemandante;
    //constructor
    public Demandante(){
        super();
       
    } 
    public  Demandante(String nombre, String apellido, int edad, Direccion direccion, int identidad) {
        super(nombre,apellido, edad, direccion, identidad);
    }
    

    /*public int getid_demandante(){
        return idDemandante; 
    }
    public  void setId_demandate(int id){
        idDemandante=id;    
    }*/
}
