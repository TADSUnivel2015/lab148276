
package br.tezza.wsclientEntrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enviarEntregaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enviarEntregaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoEntrega" type="{http://jaxWS.tezza.br/}pojoEntrega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarEntregaResponse", propOrder = {
    "resultadoEntrega"
})
public class EnviarEntregaResponse {

    protected PojoEntrega resultadoEntrega;

    /**
     * Gets the value of the resultadoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link PojoEntrega }
     *     
     */
    public PojoEntrega getResultadoEntrega() {
        return resultadoEntrega;
    }

    /**
     * Sets the value of the resultadoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link PojoEntrega }
     *     
     */
    public void setResultadoEntrega(PojoEntrega value) {
        this.resultadoEntrega = value;
    }

}
