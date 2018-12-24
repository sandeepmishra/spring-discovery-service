package org.springboot.starter.springdiscoveryservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery-service")
public class DiscoveryServiceController {


    @Value("${service.instance.name}")
    private String instance;

    @RequestMapping("/instance")
    public String message(){
        return "Hello instance "+instance;
    }
}
