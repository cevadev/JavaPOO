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
public class Nurse extends User{
    private String speciality;
    
    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showUserData() {
        System.out.println("Empleado del Hospital: San Rafael");
        System.out.println("Departamento: Oncologia");
    }
    
}
