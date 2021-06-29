package com.marks.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="POINTS")

public class CandidatePoints {
	
	@Id @GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator" , strategy="foreign" ,parameters ={@Parameter(value = "candidate" , name="property")})
	private int cno;
	
	@Column(name="ttlpoints",nullable=false)
	private int total;	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cno")
	private CandidateInfo candidate;

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(Boolean masters, Boolean graduation, Boolean hssc, Boolean sports) {
		
		int total = 0;
		
		if(masters)
			total += 5;
		if(graduation)
			total += 3;
		if(hssc)
			total += 1;
		if(sports)
			total += 3;
		
		this.total = total;
	}

	public CandidateInfo getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateInfo candidate) {
		this.candidate = candidate;
	}
	
}
