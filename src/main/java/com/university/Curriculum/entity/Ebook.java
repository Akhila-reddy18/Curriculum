package com.university.Curriculum.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity

@Table(name="ebooks")
public class Ebook  {
	@Id
	Integer ebookid;
	String category;
	String bname;
	String author;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}