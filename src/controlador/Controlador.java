
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cola;
import modelo.Nodo;
import vista.abuelo;



public class Controlador implements ActionListener {
    Cola col =new Cola();
    private Nodo nod;
    abuelo abu = new abuelo();
    DefaultTableModel modelo =new DefaultTableModel();

    public Controlador(abuelo a) {
        this.abu=a;
        this.abu.txtenviar.addActionListener(this);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==abu.txtenviar){
            agregar();
        }
    
    }
  
    public void agregar(){
        
        int d=Integer.parseInt(abu.txtdpi.getText());
        String nom=abu.txtnom.getText();
        String tr=abu.txttransaccion.getText();
        nod.setDpi(d);
        nod.setNombre(nom);
        nod.setTransaccion(tr);
        col.InsertarAlInicio(d, nom, tr);
        
        
    }
    
    
    
    
}
