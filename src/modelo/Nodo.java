package modelo;

public class Nodo {

    int dpi;
    String nombre;
    String transaccion;
    Nodo siguiente;

    public Nodo(int d, String nom, String tr) {
        dpi = d;
        nombre = nom;
        transaccion = tr;
        siguiente = null;
    }

}
