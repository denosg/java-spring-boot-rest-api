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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired //Spring auto configs this
    private CurrencyServConfig config;
    @RequestMapping("/currency-configuration")
    public CurrencyServConfig fetchInfo() {
        return config;
    }
}
