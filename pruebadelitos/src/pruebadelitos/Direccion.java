package pruebadelitos;

import java.util.ArrayList;

//Clase Direccion
class Direccion {
 private String departamento;
 private String municipio;
 private String colonia;
 private String bloque;

 // Constructor
 public Direccion(String departamento, String municipio, String colonia, String bloque) {
     this.departamento = departamento;
     this.municipio = municipio;
     this.colonia = colonia;
     this.bloque = bloque;
 }

 // Método para obtener la dirección como String
 public String obtenerDireccion() {
     return departamento + ", " + municipio + ", " + colonia + ", " + bloque;
 }
}
