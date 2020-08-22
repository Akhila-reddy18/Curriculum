package com.university.Curriculum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.dto.EbookDTO;
import com.university.Curriculum.dto.BuyerLoginDTO;

import com.university.Curriculum.service.EbookService;

@RestController
@CrossOrigin
//@RequestMapping(value="/api")
public class EbookController {

	private static final Logger logger = LoggerFactory.getLogger(EbookController.class);	
	@Autowired
	private EbookService ebookService;

	@GetMapping(value="/ebooks")
	public List<EbookDTO> view() {
		return ebookService.viewEbook();
		
		
	}

	
	@PostMapping(value="/ebooks/add")
	public void addcurriculum(@RequestBody EbookDTO ebookDTO) {
		ebookService.addBook(ebookDTO);
		
	}
	
	@DeleteMapping(value="/ebooks/delete/{eid}")
	public void deleteEbook(@PathVariable Integer eid) {
		ebookService.deletebyid(eid);
	}
	
	
	
}
