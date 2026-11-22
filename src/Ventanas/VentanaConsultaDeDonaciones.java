/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;
import Dominio.Donacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VentanaConsultaDeDonaciones extends javax.swing.JFrame implements PropertyChangeListener {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaConsultaDeDonaciones.class.getName());
    private Sistema sistema;
    
    public VentanaConsultaDeDonaciones() {
        initComponents();
    }
    
    public VentanaConsultaDeDonaciones(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        sistema.agregarListener(this);
        actualizarLista();
    }
    
    private void actualizarLista() {
        //el getModel : Obtiene el modelo que maneja los datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel) table_Donaciones.getModel();
        //Vacía la tabla para que no se repitan donaciones
        modelo.setRowCount(0);
        ArrayList<Donacion> donaciones = sistema.obtenerDonacionesOrdenadas();
        for (int i = 0; i < donaciones.size(); i++) {
            Donacion unaDonacion = donaciones.get(i);
            //Prepara los cuatro datos de cada donación: número, empresa, tipo y kilos.
            Object[] fila = {
                unaDonacion.getNumero(),
                unaDonacion.getEmpresa().getNombre(),
                unaDonacion.getTipo(),
                unaDonacion.getCantKilos()
            };
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Donaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CONSULTA DE DONACIONES");
        titulo.setName(""); // NOI18N

        table_Donaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Empresa", "Tipo de Alimento", "Cantidad de Kilos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Donaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaConsultaDeDonaciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Donaciones;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("listaDonaciones")) {
            actualizarLista();
        }
    }
}
