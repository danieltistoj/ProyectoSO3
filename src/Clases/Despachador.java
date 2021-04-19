/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Despachador {
    JPanel panel;
    Cliente cliente;
    JProgressBar barra;
    int estado;//0 libre, 1 acupado
    
    public Despachador(JPanel panel,JProgressBar barra){
        this.panel = panel;
        this.barra = barra;
        this.estado = 0;
    }
    public JPanel getPanel(){
        return panel;
    }
    public Cliente getCliente(){
      return cliente;
    }
    public JProgressBar getBarra(){
        return barra;
    }
    public int getEstado(){
        return estado;
    }
    public void setCliente(Cliente cliente){
      this.cliente = cliente;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }

}
