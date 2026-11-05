/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;

public class VentanaRegistrarDonacion extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRegistrarDonacion.class.getName());

    public VentanaRegistrarDonacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        label_Empresa.setText("Empresa:");

        label_TipoDeAlimento.setText("Tipo de alimento:");

        radioButton_PerrosGrandes.setText("Para perros grandes");

        radioButton_PerrosChicos.setText("Para perros chicos");

        radioButton_PerrosAdultos.setText("Para perros adultos");

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
                                                .addComponent(label_NumeroDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(radioButton_Otros))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_TipoDeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radioButton_PerrosAdultos)
                                                    .addComponent(radioButton_PerrosGrandes)
                                                    .addComponent(radioButton_PerrosChicos)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 55, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NumeroDonacion)
                    .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Empresa)
                    .addComponent(comboBox_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_TipoDeAlimento)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(radioButton_PerrosGrandes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton_PerrosChicos)
                        .addGap(6, 6, 6)))
                .addComponent(radioButton_PerrosAdultos)
                .addGap(2, 2, 2)
                .addComponent(radioButton_Otros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_CantidadDeKilos)
                    .addComponent(textField_CantidadDeKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Registrar)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarActionPerformed

    }//GEN-LAST:event_button_RegistrarActionPerformed

    private void textField_CantidadDeKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CantidadDeKilosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CantidadDeKilosActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaRegistrarDonacion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
