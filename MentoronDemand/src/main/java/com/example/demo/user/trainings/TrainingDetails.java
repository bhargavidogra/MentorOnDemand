package com.example.demo.user.trainings;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.example.demo.mentor.Mentor;
import com.example.demo.payments.Payment;
import com.example.demo.skill.Skill;
import com.example.demo.technology.Technology;
import com.example.demo.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="training")
public class TrainingDetails {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private int progress;
	@Column
	private float commissionAmount;
	@Column
	private int rating;
	@Column
	private float avgRating;
	
	@JsonFormat(pattern="YYYY-MM-DD")
	@Column
	private Date startDate;
	
	@Column
	@JsonFormat(pattern="YYYY-MM-DD")
	private Date endDate;
	@JsonFormat(pattern="HH:MM:SS")
	@Column
	private String startTime;
	@JsonFormat(pattern="HH:MM:SS")
	@Column
	private String endTime;
	@Column
	private float amountReceived;
	
	@Column
	private float fees;
	@Column
	private boolean status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mentor_id")
    public Mentor mentor;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="training_user",joinColumns={
		@JoinColumn(name="training_id",nullable=false,updatable=false)},
	inverseJoinColumns={@JoinColumn(name="user_id",nullable=false,updatable=false)}
	)
    private List<User> users;
	
	
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor; 
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	public Technology getTechnology() {
		return technology;
	}
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="training_skill",joinColumns={
		@JoinColumn(name="training_id",nullable=false,updatable=false)},
	inverseJoinColumns={@JoinColumn(name="skill_id",nullable=false,updatable=false)}
	)
    private List<Skill> skill;
	
	
	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="training_payment",joinColumns={
		@JoinColumn(name="training_id",nullable=false,updatable=false)},
	inverseJoinColumns={@JoinColumn(name="payment_id",nullable=false,updatable=false)}
	)
    private List<Payment> payment;
	
	
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tech_id")
    private Technology technology;
	
	
	public TrainingDetails(boolean status) {
		super();
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public float getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating; 
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}
	
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public TrainingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrainingDetails(int id, int progress, float commissionAmount, int rating, float avgRating, Date startDate,
			Date endDate, String startTime, String endTime, float amountReceived, int mentorId, String mentorName,
			int userId, String userName, long skillId, String skillName, float fees,boolean status) {
		super();
		this.id = id;
		this.progress = progress;
		this.commissionAmount = commissionAmount;
		this.rating = rating;
		this.avgRating = avgRating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amountReceived = amountReceived;
		
		this.fees = fees;
		this.status=status;
	}
	
	
	

}
