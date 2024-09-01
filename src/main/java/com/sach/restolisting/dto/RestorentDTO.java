package com.sach.restolisting.dto;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class RestorentDTO {
	
	private int id;
	@NotNull
	@NotEmpty(message = "Name shouldn't be null or empty")
	private String name;
	@NotEmpty(message = "Address should not be empty")
	private String address;
	@NotEmpty(message = "City should not be empty")
	private String city;
	@NotEmpty(message = "Description should not be empty")
	private String restorentDescription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRestorentDescription() {
		return restorentDescription;
	}
	public void setRestorentDescription(String restorentDescription) {
		this.restorentDescription = restorentDescription;
	}
	public RestorentDTO(int id, String name, String address, String city, String restorentDescription) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.restorentDescription = restorentDescription;
	}
	public RestorentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RestorentDTO [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", restorentDescription=" + restorentDescription + "]";
	}
}
