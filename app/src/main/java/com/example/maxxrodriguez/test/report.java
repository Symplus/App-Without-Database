package com.example.maxxrodriguez.test;

import java.util.ArrayList;

/**
 * Created by maxxrodriguez on 4/25/15.
 */
public class Report {

    static ArrayList<Report> reports;
    public int nausea, headache, chestpain, achiness, number =0;
    public static int num;

    public Report( int n, int h, int cp, int a) //new report object
    {
        number = num;
        nausea = n;
        headache = h;
        chestpain = cp;
        achiness = a;

    }
    public Report(){}

    public static void initList() //creates a new array list for the reports
    {
        num = 1;
        reports = new ArrayList<Report>();
    }

    public static void setReports(ArrayList<Report> newReport)   //sets an arraylist of reports to another list of reports

    {
        reports = newReport;
    }
    public static ArrayList<Report> getReports() { //fetches the array \list of reports

        return reports;
    }

    public static void addReport(Report report, ArrayList<Report> patientReports) //adds a report object to a specific array lists
    {
        num++;
        patientReports.add(report);
    }
}