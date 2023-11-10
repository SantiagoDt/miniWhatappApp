/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.miniwhatappapp;

import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class MiniWhatappApp {

    public static void main(String[] args) {
        
        System.out.println("Añadimos un nuevo cambio para imprimir un menú");
        boolean salir = false;
        int contador = 0;
        int contador_men = 0;
        Contacto[] arrayContactos = new Contacto[100];
        Mensaje[] mensajes = new Mensaje[100];
        miMiniWhatsapp app = new miMiniWhatsapp();

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion correcta: \n"
                    + "1)Crear un contacto\n"
                    + "2)Enviar mensaje\n"
                    + "3)Mostrar todos los mensajes\n"
                    + "4)Finalizar el mensaje"
            ));
            switch (opcion) {
                case 1:

                    String nombre = JOptionPane.showInputDialog("Por favor, ingrese tu nombre:");
                    int telefono = Integer.parseInt(JOptionPane.showInputDialog("Por favor,ingresa tu numero de telefono:"));
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese tu edad :"));

                    arrayContactos[contador] = new Contacto(nombre, telefono, edad);
                    contador++;

                    break;

                case 2:

                    if (contador >= 2) {
                        int con1,
                                con2;
                        String mensaje = JOptionPane.showInputDialog("Por favor ingresa el mensaje");
                        JOptionPane.showMessageDialog(null, mostrarContactos(arrayContactos,contador));
                        con1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor,ingresa el contacto  origen:"));
                        con2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor,ingrese el contacto destino: "));

                        app.anadirMensaje(new Mensaje(arrayContactos[con1], arrayContactos[con2], mensaje));

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay suficientes contactos para enviar mensajes solo hay : " + contador);
                    }

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null, app);

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    salir = true;
                    break;

                default:

            }

        } while (salir == false);

    }

    public static String mostrarContactos(Contacto[] arrayContactos,int contador) {

        StringBuilder sb = new StringBuilder();
        sb.append("Lista de contactos disponibles\n");

        for (int i = 0; i <contador; i++) {
            sb.append(i + 1).append(arrayContactos[i].getNombre()).append("\n");
        }

        return sb.toString();
    }

}
