package com.crudjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudjsp.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
