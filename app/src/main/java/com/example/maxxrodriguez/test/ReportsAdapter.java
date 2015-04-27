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
public class ReportsAdapter extends ArrayAdapter<Report> {

    public ReportsAdapter(Context context, ArrayList<Report> reports) {
        super(context, 0, reports);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Report newreport = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.report_list_item, parent, false);
        }
        // Lookup view for data population

        TextView nauseaLevel = (TextView) convertView.findViewById(R.id.nausea);
        TextView headacheLevel = (TextView) convertView.findViewById(R.id.headache);
        // Populate the data into the template view using the data object
        nauseaLevel.setText(Integer.toString(newreport.nausea));
        headacheLevel.setText(Integer.toString(newreport.headache));
        // Return the completed view to render on screen
        return convertView;
    }




}