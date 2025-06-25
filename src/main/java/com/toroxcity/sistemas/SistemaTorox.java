/**
 * Clase abstracta base para todos los sistemas desarrollados por Torox.
 * Define los atributos comunes y la estructura general que deben seguir
 * todos los sistemas funcionales dentro de la ciudad.

 * Atributos comunes:
 * - ID único (asignado automáticamente)
 * - Nombre descriptivo
 * - Estado operativo (en prueba, estable, descartado)

 * Este diseño permite aplicar polimorfismo y extender funcionalidad
 * para cada tipo de sistema concreto.
 */

package com.toroxcity.sistemas;

import java.util.Scanner;

public abstract class SistemaTorox {
    protected final int id;
    protected String nombre;
    protected String estado; // valores posible: "en prueba", "estable", "descartado"

    public SistemaTorox(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public void mostrarDetalles(){
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Estado: " + this.estado);
    }

    public void editar(Scanner scanner){
        System.out.println("Nuevo nombre:");
        String nuevoNombre = scanner.nextLine();

        System.out.println("Nuevo estado:");
        String nuevoEstado = scanner.nextLine();

        this.setNombre(nuevoNombre);
        this.setEstado(nuevoEstado);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
