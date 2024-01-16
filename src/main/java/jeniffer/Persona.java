/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeniffer;

/**
 *
 * @author dell
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
   
    //CONSTRUCTOR
    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
    //VALIDATION
    public int validarCampoEdad(){
        if(this.edad>0){
            int edad = this.edad;
            return edad;
        }else{
            this.edad = -1;
            return this.edad;
        }
    }
    
    public String validarCampoEmail(){
        if (this.email == null) {
            this.email = "email no proporcionado";
        }
        return this.email;
    }
}
