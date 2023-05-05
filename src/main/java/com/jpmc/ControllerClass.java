package com.jpmc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-docker-jenkins-poc")
public class ControllerClass {

    @GetMapping("/greeting")
    public String greeting(){
        return "Hello Springboot, Docker And Jenkins";
    }

}
