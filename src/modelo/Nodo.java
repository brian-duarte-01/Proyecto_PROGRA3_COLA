
package modelo;


public class Nodo {
   
    String dpi;
    String nombre;
    String transaccion;
    Nodo siguiente;

    public Nodo(String d, String nom, String tr) {
        dpi=d;
        nombre=nom;
        transaccion=tr;
        siguiente= null;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
