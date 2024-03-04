package delitos;

public class demandante extends persona{

	public demandante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public demandante(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad);
		// TODO Auto-generated constructor stub
	}
    
	public void realizarAccion() {
        System.out.println(getPrimerNombre() + getPrimerApellido() + " está demandando.");
    }
	
	

}
