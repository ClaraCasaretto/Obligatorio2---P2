/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

public class Animal {
    private String codigo;
    private String nombre;
    private String temperamento;
    private double peso;
    private String estado;

    public Animal(String unCodigo, String unNombre, String unTemperamento, double unPeso, String unEstado) {
        this.codigo = unCodigo;
        this.nombre = unNombre;
        this.temperamento = unTemperamento;
        this.peso = unPeso;
        this.estado = unEstado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
