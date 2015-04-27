package com.example.maxxrodriguez.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.app.Activity;
import java.util.ArrayList;

/**
 * Created by Corey on 4/26/2015.
 */
public class PatientsAdapter extends ArrayAdapter<Patient> {

    public PatientsAdapter(Context context, ArrayList<Patient> patients) {
        super(context, 0, patients);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Patient newpatient = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.patient_list_item, parent, false);
        }
        // Lookup view for data population

        TextView patientName = (TextView) convertView.findViewById(R.id.patient_name);
        // Populate the data into the template view using the data object
        patientName.setText(newpatient.name);
        // Return the completed view to render on screen
        return convertView;
    }




}