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

import com.example.demo.domain.Department;
import com.example.demo.repository.DepartmentRepository;

/**
 * @author kloudone
 *
 */
@RestController
@RequestMapping("/api/v1")
public class DepartmentResource {

	@Autowired
	private DepartmentRepository departmentRepository;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/departments")
	public List<Department> findAll() {
		return (List<Department>) departmentRepository.findAll();
	}

	/**
	 * 
	 * @param Department
	 */
	@PostMapping("/departments")
	public void save(@RequestBody Department Department) {
		departmentRepository.save(Department);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/departments/{id}")
	public Department findById(@PathVariable Long id) {
		return departmentRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/departments/{id}")
	public void deleteById(@PathVariable Long id) {
		departmentRepository.deleteById(id);
	}

}
