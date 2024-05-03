package com.hospitaldatasystem.hospital.service;

import com.hospitaldatasystem.hospital.model.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.*;
import java.util.ArrayList;

@Service
public class AddPatientInfo implements AddPatientInfoInterface {

    @Override
    public ArrayList addPatientInfo(Patient p1) throws SQLException {
        ArrayList ar = new ArrayList<>();

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement st = con.createStatement();
        String SQLquery = String.format("insert into hospital.patients values(%d,'%s',%d,%d)", p1.getPatientid(), p1.getPatientname(), p1.getPatientage(), p1.getPatientdiag());
        st.executeUpdate(SQLquery);

        ar.add(p1);


        return ar;

    }
}


