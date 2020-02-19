/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velas;

/**
 *
 * @author demen
 */
        import java.util.Scanner;
public class Velas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner d= new Scanner(System.in);
        soplar j = new soplar();
        int edad;
        System.out.println("Programa que sopla las velas mas altas de un pastel de cumpleaños");     
        System.out.println("\nIngrese la edad de la persona que cumple años\t");
        edad = d.nextInt();
        j.velas1(edad);
        j.Altura1();
        j.caltura2();
        j.Offvelas();
        
    }
    
}
    
    

