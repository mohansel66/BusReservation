package com.altimetrik.bus.GreenBus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="busdetails")
public class BusDetails {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="travelsname")
	String travelsName;
	
	@Column(name="busno")
	String busNo;
	
	@Column(name="busname")
	String busName;
	@Column(name="totalseats")
	int totalSeats;
	@Column(name="availseats")
	int availSeats;
	@Column(name="fareprice")
	float farePrice;
	@Column(name="currentdate")
	Date currentDate;
	@Column(name="selectseat")
	int selectSeat;
	
	
	
	public int getSelectSeat() {
		return selectSeat;
	}
	public void setSelectSeat(int selectSeat) {
		this.selectSeat = selectSeat;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailSeats() {
		return availSeats;
	}
	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}
	public float getFarePrice() {
		return farePrice;
	}
	public void setFarePrice(float farePrice) {
		this.farePrice = farePrice;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getTravelsName() {
		return travelsName;
	}
	
	
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	
	public String getBusNo() {
		
		return busNo;
	}
	
	
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	
	
	
	

}
