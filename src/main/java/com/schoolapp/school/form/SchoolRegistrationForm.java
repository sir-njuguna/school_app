package com.school_app.school.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class SchoolRegistrationForm {

    @Getter
    @Setter
    @NotBlank(message = "error.name.blank")
    @Size(min = 5, message = "error.name.short")
    @Size(max = 200, message = "error.name.long")
    private String name;

    @Getter
    @Setter
    @NotBlank(message = "error.physicalAddress.blank")
    @Size(min = 5, message = "error.physicalAddress.short")
    @Size(max = 200, message = "error.physicalAddress.long")
    private String physicalAddress;

    @Getter
    @Setter
    @NotBlank(message = "error.email.blank")
    @Email(message = "error.email.invalid")
    private String emailAddress;

    @Getter
    @Setter
    @NotBlank(message = "error.phoneNumber.blank")
    private String phoneNumber;
}
