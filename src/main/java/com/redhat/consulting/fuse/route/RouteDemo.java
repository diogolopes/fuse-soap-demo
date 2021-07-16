package com.redhat.consulting.fuse.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.springframework.stereotype.Component;

@Component
public class RouteDemo extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	
		 from("timer://foo?fixedRate=true&period=5000")
		 .routeId("capitalCitySoapEndpoint")		 
		 .setBody(constant("US"))
		 .process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				
				CountryInfoService x = new CountryInfoService();
				System.out.println(x.getCountryInfoServiceSoap().capitalCity("US"));
				
			}
		});
		     
		
	}
}
