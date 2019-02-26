/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Hospital;

/**
 * @author kloudone
 *
 */
public interface HospitalRepository extends CrudRepository<Hospital, Long> {

}
