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
        sistema.agregarListener(this);
        configurarListaAnimales();
        actualizarResumen();
    }
    
    public PaginaPrincipal(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        sistema.agregarListener(this);
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
        textField_CantidadAnimales.setText(""+total);
        textField_AnimalesAdopcion.setText(""+disponibles);
        textField_AnimalesAdoptados.setText(""+adoptados);
        textField_AnimalesNoDisponibles.setText(""+noDisponibles);
        textField_AdopcionesRegistradas.setText(""+sistema.getListaAdopciones().size());
        textField_EmpresasRegistradas.setText(""+sistema.getListaEmpresas().size());
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
        textField_AlimentoPerrosGrandes.setText(""+grandes);
        textField_OtrosAlimentos.setText(""+otros);
        textField_AlimentoPerrosChicos.setText(""+chicos);
        textField_AlimentoPerrosAdultos.setText(""+adultos);
    }
    
    private void actualizarListaAnimales(){
        String[] datos= new String[sistema.getListaAnimales().size()];
        for (int i= 0; i< sistema.getListaAnimales().size(); i++){
            Animal animal= sistema.getListaAnimales().get(i);
            datos[i]= animal.getNombre()+ " - "+ animal.getEstado();
        }
        list_ListadoAnimales.setListData(datos);
    }
    //Hecho con IA
    private void configurarListaAnimales(){
        list_ListadoAnimales.setCellRenderer(new DefaultListCellRenderer() {
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
                    setForeground(sistema.obtenerColorEstado(animal.getEstado()));
                }
                return this;
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo_Animales = new javax.swing.JLabel();
        label_CantidadAnimales = new javax.swing.JLabel();
        textField_CantidadAnimales = new javax.swing.JTextField();
        label_AnimalesAdopcion = new javax.swing.JLabel();
        textField_AnimalesAdopcion = new javax.swing.JTextField();
        label_AnimalesAdoptados = new javax.swing.JLabel();
        textField_AnimalesAdoptados = new javax.swing.JTextField();
        label_AnimalesNoDisponibles = new javax.swing.JLabel();
        textField_AnimalesNoDisponibles = new javax.swing.JTextField();
        titulo_Adopciones = new javax.swing.JLabel();
        label_AdopcionesRegistradas = new javax.swing.JLabel();
        textField_AdopcionesRegistradas = new javax.swing.JTextField();
        titulo_Empresas = new javax.swing.JLabel();
        label_EmpresasRegistradas = new javax.swing.JLabel();
        textField_EmpresasRegistradas = new javax.swing.JTextField();
        titulo_StockAlimentos = new javax.swing.JLabel();
        label_AlimentoPerrosGrandes = new javax.swing.JLabel();
        textField_AlimentoPerrosGrandes = new javax.swing.JTextField();
        label_AlimentoPerrosChicos = new javax.swing.JLabel();
        textField_AlimentoPerrosChicos = new javax.swing.JTextField();
        label_AlimentoPerrosAdultos = new javax.swing.JLabel();
        textField_AlimentoPerrosAdultos = new javax.swing.JTextField();
        label_OtrosAlimentos = new javax.swing.JLabel();
        textField_OtrosAlimentos = new javax.swing.JTextField();
        label_ListadoAnimales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_ListadoAnimales = new javax.swing.JList<>();
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

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REFUGIO DE ANIMALES");
        titulo.setName(""); // NOI18N

        titulo_Animales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_Animales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Animales.setText("Animales");
        titulo_Animales.setName(""); // NOI18N

        label_CantidadAnimales.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_CantidadAnimales.setText("Cantidad de animales:");

        textField_CantidadAnimales.setEditable(false);
        textField_CantidadAnimales.setBackground(new java.awt.Color(204, 204, 204));

        label_AnimalesAdopcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AnimalesAdopcion.setText("Animales en adopción:");

        textField_AnimalesAdopcion.setEditable(false);
        textField_AnimalesAdopcion.setBackground(new java.awt.Color(204, 204, 204));

        label_AnimalesAdoptados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AnimalesAdoptados.setText("Animales adoptados:");

        textField_AnimalesAdoptados.setEditable(false);
        textField_AnimalesAdoptados.setBackground(new java.awt.Color(204, 204, 204));

        label_AnimalesNoDisponibles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AnimalesNoDisponibles.setText("Animales no disponibles:");

        textField_AnimalesNoDisponibles.setEditable(false);
        textField_AnimalesNoDisponibles.setBackground(new java.awt.Color(204, 204, 204));
        textField_AnimalesNoDisponibles.addActionListener(this::textField_AnimalesNoDisponiblesActionPerformed);

        titulo_Adopciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_Adopciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Adopciones.setText("Adopciones");
        titulo_Adopciones.setName(""); // NOI18N

        label_AdopcionesRegistradas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AdopcionesRegistradas.setText("Adopciones registradas:");

        textField_AdopcionesRegistradas.setEditable(false);
        textField_AdopcionesRegistradas.setBackground(new java.awt.Color(204, 204, 204));

        titulo_Empresas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_Empresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_Empresas.setText("Empresas");
        titulo_Empresas.setName(""); // NOI18N

        label_EmpresasRegistradas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_EmpresasRegistradas.setText("Empresas registradas:");

        textField_EmpresasRegistradas.setEditable(false);
        textField_EmpresasRegistradas.setBackground(new java.awt.Color(204, 204, 204));
        textField_EmpresasRegistradas.addActionListener(this::textField_EmpresasRegistradasActionPerformed);

        titulo_StockAlimentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_StockAlimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_StockAlimentos.setText("Stock Alimentos");
        titulo_StockAlimentos.setName(""); // NOI18N

        label_AlimentoPerrosGrandes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AlimentoPerrosGrandes.setText("Alimento para perros grandes:");

        textField_AlimentoPerrosGrandes.setEditable(false);
        textField_AlimentoPerrosGrandes.setBackground(new java.awt.Color(204, 204, 204));

        label_AlimentoPerrosChicos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AlimentoPerrosChicos.setText("Alimento para perros chicos:");

        textField_AlimentoPerrosChicos.setEditable(false);
        textField_AlimentoPerrosChicos.setBackground(new java.awt.Color(204, 204, 204));
        textField_AlimentoPerrosChicos.addActionListener(this::textField_AlimentoPerrosChicosActionPerformed);

        label_AlimentoPerrosAdultos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_AlimentoPerrosAdultos.setText("Alimento para perros adultos:");

        textField_AlimentoPerrosAdultos.setEditable(false);
        textField_AlimentoPerrosAdultos.setBackground(new java.awt.Color(204, 204, 204));

        label_OtrosAlimentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        label_OtrosAlimentos.setText("Otros alimentos:");

        textField_OtrosAlimentos.setEditable(false);
        textField_OtrosAlimentos.setBackground(new java.awt.Color(204, 204, 204));

        label_ListadoAnimales.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_ListadoAnimales.setText("Listado de animales:");

        list_ListadoAnimales.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(list_ListadoAnimales);

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
        menuItem_ImportarDonaciones.addActionListener(this::menuItem_ImportarDonacionesActionPerformed);
        menu_Movimientos.add(menuItem_ImportarDonaciones);

        MenuBar.add(menu_Movimientos);

        menu_Varios.setText("Varios");

        menuItem_ConsultaDeFamilia.setText("Consulta de familia");
        menuItem_ConsultaDeFamilia.addActionListener(this::menuItem_ConsultaDeFamiliaActionPerformed);
        menu_Varios.add(menuItem_ConsultaDeFamilia);

        menuItem_ConsultaDeDonaciones.setText("Consulta de donaciones");
        menuItem_ConsultaDeDonaciones.addActionListener(this::menuItem_ConsultaDeDonacionesActionPerformed);
        menu_Varios.add(menuItem_ConsultaDeDonaciones);

        menuItem_GeneracionDePagina.setText("Generación de página");
        menu_Varios.add(menuItem_GeneracionDePagina);

        menuItem_RecuperarDatos.setText("Recuperar datos");
        menu_Varios.add(menuItem_RecuperarDatos);

        menuItem_Autores.setText("Autores");
        menuItem_Autores.addActionListener(this::menuItem_AutoresActionPerformed);
        menu_Varios.add(menuItem_Autores);

        menuItem_Salir.setText("Salir");
        menuItem_Salir.addActionListener(this::menuItem_SalirActionPerformed);
        menu_Varios.add(menuItem_Salir);

        MenuBar.add(menu_Varios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_Animales)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_Empresas)
                            .addComponent(titulo_StockAlimentos)
                            .addComponent(titulo_Adopciones)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_AnimalesNoDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_EmpresasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AlimentoPerrosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AlimentoPerrosChicos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AlimentoPerrosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_OtrosAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AnimalesAdoptados, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AnimalesAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_CantidadAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_AdopcionesRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_CantidadAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_AnimalesAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_AlimentoPerrosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_AlimentoPerrosChicos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_AlimentoPerrosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_OtrosAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textField_AnimalesAdoptados, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField_EmpresasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField_AdopcionesRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField_AnimalesNoDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_ListadoAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo_Animales)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_CantidadAnimales)
                    .addComponent(textField_CantidadAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AnimalesAdopcion)
                    .addComponent(textField_AnimalesAdopcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_AnimalesAdoptados)
                            .addComponent(textField_AnimalesAdoptados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_AnimalesNoDisponibles)
                            .addComponent(textField_AnimalesNoDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_Adopciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_AdopcionesRegistradas)
                            .addComponent(textField_AdopcionesRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_Empresas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_EmpresasRegistradas)
                            .addComponent(textField_EmpresasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_ListadoAnimales)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo_StockAlimentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AlimentoPerrosGrandes)
                    .addComponent(textField_AlimentoPerrosGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AlimentoPerrosChicos)
                    .addComponent(textField_AlimentoPerrosChicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_AlimentoPerrosAdultos)
                    .addComponent(textField_AlimentoPerrosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_OtrosAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_OtrosAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void menuItem_ConsultaDeDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ConsultaDeDonacionesActionPerformed
        VentanaConsultaDeDonaciones ventana = new VentanaConsultaDeDonaciones(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_ConsultaDeDonacionesActionPerformed

    private void menuItem_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_SalirActionPerformed
        VentanaSalir ventana = new VentanaSalir();
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_SalirActionPerformed

    private void menuItem_ConsultaDeFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ConsultaDeFamiliaActionPerformed
        VentanaConsultaDeFamilia ventana = new VentanaConsultaDeFamilia(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_ConsultaDeFamiliaActionPerformed
    private void textField_EmpresasRegistradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_EmpresasRegistradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_EmpresasRegistradasActionPerformed

    private void textField_AlimentoPerrosChicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_AlimentoPerrosChicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_AlimentoPerrosChicosActionPerformed

    private void menuItem_ImportarDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_ImportarDonacionesActionPerformed
        VentanaImportarDonaciones ventana= new VentanaImportarDonaciones(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_menuItem_ImportarDonacionesActionPerformed

    private void textField_AnimalesNoDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_AnimalesNoDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_AnimalesNoDisponiblesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PaginaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_AdopcionesRegistradas;
    private javax.swing.JLabel label_AlimentoPerrosAdultos;
    private javax.swing.JLabel label_AlimentoPerrosChicos;
    private javax.swing.JLabel label_AlimentoPerrosGrandes;
    private javax.swing.JLabel label_AnimalesAdopcion;
    private javax.swing.JLabel label_AnimalesAdoptados;
    private javax.swing.JLabel label_AnimalesNoDisponibles;
    private javax.swing.JLabel label_CantidadAnimales;
    private javax.swing.JLabel label_EmpresasRegistradas;
    private javax.swing.JLabel label_ListadoAnimales;
    private javax.swing.JLabel label_OtrosAlimentos;
    private javax.swing.JList<String> list_ListadoAnimales;
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
    private javax.swing.JTextField textField_AdopcionesRegistradas;
    private javax.swing.JTextField textField_AlimentoPerrosAdultos;
    private javax.swing.JTextField textField_AlimentoPerrosChicos;
    private javax.swing.JTextField textField_AlimentoPerrosGrandes;
    private javax.swing.JTextField textField_AnimalesAdopcion;
    private javax.swing.JTextField textField_AnimalesAdoptados;
    private javax.swing.JTextField textField_AnimalesNoDisponibles;
    private javax.swing.JTextField textField_CantidadAnimales;
    private javax.swing.JTextField textField_EmpresasRegistradas;
    private javax.swing.JTextField textField_OtrosAlimentos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo_Adopciones;
    private javax.swing.JLabel titulo_Animales;
    private javax.swing.JLabel titulo_Empresas;
    private javax.swing.JLabel titulo_StockAlimentos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange (PropertyChangeEvent evt){
        actualizarResumen();
    }
}
