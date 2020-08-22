package com.university.Curriculum.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;
import javax.validation.Validator;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.university.Curriculum.dto.CurriculumDTO;
import com.university.Curriculum.dto.EbookDTO;

import com.university.Curriculum.entity.Curriculum;
import com.university.Curriculum.entity.Ebook;
import com.university.Curriculum.repository.CurriculumRepository;
import com.university.Curriculum.repository.EbookRepository;


@Service
public class CurriculumService {
	private static final Logger logger = LoggerFactory.getLogger(CurriculumService.class);
	@Autowired
	CurriculumRepository currriculumrepo;
	
	
	
public List<CurriculumDTO> viewCurriculum()  {
	List<CurriculumDTO> DTOlist = new ArrayList<>();
	
	List<Curriculum> clist=currriculumrepo.findAll();
			for(Curriculum c :clist) {
				CurriculumDTO curriculumDTO =CurriculumDTO.valueOf(c);
				DTOlist.add(curriculumDTO);

				
			}
			return DTOlist;
		}
		
	
	
	

public String add(CurriculumDTO curriculumDTO){

    Curriculum ce=currriculumrepo.findBycid(curriculumDTO.getCid());
    if(ce==null) {
    	Curriculum cu=curriculumDTO.createEntity();
    	currriculumrepo.save(cu);
    	return ("added successfully");
    }
    else {
    	return ("It is already exist");
    }
	}

public String deletebyid(Integer cid) throws Exception{
	try {
		Curriculum cen=currriculumrepo.findBycid(cid);
		currriculumrepo.deleteById(cid);
		return("Deleted Succesfully");
		}
	catch (Exception e) {
		// TODO: handle exception
		return("There is no curriculum with given id");
	}


}
}
