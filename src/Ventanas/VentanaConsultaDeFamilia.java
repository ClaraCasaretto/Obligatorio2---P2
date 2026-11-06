/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;

public class VentanaConsultaDeFamilia extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaConsultaDeFamilia.class.getName());
    private Sistema sistema;

    public VentanaConsultaDeFamilia() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaConsultaDeFamilia(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
    }

    public void actualizar(){
        //aun no se como hacer para actualizar tablas entonces estoy evaluando si hacer un JList
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_OrdenarPor = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        label_Datos = new javax.swing.JLabel();
        radioButton_Apellido = new javax.swing.JRadioButton();
        radioButton_CantDeAdopciones = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CONSULTA DE FAMILIA");
        titulo.setName(""); // NOI18N

        label_Datos.setText("Ordenar por:");

        radioButton_Apellido.setText("Apellido (A - Z)");
        radioButton_Apellido.addActionListener(this::radioButton_ApellidoActionPerformed);

        radioButton_CantDeAdopciones.setText("Cantidad de adopciones (Mayor a menor)");
        radioButton_CantDeAdopciones.addActionListener(this::radioButton_CantDeAdopcionesActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellido", "Cédula", "Cantidad de adopciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(radioButton_Apellido)
                        .addGap(18, 18, 18)
                        .addComponent(radioButton_CantDeAdopciones))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton_Apellido)
                    .addComponent(radioButton_CantDeAdopciones))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButton_CantDeAdopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_CantDeAdopcionesActionPerformed
        actualizar();
    }//GEN-LAST:event_radioButton_CantDeAdopcionesActionPerformed

    private void radioButton_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton_ApellidoActionPerformed
        actualizar();
    }//GEN-LAST:event_radioButton_ApellidoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaConsultaDeFamilia().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_OrdenarPor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JRadioButton radioButton_Apellido;
    private javax.swing.JRadioButton radioButton_CantDeAdopciones;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
