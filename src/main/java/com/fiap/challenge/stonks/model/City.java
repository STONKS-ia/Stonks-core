package com.fiap.challenge.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;


@Entity
@Table(name = "CITIES")
public class City {

	@Id
	@Column(name = "CITY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CITY_SEQ")
	@SequenceGenerator(name = "CITY_SEQ", sequenceName = "CITY_SEQ", allocationSize = 1)
	private Long cityId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ORIGINAL_PORTAL_URL")
	private String originalPortalUrl;

	@Column(name = "IMAGE_URL")
	private String imgUrl;


	public City( String name, String originalPortalUrl, String imgUrl) {
		super();

		this.name = name;
		this.originalPortalUrl = originalPortalUrl;
		this.imgUrl = imgUrl;
	}
	
	public City() {
		
	}

	public Long getCityId() {
		return cityId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalPortalUrl() {
		return originalPortalUrl;
	}

	public void setOriginalPortalUrl(String originalPortalUrl) {
		this.originalPortalUrl = originalPortalUrl;
	}

	public String getImgUrl() { return imgUrl; }

	public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

}