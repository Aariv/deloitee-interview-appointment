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

import com.example.demo.domain.Appointment;
import com.example.demo.repository.AppointmentRepository;

/**
 * @author kloudone
 *
 */
@RestController
@RequestMapping("/api/v1")
public class AppointmentResource {

	@Autowired
	private AppointmentRepository appointmentRepository;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/appointments")
	public List<Appointment> findAll() {
		return (List<Appointment>) appointmentRepository.findAll();
	}

	/**
	 * 
	 * @param Appointment
	 */
	@PostMapping("/appointments")
	public void save(@RequestBody Appointment Appointment) {
		appointmentRepository.save(Appointment);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/appointments/{id}")
	public Appointment findById(@PathVariable Long id) {
		return appointmentRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/appointments/{id}")
	public void deleteById(@PathVariable Long id) {
		appointmentRepository.deleteById(id);
	}

}
