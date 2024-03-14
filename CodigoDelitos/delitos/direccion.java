package delitos;

public class direccion {
	private String Departamento;
	private String Municipio;
	private String AldeaCiudad;
	private String Colonia;
	private String Codigopostal;
	private String Bloque;
	private String Casa;
	
	public direccion(String departamento, String municipio, String aldeaCiudad, String colonia, String codigopostal,
			String bloque ) {
		super();
		Departamento = departamento;
		Municipio = municipio;
		AldeaCiudad = aldeaCiudad;
		Colonia = colonia;
		Codigopostal = codigopostal;
		Bloque = bloque;
		
	}

	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getMunicipio() {
		return Municipio;
	}
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getAldeaCiudad() {
		return AldeaCiudad;
	}
	public void setAldeaCiudad(String aldeaCiudad) {
		AldeaCiudad = aldeaCiudad;
	}

	public String getColonia() {
		return Colonia;
	}
	public void setColonia(String colonia) {
		Colonia = colonia;
	}

	public String getCodigopostal() {
		return Codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		Codigopostal = codigopostal;
	}

	public String getBloque() {
		return Bloque;
	}
	public void setBloque(String bloque) {
		Bloque = bloque;
	}

	public String getCasa() {
		return Casa;
	}
	public void setCasa(String casa) {
		Casa = casa;
	}

	@Override
	public String toString() {
		return "direccion [Departamento=" + Departamento + ", Municipio=" + Municipio + ", AldeaCiudad=" + AldeaCiudad
				+ ", Colonia=" + Colonia + ", Codigopostal=" + Codigopostal + ", Bloque=" + Bloque + ", Casa=" + Casa
				+ "]";
	}
	
	public void mostrardireccion() {
	    System.out.println("Departamento: " + Departamento);
	    System.out.println("Municipio: " + Municipio);
	    System.out.println("AldeaCiudad: " + AldeaCiudad);
	    System.out.println("Colonia: " + Colonia);
	    System.out.println("Codigopostal: " + Codigopostal);
	}
	
	

}
