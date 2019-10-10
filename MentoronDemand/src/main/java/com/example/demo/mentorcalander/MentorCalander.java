package com.example.demo.mentorcalander;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="mentorcalander")
public class MentorCalander {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mentorId;
	@Column
	private String mentorName;
	@Column
	private long techId;
	@JsonFormat(pattern="HH:MM:SS")
	@Column
	private String timeSlot;
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public long getTechId() {
		return techId;
	}
	public void setTechId(long techId) {
		this.techId = techId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public MentorCalander() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentorCalander(int mentorId, String mentorName, long techId, String timeSlot) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.techId = techId;
		this.timeSlot = timeSlot;
	}
	
	
	
	
	
	

}
