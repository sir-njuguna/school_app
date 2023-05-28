package com.school_app.school.service;

import com.school_app.lib.exception.CommonRuntimeException;
import com.school_app.lib.exception.ExceptionType;
import com.school_app.school.form.SchoolEmailUpdateForm;
import com.school_app.school.form.SchoolRegistrationForm;
import com.school_app.school.form.SchoolNameUpdateForm;
import com.school_app.school.model.School;
import com.school_app.school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolRegistrationService {
    private SchoolRepository schoolRepository;

    public School register(SchoolRegistrationForm form){
        School school = new School();
        school.setName(form.getName());
        school.setPhysicalAddress(form.getPhysicalAddress());
        school.setEmailAddress(form.getEmailAddress());
        school.setPhoneNumber(form.getPhoneNumber());

        return schoolRepository.save(school);
    }

    public School updateSchoolName(SchoolNameUpdateForm form, Long schoolId){
        Optional<School> schoolOpt = schoolRepository.findById(schoolId);
        if(schoolOpt.isEmpty()){
            throw new CommonRuntimeException( ExceptionType.NOT_FOUND,"entity.not.found");
        }

        School school = schoolOpt.get();
        school.setName(form.getName());
        return schoolRepository.save(school);
    }

    public School updateSchoolEmail(SchoolEmailUpdateForm form, Long schoolId){
        Optional<School> schoolOpt = schoolRepository.findById(schoolId);
        if(schoolOpt.isEmpty()){
            throw new CommonRuntimeException( ExceptionType.NOT_FOUND,"entity.not.found");
        }

        School school = schoolOpt.get();
        school.setEmailAddress(form.getEmailAddress());
        return schoolRepository.save(school);
    }

    @Autowired
    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
}
