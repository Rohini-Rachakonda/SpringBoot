package com.springboot.pjct.Sector.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.pjct.Sector.dao.SectorRepository;
import com.springboot.pjct.Sector.pojos.Sectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
@RequestMapping("sectors")
public class SectorController {
	@Autowired
	private SectorRepository sectorRepository;
	@RequestMapping("/getAllsectors")
	public Iterable<Sectors> getAllsectors() {
		return sectorRepository.findAll();
	}
	@PostMapping("/saveSectors")

	public Sectors saveSectors(@RequestBody Sectors sectors) {

		System.out.println(sectors);

		sectorRepository.save(sectors);

		return sectors;

	}
	@PutMapping("/updateSectors/{Id}")

	public Sectors updateSectors(@RequestBody Sectors sectors,@PathVariable("Id") Integer id) {

		sectors.setId(id);
		System.out.println(sectors);

		sectorRepository.save(sectors);

		return sectors;

	}
	@DeleteMapping("/deleteSectors/{Id}")

	public boolean deleteSectors(@PathVariable("Id") Integer id) {

		sectorRepository.deleteById(id);;

		return true;

	}
	@GetMapping("/find/{Id}")

	public Sectors find(@PathVariable("Id") Integer id)

	{

		Optional<Sectors> sectors = sectorRepository.findById(id);

		return sectors.get();

	}





	

}
