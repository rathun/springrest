package com.cognizant.iptm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.iptm.model.TreatmentPlan;
import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.iptm.model.AilmentCategory;
public interface TreatmentPlanRepository extends JpaRepository<TreatmentPlan, Integer> {

}
