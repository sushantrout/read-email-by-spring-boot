package com.grandview.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.mail")
public class EmailConfig {
	private String host;
	private Integer port;
	private String username;
	private String password; 
	private String protocol;
}
