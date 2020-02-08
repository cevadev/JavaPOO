/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.client.app;

import javapoo.app.entities.Doctor;
import javapoo.app.entities.Patient;
import static javapoo.app.util.UIMenu.*;

/**
 *
 * @author PC
 */
public class Client {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Antonio Perez", "Pediatria");
        System.out.println(myDoctor.speciality);
        
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());
        patient.setWeight(60);
        patient.setHeight(1.65);
        System.out.println(patient.getWeight());
        System.out.println(patient.getHeight());
    }
}
