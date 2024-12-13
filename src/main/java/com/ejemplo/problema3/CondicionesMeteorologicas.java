package com.ejemplo.problema3;

class CondicionesMeteorologicas {
    private int temperatura;
    private int humedad;
    private boolean precipitaciones;
    private boolean nublado;

    public CondicionesMeteorologicas(int temperatura, int humedad, boolean precipitaciones, boolean nublado) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.precipitaciones = precipitaciones;
        this.nublado = nublado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public boolean hayPrecipitaciones() {
        return precipitaciones;
    }

    public boolean estaNublado() {
        return nublado;
    }
}
