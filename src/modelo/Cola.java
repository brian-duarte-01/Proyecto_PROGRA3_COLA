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
    public void insertar(int n,int c, int d, String nom,int e, String tr) {
        Nodo nuevo;
        nuevo = new Nodo(n,c, d, nom,e, tr);
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
    
    
    
    public Cola InsertarAlInicio(int n,int c,int d, String nom,int e,String  tr) 
    {
        Nodo nuevo;
        nuevo = new Nodo(n,c,d,nom,e,tr);
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
    
    
    // metodo para saber quien esta en el inicio de la cola
    public String inicio(){
      return "GM-"+primero.co+", "+primero.dpi+", "+primero.nombre+", "+primero.edad+", "+primero.transaccion;
       
    }
    
    
    
    
    // metodo para mostrar la cola 
    public String mostrar() {
        Nodo aux;
        aux = primero;
        String cadena;
        cadena="";
        while (aux != null) {
               cadena = cadena+aux.n1+"        GM-"+aux.co+"      "+aux.dpi + "      " + aux.nombre + "       "+ aux.edad+"       "+ aux.transaccion + "\n";
            aux = aux.siguiente;
        }
        return cadena;

    }
    
   
    
    
    
    
    
}
