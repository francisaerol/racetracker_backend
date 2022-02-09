package com.webapi.racetracker.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.racetracker.model.Race;
import com.webapi.racetracker.repo.RaceRepository;


@RestController
public class RaceController {
	
	@Autowired
	private RaceRepository raceRepo;

	
	/** Race API */
	
	// GET - /races -> findAllRaces()
	@GetMapping("/racetracker/races")
	public List<Race> findAll() {
		return raceRepo.findAll(); 
	}
	
	
	@PostMapping("/racetracker/race")
	public ResponseEntity<Race> save(@RequestBody  Race race){
		Race persistedRace = raceRepo.save(race);
		return ResponseEntity.created(URI.create(String.format("/race_id/", race.getRace_id())))
						.body(persistedRace);
	}
	
	// POST - /races -> insert multiple
	@PostMapping("/racetracker/races")
	public void save(@RequestBody List<Race> raceList) {
		raceRepo.saveAll(raceList);
	}
	
	// PUT - /race 
	@PutMapping("/racetracker/race/{id}")
	public void put(@RequestBody Race race, @PathVariable Integer id) {
		raceRepo.save(race);
	}
	
	// DELETE -/race
	@DeleteMapping("/racetracker/race/{id}")
	public void delete(@PathVariable Integer id) {
		raceRepo.deleteById(id);
	}
	
}
