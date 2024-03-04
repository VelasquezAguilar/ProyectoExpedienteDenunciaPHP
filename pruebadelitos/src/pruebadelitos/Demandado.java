package pruebadelitos;

import java.util.ArrayList;

class Demandado extends Persona {
    private ArrayList<Delito> delitos;

    // Constructor
    public Demandado(String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        delitos = new ArrayList<>();
    }

    // Método para agregar un delito a la lista de delitos
    public void agregarDelito(Delito delito) {
        delitos.add(delito);
    }

    // Método para mostrar los delitos cometidos por el demandado
    public void mostrarDelitos() {
        System.out.println("Delitos cometidos por el demandado:");
        for (Delito delito : delitos) {
            System.out.println("- " + delito.getNombre() + ": " + delito.getDescripcion());
        }
    }
}
