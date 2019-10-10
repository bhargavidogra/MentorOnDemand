package com.example.demo.mentor;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.payments.Payment;
import com.example.demo.skill.Skill;
import com.example.demo.technology.Technology;
import com.example.demo.user.trainings.TrainingDetails;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mentorid;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	@Column
	private Long contactNumber;
	
	@Column
	private String email;
	
	@Column
	private String regCode="";
	
	@Column
	private String role=null;
	
	@Column
	private String linkedinUrl=null;
	
	@Column
	private float yearsOfExperience;
	
	@Column
	private Boolean active=false;
	
	@Column
	private Boolean confirmedSignUp=false;
	
	
	@Column
	private Boolean resetPassword=false;
	
	@Column
	private Date resetPasswordDate;
	
	
	
	@JsonFormat(pattern="HH:MM:SS")
	@Column
	private String timeZone;
	
	@Column
	private float rating;
	
	
	@Column
	private String mentorProfile;

	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="mentor_skill",joinColumns={
		@JoinColumn(name="mentor_id",nullable=false,updatable=false)},
	inverseJoinColumns={@JoinColumn(name="skill_id",nullable=false,updatable=false)}
	)
    private List<Skill>skills;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="mentor_technology",joinColumns={
		@JoinColumn(name="mentor_id",nullable=false,updatable=false)},
	inverseJoinColumns={@JoinColumn(name="technology_id",nullable=false,updatable=false)}
	)
    private List<Technology>technology;
	

	public int getMentorid() {
		return mentorid;
	}


	public void setMentorid(int mentorid) {
		this.mentorid = mentorid;
	}


	public String getMentorProfile() {
		return mentorProfile;
	}


	public void setMentorProfile(String mentorProfile) {
		this.mentorProfile = mentorProfile;
	}


	public List<Skill> getSkills() {
		return skills;
	}


	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}


	public List<Technology> getTechnology() {
		return technology;
	}


	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}


	public int getId() {
		return mentorid;
	}


	public void setId(int id) {
		this.mentorid = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRegCode() {
		return regCode;
	}


	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getLinkedinUrl() {
		return linkedinUrl;
	}


	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}


	public float getYearsOfExperience() {
		return yearsOfExperience;
	}


	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}


	public Boolean getConfirmedSignUp() {
		return confirmedSignUp;
	}


	public void setConfirmedSignUp(Boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}


	public Boolean getResetPassword() {
		return resetPassword;
	}


	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}


	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}


	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}


	public String getTimeZone() {
		return timeZone;
	}


	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mentor(int id, String userName, String password, String firstName, String lastName, Long contactNumber,
			String email, String regCode, String role, String linkedinUrl, float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Boolean resetPassword, Date resetPasswordDate, String timeZone, float rating,
			String mentorProfile) {
		super();
		this.mentorid = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
		this.resetPasswordDate = resetPasswordDate;
		this.timeZone = timeZone;
		this.rating = rating;
		this.mentorProfile = mentorProfile;
	}
	
	
	

	

}
