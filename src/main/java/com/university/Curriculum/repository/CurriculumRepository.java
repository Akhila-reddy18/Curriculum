package com.university.Curriculum.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.entity.Curriculum;

@Repository
@Transactional
public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {

	public Curriculum findBycid(int Id);
	
	public void save(CurriculumDTO curriculum);
}
