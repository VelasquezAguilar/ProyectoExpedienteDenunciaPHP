package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

import prueba2delitosconlista.Direccion;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    private String Id;

    // Constructor
    public Persona(String nombre, String apellido, int edad,String Id, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.Id= Id;
    }

    // Método para obtener la dirección de la persona
    public String obtenerDireccion() {
        return direccion.obtenerDireccion();
    }

    // Métodos getter para los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return Id;
    }
}