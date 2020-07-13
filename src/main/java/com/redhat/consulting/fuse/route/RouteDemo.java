package com.redhat.consulting.fuse.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class RouteDemo extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	
		
		from("cxf:bean:whoisSOAPEndpoint")
		.to("mock:xpto");
		
	}
}
