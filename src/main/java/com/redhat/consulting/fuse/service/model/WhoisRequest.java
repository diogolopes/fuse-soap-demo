package com.redhat.consulting.fuse.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SoapWhoisRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class WhoisRequest {
	

    @XmlElement(required = true)
	public String domain;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	
}
