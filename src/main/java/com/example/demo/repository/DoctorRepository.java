/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Doctor;

/**
 * @author kloudone
 *
 */
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
