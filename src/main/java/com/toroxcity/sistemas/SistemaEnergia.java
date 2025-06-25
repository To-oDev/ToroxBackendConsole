/**
 * Representa un sistema energético funcional en ToroxCity.
 * Hereda de SistemaTorox y añade la fuente energética utilizada,
 * como solar, eólica, nuclear, etc.
 */

package com.toroxcity.sistemas;

import java.util.Scanner;

public class SistemaEnergia extends SistemaTorox{
    String fuente;
    public SistemaEnergia(int id, String nombre, String estado, String fuente) {
        super(id, nombre, estado);
        this.fuente = fuente;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Fuente: " + this.getFuente());
    }

    public void editar(Scanner scanner){
        super.editar(scanner);

        System.out.println("Nueva fuente:");
        String nuevaFuente = scanner.nextLine();

        this.setFuente(nuevaFuente);
    }
}
