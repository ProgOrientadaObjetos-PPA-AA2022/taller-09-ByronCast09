/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author USUARIO 2020
 */
public class Persona {
    String nombre;
    String Apellido;
    String Username;
    
    public Persona(String n,String a, String us){
        nombre = n;
        Apellido = a;
        Username = us;
    }
    public void establecerNombre(String perso){
        nombre = perso;
    }
    public void establecerApellido(String apelli){
        Apellido = apelli;
    }
    public void establecerUsername(String userna){
        Username = userna;
    }
    //-------------------------------------------------------
    public String obtenerPersona(){
        return nombre;
    }
    public String obtenerApellido(){
        return Apellido;
    }
    public String obtenerUsername(){
        return Username;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                nombre,
                Apellido,
                Username);
        return cadena;
    }
}
