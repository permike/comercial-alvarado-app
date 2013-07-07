/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.view;

import java.io.IOException;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.util.lookandfeel.MyLookAndFeel;

/**
 *
 * @author DIEGOALV
 */
public class frmMainApp extends javax.swing.JFrame {

    
    static Logger log = Logger.getLogger(frmMainApp.class);
    
    /* Formularios */
        dialogRegistrarProveedor moduloProveedor = new dialogRegistrarProveedor(this,true);
        dialogGestionarProveedor gestionarProveedor =  new dialogGestionarProveedor(this,true);
        dialogGestionarCategorias gestionarCategorias = new dialogGestionarCategorias(this,true);
        dialogRegistrarFabricante registrarFabricante = new dialogRegistrarFabricante(this, true);
        dialogGestionarFabricante gestionarFabricante = new dialogGestionarFabricante(this, true);
    
    
    public frmMainApp() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        menuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar1.add(jMenu2);

        jMenu3.setText("Gestión");

        jMenu4.setText("Proveedor");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Registrar Proveedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Gestionar Proveedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu3.add(jMenu4);

        jMenu5.setText("Fabricante");

        jMenuItem1.setText("Registrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Gestionar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenu3.add(jMenu5);

        jMenu6.setText("Categorias");

        jMenuItem3.setText("Gestionar Categorias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenu3.add(jMenu6);

        jMenu7.setText("Atributos");
        jMenu3.add(jMenu7);

        menuBar1.add(jMenu3);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        moduloProveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        gestionarProveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gestionarCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       registrarFabricante.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gestionarFabricante.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

  
    public static void main(String args[]) {
        
        try {
            MyLookAndFeel.setCurrentLookAndFeel("Acry_Lemmon_Small_Font.properties");
        } catch (ClassNotFoundException | IOException ex) {
            log.error("Error al cargar Look & Feel");
            log.error(ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
