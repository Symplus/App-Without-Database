package com.example.maxxrodriguez.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ExistingDoctorUI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_doctor_ui);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_existing_doctor_ui, menu);
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
    public void loginDoctor(View v)
    {
        EditText editText1 = (EditText) findViewById(R.id.existingDoctorName);
        EditText editText2 = (EditText) findViewById(R.id.existingDoctorPassword);

        String name = editText1.getText().toString();
        String password = editText2.getText().toString();

        if(Doctor.doctors.size() == 0)
        {
            Toast.makeText(getApplicationContext(), "Name and/or Password is Incorrect ", Toast.LENGTH_LONG).show();
        }
        else
        {
            for(int i = 0; i < Doctor.doctors.size(); i++)
            {
                if(name.compareTo(Doctor.doctors.get(i).name) == 0 )
                {
                    if (password.compareTo(Doctor.doctors.get(i).password) == 0 )
                    {
                        /*if(MainActivity.PatientMap.containsKey(Doctor.doctors.get(i)))
                        {
                            PatientLoginActivity.current = MainActivity.PatientMap.get(Patient.patients.get(i));
                        }*/
                        DoctorLoginActivity.currentDoctor = Doctor.doctors.get(i);
                        DoctorLoginActivity.currentID = Doctor.doctors.get(i).id;
                        Intent intent = new Intent(this, DoctorHomePageActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Name and/or Password is Incorrect ", Toast.LENGTH_LONG).show();
                    }
                }

            }

        }


    }
}
