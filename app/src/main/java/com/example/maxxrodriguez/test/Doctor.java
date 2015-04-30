package com.example.maxxrodriguez.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Corey on 3/29/2015.
 */
public class Doctor {
    public String name, dob, emailAddress, password, hospitalName = ""; //basic info for a doctor, results has not been implemented yet
    static ArrayList<Doctor> doctors;
    public int id;
    public int temp;
    Random randomID = new Random();

    public Doctor(String n, String birth, String email, String pass, String hospital) //constructor for the doctor
    {
        name = n;
        dob = birth;
        emailAddress = email;
        password = pass;
        hospitalName = hospital;
        id = randomID.nextInt(999 - 100 + 1) + 100;


    }
    public Doctor(){}

    public static void initListDoctor()
    {
        doctors = new ArrayList<Doctor>();
    } //initializes the array list for the doctors

    public static void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    } //adds a doctor to a doctor array list
}
