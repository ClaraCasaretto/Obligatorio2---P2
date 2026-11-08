/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;
import Dominio.Adopcion;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentanaAnularAdopcion extends javax.swing.JFrame implements PropertyChangeListener{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaAnularAdopcion.class.getName());
    private Sistema sistema;

    public VentanaAnularAdopcion() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaAnularAdopcion(Sistema unSistema){
        sistema = unSistema;
        initComponents();
        actualizar();
    }
    
    private void actualizar(){
        ArrayList<Adopcion>adopciones = sistema.getListaAdopciones();
        String[]datos = new String[adopciones.size()];
        for (int i = 0; i < adopciones.size(); i++) {
            Adopcion adopcion = adopciones.get(i);
            datos[i] =   adopcion.getNumero() + "."
                       + adopcion.getAnimal().getCodigo() + "("
                       + adopcion.getAnimal().getNombre() + ") - "
                       + adopcion.getFamilia().getCedula() + "("
                       + adopcion.getFamilia().getApellido() + ")";   
        }
        list_Animales.setListData(datos);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        label_AdopcionesRegistradas = new javax.swing.JLabel();
        jList_Animales = new javax.swing.JScrollPane();
        list_Animales = new javax.swing.JList<>();
        label_Datos = new javax.swing.JLabel();
        label_NDeAdopcion = new javax.swing.JLabel();
        textField_NDeAdopcion = new javax.swing.JTextField();
        label_Codigo = new javax.swing.JLabel();
        textField_Codigo = new javax.swing.JTextField();
        label_Nombre = new javax.swing.JLabel();
        textField_Nombre = new javax.swing.JTextField();
        label_EstadoActual = new javax.swing.JLabel();
        textField_EstadoActual = new javax.swing.JTextField();
        label_CedulaFamilia = new javax.swing.JLabel();
        textField_CedulaFamilia = new javax.swing.JTextField();
        label_ApellidoFamilia = new javax.swing.JLabel();
        textField_ApellidoFamilia = new javax.swing.JTextField();
        button_Anular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ANULAR ADOPCIÓN");
        titulo.setName(""); // NOI18N

        label_AdopcionesRegistradas.setText("Adopciones registradas:");

        list_Animales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list_Animales.addListSelectionListener(this::list_AnimalesValueChanged);
        jList_Animales.setViewportView(list_Animales);

        label_Datos.setText("Datos del animal seleccionado:");

        label_NDeAdopcion.setText(" Nº de adopción:");

        textField_NDeAdopcion.setEditable(false);
        textField_NDeAdopcion.setBackground(new java.awt.Color(204, 204, 204));
        textField_NDeAdopcion.addActionListener(this::textField_NDeAdopcionActionPerformed);

        label_Codigo.setText("Código:");

        textField_Codigo.setEditable(false);
        textField_Codigo.setBackground(new java.awt.Color(204, 204, 204));
        textField_Codigo.addActionListener(this::textField_CodigoActionPerformed);

        label_Nombre.setText("Nombre:");

        textField_Nombre.setEditable(false);
        textField_Nombre.setBackground(new java.awt.Color(204, 204, 204));
        textField_Nombre.addActionListener(this::textField_NombreActionPerformed);

        label_EstadoActual.setText("Estado actual:");

        textField_EstadoActual.setEditable(false);
        textField_EstadoActual.setBackground(new java.awt.Color(204, 204, 204));
        textField_EstadoActual.addActionListener(this::textField_EstadoActualActionPerformed);

        label_CedulaFamilia.setText("Cédula Familia:");

        textField_CedulaFamilia.setEditable(false);
        textField_CedulaFamilia.setBackground(new java.awt.Color(204, 204, 204));
        textField_CedulaFamilia.addActionListener(this::textField_CedulaFamiliaActionPerformed);

        label_ApellidoFamilia.setText("Apellido Familia:");

        textField_ApellidoFamilia.setEditable(false);
        textField_ApellidoFamilia.setBackground(new java.awt.Color(204, 204, 204));
        textField_ApellidoFamilia.addActionListener(this::textField_ApellidoFamiliaActionPerformed);

        button_Anular.setText("Anular");
        button_Anular.addActionListener(this::button_AnularActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(button_Anular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_NDeAdopcion, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_EstadoActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_CedulaFamilia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_ApellidoFamilia, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textField_ApellidoFamilia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_CedulaFamilia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_EstadoActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_Codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField_NDeAdopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_AdopcionesRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jList_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 338, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(label_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NDeAdopcion)
                    .addComponent(textField_NDeAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Nombre)
                    .addComponent(textField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_EstadoActual)
                    .addComponent(textField_EstadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_CedulaFamilia)
                    .addComponent(textField_CedulaFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ApellidoFamilia)
                    .addComponent(textField_ApellidoFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_Anular)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addComponent(titulo)
                    .addGap(12, 12, 12)
                    .addComponent(label_AdopcionesRegistradas)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jList_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_AnimalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_AnimalesValueChanged
        int posicion = list_Animales.getSelectedIndex();
        if (posicion != -1) {
            Adopcion adopcion = sistema.getListaAdopciones().get(posicion);
            textField_NDeAdopcion.setText("" + adopcion.getNumero());
            textField_Codigo.setText(adopcion.getAnimal().getCodigo());
            textField_Nombre.setText(adopcion.getAnimal().getNombre());
            textField_EstadoActual.setText(adopcion.getAnimal().getEstado());
            textField_CedulaFamilia.setText(adopcion.getFamilia().getCedula());
            textField_ApellidoFamilia.setText(adopcion.getFamilia().getApellido());
        }
    }//GEN-LAST:event_list_AnimalesValueChanged

    private void textField_NDeAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NDeAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NDeAdopcionActionPerformed

    private void textField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NombreActionPerformed

    private void textField_EstadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_EstadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_EstadoActualActionPerformed

    private void button_AnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AnularActionPerformed
        int posicion = list_Animales.getSelectedIndex();
        if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una adopción",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } else {
            Adopcion adopcion = sistema.getListaAdopciones().get(posicion);
            sistema.anularAdopcion(adopcion);
            JOptionPane.showMessageDialog(null, "Adopción anulada correctamente",
                                          "Anular adopción", JOptionPane.INFORMATION_MESSAGE);
            actualizar();
            textField_NDeAdopcion.setText("");
            textField_Codigo.setText("");
            textField_Nombre.setText("");
            textField_EstadoActual.setText("");
            textField_CedulaFamilia.setText("");
            textField_ApellidoFamilia.setText("");
        }
    }//GEN-LAST:event_button_AnularActionPerformed

    private void textField_ApellidoFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ApellidoFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ApellidoFamiliaActionPerformed

    private void textField_CedulaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CedulaFamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CedulaFamiliaActionPerformed

    private void textField_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_CodigoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaAnularAdopcion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Anular;
    private javax.swing.JScrollPane jList_Animales;
    private javax.swing.JLabel label_AdopcionesRegistradas;
    private javax.swing.JLabel label_ApellidoFamilia;
    private javax.swing.JLabel label_CedulaFamilia;
    private javax.swing.JLabel label_Codigo;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JLabel label_EstadoActual;
    private javax.swing.JLabel label_NDeAdopcion;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JList<String> list_Animales;
    private javax.swing.JTextField textField_ApellidoFamilia;
    private javax.swing.JTextField textField_CedulaFamilia;
    private javax.swing.JTextField textField_Codigo;
    private javax.swing.JTextField textField_EstadoActual;
    private javax.swing.JTextField textField_NDeAdopcion;
    private javax.swing.JTextField textField_Nombre;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("listaAnimales")) {
            actualizar();
        }
    }
}
