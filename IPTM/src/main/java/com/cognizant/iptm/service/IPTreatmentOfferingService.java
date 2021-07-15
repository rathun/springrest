package com.cognizant.iptm.service;
//
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cognizant.iptm.model.AilmentCategory;
import com.cognizant.iptm.model.IPTreatmentPackage;
import com.cognizant.iptm.model.PackageDetail;
import com.cognizant.iptm.model.SpecialistDetail;

//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cognizant.iptm.model.SpecialistDetail;
//import com.cognizant.iptm.repository.SpecialistDetailRepository;
//@Service
public interface IPTreatmentOfferingService {

	List<SpecialistDetail>findAllspecialist();
	List<IPTreatmentPackage> findAllpackage();
	SpecialistDetail addSpecialist(SpecialistDetail specialistDetail);
	//SpecialistDetail deleteSpecialist(int id);
	void deleteSpecialist(int id);
	List<SpecialistDetail>findSpecialistbyexpertise(AilmentCategory area);
	 void updatePackage(int packageid, PackageDetail packageDetail);
	//IPTreatmentPackage findPackagebyname(AilmentCategory ailment, String packagename);
	
	
}
