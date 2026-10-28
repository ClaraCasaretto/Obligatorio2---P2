/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Animal;
import Dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;


public class VentanaRealizarAdopcion extends javax.swing.JFrame implements PropertyChangeListener{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRealizarAdopcion.class.getName());
    private Sistema sistema;
    
    public VentanaRealizarAdopcion() {
        sistema = new Sistema();
        initComponents();
    }
    
    public VentanaRealizarAdopcion(Sistema unSistema) {
        sistema = unSistema;
        initComponents();    
        sistema.agregarListener(this);
        actualizar();
    }
    
    private void actualizar() {
        ArrayList<Animal> disponibles = sistema.obtenerAnimalesDisponibles();
        String[] datos = new String[disponibles.size()];
        for (int i = 0; i < disponibles.size(); i++) {
            Animal animal = disponibles.get(i);
            datos[i] = animal.getCodigo() + " - " + animal.getNombre();
        }
        list_Animales.setListData(datos);
        textField_NumeroAdopcion.setText("" + sistema.getContadorAdopcion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        label_AnimalesDisponibles = new javax.swing.JLabel();
        jList_Animales = new javax.swing.JScrollPane();
        list_Animales = new javax.swing.JList<>();
        label_NumeroAdopcion = new javax.swing.JLabel();
        label_Datos = new javax.swing.JLabel();
        textField_NumeroAdopcion = new javax.swing.JTextField();
        label_Peso = new javax.swing.JLabel();
        textField_Peso = new javax.swing.JTextField();
        label_Temperamento = new javax.swing.JLabel();
        textField_Temperamento = new javax.swing.JTextField();
        label_Familia = new javax.swing.JLabel();
        comboBox_Familia = new javax.swing.JComboBox<>();
        label_Comentarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Comentarios = new javax.swing.JTextArea();
        button_Adoptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REALIZAR ADOPCIÓN");
        titulo.setName(""); // NOI18N

        label_AnimalesDisponibles.setText("Animales disponibles:");

        list_Animales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list_Animales.addListSelectionListener(this::list_AnimalesValueChanged);
        jList_Animales.setViewportView(list_Animales);

        label_NumeroAdopcion.setText(" Nº de adopción:");

        label_Datos.setText("Datos del animal seleccionado:");

        textField_NumeroAdopcion.setEditable(false);
        textField_NumeroAdopcion.setBackground(new java.awt.Color(204, 204, 204));
        textField_NumeroAdopcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_Peso.setText("Peso en kilos:");

        textField_Peso.setEditable(false);
        textField_Peso.setBackground(new java.awt.Color(204, 204, 204));

        label_Temperamento.setText("Temperamento:");

        textField_Temperamento.setEditable(false);
        textField_Temperamento.setBackground(new java.awt.Color(204, 204, 204));

        label_Familia.setText("Familia:");

        label_Comentarios.setText("Comentarios:");

        textArea_Comentarios.setColumns(20);
        textArea_Comentarios.setLineWrap(true);
        textArea_Comentarios.setRows(5);
        textArea_Comentarios.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea_Comentarios);

        button_Adoptar.setText("Adoptar");
        button_Adoptar.addActionListener(this::button_AdoptarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jList_Animales, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Comentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_Temperamento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(textField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(textField_Temperamento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_AnimalesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addComponent(button_Adoptar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AnimalesDisponibles)
                    .addComponent(label_NumeroAdopcion)
                    .addComponent(textField_NumeroAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Datos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Peso)
                            .addComponent(textField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Temperamento)
                            .addComponent(textField_Temperamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Familia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Comentarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jList_Animales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Adoptar)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_AdoptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdoptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_AdoptarActionPerformed

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaRealizarAdopcion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Adoptar;
    private javax.swing.JComboBox<String> comboBox_Familia;
    private javax.swing.JScrollPane jList_Animales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_AnimalesDisponibles;
    private javax.swing.JLabel label_Comentarios;
    private javax.swing.JLabel label_Datos;
    private javax.swing.JLabel label_Familia;
    private javax.swing.JLabel label_NumeroAdopcion;
    private javax.swing.JLabel label_Peso;
    private javax.swing.JLabel label_Temperamento;
    private javax.swing.JList<String> list_Animales;
    private javax.swing.JTextArea textArea_Comentarios;
    private javax.swing.JTextField textField_NumeroAdopcion;
    private javax.swing.JTextField textField_Peso;
    private javax.swing.JTextField textField_Temperamento;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


    //SE UTLIZA PARA QUE SE ESTE ACTULIAZANDO CONSTANTEMENTE AL INGRESAR UN NUEVO ANIMAL
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("listaAnimales")) {
            actualizar();
        }
    }
}
