package com.cmcprueba.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Enable Spring services
//Spring COnfiguration
@EnableWs
@Configuration
public class WebServiceconfig {
	//messageDispatcherServlet
	//aplicationCOntext
	//url -> /ws/*
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	}
	
	//  /ws/users.wsdl
	//PostType - UserPort
	//namespase - http://cmcprueba.com/users
	// user-details.xsd
	@Bean(name = "users")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema coursesSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("UserPort");
		definition.setTargetNamespace("http://cmcprueba.com/users");
		definition.setLocationUri("/ws");
		definition.setSchema(coursesSchema);
		return definition;
	}
	
	@Bean
	public XsdSchema coursesShema() {
		return new SimpleXsdSchema(new ClassPathResource("user-details.xsd"));
	}
}
