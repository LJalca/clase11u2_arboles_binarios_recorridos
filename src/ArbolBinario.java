import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de un Árbol Binario con recorridos recursivos en profundidad (DFS)
 * y cálculo de propiedades jerárquicas (cantidad de nodos, hojas y altura).
 */
public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    /**
     * Recorrido Preorden: Raíz -> Izquierdo -> Derecho.
     */
    public List<String> recorridoPreorden() {
        List<String> resultado = new ArrayList<>();
        preordenRecursivo(raiz, resultado);
        return resultado;
    }

    private void preordenRecursivo(NodoArbol nodo, List<String> resultado) {
        if (nodo == null) {
            return;
        }
        resultado.add(nodo.dato);
        preordenRecursivo(nodo.izquierdo, resultado);
        preordenRecursivo(nodo.derecho, resultado);
    }

    /**
     * Recorrido Inorden: Izquierdo -> Raíz -> Derecho.
     */
    public List<String> recorridoInorden() {
        List<String> resultado = new ArrayList<>();
        inordenRecursivo(raiz, resultado);
        return resultado;
    }

    private void inordenRecursivo(NodoArbol nodo, List<String> resultado) {
        if (nodo == null) {
            return;
        }
        inordenRecursivo(nodo.izquierdo, resultado);
        resultado.add(nodo.dato);
        inordenRecursivo(nodo.derecho, resultado);
    }

    /**
     * Recorrido Postorden: Izquierdo -> Derecho -> Raíz.
     */
    public List<String> recorridoPostorden() {
        List<String> resultado = new ArrayList<>();
        postordenRecursivo(raiz, resultado);
        return resultado;
    }

    private void postordenRecursivo(NodoArbol nodo, List<String> resultado) {
        if (nodo == null) {
            return;
        }
        postordenRecursivo(nodo.izquierdo, resultado);
        postordenRecursivo(nodo.derecho, resultado);
        resultado.add(nodo.dato);
    }

    public int contarNodos() {
        return contarNodosRecursivo(raiz);
    }

    private int contarNodosRecursivo(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodosRecursivo(nodo.izquierdo) + contarNodosRecursivo(nodo.derecho);
    }

    public int contarHojas() {
        return contarHojasRecursivo(raiz);
    }

    private int contarHojasRecursivo(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.izquierdo == null && nodo.derecho == null) {
            return 1;
        }
        return contarHojasRecursivo(nodo.izquierdo) + contarHojasRecursivo(nodo.derecho);
    }

    public int calcularAltura() {
        return calcularAlturaRecursivo(raiz);
    }

    private int calcularAlturaRecursivo(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        int altIzq = calcularAlturaRecursivo(nodo.izquierdo);
        int altDer = calcularAlturaRecursivo(nodo.derecho);
        return 1 + Math.max(altIzq, altDer);
    }
}
