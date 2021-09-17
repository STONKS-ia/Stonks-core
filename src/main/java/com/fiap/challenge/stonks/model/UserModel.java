package com.fiap.challenge.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserModel {
	
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String phone;
	private CityModel municipio;

	public UserModel(int userId, String fullName, String email, String password, String phone, CityModel municipio) {
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.municipio = municipio;
	}

	public UserModel() {
	}

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	@SequenceGenerator(name = "USER_SEQ", sequenceName = "USER_SEQ", allocationSize = 1)
	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "FULLNAME")
	public String getfullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "PHONE")
	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	@Column(name = "PASSWORD")
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	@ManyToOne
	@JoinColumn(name = "ID_MUNICIPIO", nullable = false)
	public CityModel getMunicipio() {
		return municipio;
	}

	public void setMunicipio(CityModel municipio) {
		this.municipio = municipio;
	}

}
