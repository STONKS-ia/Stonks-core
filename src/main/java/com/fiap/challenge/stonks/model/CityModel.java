package com.fiap.challenge.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CITIES")
public class CityModel {

	private int cityId;
	private String name;
	private String originalPortalUrl;
	
	public CityModel(int cityId, String name, String originalPortalUrl) {
		super();
		this.cityId = cityId;
		this.name = name;
		this.originalPortalUrl = originalPortalUrl;
	}
	
	public CityModel() {
		
	}

	@Id
	@Column(name = "CITY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CITY_SEQ")
	@SequenceGenerator(name = "CITY_SEQ", sequenceName = "CITY_SEQ", allocationSize = 1)
	public int getcityId() {
		return cityId;
	}

	public void setcityId(int cityId) {
		this.cityId = cityId;
	}

	@Column(name = "NAME")
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Column(name = "ORIGINAL_PORTAL_URL")
	public String getoriginalPortalUrl() {
		return originalPortalUrl;
	}

	public void setoriginalPortalUrl(String originalPortalUrl) {
		this.originalPortalUrl = originalPortalUrl;
	}

}