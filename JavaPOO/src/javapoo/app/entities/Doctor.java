/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.app.entities;

/**
 *
 * @author PC
 */
public class Doctor {
    public static int id = 0; //autoincrement
    public String name;
    public String speciality;
    
    public Doctor()
    {
        System.out.println("Se ha construido el objeto Doctor: ");
        id++;
    }
    
    public Doctor(String name)
    {
        System.out.println("Se ha construido el objeto Doctor: " + name);
        this.name = name;
    }
    
    public void showName()
    {
        System.out.println("Doctor name: " + name);
    }
    
    public void showDoctorId()
    {
        System.out.println("ID Doctor: " + id);
    }
    
    
}
