
package modelo;

public class Cola {
   Nodo frente;
    Nodo fin;
    int tama;
    //constructor
    public Cola() 
    {
        frente = null;
        fin = null;
    }
    
    //metodo insertar al inicio en cola lineal
    public Cola InsertarAlInicio( int d, String nom, String tr) 
    {
        Nodo nuevo;
        nuevo = new Nodo(d,nom,tr,frente);
        nuevo.enlace = frente;
        frente = nuevo;
        return this;
    }
    
    //metodo insertar al final en cola lineal
    public void InsertarNodoAlFinal(int d, String nom, String tr) {
        Nodo indice;

        if (frente == null) {
            Nodo nuevo;
            nuevo = new Nodo(d,nom,tr);
            frente = nuevo;
        } else {
            for (indice = frente; indice.enlace != null; indice = indice.enlace) {
            }

            Nodo nuevo;
            nuevo = new Nodo(d,nom,tr);
            indice.enlace = nuevo;
        }
    }
   
    
   public int quitar(){
        int aux=frente.dpi;
        frente=frente.enlace;
        tama--;
        return aux;
    }
   
   public int inicio(){
       return frente.dpi;
   }
}
