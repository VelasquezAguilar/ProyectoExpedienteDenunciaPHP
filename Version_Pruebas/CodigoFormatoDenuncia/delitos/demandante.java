package delitos;

public class demandante extends persona{
    //constructores
    public demandante(){
		super();
	}

	public demandante(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			          char genero,         int edad,             String identidad,      direccion dirDemandante) {
		
			super();
			
	}
    


	public void realizarAccion() {
        System.out.println(getPrimerNombre() +" "+ getPrimerApellido() + " entidad que realizo la denuncia.");
    }
	
	

}
