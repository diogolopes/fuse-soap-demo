package com.redhat.consulting.fuse.service;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlElement;

import com.redhat.consulting.fuse.service.model.WhoisRequest;
import com.redhat.consulting.fuse.service.model.WhoisResponse;

@WebService(targetNamespace="http://soap.endpoints.whois.com/")

public interface ISoapWhoisService {

    @POST
    @Path("/whois")
    public WhoisResponse check(@WebParam(name = "whois11") @XmlElement(required = true) WhoisRequest request);

}