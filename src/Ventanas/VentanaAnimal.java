/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Animal;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaAnimal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaAnimal.class.getName());
    private Animal animal;
    private Sistema sistema;

    public VentanaAnimal() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaAnimal(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        label_Codigo = new javax.swing.JLabel();
        textField_Codigo = new javax.swing.JTextField();
        label_Nombre = new javax.swing.JLabel();
        textField_Nombre = new javax.swing.JTextField();
        label_Temperamento = new javax.swing.JLabel();
        textField_Temperamento = new javax.swing.JTextField();
        label_Peso = new javax.swing.JLabel();
        textField_Peso = new javax.swing.JTextField();
        label_Estado = new javax.swing.JLabel();
        comboBox_Estado = new javax.swing.JComboBox<>();
        button_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta Animal");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ALTA ANIMAL");
        titulo.setName(""); // NOI18N
        jPanel1.add(titulo);
        titulo.setBounds(90, 10, 230, 25);

        label_Codigo.setText("Código:");
        jPanel1.add(label_Codigo);
        label_Codigo.setBounds(30, 50, 60, 16);

        textField_Codigo.addActionListener(this::textField_CodigoActionPerformed);
        jPanel1.add(textField_Codigo);
        textField_Codigo.setBounds(130, 50, 220, 22);

        label_Nombre.setText("Nombre:");
        jPanel1.add(label_Nombre);
        label_Nombre.setBounds(30, 80, 70, 16);

        textField_Nombre.addActionListener(this::textField_NombreActionPerformed);
        jPanel1.add(textField_Nombre);
        textField_Nombre.setBounds(130, 80, 220, 22);

        label_Temperamento.setText("Temperamento:");
        jPanel1.add(label_Temperamento);
        label_Temperamento.setBounds(30, 110, 100, 16);

        textField_Temperamento.addActionListener(this::textField_TemperamentoActionPerformed);
        jPanel1.add(textField_Temperamento);
        textField_Temperamento.setBounds(130, 110, 220, 22);

        label_Peso.setText("Peso en Kilos:");
        jPanel1.add(label_Peso);
        label_Peso.setBounds(30, 140, 90, 16);

        textField_Peso.addActionListener(this::textField_PesoActionPerformed);
        jPanel1.add(textField_Peso);
        textField_Peso.setBounds(130, 140, 220, 22);

        label_Estado.setText("Estado:");
        jPanel1.add(label_Estado);
        label_Estado.setBounds(30, 170, 70, 16);

        comboBox_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible para adoptar", "No disponible para adoptar", "Entregado a familia", " " }));
        comboBox_Estado.addActionListener(this::comboBox_EstadoActionPerformed);
        jPanel1.add(comboBox_Estado);
        comboBox_Estado.setBounds(130, 170, 220, 22);

        button_Agregar.setText("Agregar");
        button_Agregar.addActionListener(this::button_AgregarActionPerformed);
        jPanel1.add(button_Agregar);
        button_Agregar.setBounds(160, 200, 90, 23);
        button_Agregar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 300);

        setBounds(0, 0, 429, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void textField_TemperamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_TemperamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_TemperamentoActionPerformed

    private void textField_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CodigoActionPerformed

    private void textField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NombreActionPerformed

    private void textField_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_PesoActionPerformed

    private void comboBox_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_EstadoActionPerformed

    private void button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AgregarActionPerformed
        if (textField_Codigo.getText().trim().equals("") 
            ||textField_Nombre.getText().trim().equals("") 
            ||textField_Temperamento.getText().trim().equals("") 
            ||textField_Peso.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null,"Complete todas las casillas",
                                         "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        else if(sistema.existeCodigoAnimal(textField_Codigo.getText().trim().toUpperCase())){
            JOptionPane.showMessageDialog(null,"Ya existe un animal con ese código",
                                         "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            textField_Codigo.setText("");
        }
        else if (!textField_Codigo.getText().trim().matches("[a-zA-Z0-9]+")) {
            JOptionPane.showMessageDialog(null,"El código debe ser alfanumérico",
                                         "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            textField_Codigo.setText("");
        }
        else if (comboBox_Estado.getSelectedItem().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un estado",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                double peso = Double.parseDouble(textField_Peso.getText().trim());
                if (peso <= 0) {
                    JOptionPane.showMessageDialog(null, "El peso debe ser mayor a 0",
                                                 "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                }else{
                    Animal animal = new Animal(
                                                textField_Codigo.getText().trim().toUpperCase(),
                                                textField_Nombre.getText().trim().toUpperCase(),
                                                textField_Temperamento.getText().trim(),
                                                peso,
                                                comboBox_Estado.getSelectedItem().toString()
                                               );
                    sistema.agregarAnimal(animal);
                    JOptionPane.showMessageDialog(null,"Animal agregado correctamente",
                                                  "Alta Animal", JOptionPane.PLAIN_MESSAGE);
                    textField_Codigo.setText("");
                    textField_Nombre.setText("");
                    textField_Temperamento.setText("");
                    textField_Peso.setText("");
                    comboBox_Estado.setSelectedIndex(0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El peso debe ser un número válido",
                                             "Mensaje de error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_button_AgregarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaAnimal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Agregar;
    private javax.swing.JComboBox<String> comboBox_Estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Codigo;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Peso;
    private javax.swing.JLabel label_Temperamento;
    private javax.swing.JTextField textField_Codigo;
    private javax.swing.JTextField textField_Nombre;
    private javax.swing.JTextField textField_Peso;
    private javax.swing.JTextField textField_Temperamento;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
