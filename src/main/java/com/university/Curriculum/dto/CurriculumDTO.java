package com.university.Curriculum.dto;

import java.util.Date;

import com.university.Curriculum.entity.Curriculum;

public class CurriculumDTO {
	private Integer cid;
	private String cname;
	private Date startdate;
	private Date enddate;
	private String tutor;
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public CurriculumDTO() {
		super();
	}
	// Converts Entity into DTO
	public static CurriculumDTO valueOf(Curriculum curriculum) {
		CurriculumDTO curriculumDTO= new CurriculumDTO();
		curriculumDTO.setCid(curriculum.getCid());
		curriculumDTO.setCname(curriculum.getCname());
		curriculumDTO.setEnddate(curriculum.getEnddate());
		curriculumDTO.setStartdate(curriculum.getStartdate());
		curriculumDTO.setTutor(curriculum.getTutor());
		
		return curriculumDTO;
	}
	
	
	public Curriculum createEntity() {
		Curriculum cr=new Curriculum();
		cr.setCid(this.getCid());
		cr.setCname(this.getCname());
		cr.setEnddate(this.getEnddate());
		cr.setStartdate(this.getStartdate());
		cr.setTutor(this.getTutor());
		
		return cr;
	}
		
	
}
