package Version_PHP.CodigoJAVA;

public class direccion {
    private String Departamneto;
    private String Municipio;
    private String Colonia;
    private String Bloque;
    private String CodigoPostal;
    private String NumeroCasa;

    // constructor
    public direccion(String departamneto, String municipio, String colonia, String bloque, String codigoPostal,
            String numeroCasa) {
        Departamneto = departamneto;
        Municipio = municipio;
        Colonia = colonia;
        Bloque = bloque;
        CodigoPostal = codigoPostal;
        NumeroCasa = numeroCasa;
    }

    // constructor para Heredar las propiedades necesarias en delito
    public direccion(String departamneto, String municipio, String colonia, String bloque) {
        this.Departamneto = departamneto;
        this.Municipio = municipio;
        this.Colonia = colonia;
        this.Bloque = bloque;
    }

    // getters
    public String getDepartamneto() {
        return Departamneto;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getColonia() {
        return Colonia;
    }

    public String getBloque() {
        return Bloque;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public String getNumeroCasa() {
        return NumeroCasa;
    }

    // setters
    public void setDepartamneto(String departamneto) {
        Departamneto = departamneto;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public void setColonia(String colonia) {
        Colonia = colonia;
    }

    public void setBloque(String bloque) {
        Bloque = bloque;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public void setNumeroCasa(String numeroCasa) {
        NumeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "direccion [Departamneto=" + Departamneto + ", Municipio=" + Municipio + ", Colonia=" + Colonia
                + ", Bloque=" + Bloque + ", CodigoPostal=" + CodigoPostal + ", NumeroCasa=" + NumeroCasa
                + ", getDepartamneto()=" + getDepartamneto() + ", getMunicipio()=" + getMunicipio() + ", getColonia()="
                + getColonia() + ", getBloque()=" + getBloque() + ", getCodigoPostal()=" + getCodigoPostal()
                + ", getNumeroCasa()=" + getNumeroCasa() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}