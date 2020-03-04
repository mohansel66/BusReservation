package com.altimetrik.bus.GreenBus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.bus.GreenBus.BusSearch;
import com.altimetrik.bus.GreenBus.dao.BusRepo;
import com.altimetrik.bus.GreenBus.dao.SearchRepo;

@RestController
public class BusSearchController {

	@Autowired
	BusRepo repo;
	
	@Autowired
	SearchRepo search;
	
	@GetMapping("/searchdetails")
	public List<BusSearch> getSearchDetails(){
		return search.findAll();
	}
	
	@GetMapping("/search/{serId}")
	public Optional<BusSearch> viewBusDetail(@PathVariable("serId") int serId ) {
		return search.findById(serId);
	}
	
	@PostMapping(path="/search")
	public BusSearch insertBusDetail(@RequestBody BusSearch serd) {
		search.save(serd);
		return serd;
	}
}
