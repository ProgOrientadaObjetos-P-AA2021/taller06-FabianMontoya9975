/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author josef
 */
public class Enfermero {

    // Atributos
    private String nombre;
    private String tipo;
    private int sueldoMes;

    // constructor
    public Enfermero(String name, String ti, int sueldo) {
        nombre = name;
        tipo = ti;
        sueldoMes = sueldo;
    }

    // Metodos establecer
    public void establecerNombre(String name) {
        nombre = name;
    }

    public void establecerTipo(String ti) {
        tipo = ti;
    }

    public void establecerSueldoMes(int sueldo) {
        sueldoMes = sueldo;
    }

    // Metodos obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerSueldoMes() {
        return sueldoMes;
    }

}
