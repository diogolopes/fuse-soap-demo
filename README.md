
## To run

```
mvn clean generate-sources
```
```
mvn spring-boot:run
```

##capitalCitySoapEndpoint route

The route will invoke the WSDL *[http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl](http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?wsdl)* operation *capitalCity*

Request 

```

<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <CapitalCity xmlns="http://www.oorsprong.org/websamples.countryinfo">
      <sCountryISOCode>US</sCountryISOCode>
    </CapitalCity>
  </soap:Body>
</soap:Envelope>

```
