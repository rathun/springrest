package com.cognizant.iptm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.iptm.model.AilmentCategory;
import com.cognizant.iptm.model.IPTreatmentPackage;

@Repository
public interface IPTreatmentPackageRepository extends JpaRepository<IPTreatmentPackage, Integer> {

}
