package com.school_app.school.service;

import com.school_app.lib.view.PagedEntityApiResponse;
import com.school_app.school.repository.SchoolRepository;
import com.school_app.school.view.SchoolView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolRetrievalService {
    private SchoolRepository schoolRepository;

    public PagedEntityApiResponse<List<SchoolView>> getSchools(Integer pageNum, Integer pageSize){

    }

    @Autowired
    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
}
