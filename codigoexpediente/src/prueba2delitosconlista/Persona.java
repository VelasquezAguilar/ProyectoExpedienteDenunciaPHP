package prueba2delitosconlista;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    // Constructor
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
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
}