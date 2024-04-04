package es.uah.ed.arbol;

import es.uah.listas.ListadoblementeEnlazada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArbolBinarioDeBusquedaTest {

    @Test
    void add() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(5,a1.getRaiz().getData(),"Fallo add no coincide");
        a1.add(6);
        assertFalse(a1.isArbolHomogeneo(), "Fallo add no coincide");
    }

    @Test
    void getSubArbolIzquierda() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(0,a1.getSubArbolIzquierda().getSuma(),"subarbol izq no coincide");
        a1.add(4);
        assertEquals(4,a1.getSubArbolIzquierda().getSuma(),"subarbol izq no coincide");
    }

    @Test
    void getSubArbolDerecha() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(0,a1.getSubArbolDerecha().getSuma(),"subarbol dcha no coincide");
        a1.add(6);
        assertEquals(6,a1.getSubArbolDerecha().getSuma(),"subarbol dcha no coincide");
    }

    @Test
    void getRaiz() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(5,a1.getRaiz().getData(),"Fallo, raiz no coincide");
    }

    @Test
    void getGrado() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(1,a1.getGrado(),"Fallo, grado no coincide");
    }

    @Test
    void getAltura() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        assertEquals(1,a1.getAltura(),"Fallo, altura no coincide");
    }

    @Test
    void getListaDatosNivel() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        ListadoblementeEnlazada<Integer> l1 = a1.getListaDatosNivel(1);
        assertEquals(1, l1.getNumeroElementos(),"Fallo lista datos nivel no coincide");
        a1.add(6);
        a1.add(4);
        ListadoblementeEnlazada<Integer> l2 = a1.getListaDatosNivel(2);
        assertEquals(2,l2.getNumeroElementos(),"Fallo lista datos nivel no coincide");
    }

    @Test
    void isArbolHomogeneo() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        assertTrue(a1.isArbolHomogeneo(), "Fallo, homogeneo no coincide");
        a1.add(5);
        assertTrue(a1.isArbolHomogeneo(), "Fallo, homogeneo no coincide");
    }

    @Test
    void isArbolCompleto() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        assertTrue(a1.isArbolCompleto(), "Fallo, completo no coincide");
        a1.add(5);
        assertTrue(a1.isArbolCompleto(), "Fallo, completo no coincide");
        a1.add(6);
        a1.add(7);
        a1.add(8);
        assertFalse(a1.isArbolCompleto(), "Fallo, completo no coincide");
    }

    @Test
    void isArbolCasiCompleto() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        assertTrue(a1.isArbolCasiCompleto(), "Fallo, completo no coincide");
        a1.add(6);
        assertTrue(a1.isArbolCasiCompleto(), "Fallo, completo no coincide");

        ArbolBinarioDeBusqueda a2 = new ArbolBinarioDeBusqueda();
        a2.add(10);
        a2.add(15);
        assertFalse(a2.isArbolCasiCompleto(), "Fallo, completo no coincide");
        a2.add(8);
        a2.add(14);
        assertFalse(a2.isArbolCasiCompleto(), "Fallo, completo no coincide");

    }
    @Test
    void getCamino() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        a1.add(7);
        a1.add(9);
        ListadoblementeEnlazada<Integer> l1 = a1.getCamino(9);
        assertEquals(3,l1.getNumeroElementos(),"Fallo camino no coincide");
        ListadoblementeEnlazada<Integer> l2 = a1.getCamino(10);
        assertEquals(3,l2.getNumeroElementos(),"Fallo camino no coincide");
    }

    @Test
    void getListaPreOrden() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        a1.add(7);
        a1.add(9);
        ListadoblementeEnlazada<Integer> l1= a1.getListaPreOrden();
        assertEquals(3,l1.getNumeroElementos(),"Fallo lista preorden no coincide");
    }

    @Test
    void getListaPostOrden() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        a1.add(7);
        a1.add(9);
        ListadoblementeEnlazada<Integer> l1= a1.getListaPostOrden();
        assertEquals(3,l1.getNumeroElementos(),"Fallo lista postorden no coincide");
    }

    @Test
    void getListaOrdenCentral() {
        ArbolBinarioDeBusqueda a1 = new ArbolBinarioDeBusqueda();
        a1.add(5);
        a1.add(7);
        a1.add(9);
        ListadoblementeEnlazada<Integer> l1= a1.getListaOrdenCentral();
        assertEquals(3,l1.getNumeroElementos(),"Fallo lista orden central no coincide");
    }
}