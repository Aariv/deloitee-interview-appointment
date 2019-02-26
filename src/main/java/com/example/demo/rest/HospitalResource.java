/**
 * 
 */
package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Hospital;
import com.example.demo.repository.HospitalRepository;

/**
 * @author kloudone
 *
 */
@RestController
@RequestMapping("/api/v1")
public class HospitalResource {

	@Autowired
	private HospitalRepository hospitalRepository;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/hospitals")
	public List<Hospital> findAll() {
		return (List<Hospital>) hospitalRepository.findAll();
	}

	/**
	 * 
	 * @param Hospital
	 */
	@PostMapping("/hospitals")
	public void save(@RequestBody Hospital Hospital) {
		hospitalRepository.save(Hospital);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/hospitals/{id}")
	public Hospital findById(@PathVariable Long id) {
		return hospitalRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/hospitals/{id}")
	public void deleteById(@PathVariable Long id) {
		hospitalRepository.deleteById(id);
	}

}
