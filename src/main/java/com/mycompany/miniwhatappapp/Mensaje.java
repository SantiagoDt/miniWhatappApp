/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniwhatappapp;

/**
 *
 * @author santy
 */
public class Mensaje {

    private Contacto contactoOrigen, contactoDestino;
    private String texto;

    public Mensaje(Contacto contactoOrigen, Contacto contactoDestino, String texto) {

        if (this.contactoOrigen != contactoDestino) {

            this.contactoOrigen = contactoOrigen.copy();
            this.contactoDestino = contactoDestino.copy();
            this.texto = texto;

        }

    }

    public String getTexto() {
        return texto;
    }
    
    

    @Override
    public String toString() {
        return "El mensaje enviado de "+ this.contactoOrigen.getNombre() + " a " +  this.contactoDestino.getNombre() + " es " + this.texto; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

}
