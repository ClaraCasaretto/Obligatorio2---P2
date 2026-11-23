/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lecturaEscrituraArchivos.ArchivoLectura;
import lecturaEscrituraArchivos.ArchivoGrabacion;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sistema implements Serializable{
    private ArrayList<Animal>listaAnimales;
    private ArrayList<Familia> listaFamilias;
    private ArrayList<Empresa> listaEmpresas;
    private ArrayList<Adopcion> listaAdopciones;
    private int contadorAdopcion;
    private ArrayList<Donacion> listaDonaciones;
    private int contadorDonacion;
    private PropertyChangeSupport actualizandoCambios;

    public Sistema() {
        this.listaAnimales =  new ArrayList<Animal>();
        this.listaFamilias = new ArrayList<Familia>();
        this.listaEmpresas = new ArrayList<Empresa>();
        this.listaAdopciones = new ArrayList<Adopcion>();
        this.contadorAdopcion = 1;
        this.listaDonaciones = new ArrayList<Donacion>();
        this.contadorDonacion = 1;
        actualizandoCambios = new PropertyChangeSupport(this);
    }
    
    public void agregarListener(PropertyChangeListener unListener){
        actualizandoCambios.addPropertyChangeListener(unListener);
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    public boolean existeCodigoAnimal(String unCodigo){
        boolean existe = false;
        for (int i = 0; i < listaAnimales.size(); i++) {
            if(listaAnimales.get(i).getCodigo().equals(unCodigo)){
                existe = true;
            }
        }
        return existe;
    }
    
    public void agregarAnimal(Animal unAnimal) {
        listaAnimales.add(unAnimal);
        actualizandoCambios.firePropertyChange("listaAnimales", null, unAnimal);
    }

    public ArrayList<Familia> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(ArrayList<Familia> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }

    public boolean existeCedulaFamilia(String unaCedula) {
        boolean existe = false;
        for (int i = 0; i < listaFamilias.size(); i++) {
            if (listaFamilias.get(i).getCedula().equals(unaCedula)) {
                existe = true;
            }
        }
        return existe;
    }
       
    public void agregarFamilia(Familia unaFamilia) {
        listaFamilias.add(unaFamilia);
    }
    
    public ArrayList<Animal> obtenerAnimalesDisponibles() {
        ArrayList<Animal> disponibles = new ArrayList<>();
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal animal = listaAnimales.get(i);
            if (animal.getEstado().equals("Disponible para adoptar")) {
                disponibles.add(animal);
            }
        }
        return disponibles;
    }
    
    public ArrayList<Animal> obtenerAnimalesNoEntregados() {
        ArrayList<Animal> animales = new ArrayList<>();
        for (int i = 0; i < listaAnimales.size(); i++) {
            Animal animal = listaAnimales.get(i);
            if (!animal.getEstado().equals("Entregado a familia")) {
                animales.add(animal);
            }
        }
        return animales;
    }
    
    public void cambiarEstadoAnimal(Animal unAnimal) {
        if (unAnimal.getEstado().equals("Disponible para adoptar")) {
            unAnimal.setEstado("No disponible para adoptar");
        } else {
            unAnimal.setEstado("Disponible para adoptar");
        }
        actualizandoCambios.firePropertyChange("listaAnimales", null, unAnimal);
    }
    
    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }
    
    public boolean existeRutEmpresa(String unRut){
        boolean existe = false;
        for (int i = 0; i < listaEmpresas.size(); i++) {
            if(listaEmpresas.get(i).getRut().equals(unRut)){
                existe = true;
            }
        }
        return existe;
    }
    
    public void agregarEmpresa(Empresa unaEmpresa){
        listaEmpresas.add(unaEmpresa);
        actualizandoCambios.firePropertyChange("listaEmpresas", null, unaEmpresa);
    }

    public ArrayList<Adopcion> getListaAdopciones() {
        return listaAdopciones;
    }

    public void setListaAdopciones(ArrayList<Adopcion> listaAdopciones) {
        this.listaAdopciones = listaAdopciones;
    }

    public int getContadorAdopcion() {
        return contadorAdopcion;
    }

    public void setContadorAdopcion(int contadorAdopcion) {
        this.contadorAdopcion = contadorAdopcion;
    }
    
    public void agregarAdopcion(Animal unAnimal, Familia unaFamilia, String unComentario) {
        Adopcion adopcion = new Adopcion(
                                            contadorAdopcion,
                                            unAnimal,
                                            unaFamilia,
                                            unComentario
                                        );
        listaAdopciones.add(adopcion);
        unAnimal.setEstado("Entregado a familia");
        contadorAdopcion++;
        actualizandoCambios.firePropertyChange("listaAnimales", null, unAnimal);
        actualizandoCambios.firePropertyChange("listaAdopciones", null, adopcion);
    }
    
    public void anularAdopcion(Adopcion unaAdopcion) {
        Animal animal = unaAdopcion.getAnimal();
        animal.setEstado("No disponible para adoptar");
        listaAdopciones.remove(unaAdopcion);
        actualizandoCambios.firePropertyChange("listaAnimales", null, animal);
        actualizandoCambios.firePropertyChange("listaAdopciones", unaAdopcion, null);
    }

    public ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public void setListaDonaciones(ArrayList<Donacion> listaDonaciones) {
        this.listaDonaciones = listaDonaciones;
    }

    public int getContadorDonacion() {
        return contadorDonacion;
    }

    public void setContadorDonacion(int contadorDonacion) {
        this.contadorDonacion = contadorDonacion;
    }
    
    public void agregarDonacion(Empresa unaEmpresa, String unTipo, double unaCantKilos) {
        Donacion donacion = new Donacion(
                                         contadorDonacion,
                                         unaEmpresa,
                                         unTipo,
                                         unaCantKilos
                                        );
        listaDonaciones.add(donacion);
        contadorDonacion++;
        actualizandoCambios.firePropertyChange("listaDonaciones", null, donacion);
    }
    
    public ArrayList<String> importarDonaciones(String nombreArchivo){
        ArrayList <String> errores = new ArrayList();
        ArchivoLectura archivo = new ArchivoLectura (nombreArchivo);
        int numeroLinea=0;

        while (archivo.hayMasLineas()){
            numeroLinea++;
            String linea= archivo.linea();
            String [] datos = linea.split("#", -1);
            if (datos.length != 3){
                errores.add("Linea"+numeroLinea+": formato incorrecto.");
            }else {
                String rut= datos[0].trim();
                String tipo= datos[1].trim();
                String kilosTxt= datos[2].trim();
                
                String erroresEncontrados= "";
                Empresa empresa= null;
                double kilos= 0;
                
                for (Empresa unaEmpresa: listaEmpresas){
                    if (unaEmpresa.getRut().equals(rut)){
                        empresa= unaEmpresa;
                    }
                }
                if(empresa==null){
                    erroresEncontrados+= "Empresa no encontrada.";
                }
                
                if(!tipo.equals("1")&&!tipo.equals("2")&&!tipo.equals("3")&&!tipo.equals("4")){
                    erroresEncontrados+= "Tipo de alimento invalido.";
                }
                
                try{
                    kilos= Double.parseDouble(kilosTxt);
                    if (kilos<=0){
                        erroresEncontrados+= "Cantidad de kilos invalida.";
                    }
                }catch (NumberFormatException e){
                    erroresEncontrados+= "Cantidad de kilos invalida.";
                }
                
                if (erroresEncontrados.isEmpty()){
                    agregarDonacion(empresa, tipo, kilos);
                }else {
                    errores.add("Linea "+numeroLinea+": "+erroresEncontrados);
                }
            }
        }
        archivo.cerrar();
        
        if (!errores.isEmpty()){
            int posicionPunto= nombreArchivo.lastIndexOf(".");
            
            String nombreError= nombreArchivo.substring(0, posicionPunto)+ "Error"+ nombreArchivo.substring(posicionPunto);
            
            ArchivoGrabacion archivoErrores= new ArchivoGrabacion(nombreError);
            
            for (String error: errores){
                archivoErrores.grabarLinea(error);
            }
            
            archivoErrores.cerrar();
        }
        
        return errores;
    }
   
    //obtenemos el color correspondiente a cada estado
    public Color obtenerColorEstado(String estado) {
        Color color = Color.BLACK;
        switch (estado) {
            case "Disponible para adoptar":
                color = new Color(0, 130, 0);
                break;
            case "No disponible para adoptar":
                color = Color.RED;
                break;
            case "Entregado a familia":
                color = Color.BLUE;
                break;
        }
        return color;
    }
    
    //Para ventana consulta de familia: Quenta cuántas adopciones tiene una familia.
    public int cantidadAdopcionesFamilia(Familia unaFamilia) {
        int cantidad = 0;
        for (Adopcion unaAdopcion : listaAdopciones) {
            if (unaAdopcion.getFamilia().getCedula().equals(unaFamilia.getCedula())) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    //Para ventana consulta de familia: Ordena las familias por apellido o por cantidad de adopciones, según lo seleccionado.
    public ArrayList<Familia> obtenerFamiliasOrdenadas(boolean porApellido) {
        ArrayList<Familia> familias = new ArrayList<>(listaFamilias);
        if (porApellido) {
            Collections.sort(familias, new Comparator<Familia>() {
                @Override
                public int compare(Familia f1, Familia f2) {
                    return f1.getApellido().compareToIgnoreCase(f2.getApellido());
                }
            });
        } else {
            Collections.sort(familias, new Comparator<Familia>() {
                @Override
                public int compare(Familia f1, Familia f2) {
                    return cantidadAdopcionesFamilia(f2)
                            - cantidadAdopcionesFamilia(f1);
                }
            });
        }
        return familias;
    }
    
    
    //Serializar 
    //Guarda todos los datos del sistema en el archivo datos.ser.
    public void guardarDatos() throws IOException {
        FileOutputStream archivo = new FileOutputStream("datos.ser");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(listaAnimales);
        salida.writeObject(listaFamilias);
        salida.writeObject(listaEmpresas);
        salida.writeObject(listaAdopciones);
        salida.writeObject(contadorAdopcion);
        salida.writeObject(listaDonaciones);
        salida.writeObject(contadorDonacion);
        salida.close();
    }
    
    public void recuperarDatos() throws IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("datos.ser");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        listaAnimales = (ArrayList<Animal>) entrada.readObject();
        listaFamilias = (ArrayList<Familia>) entrada.readObject();
        listaEmpresas = (ArrayList<Empresa>) entrada.readObject();
        listaAdopciones = (ArrayList<Adopcion>) entrada.readObject();
        contadorAdopcion = (Integer) entrada.readObject();
        listaDonaciones = (ArrayList<Donacion>) entrada.readObject();
        contadorDonacion = (Integer) entrada.readObject();
        entrada.close();
        actualizandoCambios.firePropertyChange("listaAnimales", null, listaAnimales);
        actualizandoCambios.firePropertyChange("listaFamilias", null, listaFamilias);
        actualizandoCambios.firePropertyChange("listaEmpresas", null, listaEmpresas);
        actualizandoCambios.firePropertyChange("listaAdopciones", null, listaAdopciones);
        actualizandoCambios.firePropertyChange("listaDonaciones", null, listaDonaciones);
    }
    
    public void generarHTML (String nombreArchivo){
        if (!nombreArchivo.toLowerCase().endsWith(".html")){
            nombreArchivo+= ".html";
        }
        ArchivoGrabacion archivoHtml= new ArchivoGrabacion(nombreArchivo);
        ArrayList <Adopcion> adopciones= new ArrayList<>(listaAdopciones);
        adopciones.sort((a1, a2)-> Integer.compare(a1.getNumero(), a2.getNumero()));
        archivoHtml.grabarLinea("<html>");
        archivoHtml.grabarLinea("<body>");
        archivoHtml.grabarLinea("<h1>Registro de adopciones</h1>");
        
        if (adopciones.isEmpty()){
            archivoHtml.grabarLinea("<p>No hay adopciones registradas.</p>");
        }else{            
            archivoHtml.grabarLinea("<table>");
            
            archivoHtml.grabarLinea("<tr>");
            archivoHtml.grabarLinea("<th>Codigo</th>");
            archivoHtml.grabarLinea("<th>Animal</th>");
            archivoHtml.grabarLinea("<th>Familia</th>");
            archivoHtml.grabarLinea("<th>Comentarios</th>");
            archivoHtml.grabarLinea("</tr>");
            
            for(Adopcion adopcion: adopciones){
                archivoHtml.grabarLinea("<tr>");
                archivoHtml.grabarLinea("<td>"+adopcion.getNumero()+"</td>");
                archivoHtml.grabarLinea("<td>"+adopcion.getAnimal().getNombre()+"</td>");
                archivoHtml.grabarLinea("<td>"+adopcion.getFamilia().getApellido()+"</td>");
                archivoHtml.grabarLinea("<td>"+adopcion.getComentarios()+"</td>");
                archivoHtml.grabarLinea("</tr>");
            }
            
            archivoHtml.grabarLinea("<table>");
        }
        
        archivoHtml.grabarLinea("</html>");
        archivoHtml.grabarLinea("</body>");
        archivoHtml.cerrar();
    }
}
