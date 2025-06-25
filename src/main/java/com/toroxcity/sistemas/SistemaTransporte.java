/**
 * Representa un sistema de transporte dentro de ToroxCity.
 * Extiende SistemaTorox e incluye la cantidad de unidades activas
 * como propiedad adicional.
 */

package com.toroxcity.sistemas;

import java.util.Scanner;

public class SistemaTransporte extends SistemaTorox {
    int unidades;
    public SistemaTransporte(int id, String nombre, String estado, int unidades) {
        super(id, nombre, estado);
        this.unidades = unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Unidades activas: " + this.getUnidades());
    }

    public void editar(Scanner scanner){
        super.editar(scanner);

        System.out.println("Nueva cantidad de unidades activas");
        int nuevasUnidades = scanner.nextInt();
        scanner.nextLine();
        this.setUnidades(nuevasUnidades);
    }
}
