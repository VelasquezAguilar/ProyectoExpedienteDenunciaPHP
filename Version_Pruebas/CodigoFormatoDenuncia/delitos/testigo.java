package delitos;

public class testigo extends persona{
    //Constructores 
	public testigo() {
		super();
		
	}
	public testigo(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero,int edad, String identidad ) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad, identidad);
	
	}
	

	public void realizarAccion() {
        System.out.println(getPrimerNombre() +" "+ getPrimerApellido() + "  testigo de el conflicto ocurrida en la denuncia.");
    
	
    }

}
