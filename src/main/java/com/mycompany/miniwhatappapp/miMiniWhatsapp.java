/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniwhatappapp;

/**
 *
 * @author santy
 */
public class miMiniWhatsapp {

    private static int contador = 0;

   private Mensaje[] arrayMensajes;

    public miMiniWhatsapp() {

        this.arrayMensajes = new Mensaje[100];
    }

    public void anadirMensaje(Mensaje nuevoMensaje) {
        if (contador < 100 && nuevoMensaje.getTexto() != null) {
            arrayMensajes[contador] = nuevoMensaje;
            contador++;
        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Estos son los mensajes de whatApp " + "tienes : " + contador + " mensaje\n");

        for (int i = 0; i < contador; i++) {

            sb.append("Mensaje: ").append(i + 1).append("\n");
            sb.append("Texto: ").append(arrayMensajes[i].getTexto()).append("\n");

        }

        return sb.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
