/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente {
    private JLabel label;
    private int tipoCliente;//1 escritor 0 lector 
    public Cliente(int tipoCliente){
        this.tipoCliente=tipoCliente;
        
        label = new JLabel();
        label.setOpaque(true);
        if(tipoCliente==0){//lector 
            label.setBackground(Color.GREEN);
        }
        else{//Escritor 
             label.setBackground(Color.BLUE);
        }
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
    }
    public JLabel getLabel(){
        return label;
    }
    public int getTipoCliente(){
        return tipoCliente;
    }

}
