package com.example.employee_api.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {

    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 5, max = 100, message = "Full name must be between 5 and 100 characters")
    private String fullName;

    @NotBlank(message = "Major cannot be blank")
    private String major;
}
