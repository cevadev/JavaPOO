/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.util;

import java.util.ArrayList;
import java.util.Scanner;
import javapoo.app.entities.Doctor;
import javapoo.app.entities.Patient;

/**
 *
 * @author PC
 */
public class UIMenu {
    //coleccion de meses siempre disponibles y accedidos desde cualquier lugar de la app
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    
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
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
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
    
    private static void authUser(int userType)
    {
        //userType = 1 -> Doctor
        //userType = 2 -> Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "a.martinez@gmail.com", "Oncologia"));
        doctors.add(new Doctor("Karen Sosa", "k.sosa@gmail.com", "Pedriatia"));
        doctors.add(new Doctor("Rocio Gomez", "r.gomez@gmail.com", "Oncologia"));
        
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi Salgado", "a.salgado@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "r.rodriguez@gmail.com"));
        patients.add(new Patient("Carlos Sanchez", "c.sanchez@gmail.com"));
        
        boolean emailCorrect = false;
        do
        {
            System.out.println("Insert your email...[a@a.com]");
            Scanner input = new Scanner(System.in);
            String email = input.nextLine();
            if(userType == 1)
            {
                for(Doctor d : doctors)
                {
                    if(d.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            
            if(userType == 2)
            {
                for(Patient p : patients)
                {
                    if(p.getEmail().equals(email))
                    {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }
        while(!emailCorrect);
    }
}
