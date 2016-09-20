
package br.tezza.wsclientVenda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pojoVenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pojoVenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itensVenda" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalVenda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pojoVenda", propOrder = {
    "idVenda",
    "itensVenda",
    "totalVenda"
})
public class PojoVenda {

    protected int idVenda;
    @XmlElement(nillable = true)
    protected List<String> itensVenda;
    protected BigDecimal totalVenda;

    /**
     * Gets the value of the idVenda property.
     * 
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * Sets the value of the idVenda property.
     * 
     */
    public void setIdVenda(int value) {
        this.idVenda = value;
    }

    /**
     * Gets the value of the itensVenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensVenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensVenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItensVenda() {
        if (itensVenda == null) {
            itensVenda = new ArrayList<String>();
        }
        return this.itensVenda;
    }

    /**
     * Gets the value of the totalVenda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    /**
     * Sets the value of the totalVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVenda(BigDecimal value) {
        this.totalVenda = value;
    }

}
