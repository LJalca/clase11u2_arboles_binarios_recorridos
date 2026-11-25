/**
 * Demostración de Árbol Binario: enlazamiento de NodoArbol en memoria,
 * propiedades jerárquicas y recorridos recursivos Preorden, Inorden y Postorden.
 */
public class Main {
    public static void main(String[] args) {
        // Construcción manual de un árbol binario de 7 nodos
        NodoArbol raiz = new NodoArbol("A");
        raiz.izquierdo = new NodoArbol("B");
        raiz.derecho = new NodoArbol("C");

        raiz.izquierdo.izquierdo = new NodoArbol("D");
        raiz.izquierdo.derecho = new NodoArbol("E");

        raiz.derecho.izquierdo = new NodoArbol("F");
        raiz.derecho.derecho = new NodoArbol("G");

        ArbolBinario arbol = new ArbolBinario(raiz);

        System.out.println("Raíz: " + arbol.getRaiz().dato);
        System.out.println("Total de nodos: " + arbol.contarNodos());
        System.out.println("Nodos hoja: " + arbol.contarHojas());
        System.out.println("Altura del árbol: " + arbol.calcularAltura());

        System.out.println("Preorden (R-I-D):  " + String.join(" -> ", arbol.recorridoPreorden()));
        System.out.println("Inorden  (I-R-D):  " + String.join(" -> ", arbol.recorridoInorden()));
        System.out.println("Postorden (I-D-R): " + String.join(" -> ", arbol.recorridoPostorden()));
    }
}
