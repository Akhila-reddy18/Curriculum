package com.university.Curriculum.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.university.Curriculum.controller.EbookController;
import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.dto.EbookDTO;

import com.university.Curriculum.entity.Curriculum;
import com.university.Curriculum.entity.Ebook;

import com.university.Curriculum.repository.EbookRepository;

@Service
public class EbookService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EbookController.class);
	@Autowired
	EbookRepository ebookrepo;
	
	@Autowired
	EbookService ebookService;
	

	
	
	public List<EbookDTO> viewEbook() {

		List<Ebook> elist=ebookrepo.findAll();
		List<EbookDTO> DTOlist = new ArrayList<>();
		for(Ebook e :elist) {
			EbookDTO ebookDTO =EbookDTO.valueOf(e);
			DTOlist.add(ebookDTO);

			
		}
		return DTOlist;
		
	}

	public void addBook(EbookDTO ebookDTO) {

		 Ebook e=ebookrepo.findByebookid(ebookDTO.getEbookid());
		    if(e==null) {
		    	Ebook eb=ebookDTO.createEntity();
		    	ebookrepo.save(eb);
		    	System.out.println("added successfully");
		    }
		    else {
		    	System.out.println("already present");
		    }
	}

	public void deletebyid(Integer bid) {

		try {
			Ebook eb=ebookrepo.findByebookid(bid);
			ebookrepo.deleteById(bid);
			System.out.println("deleted successfully");
			}
		catch (Exception e) {

			System.out.println("curriculum does not exists");
		}


	
		
	}
	
}