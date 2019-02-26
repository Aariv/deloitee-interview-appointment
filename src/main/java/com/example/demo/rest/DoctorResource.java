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

import com.example.demo.domain.Doctor;
import com.example.demo.repository.DoctorRepository;

/**
 * @author kloudone
 *
 */
@RestController
@RequestMapping("/api/v1")
public class DoctorResource {

	@Autowired
	private DoctorRepository doctorRepository;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/doctors")
	public List<Doctor> findAll() {
		return (List<Doctor>) doctorRepository.findAll();
	}

	/**
	 * 
	 * @param doctor
	 */
	@PostMapping("/doctors")
	public void save(@RequestBody Doctor doctor) {
		doctorRepository.save(doctor);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/doctors/{id}")
	public Doctor findById(@PathVariable Long id) {
		return doctorRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/doctors/{id}")
	public void deleteById(@PathVariable Long id) {
		doctorRepository.deleteById(id);
	}

}
