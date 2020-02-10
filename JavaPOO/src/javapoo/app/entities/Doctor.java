/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Doctor extends User{
    
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    
    public Doctor(String name, String email, String speciality)
    {
        super(name, email);
        this.speciality = speciality;
    }
    
    public void showName()
    {
        System.out.println("Doctor name: " + super.getName());
    }
    
    public void showDoctorId()
    {
        System.out.println("ID Doctor: " +super.getId());
    }
    
    public void addAvalableAppoinment(Date date, String time)
    {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + " \nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showUserData() {
        System.out.println("Empleado del Hospital: San Felipe");
        System.out.println("Departamento: Oncologia");
    }
    
    
    public static class AvailableAppointment
    {
        private int id_availableAppoinment;
        private Date date;
        private String time;
        
        public AvailableAppointment(Date date, String time)
        {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppoinment() {
            return id_availableAppoinment;
        }

        public void setId_availableAppoinment(int id_availableAppoinment) {
            this.id_availableAppoinment = id_availableAppoinment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available appoinments \nDate: " + date + " \nTime: " + time; //To change body of generated methods, choose Tools | Templates.
        }
    }
}
