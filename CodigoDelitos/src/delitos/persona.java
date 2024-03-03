package delitos;

abstract public class persona {
	private String PrimerNombre;
	private String SegundoNombre;
	private String PrimerApellido;
	private String SegundoApellido;
	 private direccion direccion;

	private int Edad;
	public persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad) {
		super();
		PrimerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		Edad = edad;
		 this.direccion = direccion;
		
	
	}
	public String getPrimerNombre() {
		return PrimerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return SegundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return PrimerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
    public direccion getDireccion() {
		 return direccion;
		    }

    public void setDireccion(direccion direccion) {
		        this.direccion = direccion;
		    }
	
	@Override
	public String toString() {
		return "persona [PrimerNombre=" + PrimerNombre + ", SegundoNombre=" + SegundoNombre + ", PrimerApellido="
				+ PrimerApellido + ", SegundoApellido=" + SegundoApellido + ", Edad=" + Edad +",direccion=" +direccion
				+ "]";
	}
	
	public abstract void realizarAccion();


public void mostrarInformacion() {
    System.out.println("PrimerNombre: " + PrimerNombre);
    System.out.println("SegundoNombre: " + SegundoNombre);
    System.out.println("PrimerApellido: " + PrimerApellido);
    System.out.println("SegundoApellido: " + SegundoApellido);
    System.out.println("Edad: " + Edad);
    getDireccion();
}


	
	
}
