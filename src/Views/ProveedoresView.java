/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author FireX
 */
public class ProveedoresView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientesView
     */
    public ProveedoresView() {
        initComponents();
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
        editarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        recargarBoton = new javax.swing.JButton();

        crearBoton.setText("Crear");
        crearBoton.setActionCommand("crearproducto");
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });

        editarBoton.setText("Editar");
        editarBoton.setActionCommand("editarproducto");

        eliminarBoton.setText("Eliminar");
        eliminarBoton.setActionCommand("eliminarproducto");

        recargarBoton.setText("Recargar");
        recargarBoton.setActionCommand("recargarproducto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(crearBoton)
                .addGap(18, 18, 18)
                .addComponent(editarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarBoton)
                .addGap(18, 18, 18)
                .addComponent(recargarBoton)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearBoton)
                    .addComponent(editarBoton)
                    .addComponent(eliminarBoton)
                    .addComponent(recargarBoton))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearBoton;
    private javax.swing.JButton editarBoton;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton recargarBoton;
    // End of variables declaration//GEN-END:variables
}
