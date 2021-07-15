package com.cognizant.iptm.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.iptm.model.AilmentCategory;
import com.cognizant.iptm.model.IPTreatmentPackage;
import com.cognizant.iptm.model.PackageDetail;
import com.cognizant.iptm.model.SpecialistDetail;
import com.cognizant.iptm.repository.IPTreatmentPackageRepository;
import com.cognizant.iptm.repository.PackageDetailRepository;
import com.cognizant.iptm.repository.SpecialistDetailRepository;
import com.cognizant.iptm.repository.TreatmentPlanRepository;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;




@Service
public  class IPTreatmentOfferingServiceImpl implements IPTreatmentOfferingService {

	@Autowired
	SpecialistDetailRepository specialistDetailRepository;
	
	@Autowired
	IPTreatmentPackageRepository ipTreatmentPackageRepository;
	
	@Autowired
	PackageDetailRepository packageDetailRepository;
	
	
	@Override
	public List<SpecialistDetail> findAllspecialist() {
		
		return specialistDetailRepository.findAll();
	}

	@Override
	public List<IPTreatmentPackage> findAllpackage() {
		
		return ipTreatmentPackageRepository.findAll();
	}

	@Override
	public SpecialistDetail addSpecialist(SpecialistDetail specialistDetail) {
		// TODO Auto-generated method stub
		return specialistDetailRepository.save(specialistDetail);
	}

	@Override
	public void deleteSpecialist(int id) {
		// TODO Auto-generated method stub
		 specialistDetailRepository.deleteById(id);
	}

	@Override
	public List<SpecialistDetail> findSpecialistbyexpertise(AilmentCategory area) {
		// TODO Auto-generated method stub
		return specialistDetailRepository.findByAreaOfExpertise(area);
	}

	@Override
	public void updatePackage(int packageid, PackageDetail packageDetail) {
		// TODO Auto-generated method stub
		Optional<PackageDetail> packagedetailopt=packageDetailRepository.findById(packageid);
		if(packagedetailopt.isPresent())
		{
			packageDetailRepository.save(packageDetail);
		}
	}

	
	
	
}
