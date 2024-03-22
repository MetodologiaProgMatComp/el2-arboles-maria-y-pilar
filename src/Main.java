import es.uah.ed.arbol.ArbolBinarioDeBusqueda;
import es.uah.ed.arbol.Nodo;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();
        arbol.add(5);
        arbol.add(3);
        arbol.add(7);
        arbol.add(2);
        arbol.add(4);
        arbol.add(6);
        arbol.add(8);

        ArbolBinarioDeBusqueda subArbolIzquierda = arbol.getSubArbolIzquierda();
        ArbolBinarioDeBusqueda subArbolDerecha = arbol.getSubArbolDerecha();

        System.out.println("Contenido del subárbol izquierdo: ");
        imprimirInOrden(subArbolIzquierda.getRaiz());

        System.out.println("Contenido del subárbol derecho: ");
        imprimirInOrden(subArbolDerecha.getRaiz());
    }
    
    private static void imprimirInOrden (Nodo nodo) {
        if (nodo != null) {
            imprimirInOrden(nodo.getIzquierda());
            System.out.println(nodo.getData());
            imprimirInOrden(nodo.getDerecha());
        }
    }
    
}