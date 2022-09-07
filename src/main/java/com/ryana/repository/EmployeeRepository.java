package com.ryana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ryana.domain.Employee;
import com.ryana.domain.Gender;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("select AVG(salary) from Employee where gender=:gender")
	Double findAverageSalaryByGender(Gender gender);
	
	@Query("from Employee where YEAR(doj)=:doj")
	List<Employee> findByYear(Integer doj);
	
}
