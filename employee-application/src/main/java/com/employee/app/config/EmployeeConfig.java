package com.employee.app.config;

import org.modelmapper.ModelMapper;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
    
    @Bean
    @LoadBalanced  // This is the single annotation responsible for loadbalancing.
    public RestTemplate getRestTemplate() {
    	return new RestTemplate();
    }
}
