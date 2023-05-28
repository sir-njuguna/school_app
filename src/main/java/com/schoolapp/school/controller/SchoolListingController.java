package com.school_app.school.controller;

import com.school_app.lib.view.PagedEntityApiResponse;
import com.school_app.school.service.SchoolRetrievalService;
import com.school_app.school.view.SchoolView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("school")
public class SchoolListingController {
    private SchoolRetrievalService schoolRetrievalService;
    @GetMapping("list")
    public PagedEntityApiResponse<List<SchoolView>> fetch(
            @RequestParam(value = "pageNum", required = false, defaultValue = "0") Integer pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "100") Integer pageSize){

        return null;
    }

    @Autowired
    public void setSchoolRetrievalService(SchoolRetrievalService schoolRetrievalService) {
        this.schoolRetrievalService = schoolRetrievalService;
    }
}
