package com.sach.restolisting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Restorent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String city;
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
	public Restorent(int id, String name, String address, String city, String restorentDescription) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.restorentDescription = restorentDescription;
	}
	public Restorent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Restorent [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", restorentDescription=" + restorentDescription + "]";
	}
	
}
