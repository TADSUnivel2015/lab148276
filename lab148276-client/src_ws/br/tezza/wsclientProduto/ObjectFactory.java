
package br.tezza.wsclientProduto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.tezza.wsclientProduto package. 
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

    private final static QName _ExcluirResponse_QNAME = new QName("http://jaxWS.tezza.br/", "excluirResponse");
    private final static QName _ListarTodos_QNAME = new QName("http://jaxWS.tezza.br/", "listarTodos");
    private final static QName _Atualizar_QNAME = new QName("http://jaxWS.tezza.br/", "atualizar");
    private final static QName _AtualizarResponse_QNAME = new QName("http://jaxWS.tezza.br/", "atualizarResponse");
    private final static QName _Gravar_QNAME = new QName("http://jaxWS.tezza.br/", "gravar");
    private final static QName _Excluir_QNAME = new QName("http://jaxWS.tezza.br/", "excluir");
    private final static QName _GravarResponse_QNAME = new QName("http://jaxWS.tezza.br/", "gravarResponse");
    private final static QName _ListarTodosResponse_QNAME = new QName("http://jaxWS.tezza.br/", "listarTodosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.tezza.wsclientProduto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Excluir }
     * 
     */
    public Excluir createExcluir() {
        return new Excluir();
    }

    /**
     * Create an instance of {@link Atualizar }
     * 
     */
    public Atualizar createAtualizar() {
        return new Atualizar();
    }

    /**
     * Create an instance of {@link AtualizarResponse }
     * 
     */
    public AtualizarResponse createAtualizarResponse() {
        return new AtualizarResponse();
    }

    /**
     * Create an instance of {@link Gravar }
     * 
     */
    public Gravar createGravar() {
        return new Gravar();
    }

    /**
     * Create an instance of {@link ExcluirResponse }
     * 
     */
    public ExcluirResponse createExcluirResponse() {
        return new ExcluirResponse();
    }

    /**
     * Create an instance of {@link ListarTodos }
     * 
     */
    public ListarTodos createListarTodos() {
        return new ListarTodos();
    }

    /**
     * Create an instance of {@link ListarTodosResponse }
     * 
     */
    public ListarTodosResponse createListarTodosResponse() {
        return new ListarTodosResponse();
    }

    /**
     * Create an instance of {@link GravarResponse }
     * 
     */
    public GravarResponse createGravarResponse() {
        return new GravarResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "excluirResponse")
    public JAXBElement<ExcluirResponse> createExcluirResponse(ExcluirResponse value) {
        return new JAXBElement<ExcluirResponse>(_ExcluirResponse_QNAME, ExcluirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "listarTodos")
    public JAXBElement<ListarTodos> createListarTodos(ListarTodos value) {
        return new JAXBElement<ListarTodos>(_ListarTodos_QNAME, ListarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "atualizar")
    public JAXBElement<Atualizar> createAtualizar(Atualizar value) {
        return new JAXBElement<Atualizar>(_Atualizar_QNAME, Atualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "atualizarResponse")
    public JAXBElement<AtualizarResponse> createAtualizarResponse(AtualizarResponse value) {
        return new JAXBElement<AtualizarResponse>(_AtualizarResponse_QNAME, AtualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Gravar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "gravar")
    public JAXBElement<Gravar> createGravar(Gravar value) {
        return new JAXBElement<Gravar>(_Gravar_QNAME, Gravar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Excluir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "excluir")
    public JAXBElement<Excluir> createExcluir(Excluir value) {
        return new JAXBElement<Excluir>(_Excluir_QNAME, Excluir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GravarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "gravarResponse")
    public JAXBElement<GravarResponse> createGravarResponse(GravarResponse value) {
        return new JAXBElement<GravarResponse>(_GravarResponse_QNAME, GravarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxWS.tezza.br/", name = "listarTodosResponse")
    public JAXBElement<ListarTodosResponse> createListarTodosResponse(ListarTodosResponse value) {
        return new JAXBElement<ListarTodosResponse>(_ListarTodosResponse_QNAME, ListarTodosResponse.class, null, value);
    }

}
