/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import lecturaEscrituraArchivos.ArchivoLectura;
import lecturaEscrituraArchivos.ArchivoGrabacion;

public class Sistema {
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
}
