package es.uah.listas;

public class ListaEnlazada {
    private ElementoLE primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public ListaEnlazada(ElementoLE primero) {
        this.primero = primero;
    }

    public boolean isVacia() {
        return primero == null;
    }

    public void vaciar() {
        primero = null;
    }

    public void add(ElementoLE el) {
        if (primero == null) {
            primero = el;
        } else {
            ElementoLE actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(el);
        }
    }

    public void add(String s) {
        ElementoLE nuevoElemento = new ElementoLE(s);
        add(nuevoElemento);
    }

    public void add(Object o) {
        ElementoLE nuevoElemento = new ElementoLE(o);
        add(nuevoElemento);
    }

    public void insert(ElementoLE elemento, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida");
            return;
        }

        if (posicion == 0) {
            elemento.setSiguiente(primero);
            primero = elemento;
        } else {
            ElementoLE anterior = getElemento(posicion - 1);
            if (anterior != null) {
                elemento.setSiguiente(anterior.getSiguiente());
                anterior.setSiguiente(elemento);
            } else {
                System.out.println("Posición inválida");
            }
        }
    }


    public void insert(Object o, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida");
            return;
        }

        ElementoLE nuevoElemento = new ElementoLE(o);

        if (posicion == 0) {
            nuevoElemento.setSiguiente(primero);
            primero = nuevoElemento;
        } else {
            ElementoLE anterior = getElemento(posicion - 1);
            if (anterior != null) {
                nuevoElemento.setSiguiente(anterior.getSiguiente());
                anterior.setSiguiente(nuevoElemento);
            } else {
                System.out.println("Posición inválida");
            }
        }
    }

    public int del(int posicion) {
        if (posicion < 0 || primero == null) {
            System.out.println("Posición inválida o lista vacía");
            return posicion;
        }
        if (posicion == 0) {
            primero = primero.getSiguiente();
        } else {
            ElementoLE anterior = getElemento(posicion - 1);
            if (anterior != null && anterior.getSiguiente() != null) {
                anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
            } else {
                System.out.println("Posición inválida");
            }
        }
        return posicion;
    }

    public int getNumeroElementos() {
        int contador = 0;
        ElementoLE actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();

        }
        return contador;
    }

    public int getPosicion(ElementoLE el) {
        int posicion = 0;
        ElementoLE actual = primero;
        while (actual != null) {
            if (actual == el){
                return posicion;
            }
            posicion++;
            actual = actual.getSiguiente();
        }
        return -1;
    }

    public ElementoLE getUltimo() {
        ElementoLE actual = primero;
        while (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public ElementoLE getSiguiente(ElementoLE el) {
        return el.getSiguiente();
    }

    public ElementoLE getElemento(int posicion) {
        if (posicion < 0 || primero == null) {
            return null;
        }
        ElementoLE actual = primero;
        for (int i = 0; i < posicion; i++) {
            if (actual == null) {
                return null;
            }
            actual = actual.getSiguiente();
        }
        return actual;
    }
}
