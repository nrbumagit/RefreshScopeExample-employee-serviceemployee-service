package com.springbootdev.springcloud.examples.employeeservice.controller;

import com.springbootdev.springcloud.examples.employeeservice.configuration.SampleConfigurationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerToTestConfigurationPropertiesAccess {

    private final SampleConfigurationProperties sampleConfigurationProperties;

    @GetMapping("/configuration")
    public String getServiceName() {
        return "service name : [" + sampleConfigurationProperties.getServiceName() + "] , " +
                " welcome message : [" + sampleConfigurationProperties.getWelcome() + "]"
                ;
    }

}
