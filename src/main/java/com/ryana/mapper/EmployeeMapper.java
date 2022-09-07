package com.ryana.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ryana.domain.Employee;
import com.ryana.dto.EmployeeDTO;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	
	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class );
	
	EmployeeDTO toEmployeeDTO(Employee Employee);

	List<EmployeeDTO> toEmployeeDTOs(List<Employee> Employees);

	Employee toEmployee(EmployeeDTO EmployeeDTO);
}
