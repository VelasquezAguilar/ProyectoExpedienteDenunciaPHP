package Version_Oficial.CodigoDelitos.src.Classes_Conexion;

@SuppressWarnings("hiding")
/// **********EL tipo de dato de direccion buscar formas de instanciarlo dentro
/// de expadiente para que se aplique el concepto de composicion */
public class Exxpediente<Demandante, Demandado, Ofendido, Direccion> {
    private Demandado demandado;
    private Demandante demandante;
    private Ofendido ofendido;
    private Direccion direccion;

    // Constructor
    public Exxpediente(Demandado demandado, Demandante demandante, Ofendido ofendido, Direccion direccion) {
        this.demandado = demandado;
        this.demandante = demandante;
        this.ofendido = ofendido;
        this.direccion = direccion;
    }

    // Métodos getter para demandado y demandante
    public Demandado getDemandado() {
        return demandado;
    }

    public Demandante getDemandante() {
        return demandante;
    }

    public Ofendido getOfendido() {
        return this.ofendido;
    }

    public Direccion getDescripcion() {
        return this.direccion;
    }
}