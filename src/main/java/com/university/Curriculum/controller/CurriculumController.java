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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.dto.EbookDTO;

import com.university.Curriculum.entity.Curriculum;
import com.university.Curriculum.service.CurriculumService;



@RestController
//@RequestMapping(value="/api")
@CrossOrigin
public class CurriculumController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CurriculumService curriculumService;
	
	

	@GetMapping(value="/curriculum")
	public List<CurriculumDTO> view()  {
		return curriculumService.viewCurriculum();
		
	}

	
	@PostMapping(value="/curriculum/add")
	public String addcurriculum(@RequestBody CurriculumDTO curriculumDTO) {
		return curriculumService.add(curriculumDTO);
		
	}
	
	@DeleteMapping(value="/curriculum/delete/{cid}")
	public String deletecurriculum(@PathVariable Integer cid) throws Exception {
		return curriculumService.deletebyid(cid);
	}
}

