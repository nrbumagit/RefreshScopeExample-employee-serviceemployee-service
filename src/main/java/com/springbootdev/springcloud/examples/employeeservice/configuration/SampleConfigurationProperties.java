package com.springbootdev.springcloud.examples.employeeservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "app")
@Component
public class SampleConfigurationProperties {

    private String serviceName;
    private String welcome;

}
