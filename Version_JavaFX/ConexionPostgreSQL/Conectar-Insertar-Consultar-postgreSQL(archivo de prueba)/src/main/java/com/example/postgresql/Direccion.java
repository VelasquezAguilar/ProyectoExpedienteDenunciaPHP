package com.example.postgresql;

//import java.util.ArrayList;
public class Direccion {
    private String departamento;
    private String municipio;
    private String colonia;
    //private Srting bloque;

    //constructor 
    public  Direccion(String departamento, String municipio, String  colonia) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.colonia = colonia;
        //this.bloque = bloque;
   }

   //metodo para obtener la direccion como una cadena unica 
   public String obtenerDireccion() {
     String direCompleta= departamento + ", " +municipio+ ", " + colonia;
     return direCompleta;
   }
}

