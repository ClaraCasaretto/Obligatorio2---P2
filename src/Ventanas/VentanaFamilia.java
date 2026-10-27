/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;

import Dominio.Sistema;
import Dominio.Familia;
import javax.swing.JOptionPane;

public class VentanaFamilia extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaFamilia.class.getName());
    private Familia familia;
    private Sistema sistema;
    
    public VentanaFamilia() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaFamilia(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        label_Cedula = new javax.swing.JLabel();
        textField_Cedula = new javax.swing.JTextField();
        label_Apellido = new javax.swing.JLabel();
        textField_Apellido = new javax.swing.JTextField();
        label_Celular = new javax.swing.JLabel();
        textField_Celular = new javax.swing.JTextField();
        button_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ALTA FAMILIA");
        titulo.setName(""); // NOI18N

        label_Cedula.setText("Cédula:");

        textField_Cedula.addActionListener(this::textField_CedulaActionPerformed);

        label_Apellido.setText("Apellido:");

        textField_Apellido.addActionListener(this::textField_ApellidoActionPerformed);

        label_Celular.setText("Celular:");

        textField_Celular.addActionListener(this::textField_CelularActionPerformed);

        button_Agregar.setText("Agregar");
        button_Agregar.addActionListener(this::button_AgregarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(textField_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(textField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Cedula)
                    .addComponent(textField_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Apellido)
                    .addComponent(textField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Celular)
                    .addComponent(textField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_Agregar)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CedulaActionPerformed

    private void textField_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ApellidoActionPerformed

    private void textField_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CelularActionPerformed

    private void button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AgregarActionPerformed
        if (textField_Cedula.getText().trim().equals("")
            || textField_Apellido.getText().trim().equals("")
            || textField_Celular.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(null,"Complete todas las casillas",
                                         "Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
        else if (sistema.existeCedulaFamilia(textField_Cedula.getText().trim())) {
            JOptionPane.showMessageDialog(null,"Ya existe una familia con esa cédula",
                                         "Mensaje de error",JOptionPane.ERROR_MESSAGE);
            textField_Cedula.setText("");
        }
        else {
            Familia familia = new Familia(
                                        textField_Cedula.getText().trim(),
                                        textField_Apellido.getText().trim(),
                                        textField_Celular.getText().trim()
                                        );
            sistema.agregarFamilia(familia);
            JOptionPane.showMessageDialog(null,"Familia agregada correctamente", 
                                          "Alta Familia",JOptionPane.PLAIN_MESSAGE);
            textField_Cedula.setText("");
            textField_Apellido.setText("");
            textField_Celular.setText("");
            
        }
    }//GEN-LAST:event_button_AgregarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaFamilia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Agregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Apellido;
    private javax.swing.JLabel label_Cedula;
    private javax.swing.JLabel label_Celular;
    private javax.swing.JTextField textField_Apellido;
    private javax.swing.JTextField textField_Cedula;
    private javax.swing.JTextField textField_Celular;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
