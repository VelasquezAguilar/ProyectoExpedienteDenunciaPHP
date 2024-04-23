package com.example.postgresql;
public class persona {
    private String nombre ;
    private String apellido;
    private int edad ;
    private Direccion direccion;
    private long identidad ;

    //constructor 
    public persona(){
        
        
    }
    public persona(String nombre, String apellido, int edad, Direccion direccion, long identidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;    
        this.identidad=identidad;
    }

    //metodo para importar la direccion de la persona
    public String obtenerDireccion(){
        String direct = direccion.obtenerDireccion();
        return direct;
    }
    //getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre ;
    }

    public String  getApellido() {
        return apellido;
    }
    public void setApelido(String apellido){
        this.apellido= apellido;
    }

    public int getedad(){
        return edad;
    }
    public   void setEdad (int edad) {
       this.edad = edad;
    }

    public long getid(){
        return  identidad;
    }
    public void setid(long id){
        this.identidad = id;
    }
    
}
