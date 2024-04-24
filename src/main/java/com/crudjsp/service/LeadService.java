package com.crudjsp.service;

import java.util.List;

import com.crudjsp.dto.LeadDto;
import com.crudjsp.entity.Lead;

public interface LeadService {

	void saveLead(LeadDto leadDto);
	List<Lead> getAllLeads();
	void deleteById(long id);
	Lead findLeadById(long id);
	void updateLead(LeadDto leadDto);

}
