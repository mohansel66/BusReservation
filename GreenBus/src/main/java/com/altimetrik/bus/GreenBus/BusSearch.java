package com.altimetrik.bus.GreenBus;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bussearch")
public class BusSearch {

	@Id
	@GeneratedValue
	@Column(name = "searchid")
	int searchId;
	@Column(name = "sourcecityname")
	String sourceCityName;
	@Column(name = "destinationcityname")
	String destinationCityName;
	@Column(name = "traveldate")
	Date travelDate;
	@Column(name = "returndate")
	Date retrunDate;
	@Column(name = "travelsname")
	String travelsName;

	public int getSearchId() {
		return searchId;
	}

	public void setSearchId(int searchId) {
		this.searchId = searchId;
	}

	public String getSourceCityName() {
		return sourceCityName;
	}

	public void setSourceCityName(String sourceCityName) {
		this.sourceCityName = sourceCityName;
	}

	public String getDestinationCityName() {
		return destinationCityName;
	}

	public void setDestinationCityName(String destinationCityName) {
		this.destinationCityName = destinationCityName;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getRetrunDate() {
		return retrunDate;
	}

	public void setRetrunDate(Date retrunDate) {
		this.retrunDate = retrunDate;
	}

	public String getBusTravelsName() {
		return travelsName;
	}

	public void setBusTravelsName(String busTravelsName) {
		this.travelsName = busTravelsName;
	}

}
