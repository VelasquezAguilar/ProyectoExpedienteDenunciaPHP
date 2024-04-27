package Version_PHP.CodigoJAVA;

public class delito extends direccion {

    private String Calle;
    private String TipoDelito;
    private String Descripcion;

    // constructor implementacion de concepto de composicion para que al momento de
    // borrar el delito tambien se borre su direccion donde ocurrio
    public delito(String departamneto, String municipio, String colonia, String bloque, String Calle, String TipoDelito,
            String Descripcion) {
        super(departamneto, municipio, colonia, bloque);
        this.Calle = Calle;
        this.TipoDelito = TipoDelito;
        this.Descripcion = Descripcion;
        direccion objdireccionDelito = new direccion(departamneto, municipio, colonia, bloque);
    }

    // geters
    public String getCalle() {
        return Calle;
    }

    public String getTipoDelito() {
        return TipoDelito;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    // setters
    public void setCalle(String calle) {
        Calle = calle;
    }

    public void setTipoDelito(String tipoDelito) {
        TipoDelito = tipoDelito;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}
