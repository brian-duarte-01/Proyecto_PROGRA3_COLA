
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Cola;
import modelo.Nodo;
import vista.joven;


public class controladorjoven implements ActionListener {
    Cola col = new Cola();
    private Nodo nod;
    joven jo = new joven();
    DefaultTableModel modelo =new DefaultTableModel();

    public controladorjoven(joven j) {
        this.jo=j;
        this.jo.txtenviar.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==jo.txtenviar){
           agregar();
       }
    
    }
    
    public void agregar(){
        int d=Integer.parseInt(jo.txtdpi.getText());
        String nom=jo.txtnom.getText();
        String tr = jo.txttransaccion.getText();
        nod.setDpi(d);
        nod.setNombre(nom);
        nod.setTransaccion(tr);
        col.InsertarNodoAlFinal(d, nom, tr);
    }
    
}
