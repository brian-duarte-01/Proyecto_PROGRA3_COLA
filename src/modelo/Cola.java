package modelo;


public class Cola {
    // de claracion de variables para la cola
    private Nodo primero;
    private Nodo ultimo;
    int tama;
    //contructor de cola
    public Cola() {
        primero = null;
        ultimo = null;
    }
    //metodo para saber si esta vacia la cola 
    public boolean colaVacia() {
        return primero == null;

    }
    //metodo para insertar al final de la cola 
    public void insertar(int d, String nom, String tr) {
        Nodo nuevo;
        nuevo = new Nodo(d, nom, tr);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            tama++;
        }

    }
    //metodo para insertar al principio de la cola
    
    
    
    public Cola InsertarAlInicio(int d, String nom,String  tr) 
    {
        Nodo nuevo;
        nuevo = new Nodo(d,nom,tr);
        nuevo.siguiente = primero;
        primero = nuevo;
        return this;
    }
    
    
    
    
    // metodo para quitar elemento de la cola
    public int quitar() {
        int aux = primero.dpi;
        primero = primero.siguiente;
        tama--;
        return aux;
    }
    
    
    
    
    
    // metodo para mostrar la cola 
    public String mostrar() {
        Nodo aux;
        aux = primero;
        String cadena;
        cadena="";
        while (aux != null) {
            cadena = cadena+aux.dpi + " ,  " + aux.nombre + " ,  " + aux.transaccion + "\n";
            aux = aux.siguiente;
        }
        return cadena;

    }

}
