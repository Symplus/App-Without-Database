package com.example.maxxrodriguez.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PathEffect;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity{

    public static Map<Patient,ArrayList<Report>> PatientMap; //will have patients and their reports
    public static Map<Doctor,ArrayList<Patient>> DoctorMap; // will have doctors and patient names


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Patient.initListPatient();
        Doctor.initListDoctor();
        mapInit();

    }
    public void patientLogin(View view) //ignore everything above this line, this method takes you to the next activity on button press
    {
       Intent intent = new Intent(this, PatientLoginActivity.class);
       startActivity(intent);
    }

    public void doctorLogin(View view)
    {
        Intent intent = new Intent(this, DoctorLoginActivity.class);
        startActivity(intent);
    }

    public void mapInit()
    {
        PatientMap = new HashMap<Patient,ArrayList<Report>>(); //will have patients and their reports
        DoctorMap = new HashMap<Doctor,ArrayList<Patient>>(); // will have doctors and patient names

    }
    public static void addToPatientMap(Patient patient, ArrayList<Report> reports)
    {
        PatientMap.put(patient,reports);
    }

    public static void addToDoctorMap(Doctor doctor, ArrayList<Patient> patients)
    {
        DoctorMap.put(doctor,patients);
    }
}
