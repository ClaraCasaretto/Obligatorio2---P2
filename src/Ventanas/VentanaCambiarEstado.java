/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;

public class VentanaCambiarEstado extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaCambiarEstado.class.getName());

    public VentanaCambiarEstado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        label_AnimalesDisponibles1 = new javax.swing.JLabel();
        jList_Animales = new javax.swing.JScrollPane();
        list_Animales = new javax.swing.JList<>();
        label_Datos = new javax.swing.JLabel();
        label_Peso = new javax.swing.JLabel();
        label_Peso1 = new javax.swing.JLabel();
        label_Peso2 = new javax.swing.JLabel();
        label_Peso3 = new javax.swing.JLabel();
        label_Peso4 = new javax.swing.JLabel();
        textField_Peso = new javax.swing.JTextField();
        textField_Peso1 = new javax.swing.JTextField();
        textField_Peso2 = new javax.swing.JTextField();
        textField_Peso3 = new javax.swing.JTextField();
        textField_Peso4 = new javax.swing.JTextField();
        button_Adoptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("CAMBIAR ESTADO");
        titulo1.setName(""); // NOI18N

        label_AnimalesDisponibles1.setText("Animales disponibles:");

        list_Animales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list_Animales.addListSelectionListener(this::list_AnimalesValueChanged);
        jList_Animales.setViewportView(list_Animales);

        label_Datos.setText("Datos del animal seleccionado:");

        label_Peso.setText("Código:");

        label_Peso1.setText("Nombre:");

        label_Peso2.setText("Temperamento:");

        label_Peso3.setText("Peso en kilos:");

        label_Peso4.setText("Estado actual:");

        textField_Peso.setEditable(false);
        textField_Peso.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso.addActionListener(this::textField_PesoActionPerformed);

        textField_Peso1.setEditable(false);
        textField_Peso1.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso1.addActionListener(this::textField_Peso1ActionPerformed);

        textField_Peso2.setEditable(false);
        textField_Peso2.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso2.addActionListener(this::textField_Peso2ActionPerformed);

        textField_Peso3.setEditable(false);
        textField_Peso3.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso3.addActionListener(this::textField_Peso3ActionPerformed);

        textField_Peso4.setEditable(false);
        textField_Peso4.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso4.addActionListener(this::textField_Peso4ActionPerformed);

        button_Adoptar.setText("Cambiar");
        button_Adoptar.addActionListener(this::button_AdoptarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_AnimalesDisponibles1)
                    .addComponent(jList_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(titulo1)
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(label_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_Peso2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button_Adoptar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textField_Peso2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(label_AnimalesDisponibles1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(titulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_Datos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso)
                            .addComponent(textField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso1)
                            .addComponent(textField_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso2)
                            .addComponent(textField_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso3)
                            .addComponent(textField_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso4)
                            .addComponent(textField_Peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Adoptar))
                    .addComponent(jList_Animales, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_AnimalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_AnimalesValueChanged
        if (list_Animales.getSelectedIndex() != -1) {
            int posicion = list_Animales.getSelectedIndex();
            ArrayList<Animal> disponibles = sistema.obtenerAnimalesDisponibles();
            Animal animal = disponibles.get(posicion);
            textField_Peso.setText("" + animal.getPeso());
            textField_Temperamento.setText(animal.getTemperamento());
        } else {
            textField_Peso.setText("");
            textField_Temperamento.setText("");
        }
    }//GEN-LAST:event_list_AnimalesValueChanged

    private void textField_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_PesoActionPerformed

    private void textField_Peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Peso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_Peso1ActionPerformed

    private void textField_Peso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Peso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_Peso2ActionPerformed

    private void textField_Peso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Peso3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_Peso3ActionPerformed

    private void textField_Peso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Peso4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_Peso4ActionPerformed

    private void button_AdoptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdoptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_AdoptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaCambiarEstado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Adoptar;
    private javax.swing.JScrollPane jList_Animales;
    private javax.swing.JLabel label_AnimalesDisponibles1;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JLabel label_Peso;
    private javax.swing.JLabel label_Peso1;
    private javax.swing.JLabel label_Peso2;
    private javax.swing.JLabel label_Peso3;
    private javax.swing.JLabel label_Peso4;
    private javax.swing.JList<String> list_Animales;
    private javax.swing.JTextField textField_Peso;
    private javax.swing.JTextField textField_Peso1;
    private javax.swing.JTextField textField_Peso2;
    private javax.swing.JTextField textField_Peso3;
    private javax.swing.JTextField textField_Peso4;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
