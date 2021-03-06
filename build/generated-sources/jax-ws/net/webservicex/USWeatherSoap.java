
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "USWeatherSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface USWeatherSoap {


    /**
     * Get five day weather report for a given zipcode
     * 
     * @param zipCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetWeatherReport", action = "http://www.webserviceX.NET/GetWeatherReport")
    @WebResult(name = "GetWeatherReportResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetWeatherReport", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeatherReport")
    @ResponseWrapper(localName = "GetWeatherReportResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeatherReportResponse")
    public String getWeatherReport(
        @WebParam(name = "ZipCode", targetNamespace = "http://www.webserviceX.NET")
        String zipCode);

}
