
package br.tezza.wsclientProduto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listarTodosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listarTodosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoListarTodos" type="{http://jaxWS.tezza.br/}produto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarTodosResponse", propOrder = {
    "resultadoListarTodos"
})
public class ListarTodosResponse {

    protected List<Produto> resultadoListarTodos;

    /**
     * Gets the value of the resultadoListarTodos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultadoListarTodos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultadoListarTodos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Produto }
     * 
     * 
     */
    public List<Produto> getResultadoListarTodos() {
        if (resultadoListarTodos == null) {
            resultadoListarTodos = new ArrayList<Produto>();
        }
        return this.resultadoListarTodos;
    }

}
