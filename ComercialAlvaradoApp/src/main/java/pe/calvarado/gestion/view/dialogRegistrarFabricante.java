/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.calvarado.gestion.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.apache.log4j.Logger;
import pe.calvarado.gestion.entities.Fabricante;
import pe.calvarado.gestion.services.FabricanteServices;
import pe.calvarado.gestion.util.SpringUtils;
import pe.calvarado.gestion.util.Validar;
import pe.calvarado.gestion.util.messages.UIMessages;

/**
 *
 * @author DIEGOALV
 */
public class dialogRegistrarFabricante extends javax.swing.JDialog {
    
    FabricanteServices fabricanteServices = (FabricanteServices) SpringUtils.getBean("fabricanteServices");
    Logger log = Logger.getLogger(dialogRegistrarProveedor.class);  
    private static final int NO_ULTIMO = 0;   // esto para q es? // Bruno
    List<JTextField> textFieldList = new ArrayList<>(); 
    
    public dialogRegistrarFabricante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarListaDeJTextFieldObligatorios();
    }

    private void cargarListaDeJTextFieldObligatorios(){
        textFieldList.add(txtNombre);
   }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        lblErrorNombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Fabricante"));

        jLabel1.setText("Nombre");

        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setNextFocusableComponent(txtAreaDescripcion);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel2.setText("Descripción");

        txtAreaDescripcion.setEditable(false);
        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        lblErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombre.setText("(*)");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*) Campos Obligatorios");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/add.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblErrorNombre))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                log.info("Traza registrar Fabricante");       
        String inserto;
        if(esValidoElFormulario()){  
        Fabricante f = new Fabricante();
        f.setNombre(txtNombre.getText());
        f.setDescripcion(txtAreaDescripcion.getText());

        inserto = fabricanteServices.insert(f); 
        if(inserto != null){
          JOptionPane.showMessageDialog(this, UIMessages.getInfoMessage("onCompleteInsert"));
          int resp = JOptionPane.showConfirmDialog(this, UIMessages.getQuestionMessage("register_another_fabricante"), 
                     UIMessages.getQuestionMessage("register_another_title"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {                
               limpiarFormulario();
            } else {
               limpiarFormulario();
                dispose();
            }
        }else{
          JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("onInsertError"), UIMessages.getErrorMessage("onInsertError_title"), JOptionPane.ERROR_MESSAGE);
        }               
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
  
    private void validarSiCajaDeTextoEsVacia(String texto, JTextField cajita, JLabel labelDeError, JTextArea siguiente_focus, int ultimo) {
        if (!Validar.esVacio(texto) && !Validar.validarVacio(texto)) {
            if (ultimo == NO_ULTIMO) {
                siguiente_focus.setEnabled(true);
                siguiente_focus.setEditable(true);
                siguiente_focus.requestFocus(); 
            }
            labelDeError.setText("");
            labelDeError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/calvarado/gestion/view/images/check.png")));
        } else {
            cajita.requestFocus();     
        }
    }
        
    
    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
         if(evt.getKeyCode()==evt.VK_ENTER){
           validarSiCajaDeTextoEsVacia(txtNombre.getText(), txtNombre, lblErrorNombre, txtAreaDescripcion, NO_ULTIMO);
        } 
    }//GEN-LAST:event_txtNombreKeyPressed

      public boolean esValidoElFormulario(){
        /* VALIDAMOS QUE ESTEN COMPLETADOS TODOS LOS CAMPOS OBLIGATORIOS */
          for(JTextField txtField : textFieldList){  
              if(Validar.esVacio(txtField.getText()) || Validar.validarVacio(txtField.getText())){              
                JOptionPane.showMessageDialog(this, UIMessages.getErrorMessage("requiredField"), UIMessages.getErrorMessage("requiredField_title"), JOptionPane.ERROR_MESSAGE);
                txtField.requestFocus();
                return false;
                }
          }     
          return true;       
        }
      
      private void limpiarFormulario(){
      txtNombre.setText("");
      txtAreaDescripcion.setText(""); 
      lblErrorNombre.setIcon(null);
      lblErrorNombre.setText("(*)");
      txtNombre.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(dialogRegistrarFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogRegistrarFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogRegistrarFabricante dialog = new dialogRegistrarFabricante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
