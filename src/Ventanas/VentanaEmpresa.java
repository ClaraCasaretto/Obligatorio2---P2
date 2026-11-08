/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import javax.swing.JOptionPane;
import Dominio.Sistema;
import Dominio.Empresa;


public class VentanaEmpresa extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaEmpresa.class.getName());
    private Sistema sistema;
    private Empresa empresa;
    
    public VentanaEmpresa() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaEmpresa(Sistema unSistema){
        sistema = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        label_Nombre = new javax.swing.JLabel();
        textField_Nombre = new javax.swing.JTextField();
        label_RUT = new javax.swing.JLabel();
        textField_RUT = new javax.swing.JTextField();
        label_Direccion = new javax.swing.JLabel();
        textField_Direccion = new javax.swing.JTextField();
        button_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ALTA EMPRESA");
        titulo.setName(""); // NOI18N

        label_Nombre.setText("Nombre:");

        textField_Nombre.addActionListener(this::textField_NombreActionPerformed);

        label_RUT.setText("RUT:");

        textField_RUT.addActionListener(this::textField_RUTActionPerformed);

        label_Direccion.setText("Dirección:");

        textField_Direccion.addActionListener(this::textField_DireccionActionPerformed);

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
                        .addComponent(label_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(textField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(textField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Nombre)
                    .addComponent(textField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_RUT)
                    .addComponent(textField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Direccion)
                    .addComponent(textField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void textField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NombreActionPerformed

    private void textField_RUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_RUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_RUTActionPerformed

    private void textField_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_DireccionActionPerformed

    private void button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AgregarActionPerformed
        if(textField_Nombre.getText().trim().equals("") || 
           textField_RUT.getText().trim().equals("") ||
           textField_Direccion.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(null,"Complete todas las casillas",
                                         "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        else if(sistema.existeRutEmpresa(textField_RUT.getText().trim())){
            JOptionPane.showMessageDialog(null, "Ya existe una empresa con ese RUT",
                                         "Mensaje de error", JOptionPane.ERROR_MESSAGE );
            textField_RUT.setText("");
        }
        else{
            Empresa empresa = new Empresa(
                                        textField_Nombre.getText().trim(),
                                        textField_RUT.getText().trim(),
                                        textField_Direccion.getText().trim()
                                        ); 
            sistema.agregarEmpresa(empresa);
            JOptionPane.showMessageDialog(null, "Empresa registrada correctamente", 
                                        "Alta Empresa", JOptionPane.PLAIN_MESSAGE);
            textField_Nombre.setText("");
            textField_RUT.setText("");
            textField_Direccion.setText("");
        }
    }//GEN-LAST:event_button_AgregarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaEmpresa().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Agregar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Direccion;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_RUT;
    private javax.swing.JTextField textField_Direccion;
    private javax.swing.JTextField textField_Nombre;
    private javax.swing.JTextField textField_RUT;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
