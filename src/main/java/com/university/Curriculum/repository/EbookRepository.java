package com.university.Curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.Curriculum.entity.Ebook;
import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.dto.EbookDTO;
import com.university.Curriculum.entity.Curriculum;



public interface EbookRepository extends JpaRepository<Ebook, Integer> {
	public Ebook findByebookid(int bid);
	


	
}
