/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    String nivelEstudios;
    InstitucionEducativa centroEducativo;
    double valorCarrera;
    double ValorMensualPrestamoCarrera;
    
    public PrestamoEducativo(Persona benef, int tiempP, String ciudP, String nivelE,
            InstitucionEducativa centroEd,double valorC){
        super(benef, tiempP, ciudP);
        nivelEstudios = nivelE;
        centroEducativo = centroEd;
        valorCarrera = valorC;
    }
    @Override
    public void establecerCiudadPrestamo(String ciuPre){
        ciudadPrestamo = ciuPre.toUpperCase();
    }
    public void establecerNivelEstudios(String nivE){
        nivelEstudios = nivE;
    }
    public void establecerCentroEducativoInstEd(InstitucionEducativa centroEduc){
        centroEducativo = centroEduc;
    }
    public void establecerValorCarrera(double valCa){
        valorCarrera = valCa;
    }
    public void calcularValorMensualPrestamoCarrera(){
        ValorMensualPrestamoCarrera = (valorCarrera / tiempoPrestamo)-(10*(valorCarrera / tiempoPrestamo)/100);
    }
    //--------------------------------------------------------------------------
    public String obtenerNivelEstudio(){
        return nivelEstudios; 
    }
    public InstitucionEducativa obtenerCentroEducativoInstEd(){
        return centroEducativo; 
    }
    public double obtenerValorCarrera(){
        return valorCarrera; 
    }
    public double obtenerValorMensualPrestamoCarrera(){
        return ValorMensualPrestamoCarrera; 
    }
    
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de Estudios: %s\n"
                + "Centro Educativo : %s\n"
                + "Valor de la Carrera: %s\n"
                + "Valor Mensual del Pago(Prestamo valor Carrera): %s\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                obtenerCentroEducativoInstEd(),
                obtenerValorCarrera());
        return cadenaFinal;
    }
}
