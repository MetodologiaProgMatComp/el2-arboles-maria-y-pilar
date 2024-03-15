package es.uah.ed.arbol;



public class ArbolBinarioDeBusqueda {
    private Nodo raiz=null;

    public ArbolBinarioDeBusqueda(){
    }

    private boolean isVacio(){
        return raiz==null;
    }

    public Nodo addrecursivo(Nodo raiz, Object data){
        if (isVacio()){
            Nodo n1 = new Nodo(data);
            raiz=n1;
            return raiz;
        }
        else{
            if (((Comparable)data).compareTo(raiz.getData())<0){
                Nodo añadido= addrecursivo(raiz.getIzquierda(),data);
                raiz.setIzquierda(añadido);
            }
            else{
                Nodo añadido= addrecursivo(raiz.getDerecha(),data);
                raiz.setDerecha(añadido);
            }
            return raiz;
        }
    }
    public void add(Object data) {
        if(isVacio()){
            Nodo n1 = new Nodo(data);
            raiz=n1;
        }
        else {
            addrecursivo(raiz, data);
        }
    }
}
