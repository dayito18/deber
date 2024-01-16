/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jeniffer;
import java.util.Scanner;

//import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Registro {
  public static void main(String[] args) {
        int n = 2;
        int m = 1;
        Estudiante[] estudiantes = new Estudiante[n];
        Persona[] personas = new Persona[m];
        Scanner scanner = new Scanner(System.in);
        
        // REGISTRO PERSONA
        for(int i=0;i<m;i++){
            System.out.println("================================");
            System.out.println("PERSONA " + (i+1));
            
            System.out.println("Nombre : ");
            String nombre = scanner.next();
            
            System.out.println("Edad : ");
            int edad = scanner.nextInt();
                 
            System.out.println("Email : ");
            String email = scanner.next();
                        
            Persona nuevaPersona = new Persona( nombre,edad,email);
            nuevaPersona.validarCampoEdad();
            nuevaPersona.validarCampoEmail();
            personas[i] = nuevaPersona;
        }
        
        // REGISTRO ESTUDIANTE
        for(int i=0;i<n;i++){
            System.out.println("================================");
            System.out.println("ESTUDIANTE " + (i+1));
            
            System.out.println("Nombre : ");
            String nombre = scanner.next();
            
            System.out.println("Edad : ");
            int edad = scanner.nextInt();
            
            System.out.println("Nivel : ");
            int nivel = scanner.nextInt();
            
            System.out.println("Carrera : ");
            String carrera = scanner.next();
            
            System.out.println("Email : ");
            String email = scanner.next();
            
            Estudiante nuevoEstudiante = new Estudiante( nombre, edad,nivel,carrera, email);
            nuevoEstudiante.validarCampoEdad();
            nuevoEstudiante.validarCampoEmail();
            estudiantes[i] = nuevoEstudiante;
        }
        
        // ESTUDIANTE
        System.out.println("ESTUDIANTE");
        for(Estudiante estudiante:estudiantes){
           System.out.print("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() +
                     ", Nivel: " + estudiante.getNivel() +
                     ", Carrera: " + estudiante.getCarrea() +
                     ", Email: " + estudiante.getEmail()
           );
           System.out.println();
        }
        
    }
}
