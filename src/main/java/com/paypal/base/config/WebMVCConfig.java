package com.paypal.base.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan("com.paypal.*")
@EnableWebMvc
public class WebMVCConfig extends WebMvcConfigurationSupport {
	
	
}
