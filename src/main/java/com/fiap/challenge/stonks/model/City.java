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
public class City {

	private int cityId;
	private String name;
	private String originalPortalUrl;
	private String imgUrl;


	public City(int cityId, String name, String originalPortalUrl, String imgUrl) {
		super();
		this.cityId = cityId;
		this.name = name;
		this.originalPortalUrl = originalPortalUrl;
		this.imgUrl = imgUrl;
	}
	
	public City() {
		
	}

	@Id
	@Column(name = "CITY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CITY_SEQ")
	@SequenceGenerator(name = "CITY_SEQ", sequenceName = "CITY_SEQ", allocationSize = 1)
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ORIGINAL_PORTAL_URL")
	public String getoriginalPortalUrl() {
		return originalPortalUrl;
	}

	public void setOriginalPortalUrl(String originalPortalUrl) {
		this.originalPortalUrl = originalPortalUrl;
	}

	@Column(name = "IMAGE_URL")
	public String getImgUrl() { return imgUrl; }

	public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

}