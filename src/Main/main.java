/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.Cliente;
import java.util.ArrayList;
import Clases.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.event.AncestorEvent;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class main extends javax.swing.JFrame {

    ArrayList<Cliente> clientesGeneral, clientesEscritor;
    ArrayList<Despachador> despachadores;
    Despachador despachador1, despachador2, despachador3, despachador4, despachador5;
    int posicionGeneralY, posicionEscritorY, contadorLectores = 0;
    boolean lectorEnArea, escritorEnArea;
    Semaphore mutex = new Semaphore(1, true);

    public main() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        clientesGeneral = new ArrayList<Cliente>();
        clientesEscritor = new ArrayList<>();
        despachadores = new ArrayList<Despachador>();
        posicionGeneralY = 0;
        posicionEscritorY = 0;
        lectorEnArea = false;
        escritorEnArea = false;

        despachador1 = new Despachador(panelCaja1, barraProgreso1);
        despachador2 = new Despachador(panelCaja2, barraProgreso2);
        despachador3 = new Despachador(panelCaja3, barraProgreso3);
        despachador4 = new Despachador(panelCaja4, barraProgreso4);
        despachador5 = new Despachador(panelCaja5, barraProgreso5);

        despachadores.add(despachador1);
        despachadores.add(despachador2);
        despachadores.add(despachador3);
        despachadores.add(despachador4);
        despachadores.add(despachador5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEsperaEscritor = new javax.swing.JPanel();
        panelEsperaGeneral = new javax.swing.JPanel();
        btnIngresarLector = new javax.swing.JButton();
        btnIngresarEscritor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCaja1 = new javax.swing.JPanel();
        panelCaja5 = new javax.swing.JPanel();
        panelCaja4 = new javax.swing.JPanel();
        panelCaja3 = new javax.swing.JPanel();
        panelCaja2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        barraProgreso1 = new javax.swing.JProgressBar();
        barraProgreso2 = new javax.swing.JProgressBar();
        barraProgreso3 = new javax.swing.JProgressBar();
        barraProgreso4 = new javax.swing.JProgressBar();
        barraProgreso5 = new javax.swing.JProgressBar();
        btnAtender = new javax.swing.JButton();
        btnAtenderEscritor = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEsperaEscritor.setBackground(new java.awt.Color(255, 255, 255));
        panelEsperaEscritor.setPreferredSize(new java.awt.Dimension(178, 516));
        panelEsperaEscritor.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelEsperaEscritorLayout = new javax.swing.GroupLayout(panelEsperaEscritor);
        panelEsperaEscritor.setLayout(panelEsperaEscritorLayout);
        panelEsperaEscritorLayout.setHorizontalGroup(
            panelEsperaEscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelEsperaEscritorLayout.setVerticalGroup(
            panelEsperaEscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        panelEsperaGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelEsperaGeneral.setPreferredSize(new java.awt.Dimension(178, 516));
        panelEsperaGeneral.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelEsperaGeneralLayout = new javax.swing.GroupLayout(panelEsperaGeneral);
        panelEsperaGeneral.setLayout(panelEsperaGeneralLayout);
        panelEsperaGeneralLayout.setHorizontalGroup(
            panelEsperaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelEsperaGeneralLayout.setVerticalGroup(
            panelEsperaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        btnIngresarLector.setText("Ingresar Lectores");
        btnIngresarLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarLectorActionPerformed(evt);
            }
        });

        btnIngresarEscritor.setText("Ingresar Escritores");
        btnIngresarEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEscritorActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fila general");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fila escritor bloqueado");

        panelCaja1.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja1.setPreferredSize(new java.awt.Dimension(178, 129));

        javax.swing.GroupLayout panelCaja1Layout = new javax.swing.GroupLayout(panelCaja1);
        panelCaja1.setLayout(panelCaja1Layout);
        panelCaja1Layout.setHorizontalGroup(
            panelCaja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelCaja1Layout.setVerticalGroup(
            panelCaja1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        panelCaja5.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja5.setPreferredSize(new java.awt.Dimension(178, 129));

        javax.swing.GroupLayout panelCaja5Layout = new javax.swing.GroupLayout(panelCaja5);
        panelCaja5.setLayout(panelCaja5Layout);
        panelCaja5Layout.setHorizontalGroup(
            panelCaja5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelCaja5Layout.setVerticalGroup(
            panelCaja5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        panelCaja4.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja4.setPreferredSize(new java.awt.Dimension(178, 129));

        javax.swing.GroupLayout panelCaja4Layout = new javax.swing.GroupLayout(panelCaja4);
        panelCaja4.setLayout(panelCaja4Layout);
        panelCaja4Layout.setHorizontalGroup(
            panelCaja4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelCaja4Layout.setVerticalGroup(
            panelCaja4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        panelCaja3.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja3.setPreferredSize(new java.awt.Dimension(178, 129));

        javax.swing.GroupLayout panelCaja3Layout = new javax.swing.GroupLayout(panelCaja3);
        panelCaja3.setLayout(panelCaja3Layout);
        panelCaja3Layout.setHorizontalGroup(
            panelCaja3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelCaja3Layout.setVerticalGroup(
            panelCaja3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        panelCaja2.setBackground(new java.awt.Color(204, 204, 204));
        panelCaja2.setPreferredSize(new java.awt.Dimension(178, 129));

        javax.swing.GroupLayout panelCaja2Layout = new javax.swing.GroupLayout(panelCaja2);
        panelCaja2.setLayout(panelCaja2Layout);
        panelCaja2Layout.setHorizontalGroup(
            panelCaja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        panelCaja2Layout.setVerticalGroup(
            panelCaja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        btnLimpiar.setText("Limpiar Lugares");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Despacho");

        btnAtender.setText("Atender General");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        btnAtenderEscritor.setText("Atender Escritor");
        btnAtenderEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderEscritorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(panelCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelCaja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelCaja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(barraProgreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(barraProgreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(barraProgreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barraProgreso4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelEsperaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnIngresarLector)
                                            .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnIngresarEscritor)
                                            .addComponent(btnAtenderEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraProgreso5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCaja5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEsperaEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraProgreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barraProgreso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(barraProgreso5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(barraProgreso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(barraProgreso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelCaja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelCaja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelCaja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelCaja5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelEsperaEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEsperaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresarLector)
                            .addComponent(btnIngresarEscritor))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtenderEscritor))
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpiar)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void desplazarCliente(JPanel panel, ArrayList<Cliente> clientes, int posicionY) {
        for (Cliente cliente : clientes) {
            int y = cliente.getLabel().getY();
            y -= 129;
            cliente.getLabel().setBounds(0, y, 178, 129);
        }
        panel.repaint();
        if (posicionY == 0) {
            posicionGeneralY -= 129;
        } else {
            posicionEscritorY -= 129;
        }

    }

    public int ingresarCliente(JPanel panel, Cliente cliente, ArrayList<Cliente> clientes, int posicionY) {
        if (clientes.size() < 4) {
            cliente.getLabel().setBounds(0, posicionY, 178, 129);
            panel.add(cliente.getLabel());
            panel.repaint();
            posicionY += 129;
            clientes.add(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Ya no hay espacion en la fila general", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return posicionY;
    }

    public void AtenderEscritor(JPanel panel, ArrayList<Cliente> clientes, int posicionY) {
        //recorremos el array de despachadores buscando uno que este libre con estado 0
        for (Despachador despachador : despachadores) {
            if (despachador.getEstado() == 0) {//verificamos el estado 
                //removemos del panel de espera general el cliente que este en la primera posicion
                panel.remove(clientes.get(0).getLabel());
                //volvemos a pintar el panel
                panel.repaint();
                //le ingresamos al despachador el cliente 
                despachador.setCliente(clientes.get(0));
                //agragamos el label del cliente al panel del despachador 
                despachador.getPanel().add(despachador.getCliente().getLabel());
                //volvemos a pintar el panel del despachador 
                despachador.getPanel().repaint();
                //removemos de la lista de clientes el primer cliente 
                clientes.remove(0);
                //desplazamos los clientes una posicion
                desplazarCliente(panel, clientes, posicionY);
                //pones el estado del despachador en 1, lo que signfica que ahora esta ocupado
                despachador.setEstado(1);
                AtenderCliente atender = new AtenderCliente(despachador);
                atender.start();
                break;
            }

        }

    }
    public void condiciondeAtender(){
        
         //atender a clientes del panel general 
        if (clientesGeneral.size() > 0) {
            if (clientesGeneral.get(0).getTipoCliente() == 0) {
                if (escritorEnArea == false) {
                    
                    AtenderEscritor(panelEsperaGeneral, clientesGeneral, 0);
                    contadorLectores++;
                }
            } else if (clientesGeneral.get(0).getTipoCliente() == 1) {
                System.out.println("entro");
                if (contadorLectores == 0 && escritorEnArea == false) {
                    AtenderEscritor(panelEsperaGeneral, clientesGeneral, 0);
                    escritorEnArea = true;

                } else {
                    Cliente cliente = clientesGeneral.get(0);
                    clientesGeneral.remove(0);
                    panelEsperaGeneral.remove(cliente.getLabel());
                    panelEsperaGeneral.repaint();
                    posicionEscritorY = ingresarCliente(panelEsperaEscritor, cliente, clientesEscritor, posicionEscritorY);
                    desplazarCliente(panelEsperaGeneral, clientesGeneral, 0);
                }
            }

        } else {
            //JOptionPane.showMessageDialog(null, "No hay clientes para antender en el general", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void btnIngresarLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarLectorActionPerformed
        Cliente cliente = new Cliente(0);
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        posicionGeneralY = ingresarCliente(panelEsperaGeneral, cliente, clientesGeneral, posicionGeneralY);
        mutex.release();
        condiciondeAtender();
        System.out.println(posicionGeneralY);
    }//GEN-LAST:event_btnIngresarLectorActionPerformed

    private void btnIngresarEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEscritorActionPerformed
        Cliente cliente = new Cliente(1);
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        posicionGeneralY = ingresarCliente(panelEsperaGeneral, cliente, clientesGeneral, posicionGeneralY);
        mutex.release();
        condiciondeAtender();
        System.out.println(posicionGeneralY);
    }//GEN-LAST:event_btnIngresarEscritorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
       

    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnAtenderEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderEscritorActionPerformed
        if (clientesEscritor.size() > 0) {
            if (contadorLectores == 0 && escritorEnArea == false) {
                AtenderEscritor(panelEsperaEscritor, clientesEscritor, 1);
                escritorEnArea = true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes para antender en la lista de escritores", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAtenderEscritorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    public class AtenderCliente extends Thread {

        Despachador despachador;

        public AtenderCliente(Despachador despachador) {
            this.despachador = despachador;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                despachador.getBarra().setValue(i);
            }
            //Eliminamos el label del cliente del panel del despachador
            despachador.getPanel().remove(despachador.getCliente().getLabel());
            //repintamos el panele del despachador
            despachador.getPanel().repaint();
            //el estado del despachador vuelve a cero
            despachador.setEstado(0);
            //dejamos la barra de progreso igual a cero
            despachador.getBarra().setValue(0);
            //si hay mas de un lector se reduce
            if (contadorLectores != 0) {
                contadorLectores -= 1;
            }
            //si entro un escritor se pone en falso
            escritorEnArea = false;
            condiciondeAtender();

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso1;
    private javax.swing.JProgressBar barraProgreso2;
    private javax.swing.JProgressBar barraProgreso3;
    private javax.swing.JProgressBar barraProgreso4;
    private javax.swing.JProgressBar barraProgreso5;
    private javax.swing.JButton btnAtender;
    private javax.swing.JToggleButton btnAtenderEscritor;
    private javax.swing.JButton btnIngresarEscritor;
    private javax.swing.JButton btnIngresarLector;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelCaja1;
    private javax.swing.JPanel panelCaja2;
    private javax.swing.JPanel panelCaja3;
    private javax.swing.JPanel panelCaja4;
    private javax.swing.JPanel panelCaja5;
    private javax.swing.JPanel panelEsperaEscritor;
    private javax.swing.JPanel panelEsperaGeneral;
    // End of variables declaration//GEN-END:variables
}
