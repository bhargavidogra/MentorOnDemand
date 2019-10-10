package com.example.demo.skill;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.AuditModel;
import com.example.demo.user.trainings.TrainingDetails;

@Entity
@Table(name="skill")
public class Skill extends AuditModel {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private String toc;
	@Column
	private String prerequisites;
	@Column
	public Integer mentorId;
	
	
	
	
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(long id, String name, String toc, String prerequisites) {
		super();
		this.id = id;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
	}

}
