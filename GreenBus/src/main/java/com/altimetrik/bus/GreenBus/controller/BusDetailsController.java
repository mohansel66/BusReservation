package com.altimetrik.bus.GreenBus.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.bus.GreenBus.BusDetails;
import com.altimetrik.bus.GreenBus.dao.BusRepo;

@RestController
public class BusDetailsController {

	@Autowired
	BusRepo repo;

	@GetMapping("/busdetails")
	public List<BusDetails> getBusDetails() {
		return repo.findAll();
	}

	@GetMapping("/busdetail/{busId}")
	public Optional<BusDetails> viewBusDetail(@PathVariable("busId") int busId) {
		return repo.findById(busId);
	}

	@PostMapping(path = "/busdetail")
	public BusDetails insertBusDetail(@RequestBody BusDetails busd) {
		repo.save(busd);
		return busd;
	}
	@GetMapping("/busdetails/{busname}")
	public List<BusDetails> getSpecificBus(@PathVariable("busname") String busname) {
		
		return repo.getSpecific(busname);
	}
	
	
	

}
