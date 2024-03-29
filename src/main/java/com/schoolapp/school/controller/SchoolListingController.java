package com.schoolapp.school.controller;

import com.schoolapp.lib.view.PagedEntityApiResponse;
import com.schoolapp.school.service.SchoolRetrievalService;
import com.schoolapp.school.view.SchoolView;
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

        return schoolRetrievalService.getSchools(pageNum, pageSize);
    }

    @Autowired
    public void setSchoolRetrievalService(SchoolRetrievalService schoolRetrievalService) {
        this.schoolRetrievalService = schoolRetrievalService;
    }
}
