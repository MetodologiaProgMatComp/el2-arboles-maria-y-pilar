package es.uah.ed.arbol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArbolBinarioDeBusquedaEnterosTest {

    @Test
    void getSuma() {
        ArbolBinarioDeBusquedaEnteros a1 = new ArbolBinarioDeBusquedaEnteros();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        assertEquals(6,a1.getSuma(),"La suma no coincide");
    }
}