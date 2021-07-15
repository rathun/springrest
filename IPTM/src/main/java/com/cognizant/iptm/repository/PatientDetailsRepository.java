package com.cognizant.iptm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.iptm.model.PatientDetails;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, String> {

}
