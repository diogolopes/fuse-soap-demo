package com.redhat.consulting.fuse.service.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SoapWhoisResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class WhoisResponse implements Serializable {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -2186171365186926678L;	
	public String code;
	public String domain;
	public String owner;
	public String ownerId;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}	


}
