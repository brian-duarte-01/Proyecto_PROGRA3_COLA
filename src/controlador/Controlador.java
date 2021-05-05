
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cola;
import modelo.Nodo;
import vista.abuelo;



public class Controlador implements ActionListener {
    Cola co=new Cola();
    abuelo a=new abuelo();
    private Nodo nod;

    public Controlador(Cola co, abuelo a) {
        this.a=a;
        this.co=co;
        this.a.btnenviar.addActionListener(this);
    }
    
     public void iniciar(){
        a.setTitle("MCV PRUEBA");
        a.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String d,nom,tr;
       d=a.txtdpi.getText();
       nom=a.txtnom.getText();
       tr=a.txttransaccion.getText();
       co.insertar(d, nom, tr);
       a.txtsalida.setText(co.toString());
    }
  
   
    
    
    
}
