/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

public class Donacion {
    private int numero;
    private Empresa empresa;
    private String tipo;
    private double cantKilos;

    public Donacion(int unNumero, Empresa unaEmpresa, String unTipo, double unaCantKilos) {
        this.numero = unNumero;
        this.empresa = unaEmpresa;
        this.tipo = unTipo;
        this.cantKilos = unaCantKilos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantKilos() {
        return cantKilos;
    }

    public void setCantKilos(double cantKilos) {
        this.cantKilos = cantKilos;
    }
    
    
}
