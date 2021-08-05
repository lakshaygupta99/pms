package com.hibernate;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient  implements Serializable {
	private static final long serialVersionUID = 8633415090390966715L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="age")
	private Long age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="diseaseDetails")
	private String diseaseDetails;
	
	@Column(name="paymentDetails")
	private String paymentDetails;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Doctor doctorDetails;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, Long age, String address, String diseaseDetails, String paymentDetails,
			Doctor doctorDetails) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.diseaseDetails = diseaseDetails;
		this.paymentDetails = paymentDetails;
		this.doctorDetails = doctorDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDiseaseDetails() {
		return diseaseDetails;
	}

	public void setDiseaseDetails(String diseaseDetails) {
		this.diseaseDetails = diseaseDetails;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public Doctor getDoctorDetails() {
		return doctorDetails;
	}

	public void setDoctorDetails(Doctor doctorDetails) {
		this.doctorDetails = doctorDetails;
	}
	
	
}
