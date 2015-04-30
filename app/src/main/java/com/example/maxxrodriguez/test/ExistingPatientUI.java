package com.example.maxxrodriguez.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ExistingPatientUI extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_patient_ui);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_existing_patient_ui, menu);
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

    public void loginPatient(View v )
    {
        EditText editText1 = (EditText) findViewById(R.id.existingName); //gets the name from the textbox 
        EditText editText2 = (EditText) findViewById(R.id.existingPassword); //gets the password from the text box

        String name = editText1.getText().toString();
        String password = editText2.getText().toString();

        if(Patient.patients.size() == 0) // if the patient array list is 0 show a mesaage on the screen and do not let them log in
        {
            Toast.makeText(getApplicationContext(), "Name and/or Password is Incorrect ", Toast.LENGTH_LONG).show();
        }
        else // else loop through the list and search for the patient object
        {
            for(int i = 0; i < Patient.patients.size(); i++) // 
            {
                if(name.compareTo(Patient.patients.get(i).name) == 0 )
                {
                    if (password.compareTo(Patient.patients.get(i).password) == 0 )
                    {
                        if(MainActivity.PatientMap.containsKey(Patient.patients.get(i)))
                        {
                           PatientLoginActivity.current = MainActivity.PatientMap.get(Patient.patients.get(i));
                        }

                        Intent intent = new Intent(this, PatientHomePageActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else //if the patient object not found send a messagte to the user
                    {
                        Toast.makeText(getApplicationContext(), "Name and/or Password is Incorrect ", Toast.LENGTH_LONG).show();
                    }
                }

            }

        }


    }



}
