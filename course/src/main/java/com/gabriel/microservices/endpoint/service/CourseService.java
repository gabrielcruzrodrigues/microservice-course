package com.gabriel.microservices.endpoint.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gabriel.microservices.core.model.Course;
import org.gabriel.microservices.core.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> findAll(Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }

}
