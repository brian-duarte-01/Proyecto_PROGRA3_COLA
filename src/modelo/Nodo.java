package modelo;

public class Nodo {

    int dpi,n1;
    String nombre;
    int edad;
    String transaccion;
    Nodo siguiente;
    

    public Nodo(int n,int d, String nom,int e, String tr) {
        
        n1=n;
        dpi = d;
        nombre = nom;
        edad=e;
        transaccion = tr;
        siguiente = null;
    }

}
