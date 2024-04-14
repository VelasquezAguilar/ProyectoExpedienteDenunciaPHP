package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

import java.util.ArrayList;


//Clase Direccion
class Direccion  {
 private String departamento;
 private String municipio;
 private String colonia;
 private String bloque;
 private String casa;
 private String calle;
 public Delito objDelito;

 public String[]  OpcDeptos = {
            "Atlántida",
            "Choluteca",
            "Colón",
            "Comayagua",
            "Copán",
            "Cortés",
            "El Paraíso",
            "Francisco Morazán",
            "Gracias a Dios",
            "Intibucá",
            "Islas de la Bahía",
            "La Paz",
            "Lempira",
            "Ocotepeque",
            "Olancho",
            "Santa Bárbara",
            "Valle",
            "Yoro"
 };


 // Constructor

 public Direccion(String departamento, String municipio, String colonia, String bloque, String casa) {
     this.departamento = departamento;
     this.municipio = municipio;
     this.colonia = colonia;
     this.bloque = bloque;
     this.casa = casa;
    
 }

 public Direccion(String departamento, String municipio, String colonia, String bloque, String calle, String descripcion) {
    this.departamento = departamento;
    this.municipio = municipio;
    this.colonia = colonia;
    this.bloque = bloque;
    this.calle = calle;
    this.objDelito = new Delito(descripcion);
   
}

    // Método para obtener la dirección como String
    public String obtenerDireccion() {
        return departamento + ", " + municipio + ", " + colonia + ", " + bloque +" , "+ casa;
    }

    
}

