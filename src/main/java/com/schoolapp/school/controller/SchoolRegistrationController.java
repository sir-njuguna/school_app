package com.school_app.school.controller;

import com.school_app.lib.service.Message;
import com.school_app.lib.view.EntityApiResponse;
import com.school_app.school.form.SchoolEmailUpdateForm;
import com.school_app.school.form.SchoolRegistrationForm;
import com.school_app.school.form.SchoolNameUpdateForm;
import com.school_app.school.model.School;
import com.school_app.school.service.SchoolRegistrationService;
import com.school_app.school.view.SchoolView;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("school")
public class SchoolRegistrationController {
    private SchoolRegistrationService schoolRegistrationService;

    @PostMapping("register")
    public EntityApiResponse<SchoolView> registerSchool(@RequestBody @Valid SchoolRegistrationForm form){
        School school = schoolRegistrationService.register(form);
        return new EntityApiResponse<>(
                true,
                HttpStatus.OK.value(),
                Message.get("school.registration.success"),
                new SchoolView(school)
        );
    }

    @PutMapping("update/name/{schoolId}")
    public EntityApiResponse<SchoolView> updateSchool(
            @RequestBody @Valid SchoolNameUpdateForm form,
            @PathVariable Long schoolId){

        School school = schoolRegistrationService.updateSchoolName(form, schoolId);
        return new EntityApiResponse<>(
                true,
                HttpStatus.OK.value(),
                Message.get("school.name.update.success"),
                new SchoolView(school)
        );
    }

    @PutMapping("update/email/{schoolId}")
    public EntityApiResponse<SchoolView> updateSchoolEmail(
            @RequestBody @Valid SchoolEmailUpdateForm form,
            @PathVariable Long schoolId){

        School school = schoolRegistrationService.updateSchoolEmail(form, schoolId);
        return new EntityApiResponse<>(
                true,
                HttpStatus.OK.value(),
                Message.get("school.email.update.success"),
                new SchoolView(school)
        );
    }

    @Autowired
    public void setSchoolRegistrationService(SchoolRegistrationService schoolRegistrationService) {
        this.schoolRegistrationService = schoolRegistrationService;
    }
}
