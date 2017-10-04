package main.java.Classes;

import java.util.Date;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicalrecords")
public class MedicalRecord implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="recordid")
	private int recordId;
	@JoinColumn(name="userid")
	private int patientId;
	@JoinColumn(name="userid")	
	private int doctorId;
	@Column(name="treatment")
	private String treatment;
	@Column(name="description")
	private String description;
	@Column(name="recordDate")
	private Date recordDate;
	
	public MedicalRecord(int recordId, int patientId, int doctorId, String treatment, String description, Date recordDate)
	{
		super();
		this.setRecordId(recordId);
		this.setPatientId(patientId);
		this.setDoctorId(doctorId);
		this.setTreatment(treatment);
		this.setDescription(description);
		this.setRecordDate(recordDate);
	}
	
	public MedicalRecord(){
		super();
	}
	
	public int getRecordId(){
		return recordId;
	}
	
	public void setRecordId(int recordId){
		this.recordId = recordId;
	}
	
	public int getPatientId(){
		return patientId;
	}
	
	public void setPatientId(int patientId){
		this.patientId = patientId;
	}
	
	public int getDoctorId(){
		return doctorId;
	}
	
	public void setDoctorId(int doctorId){
		this.doctorId = doctorId;
	}
	
	public String getTreatment(){
		return treatment;
	}
	
	public void setTreatment(String treatment){
		this.treatment = treatment;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public Date getRecordDate(){
		return recordDate;
	}
	
	public void setRecordDate(Date recordDate){
		this.recordDate = recordDate;
	}
}
