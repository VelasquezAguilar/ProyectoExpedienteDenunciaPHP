package Version_Oficial.CodigoDelitos.src.Classes_Conexion;

//import java.util.ArrayList;

//Clase Direccion
public class Direccion {
    private String departamento;
    private String municipio;
    private String colonia;
    private String bloque;
    private String casa;
    private String calle;
    public Delito objDelito;
    public String descripcion;

    public String[] OpcDeptos = {
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

    // se implmenta conceptos de composicion para el objeto {delito}
    public Direccion(String departamento, String municipio, String colonia, String bloque, String calle,
            String descripcion) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.colonia = colonia;
        this.bloque = bloque;
        this.calle = calle;
        this.objDelito = new Delito(descripcion);

    }

    // Método para obtener la dirección como String
    public String obtenerDireccion() {
        return this.departamento + ", " + this.municipio + ", " + this.colonia + ", " + this.bloque + " , " + this.casa;
    }

    // Metodo para obtenr direccion de donde ocuurrio el delito
    public String obtenerDireccionDelito() {
        return this.departamento + ", " + this.municipio + ", " + this.colonia + ", " + this.bloque + " , " + this.calle
                + ", " + this.descripcion;
    }

}
