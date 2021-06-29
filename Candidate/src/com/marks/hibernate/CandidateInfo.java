package com.marks.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")

public class CandidateInfo {
	
	@Id @GeneratedValue
	@Column(name="cno",nullable=false)
	private int cno;
	
	@Column(name="fname",nullable=false)
	private String fname;
	@Column(name="lnam",nullable=false)
	private String lname;
	
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}
	

}	
	

