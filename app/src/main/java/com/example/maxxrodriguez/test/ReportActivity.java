package com.example.maxxrodriguez.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;




public class ReportActivity extends ActionBarActivity {

    public SeekBar seekBar1;
    public SeekBar seekBar2;
    public SeekBar seekBar3;
    public SeekBar seekBar4;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    int progress1, progress2, progress3, progress4 = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        initializeVariables();
        // Initialize the textview with '0'

        textView1.setText("Pain Level: " + seekBar1.getProgress()); //these settext assignments show the the current number that the slider is on
        textView2.setText("Pain Level: " + seekBar2.getProgress());
        textView3.setText("Pain Level: " + seekBar3.getProgress());
        textView4.setText("Pain Level: " + seekBar4.getProgress());

        seekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress1 = progressValue;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView1.setText("Pain Level: " + progress1);
            }
        });

        seekBar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress2 = progressValue;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView2.setText("Pain Level: " + progress2);
            }
        });

        seekBar3.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress3 = progressValue;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView3.setText("Pain Level: " + progress3);
            }
        });

        seekBar4.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress4 = progressValue;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView4.setText("Pain Level: " + progress4);
            }
        });
    }
    private void initializeVariables() { //variable initialization for the textviews and the sliders
        seekBar1 = (SeekBar) findViewById(R.id.seekBar);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar4 = (SeekBar) findViewById(R.id.seekBar4);
        textView1 = (TextView) findViewById(R.id.yourChoice1);
        textView2 = (TextView) findViewById(R.id.yourChoice2);
        textView3 = (TextView) findViewById(R.id.yourChoice3);
        textView4 = (TextView) findViewById(R.id.yourChoice4);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_report, menu);
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


    public void activityFinish(View view)
    {
        Intent intent = new Intent(this, PatientHomePageActivity.class);
        Report newReport = new Report( progress1, progress2, progress3, progress4);
        Report.addReport(newReport,CreatePatientUI.patientReports);
        PatientLoginActivity.current = CreatePatientUI.patientReports;
        finish();
        startActivity(intent);
    }
}
