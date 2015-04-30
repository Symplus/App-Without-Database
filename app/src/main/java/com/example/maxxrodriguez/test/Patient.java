package com.example.maxxrodriguez.test;

/**
 * Created by maxxrodriguez on 3/24/15.
 */

import java.util.ArrayList;

public class Patient {

    public String name, dob, emailAddress, password = ""; //basic info for a patient, results has not been implemented yet
    static ArrayList<Patient> patients;
    int docID= 0;


    public Patient(String n, String birth, String email, String pass) //DocId not provided
    {
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;
        docID = 0;

    }

    public Patient(String n, String birth, String doc, String email, String pass) //All info is present
    {
        name = n;
        dob = birth;
        docID = Integer.parseInt(doc);
        emailAddress = email;
        password = pass;

    }

    public Patient(String n) {
        name = n;
    }

    public Patient() {
    }

    public static void initListPatient()
    {
        patients = new ArrayList<Patient>();
    }

    public static ArrayList<Patient> getPatients() {

        return patients;
    }

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }
}
