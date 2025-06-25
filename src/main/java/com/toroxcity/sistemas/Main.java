/**
 * Punto de entrada del sistema de simulación Backend Torox.
 * Proporciona un menú interactivo en consola para gestionar
 * sistemas tecnológicos dentro de la ciudad:

 * - Crear sistemas (Seguridad, Transporte, Energía)
 * - Listar sistemas registrados
 * - Editar o eliminar sistemas

 * Utiliza la clase GestorDeSistemas para mantener y manipular
 * la colección de sistemas registrados, aplicando principios
 * de POO como herencia y polimorfismo.
 */

package com.toroxcity.sistemas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("[Torox CRUD Sim]");

        Scanner scanner = new Scanner(System.in);
        GestorDeSistemas admin = new GestorDeSistemas();

        boolean salir = false;
        while(!salir) {
            System.out.println("\n===============================");
            System.out.println("  🌐 TOROX SYSTEM MANAGER 1.0");
            System.out.println("===============================");
            System.out.println("1️⃣  Crear nuevo sistema");
            System.out.println("2️⃣  Listar sistemas registrados");
            System.out.println("3️⃣  Editar un sistema existente");
            System.out.println("4️⃣  Eliminar un sistema");
            System.out.println("0️⃣  Salir del sistema");
            System.out.println("===============================");
            System.out.print("👉 Ingresa una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Estás seguro que deseas salir?(s/n)");
                    String res = scanner.nextLine().trim().toLowerCase();
                    if (res.equals("s")) {
                        System.out.println("👋 Cerrando el sistema Torox...");
                        salir = true;
                    } else {
                        System.out.println("❗ Salida cancelada. Regresando al menú.");
                        salir = false;
                    }
                    break;
                case 1:
                    admin.agregarSistema(scanner);
                    break;
                case 2:
                    admin.listarSistemas();
                    break;
                case 3:
                    admin.editarSistema(scanner);
                    break;
                case 4:
                    admin.eliminarSistema(scanner);
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intenta nuevamente.");
                    return;
            }
        };
    }
}
