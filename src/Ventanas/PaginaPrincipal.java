/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;
import Dominio.Sistema;

public class PaginaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName());
    private Sistema sistema;
    
    public PaginaPrincipal() {
        sistema = new Sistema();
        initComponents();
    }
    
    public PaginaPrincipal(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        menu_Movimientos.add(menuItem_CambiarDeEstado);

        menuItem_AnularAdopcion.setText("Anular adopción");
        menu_Movimientos.add(menuItem_AnularAdopcion);

        menuItem_RegistrarDonacion.setText("Registrar donación");
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
        menu_Varios.add(menuItem_Autores);

        menuItem_Salir.setText("Salir");
        menu_Varios.add(menuItem_Salir);

        MenuBar.add(menu_Varios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PaginaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
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
    // End of variables declaration//GEN-END:variables
}
