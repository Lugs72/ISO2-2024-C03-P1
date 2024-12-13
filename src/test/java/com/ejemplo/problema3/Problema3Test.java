package com.ejemplo.problema3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problema3Test {

    private final problema3 problema = new problema3();

    @Test
    void testCaso1() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-10, 10, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Quedarse en casa", resultado);
    }

    @Test
    void testCaso2() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(5, 14, true, true);
        EspacioOcio espacio = new EspacioOcio(true, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso3() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 60, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso4() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(28, 20, false, false);
        EspacioOcio espacio = new EspacioOcio(true, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Salir a pasear", resultado);
    }

    @Test
    void testCaso5() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(35, 10, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso6() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-1, 59, true, false);
        EspacioOcio espacio = new EspacioOcio(true, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer senderismo", resultado);
    }

    @Test
    void testCaso7() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(0, 65, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso8() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(1, 20, true, false);
        EspacioOcio espacio = new EspacioOcio(true, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer senderismo", resultado);
    }

    @Test
    void testCaso9() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(14, 14, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso10() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(15, 10, false, false);
        EspacioOcio espacio = new EspacioOcio(true, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer ejercicio", resultado);
    }

    @Test
    void testCaso11() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(16, 60, false, false);
        EspacioOcio espacio = new EspacioOcio(false, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer ejercicio", resultado);
    }

    @Test
    void testCaso12() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(24, 59, true, true);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso13() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(25, 61, false, true);
        EspacioOcio espacio = new EspacioOcio(false, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Salir a pasear", resultado);
    }

    @Test
    void testCaso14() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(26, 16, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso15() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(29, 20, true, false);
        EspacioOcio espacio = new EspacioOcio(true, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer senderismo", resultado);
    }

    @Test
    void testCaso16() {
        EstadoSalud salud = new EstadoSalud(true, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(30, 14, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Quedarse en casa", resultado);
    }

    @Test
    void testCaso17() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(31, 60, true, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso18() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(14, 10, false, true);
        EspacioOcio espacio = new EspacioOcio(true, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Salir a pasear", resultado);
    }

    @Test
    void testCaso19() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(20, 20, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso20() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(0, 65, true, true);
        EspacioOcio espacio = new EspacioOcio(true, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer senderismo", resultado);
    }

    @Test
    void testCaso21() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(25, 14, false, false);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }

    @Test
    void testCaso22() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(-1, 15, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Quedarse en casa", resultado);
    }

    @Test
    void testCaso23() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(28, 16, true, false);
        EspacioOcio espacio = new EspacioOcio(false, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Salir a pasear", resultado);
    }

    @Test
    void testCaso24() {
        EstadoSalud salud = new EstadoSalud(false, false);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(1, 59, true, true);
        EspacioOcio espacio = new EspacioOcio(false, true);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Hacer senderismo", resultado);
    }

    @Test
    void testCaso25() {
        EstadoSalud salud = new EstadoSalud(false, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(30, 60, false, false);
        EspacioOcio espacio = new EspacioOcio(true, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("Salir a pasear", resultado);
    }

    @Test
    void testCaso26() {
        EstadoSalud salud = new EstadoSalud(true, true);
        CondicionesMeteorologicas condiciones = new CondicionesMeteorologicas(31, 61, false, true);
        EspacioOcio espacio = new EspacioOcio(false, false);
        String resultado = problema.generarRecomendacion(salud, condiciones, espacio);
        assertEquals("No se puede realizar ninguna actividad", resultado);
    }
}
