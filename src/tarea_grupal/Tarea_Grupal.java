/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_grupal;

import Helpers.Deportista;
import Helpers.Doctor;

/**
 *
 * @author Odalis Rivas
 */
public class Tarea_Grupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
         Doctor doctor = new Doctor(); 
         Deportista deportista = new Deportista();
      
        
        System.out.println(doctor.setinformacionforma());
        doctor.imprimirinformacionDoctor();
        System.out.println("\n");
        
        System.out.println(deportista.setinformacionforma());
        deportista.imprimirinformacionDeportista();
        System.out.println("\n");
        
    }
    }
