/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Department;

/**
 * @author kloudone
 *
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
