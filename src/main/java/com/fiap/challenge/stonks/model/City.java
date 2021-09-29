package com.fiap.challenge.stonks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

	private int cityId;
	private String name;
	private String originalPortalUrl;
	private String imgUrl;


	public City(String name, String originalPortalUrl, String imgUrl) {
		super();
		this.name = name;
		this.originalPortalUrl = originalPortalUrl;
		this.imgUrl = imgUrl;
	}
	
	public City() {
		
	}

	@Id
	@Column(name = "city_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "original_portal_url")
	public String getoriginalPortalUrl() {
		return originalPortalUrl;
	}

	public void setOriginalPortalUrl(String originalPortalUrl) {
		this.originalPortalUrl = originalPortalUrl;
	}

	@Column(name = "image_url")
	public String getImgUrl() { return imgUrl; }

	public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

}