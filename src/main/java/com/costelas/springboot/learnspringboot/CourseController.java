package com.costelas.springboot.learnspringboot;

// httpL//localhost:8080/courses
// course details: id, name, author
// returns:
// [
//        {
//        "id":1,
//        "name":"Learn AWS",
//        "author":"costelas,"
//        }
// ]

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> fetchCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "costelas"),
                new Course(2, "Learn DevOps", "costelas")
        );
    }
}
