/*
* Manuel Negrin - N°: 379313
* Clara Casaretto - N°: 250991
*/
package Ventanas;

import Dominio.Sistema;

public class Main {
     public static void main(String[] args){
        Sistema sistema = new Sistema();
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal(sistema);
        paginaPrincipal.setVisible(true);
     }
}
