package com.academy.course.endpoint.service;

import com.academy.course.endpoint.model.Course;
import com.academy.course.endpoint.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;

    public Iterable<Course>listAll(Pageable pageable){
        log.info("Listing all courses");
        return repository.findAll(pageable);
    }
}
