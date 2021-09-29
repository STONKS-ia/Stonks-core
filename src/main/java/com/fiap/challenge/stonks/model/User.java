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
@Table(name = "users")
public class User {
	
	private int userId;
	private String fullName;
	private String email;
	private String password;
	private String phone;
	private City municipio;

	public User(int userId, String fullName, String email, String password, String phone, City municipio) {
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.municipio = municipio;
	}

	public User() {
	}

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "fullname")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	public City getMunicipio() {
		return municipio;
	}

	public void setMunicipio(City municipio) {
		this.municipio = municipio;
	}

}
