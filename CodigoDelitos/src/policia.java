package delitos;

public class policia extends persona {

	public policia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public policia(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad);
		// TODO Auto-generated constructor stub
	}
  
    
	public void realizarAccion() {
        System.out.println(getPrimerNombre() + getPrimerApellido() + " está arrestando.");
    
	
    }
}
