package com.testing.problema3;

public class RecomendadorActividades {

    public String generarRecomendacion(EstadoSalud estadoSalud, CondicionesMeteorologicas condiciones, EspacioOcio espacio) {
        // Evaluar condiciones críticas como quedarse en casa
        if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && condiciones.hayPrecipitaciones()) {
            return "Quedarse en casa";
        }

        // Evaluar condiciones de salud y pasaporte COVID
        if (estadoSalud.estaSano() && estadoSalud.tienePasaporteCovid()) {
            if (condiciones.getTemperatura() < 0 && condiciones.getHumedad() < 15 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Ir a esquiar" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 0 && condiciones.getTemperatura() < 15 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Hacer senderismo" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 15 && condiciones.getTemperatura() < 25 && !condiciones.hayPrecipitaciones()
                    && !condiciones.estaNublado() && condiciones.getHumedad() <= 60) {
                return espacio.sinRestricciones() ? "Hacer turismo al aire libre" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() >= 25 && condiciones.getTemperatura() < 35 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Irse de cañas" : "No se puede realizar ninguna actividad";
            } else if (condiciones.getTemperatura() > 30 && !condiciones.hayPrecipitaciones()) {
                return espacio.aforoPermitido() ? "Ir a la playa o piscina" : "No se puede realizar ninguna actividad";
            }
        }

        return "No se puede realizar ninguna actividad";
    }

}
