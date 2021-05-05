package modelo;

public class Cola {

    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public boolean colaVacia() {
        return primero == null;

    }

    public void insertar(String d, String nom, String tr) {
        Nodo nuevo;
        nuevo = new Nodo(d, nom, tr);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

    }

    public Object quitar() {
        Object aux = null;
        if (!colaVacia()) {
            aux = primero.dpi;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
        }
        return aux;
    }

    public String toString() {
        Nodo aux;
        aux = primero;
        String cadena;
        cadena = "";
        while(aux !=null){
            cadena=cadena + aux.dpi+" , " +aux.nombre +  " , " +aux.transaccion+"\n";
            aux = aux.siguiente;
        }
        return cadena;

    }

}
