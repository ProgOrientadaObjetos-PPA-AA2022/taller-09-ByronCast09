/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.InstitucionEducativa;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        Persona beneficiario;
        String nombre;
        String Apellido;
        String Username;
        int tiempoPresta;
        String CiudadPresta;
        String tipoAuto;
        String marcaAuto;
        Persona garante1;
        
        double valorAuto;
        String nivelEstudios;
        InstitucionEducativa centroEducativo;
        String nombreIns;
        String siglas;
        double valorCarrera;
        int tipoPrestamo;
        String continuar;
        String bandera = "SI";

       
        do {
            
                
            System.out.println("Tipo de Estudiante a ingresar.\n1) Prestamo"
                    + "Automovil. \n2) Prestamo Educativo");
             
            tipoPrestamo = entrada.nextInt();
            if (tipoPrestamo == 1 || tipoPrestamo == 2) {
                entrada.nextLine();
                
                System.out.println("Ingrese el nombre de la Persona: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido de esa Persona: ");
                Apellido = entrada.nextLine();
                System.out.println("Ingrese su Username: ");
                Username = entrada.nextLine();
                beneficiario = new Persona(nombre,Apellido,Username);
                System.out.println("Ingrese su tiempo de Prestamo: ");
                tiempoPresta = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad del Prestamo: ");
                CiudadPresta = entrada.nextLine();
                
                if (tipoPrestamo == 1) {
               
                    entrada.nextLine();
                    
                    System.out.println("Ingrese el nombre del garante: ");
                    String nombreG = entrada.nextLine();
                    System.out.println("Ingrese el apellido del garante: ");
                    String apellidoG = entrada.nextLine();
                    System.out.println("Ingrese el username del garante: ");
                    String usernG = entrada.nextLine();
                    garante1 = new Persona(nombreG,apellidoG,usernG);
                    System.out.println("Ingrese el tipo de Auto: ");
                    tipoAuto = entrada.nextLine();
                    System.out.println("Ingrese la Marca del Auto: ");
                    marcaAuto = entrada.nextLine();
                    beneficiario = new Persona(nombre,Apellido,Username);
                    System.out.println("Ingrese el valor del Auto: ");
                    valorAuto = entrada.nextDouble();
                    
                    PrestamoAutomovil prestaAuto = new PrestamoAutomovil(beneficiario,tiempoPresta,CiudadPresta,garante1,tipoAuto,
                    marcaAuto,valorAuto);
                   
                    prestaAuto.establecerBeneficiario(beneficiario);
                    prestaAuto.establecerTiempoPrestamo(tiempoPresta);
                    prestaAuto.establecerCiudadPrestamo(CiudadPresta);
                    prestaAuto.establecerGarante1(garante1);
                    prestaAuto.establecerTipoAuto(tipoAuto);
                    prestaAuto.establecerMarcaAuto(marcaAuto);
                    prestaAuto.establecerValorAuto(valorAuto);

                    prestaAuto.calcularValorMensualPresta();

                    System.out.println("");
                    System.out.println("Datos de Prestamo del Automovil");
                    System.out.printf("Beneficiario: %s\n",
                            prestaAuto.obtenerBeneficiario());
                    System.out.printf("Garante: %s\n",
                            prestaAuto.obtenerGarante1());
                    System.out.printf("Ciudad del Prestamo: %s\n",
                            prestaAuto.obtenerCiudadPrestamo());
                    System.out.printf("Tiempo del Prestamo: %s\n",
                            prestaAuto.obtenerTiempoPrestamo());
                    System.out.printf("Tipo de Auto: %s\n",
                            prestaAuto.obtenerTipoAuto());
                    System.out.printf("Marca del Auto: %s\n",
                            prestaAuto.obtenerMarcaAuto());
                    System.out.printf("Valor del Auto: %.2f\n",
                            prestaAuto.obtenerValorAuto());
                    System.out.printf("Valor Mensual del Prestamo $: %.2f\n",
                            prestaAuto.obtenerValorMensualPrest());

                } else {
                   
                    System.out.println("Ingrese nivel de estudios: ");
                    nivelEstudios = entrada.nextLine();
                    
                    System.out.println("Ingrese nombre de la Institucion: ");
                    nombreIns = entrada.nextLine();
                    System.out.println("Ingrese las siglas de la Institucion: ");
                    siglas = entrada.nextLine();
                    centroEducativo = new InstitucionEducativa(nombreIns,siglas);
                    
                    System.out.println("Ingrese el valor de la Carrera: ");
                    valorCarrera = entrada.nextDouble();
                    
                    PrestamoEducativo prestaEdu = new PrestamoEducativo(beneficiario,tiempoPresta,
                            CiudadPresta,nivelEstudios,centroEducativo,valorCarrera);
                     
                    prestaEdu.establecerBeneficiario(beneficiario);
                    prestaEdu.establecerTiempoPrestamo(tiempoPresta);
                    prestaEdu.establecerCiudadPrestamo(CiudadPresta);
                    prestaEdu.establecerNivelEstudios(nivelEstudios);
                    prestaEdu.establecerCentroEducativoInstEd(centroEducativo);
                    prestaEdu.establecerValorCarrera(valorCarrera);
                    
                    
                    prestaEdu.calcularValorMensualPrestamoCarrera();
                   
                    System.out.println("");
                    System.out.println("Datos de Prestamo Educativo");
                    System.out.printf("Beneficiario: %s\n",
                            prestaEdu.obtenerBeneficiario());
                    System.out.printf("Nivel de estudios: %s\n",
                            prestaEdu.obtenerNivelEstudio());
                    System.out.printf("Ciudad del Prestamo: %s\n",
                            prestaEdu.obtenerCiudadPrestamo());
                    System.out.printf("Tiempo del Prestamo: %s\n",
                            prestaEdu.obtenerTiempoPrestamo());
                    System.out.printf("Centro Educativo: %s\n",
                            prestaEdu.obtenerCentroEducativoInstEd());
                    System.out.printf("Valor de la Carrera: %.2f\n",
                            prestaEdu.obtenerValorCarrera());
                    System.out.printf("Valor Mensual del Prestamo Carrera: %.2f\n",
                            prestaEdu.obtenerValorMensualPrestamoCarrera());
                }
            } else {
                System.out.println("Error en la opción");
            }
            System.out.println("Desea ingresar más Prestamos. Digite la letra"
                    + " S para continuar o digite la letra N para salir");
          
            entrada.nextLine(); 
            continuar = entrada.nextLine();
        } while (continuar.equals("S"));
    }
}
