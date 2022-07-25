package com.bl.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.annotations") 
@PropertySource("classpath:college-file.properties")
public class CollegeConfig {

}
