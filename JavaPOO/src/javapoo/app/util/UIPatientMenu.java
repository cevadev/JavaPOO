/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.util;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javapoo.app.entities.Doctor;

/**
 *
 * @author PC
 */
public class UIPatientMenu {
    public static void showPatientMenu()
    {
        int response = 0;
        do
        {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments"); 
            System.out.println("0. Logout");
            
            Scanner input = new Scanner(System.in);
            response = Integer.valueOf(input.nextLine());
            
            switch(response)
            {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }
        while(response != 0);
    }
    
    private static void showBookAppointmentMenu()
    {
        int response = 0;
        do
        {
            System.out.println("::Book an appointment");
            //Numeracion de la lista de fechas
            //indice de la fecha seleccionada
            // [doctors]
            // - doctor1
            // --- 1. cita1
            // --- 2. cita2
            // - doctor2
            // -- array de citas
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) 
            {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = 
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDateStr());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(k, doctorAppointments);
                }
            }
            Scanner input = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(input.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "", "");
            for(Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet())
            {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println(doctorSelected.getName() + 
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDateStr() + 
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(input.nextLine());
            
            if(response == 1)
            {
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected, 
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), 
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }
        }
        while(response != 0);
    }
    
    private static void showPatientMyAppointments()
    {
        int response = 0;
        do
        {
            System.out.println("::My Appointments");
            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0)
            {
                System.out.println("Do not have appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) 
            {
                int j = i + 1;
                System.out.println(j + ". " + 
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + 
                        "\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor());
            }
            System.out.println("0. Return");
        }
        while(response !=0);
    }
}
