/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;
import Dominio.Animal;
import Dominio.Donacion;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class PaginaPrincipal extends javax.swing.JFrame implements PropertyChangeListener {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName());
    private Sistema sistema;
    
    public PaginaPrincipal() {
        sistema = new Sistema();
        initComponents();
        inicializarPanel();
    }
    
    public PaginaPrincipal(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        inicializarPanel();
    }
    
    private void inicializarPanel (){
        sistema.agregarListener(this);
        
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        
        configurarListaAnimales();
        actualizarResumen();
    }
    
    private void actualizarResumen(){
        int total= sistema.getListaAnimales().size();
        
        int disponibles= 0;
        int noDisponibles= 0;
        int adoptados= 0;
        
        for (Animal animal : sistema.getListaAnimales()){
            switch (animal.getEstado()){
                case "Disponible para adoptar":
                    disponibles+=1;
                    break;
                    
                case "No disponible para adoptar":
                    noDisponibles+=1;
                    break;
                    
                case "Entregado a familia":
                    adoptados+=1;
                    break;        
            }
        }
        
        jTextField1.setText(""+total);
        jTextField2.setText(""+disponibles);
        jTextField3.setText(""+adoptados);
        jTextField4.setText(""+noDisponibles);
        //Para la cantidad de adopciones contamos el tamaño de la lista o el contador? 
        //Porque el contador tiene las anuladas creo
        jTextField5.setText(""+sistema.getListaAdopciones().size());
        jTextField6.setText(""+sistema.getListaEmpresas().size());
        
        actualizarStock();
        actualizarListaAnimales();
    }

    private void actualizarStock(){
        double grandes=0;
        double chicos=0;
        double adultos= 0;
        double otros= 0;
        
        for (Donacion donacion : sistema.getListaDonaciones()){
            switch (donacion.getTipo()) {
                case "1":
                    grandes+= donacion.getCantKilos();
                    break;
                case "2":
                    chicos+= donacion.getCantKilos();
                    break;
                case "3":
                    adultos+= donacion.getCantKilos();
                    break;    
                case "4":
                    otros+= donacion.getCantKilos();
                    break;    
            }
        }
        
        jTextField7.setText(""+grandes);
        jTextField8.setText(""+otros);
        jTextField9.setText(""+chicos);
        jTextField10.setText(""+adultos);
        
    }
    
    private void actualizarListaAnimales(){
        String[] datos= new String[sistema.getListaAnimales().size()];
        
        for (int i= 0; i< sistema.getListaAnimales().size(); i++){
            Animal animal= sistema.getListaAnimales().get(i);
            datos[i]= animal.getNombre()+ " - "+ animal.getEstado();
        }
        jList1.setListData(datos);
    }
    
    //Hecho con IA
    private void configurarListaAnimales(){
        jList1.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {

                super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);
                
                if (index >= 0 && index < sistema.getListaAnimales().size()) {
                    Animal animal = sistema.getListaAnimales().get(index);

                    switch (animal.getEstado()) {

                        case "Disponible para adoptar":
                            setForeground(new Color(0, 130, 0));
                            break;

                        case "No disponible para adoptar":
                            setForeground(Color.RED);
                            break;

                        case "Entregado a familia":
                            setForeground(Color.BLUE);
                            break;
                    }
                }

                return this;
            }
        });
    }
    
    @Override
    public void propertyChange (PropertyChangeEvent evt){
        actualizarResumen();
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        titulo4 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menu_Alta = new javax.swing.JMenu();
        menuItem_Animales = new javax.swing.JMenuItem();
        menuItem_Familias = new javax.swing.JMenuItem();
        menuItem_Empresas = new javax.swing.JMenuItem();
        menu_Movimientos = new javax.swing.JMenu();
        menuItem_RealizarAdopcion = new javax.swing.JMenuItem();
        menuItem_CambiarDeEstado = new javax.swing.JMenuItem();
        menuItem_AnularAdopcion = new javax.swing.JMenuItem();
        menuItem_RegistrarDonacion = new javax.swing.JMenuItem();
        menuItem_ImportarDonaciones = new javax.swing.JMenuItem();
        menu_Varios = new javax.swing.JMenu();
        menuItem_ConsultaDeFamilia = new javax.swing.JMenuItem();
        menuItem_ConsultaDeDonaciones = new javax.swing.JMenuItem();
        menuItem_GeneracionDePagina = new javax.swing.JMenuItem();
        menuItem_RecuperarDatos = new javax.swing.JMenuItem();
        menuItem_Autores = new javax.swing.JMenuItem();
        menuItem_Salir = new javax.swing.JMenuItem();

        titulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Stock de alimento");
        titulo1.setName(""); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad de animales:");

        jLabel2.setText("Animales en adopción:");

        jLabel3.setText("Animales adoptados:");

        jLabel4.setText("Animales no disponibles:");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jLabel5.setText("Adopciones registradas:");

        jLabel6.setText("Empresas registradas:");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");
        jTextField6.addActionListener(this::jTextField6ActionPerformed);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel7.setText("Listado de animales:");

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Adopciones");
        titulo.setName(""); // NOI18N

        titulo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Animales");
        titulo2.setName(""); // NOI18N

        titulo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Empresas");
        titulo3.setName(""); // NOI18N

        jLabel8.setText("Alimento para perros grandes:");

        jLabel9.setText("Alimento para perros chicos:");

        jLabel10.setText("Alimento para perros adultos:");

        jLabel11.setText("Otros alimentos:");

        jTextField7.setText("jTextField7");

        jTextField9.setText("jTextField9");
        jTextField9.addActionListener(this::jTextField9ActionPerformed);

        jTextField10.setText("jTextField10");

        jTextField8.setText("jTextField8");

        titulo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("Stock Alimentos");
        titulo4.setName(""); // NOI18N

        menu_Alta.setText("Alta");

        menuItem_Animales.setText("Animales");
        menuItem_Animales.addActionListener(this::menuItem_AnimalesActionPerformed);
        menu_Alta.add(menuItem_Animales);

        menuItem_Familias.setText("Familias");
        menuItem_Familias.addActionListener(this::menuItem_FamiliasActionPerformed);
        menu_Alta.add(menuItem_Familias);

        menuItem_Empresas.setText("Empresas");
        menuItem_Empresas.addActionListener(this::menuItem_EmpresasActionPerformed);
        menu_Alta.add(menuItem_Empresas);

        MenuBar.add(menu_Alta);

        menu_Movimientos.setText("Movimientos");

        menuItem_RealizarAdopcion.setText("Realizar adopción");
        menuItem_RealizarAdopcion.addActionListener(this::menuItem_RealizarAdopcionActionPerformed);
        menu_Movimientos.add(menuItem_RealizarAdopcion);

        menuItem_CambiarDeEstado.setText("Cambiar de estado ");
        menuItem_CambiarDeEstado.addActionListener(this::menuItem_CambiarDeEstadoActionPerformed);
        menu_Movimientos.add(menuItem_CambiarDeEstado);

        menuItem_AnularAdopcion.setText("Anular adopción");
        menuItem_AnularAdopcion.addActionListener(this::menuItem_AnularAdopcionActionPerformed);
        menu_Movimientos.add(menuItem_AnularAdopcion);

        menuItem_RegistrarDonacion.setText("Registrar donación");
        menuItem_RegistrarDonacion.addActionListener(this::menuItem_RegistrarDonacionActionPerformed);
        menu_Movimientos.add(menuItem_RegistrarDonacion);

        menuItem_ImportarDonaciones.setText("Importar donaciones");
        menu_Movimientos.add(menuItem_ImportarDonaciones);

        MenuBar.add(menu_Movimientos);

        menu_Varios.setText("Varios");

        menuItem_ConsultaDeFamilia.setText("Consulta de familia");
        menu_Varios.add(menuItem_ConsultaDeFamilia);

        menuItem_ConsultaDeDonaciones.setText("Consulta de donaciones");
        menu_Varios.add(menuItem_ConsultaDeDonaciones);

        menuItem_GeneracionDePagina.setText("Generación de página");
        menu_Varios.add(menuItem_GeneracionDePagina);

        menuItem_RecuperarDatos.setText("Recuperar datos");
        menu_Varios.add(menuItem_RecuperarDatos);

        menuItem_Autores.setText("Autores");
        menuItem_Autores.addActionListener(this::menuItem_AutoresActionPerformed);
        menu_Varios.add(menuItem_Autores);

        menuItem_Salir.setText("Salir");
        menu_Varios.add(menuItem_Salir);

        MenuBar.add(menu_Varios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titulo3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titulo4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_AnimalesActionPerformed
        VentanaAnimal ventana = new VentanaAnimal(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_AnimalesActionPerformed

    private void menuItem_RealizarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_RealizarAdopcionActionPerformed
        VentanaRealizarAdopcion ventana = new VentanaRealizarAdopcion(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_RealizarAdopcionActionPerformed

    private void menuItem_FamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_FamiliasActionPerformed
        VentanaFamilia ventana = new VentanaFamilia(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_FamiliasActionPerformed

    private void menuItem_EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_EmpresasActionPerformed
        VentanaEmpresa ventana = new VentanaEmpresa(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_EmpresasActionPerformed

    private void menuItem_CambiarDeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_CambiarDeEstadoActionPerformed
        VentanaCambiarEstado ventana = new VentanaCambiarEstado(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_CambiarDeEstadoActionPerformed

    private void menuItem_AnularAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_AnularAdopcionActionPerformed
        VentanaAnularAdopcion ventana = new VentanaAnularAdopcion(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_AnularAdopcionActionPerformed

    private void menuItem_RegistrarDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_RegistrarDonacionActionPerformed
        VentanaRegistrarDonacion ventana = new VentanaRegistrarDonacion(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_RegistrarDonacionActionPerformed

    private void menuItem_AutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_AutoresActionPerformed
        VentanaAutores ventana = new VentanaAutores();
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_AutoresActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PaginaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuItem menuItem_Animales;
    private javax.swing.JMenuItem menuItem_AnularAdopcion;
    private javax.swing.JMenuItem menuItem_Autores;
    private javax.swing.JMenuItem menuItem_CambiarDeEstado;
    private javax.swing.JMenuItem menuItem_ConsultaDeDonaciones;
    private javax.swing.JMenuItem menuItem_ConsultaDeFamilia;
    private javax.swing.JMenuItem menuItem_Empresas;
    private javax.swing.JMenuItem menuItem_Familias;
    private javax.swing.JMenuItem menuItem_GeneracionDePagina;
    private javax.swing.JMenuItem menuItem_ImportarDonaciones;
    private javax.swing.JMenuItem menuItem_RealizarAdopcion;
    private javax.swing.JMenuItem menuItem_RecuperarDatos;
    private javax.swing.JMenuItem menuItem_RegistrarDonacion;
    private javax.swing.JMenuItem menuItem_Salir;
    private javax.swing.JMenu menu_Alta;
    private javax.swing.JMenu menu_Movimientos;
    private javax.swing.JMenu menu_Varios;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
