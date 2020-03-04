package com.altimetrik.bus.GreenBus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.altimetrik.bus.GreenBus.BusDetails;

public interface BusRepo extends JpaRepository<BusDetails, Integer>{

//	@Query("from busdetails where busname = :busname")
	@Query(value = "Select id, travelsname, busno,busname,totalseats,availseats,fareprice,currentdate,selectseat from busdetails where busname = :busname", nativeQuery = true)
	List<BusDetails> getSpecific(@PathVariable("busname") String busname);
}
