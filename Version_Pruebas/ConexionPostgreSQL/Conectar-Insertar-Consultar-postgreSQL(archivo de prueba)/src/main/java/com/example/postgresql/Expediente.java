package com.example.postgresql;


class Expediente<Demandante> {
    private Demandado demandado;
    private Demandante demandante;

    private Ofendido ofendido;

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

    public Ofendido getOfendido() { return ofendido;}
    }
