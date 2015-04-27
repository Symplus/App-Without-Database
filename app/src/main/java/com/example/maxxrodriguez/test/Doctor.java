package com.example.maxxrodriguez.test;

/**
 * Created by Corey on 3/29/2015.
 */
public class Doctor {
    private String name, dob, emailAddress, password, hospitalName = ""; //basic info for a doctor, results has not been implemented yet

    public Doctor(String n, String birth, String email, String pass, String hospital) //Create doctor
    {
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;
        hospitalName = hospital;

    }
}
