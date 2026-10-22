/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

public class Familia {
    private String cedula;
    private String apellido;
    private String celular;

    public Familia(String unaCedula, String unApellido, String unCelular) {
        this.cedula = unaCedula;
        this.apellido = unApellido;
        this.celular = unCelular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    
    
}
