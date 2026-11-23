/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VentanaImportarDonaciones extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaImportarDonaciones.class.getName());

    private Sistema sistema;
    private String nombreArchivo;
    
    public VentanaImportarDonaciones() {
        sistema = new Sistema();
        initComponents();
    }
    public VentanaImportarDonaciones(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        label_ArchivoSeleccionado = new javax.swing.JLabel();
        textField_Archivo = new javax.swing.JTextField();
        button_Examinar = new javax.swing.JButton();
        button_Importar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Errores = new javax.swing.JTextArea();
        label_Errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("IMPORTAR DONACIONES");
        titulo.setName(""); // NOI18N

        label_ArchivoSeleccionado.setText("Archivo Seleccionado:");

        textField_Archivo.setEditable(false);
        textField_Archivo.setBackground(new java.awt.Color(204, 204, 204));
        textField_Archivo.setText("Ningun archivo seleccionado");
        textField_Archivo.addActionListener(this::textField_ArchivoActionPerformed);

        button_Examinar.setText("Examinar");
        button_Examinar.addActionListener(this::button_ExaminarActionPerformed);

        button_Importar.setText("Importar");
        button_Importar.setEnabled(false);
        button_Importar.addActionListener(this::button_ImportarActionPerformed);

        textArea_Errores.setEditable(false);
        textArea_Errores.setColumns(20);
        textArea_Errores.setRows(5);
        jScrollPane1.setViewportView(textArea_Errores);

        label_Errores.setText("Errores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Importar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Errores)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField_Archivo)
                                .addGap(18, 18, 18)
                                .addComponent(button_Examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label_ArchivoSeleccionado)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo)
                .addGap(27, 27, 27)
                .addComponent(label_ArchivoSeleccionado)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Examinar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Importar)
                .addGap(18, 18, 18)
                .addComponent(label_Errores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExaminarActionPerformed
        //Asistido por chatGPT con el tema de seleccionar el archivo
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccionar archivo de donaciones");
        FileNameExtensionFilter filtro =
                new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        selector.setFileFilter(filtro);
        selector.setAcceptAllFileFilterUsed(false);
        int resultado = selector.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            nombreArchivo = selector.getSelectedFile().getAbsolutePath();
            textField_Archivo.setText(nombreArchivo);
            textArea_Errores.setText("");
            button_Importar.setEnabled(true);
        }
    }//GEN-LAST:event_button_ExaminarActionPerformed

    private void textField_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ArchivoActionPerformed

    private void button_ImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ImportarActionPerformed
        ArrayList<String> errores = sistema.importarDonaciones(nombreArchivo);
        if (errores.isEmpty()) {
            textArea_Errores.setText("");
            JOptionPane.showMessageDialog(null, "Donaciones importadas correctamente",
                                          "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String listadoErrores = "Se encontraron los siguientes errores:\n";
            for (String error : errores) {
                listadoErrores += error + "\n";
            }
            textArea_Errores.setText(listadoErrores);
            JOptionPane.showMessageDialog(null, "La importación finalizó con errores",
                                          "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        button_Importar.setEnabled(false);
    }//GEN-LAST:event_button_ImportarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaImportarDonaciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Examinar;
    private javax.swing.JButton button_Importar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_ArchivoSeleccionado;
    private javax.swing.JLabel label_Errores;
    private javax.swing.JTextArea textArea_Errores;
    private javax.swing.JTextField textField_Archivo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
