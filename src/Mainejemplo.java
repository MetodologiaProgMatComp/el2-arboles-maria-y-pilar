import es.uah.ed.arbol.ArbolBinarioDeBusquedaEnteros;
import es.uah.listas.ElementoLDE;
import es.uah.listas.ListadoblementeEnlazada;
import java.util.Random;
import java.util.Set;

import static java.lang.Math.random;

public class Mainejemplo {
    public static void main(String[] args) {
        //EJEMPLO 1
        System.out.println("ARBOL EJEMPLO 1");
        ArbolBinarioDeBusquedaEnteros arbol1 = new ArbolBinarioDeBusquedaEnteros();
        for (int i = 0; i <= 128; i++) {
            arbol1.add(i);
        }

        System.out.println("Suma árbol 1:" + arbol1.getSuma());

        ListadoblementeEnlazada<Integer> listapreorden = arbol1.getListaPreOrden();
        int sumapre = 0;
        for (int i = 0; i < listapreorden.getNumeroElementos(); i++) {
            ElementoLDE elempre = listapreorden.getElemento(i);
            sumapre += Integer.parseInt(elempre.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 1 ordenado en preorden:" + sumapre);

        ListadoblementeEnlazada<Integer> listapostorden = arbol1.getListaPostOrden();
        int sumapost = 0;
        for (int i = 0; i < listapostorden.getNumeroElementos(); i++) {
            ElementoLDE elempost = listapostorden.getElemento(i);
            sumapost += Integer.parseInt(elempost.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 1 ordenado en postrden:" + sumapost);

        ListadoblementeEnlazada<Integer> listaordencentral = arbol1.getListaOrdenCentral();
        int sumacent = 0;
        for (int i = 0; i < listaordencentral.getNumeroElementos(); i++) {
            ElementoLDE elemcent = listaordencentral.getElemento(i);
            sumacent += Integer.parseInt(elemcent.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 1 ordenado en orden central:" + sumacent);

        ArbolBinarioDeBusquedaEnteros subArbolIzquierda = (ArbolBinarioDeBusquedaEnteros) arbol1.getSubArbolIzquierda();
        ArbolBinarioDeBusquedaEnteros subArbolDerecha = (ArbolBinarioDeBusquedaEnteros) arbol1.getSubArbolDerecha();

        System.out.println("Suma subarbol izquierdo 1:" + subArbolIzquierda.getSuma());
        System.out.println("Suma subarbol derecha 1:" + subArbolDerecha.getSuma());

        //VERIFICAR
        if(arbol1.getSuma() == sumapre && arbol1.getSuma() == sumapost && arbol1.getSuma() == sumacent){
            System.out.println("Las sumas son iguales independientemente del recorrido");
        }
        else{
            System.out.println("Las sumas dependen del recorrido");
        }

        if(arbol1.getSuma() == subArbolIzquierda.getSuma()+subArbolDerecha.getSuma()){
            System.out.println("Las sumas son iguales independientemente de los elementos del subarbol dcho o izq");
        }
        else{
            System.out.println("Las sumas dependen del subarbol dcho o izq");
        }

        System.out.println("Altura del árbol 1:" + arbol1.getAltura());

        ListadoblementeEnlazada<Integer> camino = arbol1.getCamino(110);
        System.out.println("Obtener camino hasta el elemento 110 en arbol 1:");
        for (int i = 0; i < camino.getNumeroElementos(); i++) {
            System.out.println(camino.getElemento(i));
        }


        //EJEMPLO 2
        System.out.println("ARBOL EJEMPLO 2");
        ArbolBinarioDeBusquedaEnteros arbol2 = new ArbolBinarioDeBusquedaEnteros();
        Random random= new Random();
        ListadoblementeEnlazada lista= new ListadoblementeEnlazada();
        while (lista.getNumeroElementos()<129) {
            int numerosAleatorios = random.nextInt(0, 129);
            boolean estaenlaLista = false;
            for (int i = 0; i < lista.getNumeroElementos(); i++) {
                if (numerosAleatorios == Integer.parseInt(String.valueOf(lista.getElemento(i).getData()))) {
                    estaenlaLista = true;
                    break;
                }
            }
            if (!estaenlaLista) {
                lista.add(numerosAleatorios); // Añade el número a la lista si no está presente
            }
        }
        for (int i = 0; i < lista.getNumeroElementos(); i++) {
            arbol2.add(lista.getElemento(i).getData());
        }



        System.out.println("Suma árbol 2:" + arbol2.getSuma());

        ListadoblementeEnlazada<Integer> listapreorden2 = arbol2.getListaPreOrden();
        int sumapre2 = 0;
        for (int i = 0; i < listapreorden2.getNumeroElementos(); i++) {
            ElementoLDE elempre2 = listapreorden2.getElemento(i);
            sumapre2 += Integer.parseInt(elempre2.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 2 ordenado en preorden:" + sumapre2);

        ListadoblementeEnlazada<Integer> listapostorden2 = arbol2.getListaPostOrden();
        int sumapost2 = 0;
        for (int i = 0; i < listapostorden2.getNumeroElementos(); i++) {
            ElementoLDE elempost2 = listapostorden2.getElemento(i);
            sumapost2 += Integer.parseInt(elempost2.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 2 ordenado en postrden:" + sumapost2);

        ListadoblementeEnlazada<Integer> listaordencentral2 = arbol2.getListaOrdenCentral();
        int sumacent2 = 0;
        for (int i = 0; i < listaordencentral2.getNumeroElementos(); i++) {
            ElementoLDE elemcent2 = listaordencentral2.getElemento(i);
            sumacent2 += Integer.parseInt(elemcent2.getData().toString()); //Lo convierte a entero para poder sumarlo
        }
        System.out.println("Suma arbol 2 ordenado en orden central:" + sumacent2);

        ArbolBinarioDeBusquedaEnteros subArbolIzquierda2 = (ArbolBinarioDeBusquedaEnteros) arbol2.getSubArbolIzquierda();
        ArbolBinarioDeBusquedaEnteros subArbolDerecha2 = (ArbolBinarioDeBusquedaEnteros) arbol2.getSubArbolDerecha();

        System.out.println("Suma subarbol izquierdo 2:" + subArbolIzquierda2.getSuma());
        System.out.println("Suma subarbol derecha 2:" + subArbolDerecha2.getSuma());

        //VERIFICAR
        if(arbol2.getSuma() == sumapre2 && arbol2.getSuma() == sumapost2 && arbol2.getSuma() == sumacent2){
            System.out.println("Las sumas son iguales independientemente del recorrido");
        }
        else{
            System.out.println("Las sumas dependen del recorrido");
        }
        Object datoraiz = arbol2.getRaiz().getData();

        if(arbol2.getSuma() == subArbolIzquierda2.getSuma()+subArbolDerecha2.getSuma()+Integer.parseInt(datoraiz.toString())){
            System.out.println("Las sumas son iguales independientemente de los elementos del subarbol dcho o izq");
        }
        else{
            System.out.println("Las sumas dependen del subarbol dcho o izq");
        }

        System.out.println("Altura del árbol 2:" + arbol2.getAltura());

        ListadoblementeEnlazada<Integer> camino2 = arbol2.getCamino(110);
        System.out.println("Obtener camino hasta el elemento 110 en arbol 2:");
        for (int i = 0; i < camino2.getNumeroElementos(); i++) {
            System.out.println(camino2.getElemento(i));
        }
    }
}