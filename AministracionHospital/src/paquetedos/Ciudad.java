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
public class Ciudad {
    
    // Atributos
    private String nombre;
    private String provincia;
    
    // Constructor
    public Ciudad(String name, String province) {
        nombre = name;
        provincia = province;
    }
    
    // Metodos establecer
    public void establecerNombre(String name) {
        nombre = name;
    }
    
    public void establecerProvincia(String province) {
        provincia = province;
    }
    
    // Metodos obtener
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }

}
