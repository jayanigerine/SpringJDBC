package com.hospitaldatasystem.hospital.service;

import com.hospitaldatasystem.hospital.model.Patient;
import org.springframework.stereotype.Service;

import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;
@Service
public class FetchPatientInfo implements FetchPatientInfoInterface{
    @Override
    public ArrayList fetchPatientInfo() throws SQLException {
        ResultSet rs=null;
        ArrayList ar =new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=hospital", "postgres", "postgres");
            Statement st = con.createStatement();
             rs = st.executeQuery("select * from patients");
            while (rs.next()) {
                Patient patient= new Patient();
                patient.setPatientid(rs.getInt("patientid"));
                patient.setPatientname(rs.getString("patientname"));
                patient.setPatientage(rs.getInt("patientage"));
                patient.setPatientdiag(rs.getInt("patientdiag"));
                ar.add(patient);
            }
        }catch(SQLException e){
                e.printStackTrace();
            }

        return ar;

    }
}
