package delitos;

//import delitos.direccion;

abstract public class persona {
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private direccion Direccion;
    private int edad;
    private String identidad;
	/////////////////////////////////////////////////////////////////
	private String PrimerNombre;
	private String SegundoNombre;
	private String PrimerApellido;
	private String SegundoApellido;
	
    private int Edad;
    ///////////////////////////////////////////////////////////
    //constructor
    public persona(){
	super();
    }
    //constructor  con parametros
	public persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad, String identidad) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.identidad= identidad;
		///////////////////////////////////////////////////////////////
		this.PrimerNombre = primerNombre;
		this.SegundoNombre = segundoNombre;
		this.PrimerApellido = primerApellido;
		this.SegundoApellido = segundoApellido;
		this.Edad = edad;
		///////////////////////////////////////////////////////////////////
	    
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
		 return Direccion;
		    }

    public void setDireccion(direccion direccion) {
		        this.Direccion = direccion;
		    }
	
	public String getIdentidad(){
		return identidad;
	}		
	public void setIdentidad(String identidad){
		this.identidad = identidad;
	}


public void mostrarInformacion() {
    System.out.println("PrimerNombre: " + primerNombre);
    System.out.println("SegundoNombre: " + segundoNombre);
    System.out.println("PrimerApellido: " + primerApellido);
    System.out.println("SegundoApellido: " + segundoApellido);
    System.out.println("Edad: " + edad);
   // getDireccion();
}

	
}