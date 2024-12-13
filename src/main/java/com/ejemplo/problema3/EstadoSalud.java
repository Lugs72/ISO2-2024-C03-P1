package com.ejemplo.problema3;

class EstadoSalud {
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
