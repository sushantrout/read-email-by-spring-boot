package com.grandview.bean;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.grandview.model.EmailConfig;

@Configuration
public class JavaMailSender {
	@Autowired
	private EmailConfig config;
	@Bean
	public JavaMailSenderImpl getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost(config.getHost());
	    mailSender.setPort(config.getPort());
	    
	    mailSender.setUsername(config.getUsername());
	    mailSender.setPassword(config.getPassword());
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", config.getProtocol());
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	    
	    return mailSender;
	}
}
