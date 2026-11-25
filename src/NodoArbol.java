/**
 * Representa un nodo de un Árbol Binario en memoria.
 * Almacena el dato y las referencias hacia sus subárboles izquierdo y derecho.
 */
public class NodoArbol {
    public String dato;
    public NodoArbol izquierdo;
    public NodoArbol derecho;

    public NodoArbol(String dato) {
        if (dato == null || dato.trim().isEmpty()) {
            throw new IllegalArgumentException("El dato del nodo no puede estar vacío.");
        }
        this.dato = dato.trim();
        this.izquierdo = null;
        this.derecho = null;
    }
}
