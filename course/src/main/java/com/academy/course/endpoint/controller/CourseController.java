package com.academy.course.endpoint.controller;

import com.academy.course.endpoint.model.Course;
import com.academy.course.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/admin/course")
@Slf4j
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;


    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    private ResponseEntity<Iterable<Course>>listAll(Pageable pageable){
        return new ResponseEntity<>(service.listAll(pageable), HttpStatus.OK);
    }
}
