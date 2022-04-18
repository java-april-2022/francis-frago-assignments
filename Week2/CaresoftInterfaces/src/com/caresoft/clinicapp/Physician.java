package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // Constructor that takes an ID
    public Physician(Integer id) {
    	super(id);
//    	this.patientNotes = patientNotes;
    }
    
    // Implement HIPAACompliantUser!	
    public void newPatientNotes(String notes, String patientName, Date date) {
    	String report = String.format(
    			"Datetime Submitted: %s \n", date);
    	report += String.format("Reported By ID: %s\n", this.id);
    	report += String.format("Patient Name: %s\n", patientName);
    	report += String.format("Notes: %s \n", notes);
    	this.patientNotes.add(report);
    }

    @Override
    public boolean assignPin(int pin) {
    	// Auto-generated method stub
    	if(pin< 0001|| pin> 9999) {
    		return false;
    		}
    		else{
    		this.pin= pin;
    	return true;
    		}
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	// Auto-generated method stub
    	if(this.id == confirmedAuthID) {
    		return true;
    	}
    	else {
    		return false;    		
    	}
    }
        
	// Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
