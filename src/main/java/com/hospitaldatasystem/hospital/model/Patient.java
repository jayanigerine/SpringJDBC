package com.hospitaldatasystem.hospital.model;

public class Patient {
    private int patientid;
    private int patientage;
    private int patientdiag;
    private String patientname;


    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getPatientage() {
        return patientage;
    }

    public void setPatientage(int patientage) {
        this.patientage = patientage;
    }

    public int getPatientdiag() {
        return patientdiag;
    }

    public void setPatientdiag(int patientdiag) {
        this.patientdiag = patientdiag;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }


}
