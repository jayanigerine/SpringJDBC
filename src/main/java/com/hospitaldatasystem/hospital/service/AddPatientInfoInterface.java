package com.hospitaldatasystem.hospital.service;

import com.hospitaldatasystem.hospital.model.Patient;

import java.util.ArrayList;
import java.sql.*;

public interface AddPatientInfoInterface {
    public ArrayList addPatientInfo(Patient patient)throws SQLException;



}
