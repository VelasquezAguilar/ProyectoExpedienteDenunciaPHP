package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista;

import java.util.Scanner;

import Version_Oficial.CodigoDelitos.src.prueba2delitosconlista.Direccion;

@SuppressWarnings("unused")
class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    private String Id;
    public String[] Genero = {"Masculino", "Femenino", "0tr0"};
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


    //metodo para poder capturar la opcion seleccionada por el "Actor"
    public static String mostrarGenero(){
        System.out.println("Ingrese el inciso con el genero que se identifica:");
        for (int i = 0; i < Genero.length; i++) {
            System.out.println((i+1)+"). "+Genero[i]);
        }

        Scanner scanner = new Scanner (System.in);
        int opcionSeleccionada = scanner.nextInt();

        //creo que esto no es necesario ya que se retorna por el metodo el genero seleccionado 
        if (opcionSeleccionada == 0 ){
            System.out.println("Genero: " + Genero[0]);
        }else if (opcionSeleccionada == 1){
            System.out.println("Genero: "+ Genero[1]);
        }else if (opcionSeleccionada ==2) {
            System.out.println("Genero: "+ Genero[2]);
        }else {
            System.out.println("Opcion invalida");
        }

        scanner.close();
        

        return Genero[opcionSeleccionada-1];
    }
}