/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aministracionhospital;

import java.util.Scanner;
import paquetedos.Ciudad;
import paquetedos.Enfermero;
import paquetedos.Hospital;
import paquetedos.Medico;

/**
 *
 * @author josef
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Lista de variables
        String nameHosp;
        String direccionHosp;
        String ciud;
        String provincia;
        int numEspecialidades;
        int numeroMedicos;
        String nombreMedico;
        String especialidad;
        int sueldoMedico;
        Medico med[];
        int numeroEnfermeros;
        String nombreEnfermero;
        String tipoEnf;
        int sueldoEnf;
        Enfermero enf[];

        // Entradass por teclado
        System.out.println("Ingresar el nombre del hospital: ");
        nameHosp = entrada.nextLine();
        nameHosp = nameHosp.toUpperCase();
        System.out.println("Ingresar la dirección donde se encuentra: ");
        direccionHosp = entrada.nextLine();
        System.out.println("Ingresar la ciudad: ");
        ciud = entrada.nextLine();
        System.out.println("Ingresar la provincia: ");
        provincia = entrada.nextLine();
        Ciudad ub = new Ciudad(ciud, provincia);
        System.out.println("Digitar el número de especialidades: ");
        numEspecialidades = entrada.nextInt();
        System.out.println("Digitar el número de médicos: ");
        numeroMedicos = entrada.nextInt();
        entrada.nextLine();
        med = new Medico[numeroMedicos];
        // Grupo de médicos
        for (int i = 0; i < numeroMedicos; i++) {
            System.out.printf("Ingresar el nombre del médico %d: ", i + 1);
            nombreMedico = entrada.nextLine();
            System.out.printf("Ingresar la especialidad del médico %d: ",
                    i + 1);
            especialidad = entrada.nextLine();
            System.out.printf("Ingresar el sueldo del médico %d: ", i + 1);
            sueldoMedico = entrada.nextInt();
            entrada.nextLine();
            Medico m = new Medico(nombreMedico, especialidad, sueldoMedico);
            med[i] = m;
        }
        System.out.println("Digitar el número de enfermeros y enfermeras: ");
        numeroEnfermeros = entrada.nextInt();
        entrada.nextLine();
        enf = new Enfermero[numeroEnfermeros];
        // Grupo de enfermeros(as)
        for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.printf("Ingresar el nombre del enfermera/o %d: ", i + 1);
            nombreEnfermero = entrada.nextLine();
            System.out.printf("Digite la opción del tipo de enfermera/o "
                    + "si es por contrato ó nombramiento: ",
                    i + 1);
            tipoEnf = entrada.nextLine();
            tipoEnf = tipoEnf.toLowerCase();
            System.out.printf("Ingresar el sueldo del enfermera/o %d: ", i + 1);
            sueldoEnf = entrada.nextInt();
            entrada.nextLine();
            Enfermero e = new Enfermero(nombreEnfermero, tipoEnf, sueldoEnf);
            enf[i] = e;
        }
        // objecto Hospital
        Hospital hosp = new Hospital(nameHosp, direccionHosp, ub,
                numEspecialidades, med, enf);
        hosp.establecerTotalSueldosMes();
        
        System.out.println();
        // Se imprime el objeto
        System.out.printf("%s\n", hosp);
    }

}
