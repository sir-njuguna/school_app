package com.schoolapp.school.service;

import com.schoolapp.lib.repository.BaseRepository;
import com.schoolapp.lib.view.PagedEntityApiResponse;
import com.schoolapp.school.model.School;
import com.schoolapp.school.repository.SchoolRepository;
import com.schoolapp.school.view.SchoolView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolRetrievalService {
    private SchoolRepository schoolRepository;

    public PagedEntityApiResponse<List<SchoolView>> getSchools(Integer pageNum, Integer pageSize){
        Page<School> page = schoolRepository.findAll(BaseRepository.defaultPageable(pageNum, pageSize));

        List<SchoolView> views = page.stream()
                .map(SchoolView::new)
                .collect(Collectors.toList());

        return new PagedEntityApiResponse<>(page, views);
    }

    @Autowired
    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
}
