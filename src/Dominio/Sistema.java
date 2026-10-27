/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Animal>listaAnimales;
    private ArrayList<Familia> listaFamilias;
    private ArrayList<Empresa> listaEmpresas;
    private ArrayList<Adopcion> listaAdopciones;
    private int contadorAdopcion;
    private ArrayList<Donacion> listaDonaciones;
    private int contadorDonacion;

    public Sistema() {
        this.listaAnimales =  new ArrayList<Animal>();
        this.listaFamilias = new ArrayList<Familia>();
        this.listaEmpresas = new ArrayList<Empresa>();
        this.listaAdopciones = new ArrayList<Adopcion>();
        this.contadorAdopcion = 1;
        this.listaDonaciones = new ArrayList<Donacion>();
        this.contadorDonacion = 1;
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
    
    
    
    
    
    
}
