/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

public class Empresa {
    private String nombre;
    private String rut;
    private String direccion;

    public Empresa(String unNombre, String unRut, String unaDireccion) {
        this.nombre = unNombre;
        this.rut = unRut;
        this.direccion = unaDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
