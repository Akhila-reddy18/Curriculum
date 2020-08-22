package com.university.Curriculum.dto;


import com.university.Curriculum.entity.*;



public class EbookDTO {
	private Integer ebookid;
	private String category;
	private String bname;
	private String author;
	
	public Integer getEbookid() {
		return ebookid;
	}

	public void setEbookid(Integer ebookid) {
		this.ebookid = ebookid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	
	public Ebook createEntity(){
		// TODO Auto-generated method stub
		Ebook ebook = new Ebook();
		ebook.setAuthor(this.getAuthor());
		ebook.setBname(this.getBname());
		ebook.setCategory(this.getCategory());
		ebook.setEbookid(this.getEbookid());
		
		
		return ebook;
	}
	
//converts entity to DTO
	public static EbookDTO valueOf(Ebook ebook) {
		// TODO Auto-generated method stub
		EbookDTO ebookDTO=new EbookDTO();
		ebookDTO.setAuthor(ebook.getAuthor());
		ebookDTO.setBname(ebook.getBname());
		ebookDTO.setCategory(ebook.getCategory());
		ebookDTO.setEbookid(ebook.getEbookid());
		return ebookDTO;
	}

	
    
}