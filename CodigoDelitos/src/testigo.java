package delitos;

public class testigo extends persona{

	public testigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public testigo(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad);
		// TODO Auto-generated constructor stub
	}
	
	
	public void realizarAccion() {
        System.out.println(getPrimerNombre() + getPrimerApellido() + " está testificando.");
    
	
    }

}
