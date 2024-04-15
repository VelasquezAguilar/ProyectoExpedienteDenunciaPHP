package Version_Oficial.CodigoDelitos.src.Classes_Conexion;

public class expediente {
    private Demandante demandante;
    private Demandado demandado;
    private Ofendido ofendido;
    private Direccion direccion;

//implemnetacion de composicion
//la instnacia de direccion se realizara dentro la memoria del expediente
    public expediente(Demandante demandante, Demandado demandado, Ofendido ofendido, String departamento, String municipio, String colonia, String bloque, String calle, String descripcion) {
        this.demandante = demandante;
        this.demandado = demandado;
        this.ofendido = ofendido;
        this.direccion = new Direccion(departamento, municipio, colonia, bloque, calle, descripcion);
    }

    // Resto de la implementación de la clase Expediente
    


    // Métodos getter para demandado y demandante
    public Demandado getDemandado() {
        return demandado;
    }
    public void setDemandado(Demandado demandado) {
        this.demandado = demandado;
    }

    public Demandante getDemandante() {
        return demandante;
    }
    public void setDemandante(Demandante demandante){
        this.demandante = demandante;
    }

    
    public Ofendido getOfendido(){
        return this.ofendido;
    }
    public void setOfendido(Ofendido ofendido){
        this.ofendido = ofendido;
    }

    public Direccion getDireccion(){
        return this.direccion;
    }
    


}