package com.fiap.challenge.stonks.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "USERS")
public class User {

	@Column(name = "USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "FULLNAME")
	private String fullName;

	@Column(name = "EMAIL", unique = true)
	private String email;

	@Column(name = "LOGIN", unique = true)
	private String login;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PHONE")
	private String phone;

	@ManyToOne(optional = true)
	@JoinColumn(name = "CITY_ID", nullable = true)
	private City city;

	@ManyToMany(fetch = FetchType.EAGER)
	Collection<Role> roles = new ArrayList<>();

	public User(String fullName, String email, String login, String password, String phone, City city, Collection<Role> roles) {
		this.fullName = fullName;
		this.email = email;
		this.login = login;
		this.password = password;
		this.phone = phone;
		this.city = city;
		this.roles = roles;
	}

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
}
