package com.ryana.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ryana.domain.Gender;

// @Data
// @Validated
// public class EmployeeDTO {
// 	Long id;
// 	@NotBlank
// 	String name;
// 	@NotNull
// 	Gender gender;
// 	@JsonFormat(pattern="yyyy-MM-dd")
// 	@NotNull
// 	LocalDate doj;
// 	@NotNull
// 	Double salary;
// }
@Validated
public record EmployeeDTO(
		Long id,
		@NotBlank String name,
		@NotNull Gender gender,
		@JsonFormat(pattern = "yyyy-MM-dd") @NotNull LocalDate doj,
		@NotNull Double salary) {
	public EmployeeDTO() {
		this(null, null, null, null, null);
	}
}
