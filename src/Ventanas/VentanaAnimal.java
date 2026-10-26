/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Animal;
import Dominio.Sistema;

public class VentanaAnimal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaAnimal.class.getName());
    private Animal animal;
    private Sistema sistema;

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
        lable_alerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        label_Codigo.setBounds(40, 60, 50, 16);

        textField_Codigo.addActionListener(this::textField_CodigoActionPerformed);
        jPanel1.add(textField_Codigo);
        textField_Codigo.setBounds(130, 60, 220, 22);

        label_Nombre.setText("Nombre:");
        jPanel1.add(label_Nombre);
        label_Nombre.setBounds(40, 90, 60, 16);

        textField_Nombre.addActionListener(this::textField_NombreActionPerformed);
        jPanel1.add(textField_Nombre);
        textField_Nombre.setBounds(130, 90, 220, 22);

        label_Temperamento.setText("Temperamento:");
        jPanel1.add(label_Temperamento);
        label_Temperamento.setBounds(40, 120, 90, 16);

        textField_Temperamento.addActionListener(this::textField_TemperamentoActionPerformed);
        jPanel1.add(textField_Temperamento);
        textField_Temperamento.setBounds(130, 120, 220, 22);

        label_Peso.setText("Peso en Kilos:");
        jPanel1.add(label_Peso);
        label_Peso.setBounds(40, 150, 80, 16);

        textField_Peso.addActionListener(this::textField_PesoActionPerformed);
        jPanel1.add(textField_Peso);
        textField_Peso.setBounds(130, 150, 220, 22);

        label_Estado.setText("Estado:");
        jPanel1.add(label_Estado);
        label_Estado.setBounds(40, 180, 60, 16);

        comboBox_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible para adoptar", "No disponible para adoptar", "Entregado a familia", " " }));
        comboBox_Estado.addActionListener(this::comboBox_EstadoActionPerformed);
        jPanel1.add(comboBox_Estado);
        comboBox_Estado.setBounds(130, 180, 220, 22);

        button_Agregar.setText("Agregar");
        button_Agregar.addActionListener(this::button_AgregarActionPerformed);
        jPanel1.add(button_Agregar);
        button_Agregar.setBounds(170, 230, 80, 23);
        button_Agregar.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(lable_alerta);
        lable_alerta.setBounds(40, 260, 350, 30);

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
            
            lable_alerta.setText("Complete todas las casillas");
            
        }else if(sistema.existeCodigoAnimal(textField_Codigo.getText().trim())){
            lable_alerta.setText("Ya existe un animal con ese código");
            textField_Codigo.setText("");
        }//validar alfanumerico
        
        else if (comboBox_Estado.getSelectedItem().toString().trim().equals("")) {
            lable_alerta.setText("Seleccione un estado");
        }
        else if (comboBox_Estado.getSelectedItem().toString().equals("Entregado a familia")) {
            lable_alerta.setText("No puede registrar un animal como entregado");
        }
        else {
            try {
                double peso = Double.parseDouble(textField_Peso.getText().trim());
                if (peso <= 0) {
                    lable_alerta.setText("El peso debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                lable_alerta.setText("El peso debe ser un número válido");
            }
}
    }//GEN-LAST:event_button_AgregarActionPerformed

    public static void main(String args[]) {
        //java.awt.EventQueue.invokeLater(() -> new VentanaAnimal().setVisible(true));
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
    private javax.swing.JLabel lable_alerta;
    private javax.swing.JTextField textField_Codigo;
    private javax.swing.JTextField textField_Nombre;
    private javax.swing.JTextField textField_Peso;
    private javax.swing.JTextField textField_Temperamento;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
