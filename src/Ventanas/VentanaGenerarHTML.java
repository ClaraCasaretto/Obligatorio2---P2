/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;

import Dominio.Sistema;
import java.awt.Button;
import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class VentanaGenerarHTML extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaGenerarHTML.class.getName());
    private Sistema sistema;
    private String nombreArchivo;
    /**
     * Creates new form VentanaGenerarHTML
     */
    public VentanaGenerarHTML() {
        sistema= new Sistema();
        initComponents();
    }
    public VentanaGenerarHTML(Sistema unSistema){
        sistema= unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        rutaArchivo = new javax.swing.JTextField();
        botonExaminar = new javax.swing.JButton();
        generarHTML = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        abrirHTML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("GENERAR HTML");
        titulo.setName(""); // NOI18N

        rutaArchivo.setText("Ingrese ruta y nombre de archivo a generar");
        rutaArchivo.addActionListener(this::rutaArchivoActionPerformed);

        botonExaminar.setText("Examinar");
        botonExaminar.addActionListener(this::botonExaminarActionPerformed);

        generarHTML.setText("Generar");
        generarHTML.addActionListener(this::generarHTMLActionPerformed);

        jLabel1.setText("Ruta y nombre de archivo:");

        abrirHTML.setText("Abrir HTML");
        abrirHTML.addActionListener(this::abrirHTMLActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(generarHTML, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(abrirHTML))
                            .addComponent(rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonExaminar)
                    .addComponent(generarHTML)
                    .addComponent(abrirHTML))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarHTMLActionPerformed
        String archivoAGenerar= rutaArchivo.getText().trim();
        if (archivoAGenerar.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un nombre de archivo");
            return;
        }
        sistema.generarHTML(nombreArchivo);
        javax.swing.JOptionPane.showMessageDialog(this, "HTML generado correctamente");
    }//GEN-LAST:event_generarHTMLActionPerformed

    private void rutaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaArchivoActionPerformed
        
    }//GEN-LAST:event_rutaArchivoActionPerformed

    private void botonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExaminarActionPerformed
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Guardar reporte de adopciones");
        int resultado = selector.showSaveDialog(this);
        
        if (resultado == JFileChooser.APPROVE_OPTION) {
            nombreArchivo = selector.getSelectedFile().getAbsolutePath();
            rutaArchivo.setText(nombreArchivo);
            generarHTML.setEnabled(true);
        }
    }//GEN-LAST:event_botonExaminarActionPerformed

    private void abrirHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirHTMLActionPerformed
        if (nombreArchivo==null) {
            JOptionPane.showMessageDialog(this, "No genero ningun archivo HTML");
        }
        try {
            Desktop.getDesktop().browse(Paths.get(nombreArchivo).toUri());
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo HTML", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_abrirHTMLActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaGenerarHTML().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirHTML;
    private javax.swing.JButton botonExaminar;
    private javax.swing.JButton generarHTML;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rutaArchivo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
