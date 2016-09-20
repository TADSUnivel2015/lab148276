
package br.tezza.wsclientEntrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pojoEntrega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pojoEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEntrega" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idEntrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pojoEntrega", propOrder = {
    "dataEntrega",
    "idEntrega"
})
public class PojoEntrega {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEntrega;
    protected int idEntrega;

    /**
     * Gets the value of the dataEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEntrega() {
        return dataEntrega;
    }

    /**
     * Sets the value of the dataEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEntrega(XMLGregorianCalendar value) {
        this.dataEntrega = value;
    }

    /**
     * Gets the value of the idEntrega property.
     * 
     */
    public int getIdEntrega() {
        return idEntrega;
    }

    /**
     * Sets the value of the idEntrega property.
     * 
     */
    public void setIdEntrega(int value) {
        this.idEntrega = value;
    }

}
