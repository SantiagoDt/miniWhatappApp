/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniwhatappapp;

/**
 *
 * @author santy
 */
public class Contacto {

    private int telefono, edad;
    private String nombre;

    public Contacto(String nombre, int telefono, int edad) {

        if (telefono > 0) {
            this.telefono = telefono;
            this.edad = edad;
            this.nombre = nombre;
        }
    }

    public Contacto(String nombre, int telefono) {

        if (telefono > 0) {

            this.nombre = nombre;
            this.telefono = telefono;
        }

    }

    /**
     * Getter de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Getter de telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * setter telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Contacto es el mismo si coinciden con el numero de telefono
     */
    public boolean esIgual(Contacto contactoExterno) {
        if (this.telefono == contactoExterno.telefono) {
            return true;
        } else {
            return false;
        }
    }

    public Contacto copy() {
        return new Contacto(this.nombre,this.telefono,this.edad);
    }

    @Override
    public String toString() {
        return "------------------------------------------\n"
                + "CONTACTO\n"
                + "Nombre: " + this.nombre + "\n"
                + "Telefono: " + this.telefono + "\n"
                + "Edad: " + this.edad + "\n"
                + "----------------------------------------";

    }

}
