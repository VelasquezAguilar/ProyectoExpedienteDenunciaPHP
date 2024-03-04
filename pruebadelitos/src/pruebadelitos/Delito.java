package pruebadelitos;

//Clase Delito
class Delito {
 private String nombre;
 private String descripcion;

 // Constructor
 public Delito(String nombre, String descripcion) {
     this.nombre = nombre;
     this.descripcion = descripcion;
 }

 // Métodos para obtener nombre y descripción del delito
 public String getNombre() {
     return nombre;
 }

 public String getDescripcion() {
     return descripcion;
 }
}