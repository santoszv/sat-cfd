//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:39:15 PM CST 
//


package mx.gob.sat.cfd.bindings.TimbreFiscalDigital;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" /&gt;
 *       &lt;attribute name="UUID" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;length value="36"/&gt;
 *             &lt;pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="FechaTimbrado" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="selloCFD" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="noCertificadoSAT" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;length value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="selloSAT" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "TimbreFiscalDigital")
public class TimbreFiscalDigital
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "UUID", required = true)
    protected String uuid;
    @XmlAttribute(name = "FechaTimbrado", required = true)
    protected XMLGregorianCalendar fechaTimbrado;
    @XmlAttribute(name = "selloCFD", required = true)
    protected String selloCFD;
    @XmlAttribute(name = "noCertificadoSAT", required = true)
    protected String noCertificadoSAT;
    @XmlAttribute(name = "selloSAT", required = true)
    protected String selloSAT;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fechaTimbrado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTimbrado() {
        return fechaTimbrado;
    }

    /**
     * Sets the value of the fechaTimbrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTimbrado(XMLGregorianCalendar value) {
        this.fechaTimbrado = value;
    }

    /**
     * Gets the value of the selloCFD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloCFD() {
        return selloCFD;
    }

    /**
     * Sets the value of the selloCFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloCFD(String value) {
        this.selloCFD = value;
    }

    /**
     * Gets the value of the noCertificadoSAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificadoSAT() {
        return noCertificadoSAT;
    }

    /**
     * Sets the value of the noCertificadoSAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificadoSAT(String value) {
        this.noCertificadoSAT = value;
    }

    /**
     * Gets the value of the selloSAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloSAT() {
        return selloSAT;
    }

    /**
     * Sets the value of the selloSAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloSAT(String value) {
        this.selloSAT = value;
    }

}
