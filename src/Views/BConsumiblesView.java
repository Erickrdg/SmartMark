/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controladoresview.ControladorBConsumible;
import SmartConexion.SQLServerConnection;

/**
 *
 * @author FireX
 */
public class BConsumiblesView extends javax.swing.JInternalFrame {
  BConsumiblesView consumibleView; 
    /**
     * Creates new form BConsumiblesView
     */
    public BConsumiblesView() {
        initComponents();
       
    }
        private void setControllers(SQLServerConnection connection){
            controladorBConsumible = new ControladorBConsumible(this, connection);
            
        }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearBoton = new javax.swing.JButton();
        editarBton = new javax.swing.JButton();
        eliminarBtton = new javax.swing.JButton();
        recargarBtton = new javax.swing.JButton();

        crearBoton.setText("Crear");
        crearBoton.setActionCommand("Crear Producto");
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });

        editarBton.setText("Editar");
        editarBton.setActionCommand("edicionconsumible");

        eliminarBtton.setText("Eliminar");
        eliminarBtton.setActionCommand("eliminarconsumible");

        recargarBtton.setText("Recargar");
        recargarBtton.setActionCommand("recargarconsumible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crearBoton)
                .addGap(18, 18, 18)
                .addComponent(editarBton)
                .addGap(18, 18, 18)
                .addComponent(eliminarBtton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recargarBtton)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearBoton)
                    .addComponent(editarBton)
                    .addComponent(eliminarBtton)
                    .addComponent(recargarBtton))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearBoton;
    private javax.swing.JButton editarBton;
    private javax.swing.JButton eliminarBtton;
    private javax.swing.JButton recargarBtton;
    // End of variables declaration//GEN-END:variables
}
