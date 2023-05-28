package com.schoolapp.school.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class SchoolNameUpdateForm {
    @Getter
    @Setter
    @NotBlank(message = "error.name.blank")
    @Size(min = 5, message = "error.name.short")
    @Size(max = 200, message = "error.name.long")
    private String name;
}
