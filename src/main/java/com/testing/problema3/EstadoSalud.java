package com.testing.problema3;

public class EstadoSalud {
    private boolean sano;
    private boolean pasaporteCovid;

    public EstadoSalud(boolean sano, boolean pasaporteCovid) {
        this.sano = sano;
        this.pasaporteCovid = pasaporteCovid;
    }

    public boolean estaSano() {
        return sano;
    }

    public boolean tienePasaporteCovid() {
        return pasaporteCovid;
    }
}