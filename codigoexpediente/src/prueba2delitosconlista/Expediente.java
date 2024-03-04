package prueba2delitosconlista;

class Expediente<Demandante> {
    private Demandado demandado;
    private Demandante demandante;

    // Constructor
    public Expediente(Demandado demandado, Demandante demandante) {
        this.demandado = demandado;
        this.demandante = demandante;
    }

    // Métodos getter para demandado y demandante
    public Demandado getDemandado() {
        return demandado;
    }

    public Demandante getDemandante() {
        return demandante;
    }
}