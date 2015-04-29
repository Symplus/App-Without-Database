package com.example.maxxrodriguez.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


public class PatientHomePageActivity extends ActionBarActivity {

    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home_page);

        // Construct the data source
        ArrayList<Report> arrayOfReports = PatientLoginActivity.current;         //ArrayList<Report> arrayOfReports = Report.getReports();


        // Create the adapter to convert the array to views
        ReportsAdapter adapter = new ReportsAdapter(this, arrayOfReports);
        // Attach the adapter to a ListView
        ListView listView2 = (ListView)findViewById(R.id.listView2);
        listView2.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_patient_home_page, menu);
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

    public void report(View view)
    {
        Intent intent = new Intent(this, ReportActivity.class);
        startActivityForResult(intent,1);
        finish();
    }

    //@Override
    /*protected void onActivityResult(Intent data) {
     // Check which request we're responding to
     if (requestCode == PICK_CONTACT_REQUEST) {
     // Make sure the request was successful
     if (resultCode == RESULT_OK) {
     // The user picked a contact.
     // The Intent's data Uri identifies which contact was selected.
     }*/
}
