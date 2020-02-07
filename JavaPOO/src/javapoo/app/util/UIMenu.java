/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.util;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class UIMenu {
    //coleccion de meses siempre disponibles y accedidos desde cualquier lugar de la app
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            
    public static void showMenu()
    {
        System.out.println("Welcomen to my Appointmets");
        System.out.println("Select your option");
        int response = 0;
        do
        {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("3. Salir");
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            switch(response)
            {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    showPatientMenu();
                    break;
                case 3:
                    System.out.println("Thanks for visiting us");
                    break;
                default:
                    System.out.println("Select a correct option");
            }
        }
        while(response != 3);
    }
    
    public static void showPatientMenu()
    {
        int response = 0;
        do
        {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");
            
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            
            switch(response)
            {
                case 1:
                    System.out.println("::Book an apointment");
                    for (int i = 1; i < 4; i++) 
                    {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    System.out.println("Thanks for visiting us");
                    break;
                default:
                    System.out.println("Select a correct option");
            }
        }
        while(response != 0);
    }
    
    
}
