package modelo;

public class Nodo {

    int dpi,n1,co=1;
    String nombre;
    int edad;
    String transaccion;
    Nodo siguiente;
    

    public Nodo(int n,int c,int d, String nom,int e, String tr) {
        n1=n;
        co=c;
        dpi = d;
        nombre = nom;
        edad=e;
        transaccion = tr;
        siguiente = null;
    }

}
