package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

import java.util.ArrayList;

import java.util.ArrayList;

//Clase Direccion
class Direccion {
 private String departamento;
 private String municipio;
 private String colonia;
 private String bloque;
 private String casa;

 // Constructor
 public Direccion(String departamento, String municipio, String colonia, String bloque) {
     this.departamento = departamento;
     this.municipio = municipio;
     this.colonia = colonia;
     this.bloque = bloque;
     this.casa = casa;
 }

    // Método para obtener la dirección como String
    public String obtenerDireccion() {
        return departamento + ", " + municipio + ", " + colonia + ", " + bloque +" , "+ casa;
    }
}

