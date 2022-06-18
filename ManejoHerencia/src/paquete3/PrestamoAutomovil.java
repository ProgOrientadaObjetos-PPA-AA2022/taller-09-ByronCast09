/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    String tipoAuto;
    String marcaAuto;
    Persona garante1;
    double valorAuto;
    double valorMensualPresta;
    
    public PrestamoAutomovil(Persona benef, int tiempP, String ciudP,Persona garante1, String tipA,
            String marcA,double valAu){
        super(benef, tiempP, ciudP);
        tipoAuto = tipA;
        marcaAuto = marcA;
        valorAuto = valAu;
    }

    @Override
    public void establecerCiudadPrestamo(String ciuPre){
        ciudadPrestamo = ciuPre.toLowerCase();
    }
    
    public void establecerTipoAuto(String tipoA){
        tipoAuto = tipoA;
    }
    public void establecerMarcaAuto(String marc){
        marcaAuto = marc;
    }
    public void establecerGarante1(Persona gar1){
        garante1 = gar1;
    }
    public void establecerValorAuto(double valAut){
        valorAuto = valAut;
    }
    public void calcularValorMensualPresta(){
        valorMensualPresta = valorAuto / tiempoPrestamo;
    }
    //-------------------------------------------------------------------
    public String obtenerTipoAuto(){
        return tipoAuto; 
    }
    public String obtenerMarcaAuto(){
        return marcaAuto; 
    }
    public Persona obtenerGarante1(){
        return garante1; 
    }
    public double obtenerValorAuto(){
        return valorAuto; 
    }
    public double obtenerValorMensualPrest(){
        return valorMensualPresta; 
    }
    
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de Auto: %s\n"
                + "Marca del Auto : %s\n"
                + "Garante 1: %s\n"
                + "Valor del Auto: %s\n"
                + "Valor Mensual de Pago Prestamo Automovil: %s\n",
                cadenaFinal,
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                obtenerGarante1(),
                obtenerValorAuto(),
                obtenerValorMensualPrest());
        
        return cadenaFinal;
    }
}
