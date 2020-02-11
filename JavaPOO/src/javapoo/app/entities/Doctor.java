/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void addAvalableAppoinment(String date, String time)
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
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        public AvailableAppointment(String date, String time)
        {
            this.time = time;
            try 
            {
                this.date = format.parse(date);
            } 
            catch (ParseException ex) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public int getId_availableAppoinment() {
            return id_availableAppoinment;
        }

        public void setId_availableAppoinment(int id_availableAppoinment) {
            this.id_availableAppoinment = id_availableAppoinment;
        }

        public Date getDate(String DATE) {
            return date;
        }
        
        public String getDateStr()
        {
            return format.format(date);
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
