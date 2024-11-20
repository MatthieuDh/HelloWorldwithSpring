package org.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.spring.services")
@PropertySource("classpath:application.properties")
public class ProjectConfig {
}
