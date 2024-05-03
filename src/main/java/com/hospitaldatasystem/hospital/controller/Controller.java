package com.hospitaldatasystem.hospital.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.hospitaldatasystem.hospital.model.Patient;
import com.hospitaldatasystem.hospital.service.AddPatientInfoInterface;
import com.hospitaldatasystem.hospital.service.FetchPatientInfoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class Controller {
    @Autowired
    FetchPatientInfoInterface fetchPatientInfoInterface;
    @Autowired
    AddPatientInfoInterface addPatientInfoInterface;

    @GetMapping("/Patientlist/")
    public String displayPatients() throws SQLException, JsonProcessingException {
        ArrayList ar= fetchPatientInfoInterface.fetchPatientInfo();
        ObjectWriter ow= new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json= ow.writeValueAsString(ar);
        return json;
    }

    @PostMapping("/NewPatientlist")
    public String showNewPatient(@RequestBody Patient patient) throws SQLException, JsonProcessingException {
        ArrayList ar= addPatientInfoInterface.addPatientInfo(patient);
        ObjectWriter ow= new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json1= ow.writeValueAsString(ar);
        return json1;
    }

}
