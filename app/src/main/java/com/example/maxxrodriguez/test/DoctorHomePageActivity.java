package com.example.maxxrodriguez.test;

/**
 * Created by Corey on 3/29/2015.
 */

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class DoctorHomePageActivity extends ActionBarActivity{




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_page);

        // Construct the data source
        ArrayList<Patient> arrayOfUsers = Patient.getPatients();
        // Create the adapter to convert the array to views
        PatientsAdapter adapter = new PatientsAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView1 = (ListView)findViewById(R.id.listView);
        listView1.setAdapter(adapter);

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

}

