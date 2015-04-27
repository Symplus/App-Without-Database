package com.example.maxxrodriguez.test;

import java.util.ArrayList;

/**
 * Created by maxxrodriguez on 4/25/15.
 */
public class Report {

    public int nausea, headache, chestpain, achiness, number, counter = 0;
    public String n, head = "";

    public Report(int n, int h, int cp, int a)
    {
        number = 0;
        nausea = n;
        headache = h;
        chestpain = cp;
        achiness = a;
    }
    public Report(int nd, int hd)
    {
        nausea = nd;
        headache = hd;
    }
    public Report(){}


    public static ArrayList<Report> getReports() {
        ArrayList<Report> reports = new ArrayList<Report>();

        reports.add(new Report(4,3));

        return reports;
    }

}
