package prueba2delitosconlista;

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
        for (Delito delito : delitos) {
            System.out.println("Delito cometido por el demandado: " + delito.getNombre());
            System.out.println("Descripción: " + delito.getDescripcion());
        }
    }

	public String jhoan() {
		// TODO Auto-generated method stub
		return null;
	}
}