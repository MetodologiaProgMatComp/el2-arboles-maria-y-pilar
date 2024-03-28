import es.uah.ed.arbol.ArbolBinarioDeBusqueda;
import es.uah.ed.arbol.Nodo;
import es.uah.listas.ListadoblementeEnlazada;

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

        System.out.println("Grado del árbol:"+ arbol.getGrado());
        System.out.println("Altura del árbol:"+ arbol.getAltura());

        ListadoblementeEnlazada<Integer> lista = arbol.getListaDatosNivel(2);

        System.out.println("Datos nivel 2:");
        for (int i = 0; i < lista.getNumeroElementos(); i++) {
            System.out.println(lista.getElemento(i));
        }
        System.out.println("Arbol homogéneo:"+arbol.isArbolHomogeneo());
        System.out.println("Arbol completo:"+arbol.isArbolCompleto());
        System.out.println("Arbol casi completo:"+arbol.isArbolCasiCompleto());

        ListadoblementeEnlazada<Integer> camino = arbol.getCamino(2);
        System.out.println("Obtener camino hasta el elemento 2:");
        for (int i = 0; i < camino.getNumeroElementos(); i++) {
            System.out.println(camino.getElemento(i));
        }
    }
    
    private static void imprimirInOrden (Nodo nodo) {
        if (nodo != null) {
            imprimirInOrden(nodo.getIzquierda());
            System.out.println(nodo.getData());
            imprimirInOrden(nodo.getDerecha());
        }
    }


    
}