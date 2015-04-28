package com.example.maxxrodriguez.test;

import java.util.ArrayList;

/**
 * Created by maxxrodriguez on 4/25/15.
 */
public class Report {

    static ArrayList<Report> reports;
    public int nausea, headache, chestpain, achiness, number =0;
    public static int num;

    public Report( int n, int h, int cp, int a)
    {
        number = num;
        nausea = n;
        headache = h;
        chestpain = cp;
        achiness = a;

    }
    public Report(){}

    public static void initList()
    {
        num = 1;
        reports = new ArrayList<Report>();
    }

    public static void setReports(ArrayList<Report> newReport)
    {
        reports = newReport;
    }

    public static ArrayList<Report> getReports() {

        return reports;
    }

    public static void addReport(Report report)
    {
        num++;
        reports.add(report);
    }
}