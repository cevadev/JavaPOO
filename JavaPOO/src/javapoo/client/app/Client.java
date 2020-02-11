/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.client.app;

import java.util.Date;
import javapoo.app.entities.Doctor;
import javapoo.app.entities.Patient;
import javapoo.app.entities.User;
import static javapoo.app.util.UIMenu.*;

/**
 *
 * @author PC
 */
public class Client {
    public static void main(String[] args) {
        showMenu();
        /*
        User user = new Doctor("Juan Jose Mendez", "jmendez@sanfelipe.com.ar", "Oncologia");
        user.showUserData();
        
        //Ejemplo de clase anonima
        User user1 = new User("Juan Gonzalez", "jgonzalez@gmail.com") {
            @Override
            public void showUserData() {
                System.out.println("Recepcionista en el hospital San Felipe");
                System.out.println("Departamento Administracion");
            }
        };
        user1.showUserData();
        */
        
        //showMenu();
        /*
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());
        patient.setWeight(60);
        patient.setHeight(1.65);
        System.out.println(patient.getWeight());
        System.out.println(patient.getHeight());
        */
        
        /*
        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@gmail.com", "Pediatra");
        myDoctor.addAvalableAppoinment(new Date(), "10hs");
        myDoctor.addAvalableAppoinment(new Date(), "12hs");
        myDoctor.addAvalableAppoinment(new Date(), "15hs");
        myDoctor.addAvalableAppoinment(new Date(), "18hs");
        System.out.println(myDoctor);
        */
        
        /*
        for(Doctor.AvailableAppointment i : myDoctor.getAvailableAppointments())
        {
            System.out.println("Anahi Salgado - cita: " + i.getDate() + " hora: " + i.getTime());
        }
        */
        
        /*
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);
        */
    }
}
