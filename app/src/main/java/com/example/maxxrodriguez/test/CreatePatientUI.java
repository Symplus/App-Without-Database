package com.example.maxxrodriguez.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CreatePatientUI extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_patient_ui);
        Report.initList();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_patient_ui, menu);
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
    public void createPatient(View view) //ignore everything above this line, this method takes you to the next activity on button press
    {
        Intent intent = new Intent(this, PatientHomePageActivity.class); //All of this code extracts the data the user will write in the text fields
        EditText editText = (EditText) findViewById(R.id.FnLtext);
        String name = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.dobText);
        String dob = editText.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.docIDText);
        String docID = editText.getText().toString();
        EditText editText4 = (EditText) findViewById(R.id.emailText);
        String email = editText.getText().toString();
        EditText editText5 = (EditText) findViewById(R.id.passwordText);
        String password = editText.getText().toString();

        Patient newPatient = new Patient(name,dob,docID,email,password);
        Patient.addPatient(newPatient);
        MainActivity.addToPatientMap(newPatient,Report.getReports());
        finish();
        startActivity(intent);
    }
}
