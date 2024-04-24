package com.crudjsp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudjsp.dto.LeadDto;
import com.crudjsp.entity.Lead;
import com.crudjsp.repository.LeadRepository;
import com.crudjsp.service.LeadService;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepository;

	@Override
	public void saveLead(LeadDto leadDto) {
		Lead lead = new Lead();
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		leadRepository.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepository.findAll();
		return leads;
	}

	@Override
	public void deleteById(long id) {
		leadRepository.deleteById(id);
	}

	@Override
	public Lead findLeadById(long id) {
		Lead lead = leadRepository.findById(id).get();
		return lead;
	}

	@Override
	public void updateLead(LeadDto leadDto) {
		Lead lead = new Lead();
		lead.setId(leadDto.getId());
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		leadRepository.save(lead);
		
	}

}
