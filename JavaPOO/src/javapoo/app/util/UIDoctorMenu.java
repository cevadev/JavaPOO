/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.util;

import java.util.ArrayList;
import java.util.Scanner;
import javapoo.app.entities.Doctor;

/**
 *
 * @author PC
 */
public class UIDoctorMenu {
    
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    
    public static void showDoctorMenu()
    {
        int response = 0;
        do
        {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment"); //doctor define las fechas disponible
            System.out.println("2. My schedule appointments");
            System.out.println("0. logout");
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            switch(response)
            {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
            }
        }
        while(response != 0);
    }
    
    public static void showAddAvailableAppointmentsMenu()
    {
        int response = 0;
        do
        {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println("::: Select a month");
            for(int i = 0; i < 3; i++)
            {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            if(response > 0 && response < 4)
            {
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected - 1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = input.nextLine();
                System.out.println("Your date is: " + date + " \n1. Correct \n2. Change date");
                int responseDate = Integer.valueOf(input.nextLine());
                if(responseDate == 2) continue;
                
                int responseTime = 0;
                String time;
                do
                {
                    System.out.println("Insert the time available for date " + date + " [16:00]");
                    time = input.nextLine();
                    System.out.println("Your time is " + time + " \n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(input.nextLine());
                }
                while(responseTime == 2); //muestra solo el fragmento de insertar time
                UIMenu.doctorLogged.addAvalableAppoinment(date, time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);
            }
            else if(response == 0)
            {
                showDoctorMenu();
            }
        }
        while(response != 0);
    }
    
    private static void checkDoctorAvailableAppointment(Doctor doctor)
    {
        if(doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor))
        {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
