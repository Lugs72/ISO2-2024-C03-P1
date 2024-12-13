package com.ejemplo.problema3;

public class problema3 {

    public String generarRecomendacion(EstadoSalud estadoSalud, CondicionesMeteorologicas condiciones, EspacioOcio espacio) {
        if (estadoSalud.estaSano() && estadoSalud.tienePasaporteCovid()) {
            if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && condiciones.hayPrecipitaciones()) {
                return "Quedarse en casa";
            } else if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Ir a esquiar" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 0 && condiciones.getTemperatura() < 15 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Hacer senderismo" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 15 && condiciones.getTemperatura() < 25 && !condiciones.hayPrecipitaciones() && !condiciones.estaNublado() && condiciones.getHumedad() <= 60) {
                return espacio.sinRestricciones() ? "Hacer turismo al aire libre" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 25 && condiciones.getTemperatura() < 35 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Irse de cañas" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() > 30 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Ir a la playa o piscina" : "No se puede realizar ninguna actividad";
            }
        }
        return "No se puede realizar ninguna actividad";
    }

    public static void main(String[] args) {
        EstadoSalud estadoSalud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 50, false, false);
        EspacioOcio espacio = new EspacioOcio(true, true);

        problema3 recomendacion = new problema3();
        String resultado = recomendacion.generarRecomendacion(estadoSalud, condiciones, espacio);

        System.out.println("Recomendación: " + resultado);
    }
}