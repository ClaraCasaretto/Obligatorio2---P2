/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Empresa;
import Dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaRegistrarDonacion extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRegistrarDonacion.class.getName());
    private Sistema sistema;
    
    public VentanaRegistrarDonacion() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaRegistrarDonacion(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        actualizar();
    }
    
    private void actualizar() {
        textField_NumeroAdopcion.setText("" + sistema.getContadorDonacion());
        comboBox_Empresa.removeAllItems();
        ArrayList<Empresa> empresas = sistema.getListaEmpresas();
        for (int i = 0; i < empresas.size(); i++) {
            comboBox_Empresa.addItem(empresas.get(i).getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_TipoAlimento = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        label_Datos = new javax.swing.JLabel();
        label_NumeroDonacion = new javax.swing.JLabel();
        textField_NumeroAdopcion = new javax.swing.JTextField();
        label_Empresa = new javax.swing.JLabel();
        comboBox_Empresa = new javax.swing.JComboBox<>();
        label_TipoDeAlimento = new javax.swing.JLabel();
        radioButton_PerrosGrandes = new javax.swing.JRadioButton();
        radioButton_PerrosChicos = new javax.swing.JRadioButton();
        radioButton_PerrosAdultos = new javax.swing.JRadioButton();
        radioButton_Otros = new javax.swing.JRadioButton();
        label_CantidadDeKilos = new javax.swing.JLabel();
        textField_CantidadDeKilos = new javax.swing.JTextField();
        button_Registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REGISTRAR DONACIÓN");
        titulo.setName(""); // NOI18N

        label_Datos.setText("Datos de la donación:");

        label_NumeroDonacion.setText("Nº de donación:");

        textField_NumeroAdopcion.setEditable(false);
        textField_NumeroAdopcion.setBackground(new java.awt.Color(204, 204, 204));
        textField_NumeroAdopcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_NumeroAdopcion.addActionListener(this::textField_NumeroAdopcionActionPerformed);

        label_Empresa.setText("Empresa:");

        label_TipoDeAlimento.setText("Tipo de alimento:");

        buttonGroup_TipoAlimento.add(radioButton_PerrosGrandes);
        radioButton_PerrosGrandes.setText("Para perros grandes");

        buttonGroup_TipoAlimento.add(radioButton_PerrosChicos);
        radioButton_PerrosChicos.setText("Para perros chicos");

        buttonGroup_TipoAlimento.add(radioButton_PerrosAdultos);
        radioButton_PerrosAdultos.setText("Para perros adultos");
        radioButton_PerrosAdultos.addActionListener(this::radioButton_PerrosAdultosActionPerformed);

        buttonGroup_TipoAlimento.add(radioButton_Otros);
        radioButton_Otros.setText("Otros");

        label_CantidadDeKilos.setText("Cantidad de kilos:");

        textField_CantidadDeKilos.addActionListener(this::textField_CantidadDeKilosActionPerformed);

        button_Registrar.setText("Registrar");
        button_Registrar.addActionListener(this::button_RegistrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label_NumeroDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label_TipoDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radioButton_PerrosAdultos)
                                                    .addComponent(radioButton_PerrosGrandes)
                                                    .addComponent(radioButton_PerrosChicos)
                                                    .addComponent(radioButton_Otros)
                                                    .addComponent(comboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_Registrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_NumeroDonacion)
                            .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Empresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_TipoDeAlimento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(comboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton_PerrosGrandes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton_PerrosChicos)
                        .addGap(2, 2, 2)
                        .addComponent(radioButton_PerrosAdultos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButton_Otros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_CantidadDeKilos)
                    .addComponent(textField_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(button_Registrar)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarActionPerformed
        int posicionEmpresa = comboBox_Empresa.getSelectedIndex();
        String kilosTexto  = textField_CantidadDeKilos.getText().trim();
        String tipo = "";
        if(radioButton_PerrosGrandes.isSelected()){
            tipo = "1";
        }else if(radioButton_PerrosChicos.isSelected()){
            tipo = "2";
        }else if(radioButton_PerrosAdultos.isSelected()){
            tipo = "3";
        }else if(radioButton_Otros.isSelected()){
            tipo = "4";
        }
        
        if(posicionEmpresa == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una empresa",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        else if(tipo.equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de alimento",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        else if(kilosTexto .equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad de kilos",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            try {
                double kilos = Double.parseDouble(kilosTexto);

                if (kilos <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "La cantidad de kilos debe ser mayor a cero",
                            "Mensaje de error", JOptionPane.ERROR_MESSAGE);

                } else {
                    Empresa empresa = sistema.getListaEmpresas().get(posicionEmpresa);

                    sistema.agregarDonacion(empresa, tipo, kilos);

                    JOptionPane.showMessageDialog(null,
                            "Donación registrada correctamente",
                            "Registrar donación", JOptionPane.INFORMATION_MESSAGE);

                    textField_CantidadDeKilos.setText("");
                    buttonGroup_TipoAlimento.clearSelection();

                    actualizar();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese una cantidad de kilos válida",
                        "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_button_RegistrarActionPerformed

    private void textField_CantidadDeKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CantidadDeKilosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CantidadDeKilosActionPerformed

    private void radioButton_PerrosAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_PerrosAdultosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton_PerrosAdultosActionPerformed

    private void textField_NumeroAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NumeroAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NumeroAdopcionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaRegistrarDonacion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_TipoAlimento;
    private javax.swing.JButton button_Registrar;
    private javax.swing.JComboBox<String> comboBox_Empresa;
    private javax.swing.JLabel label_CantidadDeKilos;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JLabel label_Empresa;
    private javax.swing.JLabel label_NumeroDonacion;
    private javax.swing.JLabel label_TipoDeAlimento;
    private javax.swing.JRadioButton radioButton_Otros;
    private javax.swing.JRadioButton radioButton_PerrosAdultos;
    private javax.swing.JRadioButton radioButton_PerrosChicos;
    private javax.swing.JRadioButton radioButton_PerrosGrandes;
    private javax.swing.JTextField textField_CantidadDeKilos;
    private javax.swing.JTextField textField_NumeroAdopcion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
