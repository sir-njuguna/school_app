package com.schoolapp.school.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class SchoolEmailUpdateForm {
    @Getter
    @Setter
    @NotBlank(message = "error.email.blank")
    @Email(message = "error.email.invalid")
    private String emailAddress;
}
