package com.crudjsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudjsp.dto.LeadDto;
import com.crudjsp.entity.Lead;
import com.crudjsp.service.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;

	@RequestMapping("/viewLeadForm")
	public String viewLeadForm() {
		return "create_lead";
	}

	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute LeadDto leadDto, Model model) {
		leadService.saveLead(leadDto);
		model.addAttribute("msg", "lead is saved!!");
		return "redirect:viewLeadForm";
	}

	@GetMapping("/listLeads")
	public String getAllLeads(ModelMap model) {
		List<Lead> lead = leadService.getAllLeads();
		model.addAttribute("leads", lead); // Changed "lead" to "leads" to match the attribute name in the JSP
		return "list_leads"; // Return the name of the JSP file
	}
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id,Model model) {
		leadService.deleteById(id);
		List<Lead> lead = leadService.getAllLeads();
		model.addAttribute("leads", lead);
		return "redirect:listLeads"; 
		
	}
	@RequestMapping("/update")
	public String updateLeadForm(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "updateform"; 
	}
	@RequestMapping("/updateLead")
	public String updatLead(LeadDto leadDto,Model model) {
		leadService.updateLead(leadDto);
		List<Lead> lead = leadService.getAllLeads();
		model.addAttribute("leads", lead);
		return "redirect:listLeads"; 
	}
}
