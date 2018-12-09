
package br.com.soc.tardelli.examws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExamsPortService", targetNamespace = "http://tardelli.soc.com.br/examws", wsdlLocation = "http://localhost:8080/ws/exams.wsdl")
public class ExamsPortService
    extends Service
{

    private final static URL EXAMSPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXAMSPORTSERVICE_EXCEPTION;
    private final static QName EXAMSPORTSERVICE_QNAME = new QName("http://tardelli.soc.com.br/examws", "ExamsPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/exams.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMSPORTSERVICE_WSDL_LOCATION = url;
        EXAMSPORTSERVICE_EXCEPTION = e;
    }

    public ExamsPortService() {
        super(__getWsdlLocation(), EXAMSPORTSERVICE_QNAME);
    }

    public ExamsPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMSPORTSERVICE_QNAME, features);
    }

    public ExamsPortService(URL wsdlLocation) {
        super(wsdlLocation, EXAMSPORTSERVICE_QNAME);
    }

    public ExamsPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMSPORTSERVICE_QNAME, features);
    }

    public ExamsPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExamsPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExamsPort
     */
    @WebEndpoint(name = "ExamsPortSoap11")
    public ExamsPort getExamsPortSoap11() {
        return super.getPort(new QName("http://tardelli.soc.com.br/examws", "ExamsPortSoap11"), ExamsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExamsPort
     */
    @WebEndpoint(name = "ExamsPortSoap11")
    public ExamsPort getExamsPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://tardelli.soc.com.br/examws", "ExamsPortSoap11"), ExamsPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMSPORTSERVICE_EXCEPTION!= null) {
            throw EXAMSPORTSERVICE_EXCEPTION;
        }
        return EXAMSPORTSERVICE_WSDL_LOCATION;
    }

}