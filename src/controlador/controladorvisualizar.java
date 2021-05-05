
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cola;
import modelo.Nodo;
import vista.Visualisarcola;


public class controladorvisualizar implements ActionListener {
    Cola col=new Cola();
    private Nodo nod;
    Visualisarcola vi=new Visualisarcola();

    public controladorvisualizar(Visualisarcola v,Nodo n, Cola c ) {
        this.vi=v;
        this.nod=n;
        this.col=c;
        this.vi.btnvisualizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
           JOptionPane.showMessageDialog(vi,"hola"+col.inicio());
        
    
    }
    
    
    
}
