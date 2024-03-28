package es.uah.listas;

public class ElementoLE {
    private Object data;
    private ElementoLE siguiente;

    public ElementoLE(Object data) {
        this.data = data;
        this.siguiente = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ElementoLE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ElementoLE siguiente) {
        this.siguiente = siguiente;
    }
}
