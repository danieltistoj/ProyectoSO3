 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente {

    private JLabel label;
    private int tipoCliente;//1 escritor 0 lector 
    private String escritor = "src/img/escritor.png";
    private String lector = "src/img/lector.png";

    public Cliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;

        label = new JLabel();
        label.setOpaque(true);
        if (tipoCliente == 0) {//lector 
            label = new JLabel("lector", SwingConstants.CENTER);
            //label.setBackground(Color.GREEN);
            label.setPreferredSize(new Dimension(96, 84));
            label.setIcon(new ImageIcon(lector));

        } else {//Escritor 
            label = new JLabel("escritor", SwingConstants.CENTER);
            label.setPreferredSize(new Dimension(96, 84));
            label.setIcon(new ImageIcon(escritor));
            //label.setBackground(Color.BLUE);

        }
        // label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }

    public JLabel getLabel() {
        return label;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

}
