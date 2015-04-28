package com.example.maxxrodriguez.test;

/**
 * Created by Corey on 3/29/2015.
 */

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class DoctorHomePageActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    ArrayList<Patient> arrayOfPatients;
    static ArrayList<Report> currentReports;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_page);
        init();

        // Construct the data source

        // Create the adapter to convert the array to views
        PatientsAdapter adapter = new PatientsAdapter(this, arrayOfPatients);
        // Attach the adapter to a ListView
        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(this);

      //  listView1.setOnItemClickListener(new OnItemClickListener(){


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_doctor_home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this,patient_reports.class);

        Toast.makeText(getApplicationContext(),"Position: "+position,Toast.LENGTH_LONG).show();

        if(MainActivity.PatientMap.containsKey(arrayOfPatients.get(position)))
        {
            currentReports = MainActivity.PatientMap.get(arrayOfPatients.get(position));
        }

        startActivity(intent);
    }

    public void init()
    {
        arrayOfPatients = Patient.getPatients();
        currentReports = new ArrayList<Report>();
    }

}

