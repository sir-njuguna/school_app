package com.school_app.lib.repository;

import com.school_app.lib.model.BaseModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T extends BaseModel> extends JpaRepository<T, Long> {
    Sort DEFAULT_SORT = Sort.by(Sort.Direction.DESC, "timeCreatedInMs");

    Optional<T> findTopByOrderByTimeCreatedDesc();

    Page<T> findByTimeCreatedBetween(Date startDate, Date endDate, Pageable pageable);

    static Pageable defaultPageable(Integer pageNum, Integer pageSize) {
        return PageRequest.of(
                pageNum,
                pageSize,
                DEFAULT_SORT
        );
    }
}
