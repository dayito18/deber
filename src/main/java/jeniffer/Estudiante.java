package jeniffer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private int nivel;
    private String carrea;
    private String email;
   
    //CONSTRUCTOR
    public Estudiante(String nombre, int edad, int nivel, String carrea, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.carrea = carrea;
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
        if (this.email == null || this.email.equals("null")) {
            this.email = "email no proporcionado";
        }
    return this.email;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivel() {
        return nivel;
    }

    public String getCarrea() {
        return carrea;
    }

    public String getEmail() {
        return email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
