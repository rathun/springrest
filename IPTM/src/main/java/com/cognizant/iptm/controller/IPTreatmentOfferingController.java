package com.cognizant.iptm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.iptm.model.AilmentCategory;
import com.cognizant.iptm.model.IPTreatmentPackage;
import com.cognizant.iptm.model.PackageDetail;
import com.cognizant.iptm.model.SpecialistDetail;
import com.cognizant.iptm.repository.SpecialistDetailRepository;
import com.cognizant.iptm.service.IPTreatmentOfferingService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/specialist")
public class IPTreatmentOfferingController {

	@Autowired
	private IPTreatmentOfferingService ipTreatmentOfferingService;
	
	
	@GetMapping("/getspecialist")
	public List<SpecialistDetail> getAllSpecialist()
	{
		return ipTreatmentOfferingService.findAllspecialist();
	}

		
	@PostMapping("/addspecialist")
	public ResponseEntity<SpecialistDetail>addSpecialist(@RequestBody SpecialistDetail specialistDetail)
	{
		 ipTreatmentOfferingService.addSpecialist(specialistDetail);
		 return new ResponseEntity<SpecialistDetail>(specialistDetail,HttpStatus.OK);
	}
	@GetMapping("/iptreatmentpackage")
	public List<IPTreatmentPackage> getAlltreatmentpackage()
	{
		return ipTreatmentOfferingService.findAllpackage();
	}
	@DeleteMapping("/deletespecialist/{id}")
	public ResponseEntity<String> deleteSpecialist(@PathVariable("id") int id)
	{
		 ipTreatmentOfferingService.deleteSpecialist(id);
		 return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
	@GetMapping("/specialistbyexpertise/{area}")
	public List<SpecialistDetail>getSpecialistByExpertise(@PathVariable AilmentCategory area)
	{
		return ipTreatmentOfferingService.findSpecialistbyexpertise(area);
	}
	@PutMapping("/updatepackage/{packageid}")
	public ResponseEntity<String> updatepackagedetail(@PathVariable int packageid,@RequestBody PackageDetail packageDetail)
	{
		ipTreatmentOfferingService.updatePackage(packageid,packageDetail);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	
	
}
