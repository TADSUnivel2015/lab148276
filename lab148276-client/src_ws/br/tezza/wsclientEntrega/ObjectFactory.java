
package br.tezza.wsclientEntrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.tezza.wsclientEntrega package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnviarEntrega_QNAME = new QName("http://jaxWS.tezza.br/", "enviarEntrega");
    private final static QName _ServletException_QNAME = new QName("http://jaxWS.tezza.br/", "ServletException");
    private final static QName _EnviarEntregaResponse_QNAME = new QName("http://jaxWS.tezza.br/", "enviarEntregaResponse");
    private final static QName _IOException_QNAME = new QName("http://jaxWS.tezza.br/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.tezza.wsclientEntrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServletException }
     * 
     */
    public ServletException createServletException() {
        return new ServletException();
    }

    /**
     * Create an instance of {@link EnviarEntrega }
     * 
     */
    public EnviarEntrega createEnviarEntrega() {
        return new EnviarEntrega();
    }

    /**
     * Create an instance of {@link EnviarEntregaResponse }
     * 
     */
    public EnviarEntregaResponse createEnviarEntregaResponse() {
        return new EnviarEntregaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link PojoEntrega }
     * 
     */
    public PojoEntrega createPojoEntrega() {
        return new PojoEntrega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "enviarEntrega")
    public JAXBElement<EnviarEntrega> createEnviarEntrega(EnviarEntrega value) {
        return new JAXBElement<EnviarEntrega>(_EnviarEntrega_QNAME, EnviarEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServletException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "ServletException")
    public JAXBElement<ServletException> createServletException(ServletException value) {
        return new JAXBElement<ServletException>(_ServletException_QNAME, ServletException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "enviarEntregaResponse")
    public JAXBElement<EnviarEntregaResponse> createEnviarEntregaResponse(EnviarEntregaResponse value) {
        return new JAXBElement<EnviarEntregaResponse>(_EnviarEntregaResponse_QNAME, EnviarEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
