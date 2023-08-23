package com.talzoo.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnboardRepository extends JpaRepository<OnboardDto,Integer>{
    Page<OnboardDto> findAll(Pageable pageable);
    Page<OnboardDto> findAll(Specification<OnboardDto> spec, Pageable pageable);
	
}