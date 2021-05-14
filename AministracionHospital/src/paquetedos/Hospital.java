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
public class Hospital {

    // Atributos
    private String nombreHospital;
    private String direccionHospital;
    private Ciudad ciudadHospital;
    private int numeroEspecialidades;
    private Medico[] listaMedicos;
    private Enfermero[] listaEnfermeros;
    private int totalSueldosMes;

    // Constructor
    public Hospital(String nombre, String direccion, Ciudad ubi,
            int especialidades, Medico[] medi, Enfermero[] enfe) {
        nombreHospital = nombre;
        direccionHospital = direccion;
        ciudadHospital = ubi;
        numeroEspecialidades = especialidades;
        listaMedicos = medi;
        listaEnfermeros = enfe;
    }

    // Metodos establecer
    public void establecerNombreHospital(String nombre) {
        nombreHospital = nombre;
    }

    public void establecerDireccionHospital(String direc) {
        direccionHospital = direc;
    }

    public void establecerCiudadHospital(Ciudad hosp) {
        ciudadHospital = hosp;
    }

    public void establecerNumeroEspecialidades(int num) {
        numeroEspecialidades = num;
    }

    public void establecerListaMedicos(Medico[] listm) {
        listaMedicos = listm;
    }

    public void establecerListaEnfermeros(Enfermero[] enfer) {
        listaEnfermeros = enfer;
    }

    public void establecerTotalSueldosMes() {
        int sueldos = 0;
        for (Medico obtenerListaMedico : obtenerListaMedicos()) {
            sueldos = sueldos + obtenerListaMedico.obtenerSueldoMes();
        }
        for (Enfermero obtenerListaEnfermero : obtenerListaEnfermeros()) {
            sueldos = sueldos + obtenerListaEnfermero.obtenerSueldoMes();
        }
        totalSueldosMes = sueldos;
    }

    // Metodos obtener
    public String obtenerNombreHospita() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerListaMedicos() {
        return listaMedicos;
    }

    public Enfermero[] obtenerListaEnfermeros() {
        return listaEnfermeros;
    }

    public int obtenerTotalSueldosMes() {
        return totalSueldosMes;
    }

    @Override
    public String toString() {
        String cadena = "Información Hospital\n";
        cadena = String.format("%s%s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos:\n",
                cadena,
                nombreHospital,
                direccionHospital,
                obtenerCiudadHospital().obtenerNombre(),
                obtenerCiudadHospital().obtenerProvincia(),
                numeroEspecialidades);
        for (Medico obtenerListaMedico : obtenerListaMedicos()) {
            cadena = String.format("%s - %s - sueldo: %d - %s\n",
                    cadena,
                    obtenerListaMedico.obtenerNombre(),
                    obtenerListaMedico.obtenerSueldoMes(),
                    obtenerListaMedico.obtenerEspecialidades());
        }
        cadena = String.format("%s\nListado de enfermeros(as):\n",cadena);
        for (Enfermero obtenerListaEnfermero : obtenerListaEnfermeros()) {
            cadena = String.format("%s - %s - sueldo: %d - %s\n",
                    cadena,
                    obtenerListaEnfermero.obtenerNombre(),
                    obtenerListaEnfermero.obtenerSueldoMes(),
                    obtenerListaEnfermero.obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %d\n",
                cadena, obtenerTotalSueldosMes());
        return cadena;
    }

}
