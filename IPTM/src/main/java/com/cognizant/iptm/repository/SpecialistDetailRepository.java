package com.cognizant.iptm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.iptm.model.AilmentCategory;
import com.cognizant.iptm.model.SpecialistDetail;
@Repository
public interface SpecialistDetailRepository extends JpaRepository<SpecialistDetail,Integer> {

	List<SpecialistDetail> findByAreaOfExpertise(AilmentCategory area);

	
	
}
