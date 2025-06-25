/**
 * Representa un sistema de seguridad dentro de ToroxCity.
 * Hereda los atributos generales de SistemaTorox y añade
 * un nivel de seguridad como propiedad específica.
 */

package com.toroxcity.sistemas;

import java.util.Scanner;

public class SistemaSeguridad extends SistemaTorox{
    int nivel;
    public SistemaSeguridad(int id, String nombre, String estado, int nivel) {
        super(id, nombre, estado);
        this.nivel = nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Nivel: " + this.getNivel());
    }

    public void editar(Scanner scanner){
        super.editar(scanner);

        System.out.println("Nuevo nivel de seguridad:");
        int nuevoNivel = scanner.nextInt();
        scanner.nextLine();
        this.setNivel(nuevoNivel);
    }
}
