package com.testing.problema3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RecomendadorActividadesTest {

    // Caso 1: Temperatura -10, humedad 10, sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso1() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-10, 10, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("Quedarse en casa", resultado);
    }

    // Caso 2: Temperatura 5, humedad 14, no sano, con pasaporte Covid, con precipitaciones
    @Test
    public void testCaso2() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(5, 14, true, true);
        EspacioOcio espacio = new EspacioOcio(true, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 3: Temperatura 20, humedad 60, sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso3() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 60, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 4: Temperatura 28, humedad 20, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso4() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(28, 20, false, false);
        EspacioOcio espacio = new EspacioOcio(true, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 5: Temperatura 35, humedad 10, no sano, con pasaporte Covid, con precipitaciones
    @Test
    public void testCaso5() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(35, 10, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 6: Temperatura -1, humedad 59, sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso6() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-1, 59, true, false);
        EspacioOcio espacio = new EspacioOcio(true, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 7: Temperatura 0, humedad 65, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso7() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(0, 65, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 8: Temperatura 1, humedad 20, sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso8() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(1, 20, true, false);
        EspacioOcio espacio = new EspacioOcio(true, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 9: Temperatura 14, humedad 14, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso9() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(14, 14, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 10: Temperatura 15, humedad 10, sano, con pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso10() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(15, 10, false, false);
        EspacioOcio espacio = new EspacioOcio(true, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("Hacer turismo al aire libre", resultado);
    }

    // Caso 11: Temperatura 16, humedad 60, sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso11() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(16, 60, false, false);
        EspacioOcio espacio = new EspacioOcio(false, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 12: Temperatura 24, humedad 59, sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso12() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(24, 59, true, true);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 13: Temperatura 25, humedad 61, no sano, con pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso13() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(25, 61, false, true);
        EspacioOcio espacio = new EspacioOcio(false, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 14: Temperatura 26, humedad 16, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso14() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(26, 16, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 15: Temperatura 29, humedad 20, no sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso15() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(29, 20, true, false);
        EspacioOcio espacio = new EspacioOcio(true, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 16: Temperatura 30, humedad 14, sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso16() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(30, 14, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 17: Temperatura 31, humedad 60, no sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso17() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(31, 60, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 18: Temperatura 14, humedad 10, no sano, con pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso18() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(14, 10, false, true);
        EspacioOcio espacio = new EspacioOcio(true, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 19: Temperatura 20, humedad 20, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso19() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 20, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 20: Temperatura 0, humedad 65, sano, con pasaporte Covid, con precipitaciones
    @Test
    public void testCaso20() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(0, 65, true, true);
        EspacioOcio espacio = new EspacioOcio(true, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 21: Temperatura 25, humedad 14, no sano, sin pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso21() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(25, 14, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 22: Temperatura -1, humedad 15, no sano, con pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso22() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-1, 15, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 23: Temperatura 28, humedad 16, no sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso23() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(28, 16, true, false);
        EspacioOcio espacio = new EspacioOcio(false, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 24: Temperatura 1, humedad 59, no sano, sin pasaporte Covid, con precipitaciones
    @Test
    public void testCaso24() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(1, 59, true, true);
        EspacioOcio espacio = new EspacioOcio(false, true);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 25: Temperatura 30, humedad 60, no sano, con pasaporte Covid, sin precipitaciones
    @Test
    public void testCaso25() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(30, 60, false, false);
        EspacioOcio espacio = new EspacioOcio(true, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    // Caso 26: Temperatura 31, humedad 61, sano, con pasaporte Covid, con precipitaciones
    @Test
    public void testCaso26() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(31, 61, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);

        RecomendadorActividades recomendador = new RecomendadorActividades();
        String resultado = recomendador.generarRecomendacion(salud, condiciones, espacio);

        assertEquals("No se puede realizar ninguna actividad", resultado);
    }
}


