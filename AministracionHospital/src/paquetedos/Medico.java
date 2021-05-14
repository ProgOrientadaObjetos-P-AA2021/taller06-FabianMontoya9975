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
public class Medico {

    // Atributos
    private String nombre;
    private String especialidad;
    private int sueldoMes;
    
    // Constructor
    public Medico(String name, String esp, int sueldo) {
        nombre = name;
        especialidad = esp;
        sueldoMes = sueldo;
    }

    // Metodos establecer
    public void establecerNombre(String name) {
        nombre = name;
    }

    public void establecerEspecialidad(String esp) {
        especialidad = esp;
    }

    public void establecerSueldoMes(int sueldo) {
        sueldoMes = sueldo;
    }

    // Metodos obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidades() {
        return especialidad;
    }

    public int obtenerSueldoMes() {
        return sueldoMes;
    }

}
