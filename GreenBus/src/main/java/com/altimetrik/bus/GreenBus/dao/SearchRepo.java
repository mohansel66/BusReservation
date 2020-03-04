package com.altimetrik.bus.GreenBus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.bus.GreenBus.BusSearch;

public interface SearchRepo extends JpaRepository<BusSearch, Integer>{

	
}
