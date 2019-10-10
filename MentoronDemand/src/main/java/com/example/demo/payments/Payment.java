package com.example.demo.payments;

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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.AuditModel;
import com.example.demo.technology.Technology;
import com.example.demo.user.User;
import com.example.demo.user.trainings.TrainingDetails;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="payment")
public class Payment extends AuditModel{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	@Column
	private String txnType;
	@Column
	private float Amount;
	@Column
	private String remarks;
	@Column
	private int mentorId;
	
	
	@Column
	private String mentorName;
	@Column
	private Integer trainingId;
	@Column
	private String paymentType;
	@Column
	private Float totalAmountToMentor;
    @Column
    public Integer userId;
 

	public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

	@ManyToMany(fetch=FetchType.LAZY,mappedBy="payment")
	List<TrainingDetails> trainingDetails;
 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

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

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}

	
	
	
	
	

}
