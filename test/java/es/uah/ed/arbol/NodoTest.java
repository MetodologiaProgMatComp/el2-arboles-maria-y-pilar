package es.uah.ed.arbol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodoTest {

    @Test
    void getData() {
        Nodo n1 = new Nodo(1);
        assertEquals(1,n1.getData(),"El dato no coincide en el nodo");
    }

    @Test
    void setData() {
        Nodo n1 = new Nodo(1);
        n1.setData(2);
        assertEquals(2,n1.getData(),"El dato no coincide en el set del nodo");
    }

    @Test
    void getIzquierda() {
        Nodo n1 = new Nodo(2);
        assertEquals(null,n1.getIzquierda(),"Izquierda no coincide");
    }

    @Test
    void getDerecha() {
        Nodo n1 = new Nodo(2);
        assertEquals(null,n1.getDerecha(),"Derecha no coincide");
    }

    @Test
    void setIzquierda() {
        Nodo n1 = new Nodo(2);
        Nodo n2 = new Nodo(1);
        n1.setIzquierda(n2);
        assertEquals(1,n1.getIzquierda().getData(),"Izquierda no coincide en el set");
    }

    @Test
    void setDerecha() {
        Nodo n1 = new Nodo(2);
        Nodo n2 = new Nodo(3);
        n1.setDerecha(n2);
        assertEquals(3,n1.getDerecha().getData(),"Derecha no coincide en el set");
    }
}