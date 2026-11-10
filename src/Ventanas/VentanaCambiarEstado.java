/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Animal;
import Dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Color;

public class VentanaCambiarEstado extends javax.swing.JFrame implements PropertyChangeListener{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaCambiarEstado.class.getName());
    private Sistema sistema;
    
    public VentanaCambiarEstado() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaCambiarEstado(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        sistema.agregarListener(this);
        actualizar();
    }
    
    private void actualizar() {
        ArrayList<Animal> animales = sistema.obtenerAnimalesNoEntregados();
        String[] datos = new String[animales.size()];
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            datos[i] = animal.getCodigo() + " - " + animal.getNombre()
                     + " - " + animal.getEstado();
        }
        list_Animales.setListData(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        label_AnimalesDisponibles = new javax.swing.JLabel();
        jList_Animales = new javax.swing.JScrollPane();
        list_Animales = new javax.swing.JList<>();
        label_Datos = new javax.swing.JLabel();
        label_Codigo = new javax.swing.JLabel();
        textField_Codigo = new javax.swing.JTextField();
        label_Nombre = new javax.swing.JLabel();
        textField_Nombre = new javax.swing.JTextField();
        label_Temperamento = new javax.swing.JLabel();
        textField_Temperamento = new javax.swing.JTextField();
        label_Peso = new javax.swing.JLabel();
        textField_Peso = new javax.swing.JTextField();
        label_EstadoActual = new javax.swing.JLabel();
        textField_EstadoActual = new javax.swing.JTextField();
        button_Cambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 350));
        getContentPane().setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CAMBIAR ESTADO");
        titulo.setName(""); // NOI18N
        getContentPane().add(titulo);
        titulo.setBounds(237, 6, 157, 25);

        label_AnimalesDisponibles.setText("Animales disponibles:");
        getContentPane().add(label_AnimalesDisponibles);
        label_AnimalesDisponibles.setBounds(6, 43, 170, 16);

        list_Animales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list_Animales.addListSelectionListener(this::list_AnimalesValueChanged);
        jList_Animales.setViewportView(list_Animales);

        getContentPane().add(jList_Animales);
        jList_Animales.setBounds(6, 65, 270, 209);

        label_Datos.setText("Datos del animal seleccionado:");
        getContentPane().add(label_Datos);
        label_Datos.setBounds(284, 65, 199, 16);

        label_Codigo.setText("Código:");
        getContentPane().add(label_Codigo);
        label_Codigo.setBounds(288, 90, 100, 16);

        textField_Codigo.setEditable(false);
        textField_Codigo.setBackground(new java.awt.Color(204, 204, 204));
        textField_Codigo.addActionListener(this::textField_CodigoActionPerformed);
        getContentPane().add(textField_Codigo);
        textField_Codigo.setBounds(394, 87, 199, 22);

        label_Nombre.setText("Nombre:");
        getContentPane().add(label_Nombre);
        label_Nombre.setBounds(288, 118, 100, 16);

        textField_Nombre.setEditable(false);
        textField_Nombre.setBackground(new java.awt.Color(204, 204, 204));
        textField_Nombre.addActionListener(this::textField_NombreActionPerformed);
        getContentPane().add(textField_Nombre);
        textField_Nombre.setBounds(394, 115, 199, 22);

        label_Temperamento.setText("Temperamento:");
        getContentPane().add(label_Temperamento);
        label_Temperamento.setBounds(288, 146, 100, 16);

        textField_Temperamento.setEditable(false);
        textField_Temperamento.setBackground(new java.awt.Color(204, 204, 204));
        textField_Temperamento.addActionListener(this::textField_TemperamentoActionPerformed);
        getContentPane().add(textField_Temperamento);
        textField_Temperamento.setBounds(394, 143, 199, 22);

        label_Peso.setText("Peso en kilos:");
        getContentPane().add(label_Peso);
        label_Peso.setBounds(288, 174, 100, 16);

        textField_Peso.setEditable(false);
        textField_Peso.setBackground(new java.awt.Color(204, 204, 204));
        textField_Peso.addActionListener(this::textField_PesoActionPerformed);
        getContentPane().add(textField_Peso);
        textField_Peso.setBounds(394, 171, 199, 22);

        label_EstadoActual.setText("Estado actual:");
        getContentPane().add(label_EstadoActual);
        label_EstadoActual.setBounds(288, 202, 100, 16);

        textField_EstadoActual.setEditable(false);
        textField_EstadoActual.setBackground(new java.awt.Color(204, 204, 204));
        textField_EstadoActual.addActionListener(this::textField_EstadoActualActionPerformed);
        getContentPane().add(textField_EstadoActual);
        textField_EstadoActual.setBounds(394, 199, 199, 22);

        button_Cambiar.setText("Cambiar");
        button_Cambiar.addActionListener(this::button_CambiarActionPerformed);
        getContentPane().add(button_Cambiar);
        button_Cambiar.setBounds(494, 251, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_AnimalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_AnimalesValueChanged
        if(list_Animales.getSelectedIndex() != -1){
            int posicion = list_Animales.getSelectedIndex();
            ArrayList<Animal> animales = sistema.obtenerAnimalesNoEntregados();
            Animal animal = animales.get(posicion);
            textField_Codigo.setText(animal.getCodigo());
            textField_Nombre.setText(animal.getNombre());
            textField_Temperamento.setText(animal.getTemperamento());
            textField_Peso.setText("" +animal.getPeso());
            textField_EstadoActual.setText(animal.getEstado());
            if (animal.getEstado().equals("Disponible para adoptar")) {
                textField_EstadoActual.setForeground(new Color(0, 128, 0));
            } else {
                textField_EstadoActual.setForeground(new Color(255, 0, 0));
            }
        }else{
            textField_Codigo.setText("");
            textField_Nombre.setText("");
            textField_Temperamento.setText("");
            textField_Peso.setText("");
            textField_EstadoActual.setText("");
        }
    }//GEN-LAST:event_list_AnimalesValueChanged

    private void textField_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CodigoActionPerformed

    private void textField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NombreActionPerformed

    private void textField_EstadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_EstadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_EstadoActualActionPerformed

    private void textField_TemperamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_TemperamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_TemperamentoActionPerformed

    private void textField_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_PesoActionPerformed

    private void button_CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CambiarActionPerformed
        int posicion = list_Animales.getSelectedIndex();
        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un animal",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Animal> animales = sistema.obtenerAnimalesNoEntregados();
            Animal animal = animales.get(posicion);
            sistema.cambiarEstadoAnimal(animal);
            actualizar();
            JOptionPane.showMessageDialog(null,"Estado cambiado correctamente",
                                          "Cambiar estado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_button_CambiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaCambiarEstado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cambiar;
    private javax.swing.JScrollPane jList_Animales;
    private javax.swing.JLabel label_AnimalesDisponibles;
    private javax.swing.JLabel label_Codigo;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JLabel label_EstadoActual;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Peso;
    private javax.swing.JLabel label_Temperamento;
    private javax.swing.JList<String> list_Animales;
    private javax.swing.JTextField textField_Codigo;
    private javax.swing.JTextField textField_EstadoActual;
    private javax.swing.JTextField textField_Nombre;
    private javax.swing.JTextField textField_Peso;
    private javax.swing.JTextField textField_Temperamento;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("listaAnimales")) {
            actualizar();
        }
    }
}
