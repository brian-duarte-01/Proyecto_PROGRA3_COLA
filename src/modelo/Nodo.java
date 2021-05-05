
package modelo;


public class Nodo {
   
    int dpi;
    String nombre;
    String transaccion;
    Nodo enlace;

    public Nodo( int d, String nom, String tr, Nodo en ) {
       
        dpi=d;
        nombre=nom;
        transaccion=tr;
        enlace=en;  
    }
    
    public Nodo( int d, String nom, String tr ) {
      
        dpi=d;
        nombre=nom;
        transaccion=tr;
        enlace=null;  
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
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

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
    
}
