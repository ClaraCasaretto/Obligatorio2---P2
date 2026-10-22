/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Dominio;

public class Adopcion {
    private int numero;
    private Animal animal;
    private Familia familia;
    private String comentarios;

    public Adopcion(int unNumero, Animal unAnimal, Familia unaFamilia, String unComentarios) {
        this.numero = unNumero;
        this.animal = unAnimal;
        this.familia = unaFamilia;
        this.comentarios = unComentarios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
}
