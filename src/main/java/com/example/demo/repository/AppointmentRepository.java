/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Appointment;

/**
 * @author kloudone
 *
 */
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
