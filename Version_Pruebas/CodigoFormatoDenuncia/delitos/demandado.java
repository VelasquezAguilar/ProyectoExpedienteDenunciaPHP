package Version_Pruebas.CodigoFormatoDenuncia.delitos;

import Version_Pruebas.ConexionPostgreSQL.persona;

public class demandado extends persona{

	public demandado() {
		super();
		
	}

	public demandado(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad, String identidad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad, identidad);
		
	}
    
	public void realizarAccion() {
        System.out.println(getPrimerNombre() +" "+ getPrimerApellido() + " está demandado.");
    }

}
