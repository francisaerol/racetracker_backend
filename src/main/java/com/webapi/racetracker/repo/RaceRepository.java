package com.webapi.racetracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapi.racetracker.model.Race;

public interface RaceRepository extends JpaRepository<Race, Integer> {

}
