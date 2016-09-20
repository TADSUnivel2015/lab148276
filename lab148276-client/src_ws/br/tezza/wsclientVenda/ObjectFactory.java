
package br.tezza.wsclientVenda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.tezza.wsclientVenda package. 
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

    private final static QName _ServletException_QNAME = new QName("http://jaxWS.tezza.br/", "ServletException");
    private final static QName _EnviarVenda_QNAME = new QName("http://jaxWS.tezza.br/", "enviarVenda");
    private final static QName _EnviarVendaResponse_QNAME = new QName("http://jaxWS.tezza.br/", "enviarVendaResponse");
    private final static QName _IOException_QNAME = new QName("http://jaxWS.tezza.br/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.tezza.wsclientVenda
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
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link EnviarVendaResponse }
     * 
     */
    public EnviarVendaResponse createEnviarVendaResponse() {
        return new EnviarVendaResponse();
    }

    /**
     * Create an instance of {@link EnviarVenda }
     * 
     */
    public EnviarVenda createEnviarVenda() {
        return new EnviarVenda();
    }

    /**
     * Create an instance of {@link PojoVenda }
     * 
     */
    public PojoVenda createPojoVenda() {
        return new PojoVenda();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarVenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "enviarVenda")
    public JAXBElement<EnviarVenda> createEnviarVenda(EnviarVenda value) {
        return new JAXBElement<EnviarVenda>(_EnviarVenda_QNAME, EnviarVenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "enviarVendaResponse")
    public JAXBElement<EnviarVendaResponse> createEnviarVendaResponse(EnviarVendaResponse value) {
        return new JAXBElement<EnviarVendaResponse>(_EnviarVendaResponse_QNAME, EnviarVendaResponse.class, null, value);
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
