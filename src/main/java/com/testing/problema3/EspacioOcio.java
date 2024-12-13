package com.testing.problema3;

public class EspacioOcio {
    private boolean aforoPermitido;
    private boolean sinRestricciones;

    public EspacioOcio(boolean aforoPermitido, boolean sinRestricciones) {
        this.aforoPermitido = aforoPermitido;
        this.sinRestricciones = sinRestricciones;
    }

    public boolean aforoPermitido() {
        return aforoPermitido;
    }

    public boolean sinRestricciones() {
        return sinRestricciones;
    }
}