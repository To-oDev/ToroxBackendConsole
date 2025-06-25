/**
 * Controlador principal de la lógica de gestión de sistemas Torox.
 * Permite realizar operaciones CRUD (crear, listar, editar, eliminar)
 * sobre una colección de sistemas, sin importar su tipo.

 * Simula el rol de una base de datos o backend simple,
 * manejando la asignación de ID únicos y el control general del estado
 * de los sistemas registrados.
 */

package com.toroxcity.sistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeSistemas {
    private int nextId = 1;
    private List<SistemaTorox> sistemas = new ArrayList<>();

    public void agregarSistema(Scanner scanner) {
        System.out.println("[Registro de sistemas Torox]");
        System.out.println("Elive el tipo de sistema a registrar:");
        System.out.println("1. Seguridad");
        System.out.println("2. Transporte");
        System.out.println("3. Energía");
        int opcion = scanner.nextInt(); // lee entrada del usuario
        scanner.nextLine(); // limpia buffer

        System.out.println("Ingresa nombre de sistema:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa estado (en prueba, estable, descartado:");
        String estado = scanner.nextLine();

        SistemaTorox nuevo = null;

        switch (opcion) {
            case 1:
                System.out.println("Nivel de seguridad:");
                int nivel = scanner.nextInt();
                scanner.nextLine();
                nuevo = new SistemaSeguridad(nextId++, nombre, estado, nivel);
                break;
            case 2:
                System.out.println("Cantidad de unidades:");
                int unidades = scanner.nextInt();
                scanner.nextLine();
                nuevo = new SistemaTransporte(nextId++, nombre, estado, unidades);
                break;
            case 3:
                System.out.println("Fuente de energía:");
                String fuente = scanner.nextLine();
                nuevo = new SistemaEnergia(nextId++, nombre, estado, fuente);
                break;
            default:
                System.out.println("Opción invalida...");
                return;
        }

        sistemas.add(nuevo);
        System.out.println("Sistema creado con ID:" + nuevo.getId());
    }

    public void listarSistemas(){
        if (sistemas.isEmpty()) {
            System.out.println("No hay sistemas registrados");
            return;
        }

        System.out.println("Listado de sistemas registrados:");
        for (SistemaTorox sistema : sistemas){
            sistema.mostrarDetalles();
        }
    }

    public SistemaTorox buscarPorId(int id){
        for (SistemaTorox sistema : sistemas){
            if (sistema.getId() == id){
                return sistema;
            }
        }
        System.out.println("No existe el id " + id);
        return null;
    }

    public SistemaTorox buscarPorNombre(String nombre){
        for (SistemaTorox sistema : sistemas){
            if (sistema.getNombre().equals(nombre)){
                return sistema;
            }
        }

        System.out.println("No existe el sistema con el nombre " + nombre);
        return null;
    }

    public SistemaTorox buscarSistema(Scanner scanner){
        System.out.println("Buscar por:");
        System.out.println("1. ID");
        System.out.println("2. Nombre");
        int metodoBusqueda = scanner.nextInt();
        scanner.nextLine();

        SistemaTorox sistema = null;
        switch (metodoBusqueda) {
            case 1:
                System.out.println("Ingresa ID:");
                int id = scanner.nextInt();
                scanner.nextLine();
                sistema = this.buscarPorId(id);
                break;
            case 2:
                System.out.println("Ingresa nombre:");
                String nombre = scanner.nextLine();
                sistema = this.buscarPorNombre(nombre);
                break;
            default:
                System.out.println("Metodo no valido...");
                return null;
        }

        return sistema;
    }

    public void editarSistema(Scanner scanner){
        SistemaTorox sistema = this.buscarSistema(scanner);
        if (sistema == null){
            System.out.println("Sistema no encontrado.");
            return;
        }

        sistema.editar(scanner);

        System.out.println("Sistema editado!");

        sistema.mostrarDetalles();
    }

    public void eliminarSistema(Scanner scanner){
        SistemaTorox sistema = this.buscarSistema(scanner);
        if (sistema == null){
            System.out.println("Sistema no encontrado.");
            return;
        }

        sistemas.remove(sistema);
        System.out.println("Sistema eliminado correctamente!");
    }
}
