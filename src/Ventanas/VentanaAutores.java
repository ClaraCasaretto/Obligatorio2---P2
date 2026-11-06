/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import javax.swing.ImageIcon;
import java.awt.Image;


public class VentanaAutores extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaAutores.class.getName());


    public VentanaAutores() {
        initComponents();
        cargarFoto();
    }
    
    private void cargarFoto() {
        ImageIcon fotoClara = new ImageIcon(
                getClass().getResource("/Ventanas/clara.jpeg"));
        ImageIcon fotoManu = new ImageIcon(
                getClass().getResource("/Ventanas/manu.jpeg"));
        Image imagenClara = fotoClara.getImage().getScaledInstance(
                180, 180, Image.SCALE_SMOOTH);
        Image imagenManu = fotoManu.getImage().getScaledInstance(
                -1, 180, Image.SCALE_SMOOTH);
        label_FotoClara.setIcon(new ImageIcon(imagenClara));
        label_FotoManu.setIcon(new ImageIcon(imagenManu));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        label_NombreClara = new javax.swing.JLabel();
        label_FotoClara = new javax.swing.JLabel();
        label_NombreManu = new javax.swing.JLabel();
        label_FotoManu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("AUTORES");
        titulo.setName(""); // NOI18N

        label_NombreClara.setText("María Clara Casaretto - 250991");

        label_NombreManu.setText("Manuel Negrin  - 379313");

        label_FotoManu.setMaximumSize(new java.awt.Dimension(180, 180));
        label_FotoManu.setMinimumSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_FotoClara, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NombreClara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_FotoManu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NombreManu))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_FotoClara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_FotoManu, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NombreClara)
                    .addComponent(label_NombreManu))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaAutores().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_FotoClara;
    private javax.swing.JLabel label_FotoManu;
    private javax.swing.JLabel label_NombreClara;
    private javax.swing.JLabel label_NombreManu;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
