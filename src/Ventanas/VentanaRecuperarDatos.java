/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;
import java.io.IOException;
import javax.swing.JOptionPane;


public class VentanaRecuperarDatos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRecuperarDatos.class.getName());
    private Sistema sistema;
    
    public VentanaRecuperarDatos() {
        initComponents();
    }
    
    public VentanaRecuperarDatos(Sistema unSistema){
        sistema = unSistema;
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_Cancelar = new javax.swing.JButton();
        button_Recuperar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("RECUPERAR DATOS");
        titulo.setName(""); // NOI18N

        jLabel1.setText("Confirmar recuperación de datos  ");

        jLabel2.setText("¿Desea recuperar los datos de la última ejecución finalizada?");

        jLabel3.setText(" Esta acción reemplazará todos los datos actuales del sistema.");

        button_Cancelar.setText("Cancelar");
        button_Cancelar.addActionListener(this::button_CancelarActionPerformed);

        button_Recuperar.setText("Si, recuperar");
        button_Recuperar.addActionListener(this::button_RecuperarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(button_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(button_Recuperar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Cancelar)
                    .addComponent(button_Recuperar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_button_CancelarActionPerformed

    private void button_RecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RecuperarActionPerformed
        try {
            sistema.recuperarDatos();
            JOptionPane.showMessageDialog(null, "Datos recuperados correctamente",
                                         "Recuperación exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al recuperar los datos",
                                         "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al recuperar los datos",
                                         "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_RecuperarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaRecuperarDatos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JButton button_Recuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
