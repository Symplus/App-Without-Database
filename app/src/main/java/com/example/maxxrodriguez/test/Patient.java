package com.example.maxxrodriguez.test;

/**
 * Created by maxxrodriguez on 3/24/15.
 */

import java.util.ArrayList;

public class Patient {

    public String name, dob, emailAddress, docID, password = ""; //basic info for a patient, results has not been implemented yet

    public Patient(String n, String birth, String email, String pass) //DocId not provided
    {
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;

    }

    public Patient(String n, String birth, String doc, String email, String pass) //All info is present
    {
        name = n;
        dob = birth;
        docID = doc;
        emailAddress = email;
        password = pass;

    }

    public Patient(String n)
    {
        name = n;
    }

    public Patient(){}

    public static ArrayList<Patient> getPatients() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        for(int i= 0; i<50 ; i++)
        {
            patients.add(new Patient("Harry"+i));
        }
        return patients;
    }
}
