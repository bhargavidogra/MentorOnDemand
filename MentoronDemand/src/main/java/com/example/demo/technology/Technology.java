package com.example.demo.technology;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.AuditModel;
import com.example.demo.user.trainings.TrainingDetails;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="technology")
public class Technology extends AuditModel{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	@Column
	private String techName;
	@Column
	private String description;
	@Column
	public Integer mentorId;
	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	@Column
	//private Float cost;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(long id, String techName, String description, Float cost) {
		super();
		this.id = id;
		this.techName = techName;
		this.description = description;
		
	}
	
	
	
	
	

}
