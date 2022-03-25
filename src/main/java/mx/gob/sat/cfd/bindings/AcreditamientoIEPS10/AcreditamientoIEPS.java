//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.24 at 06:39:00 PM CST 
//


package mx.gob.sat.cfd.bindings.AcreditamientoIEPS10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="TAR" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.sat.gob.mx/acreditamiento}c_TAR"&gt;
 *             &lt;length value="3"/&gt;
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
@XmlRootElement(name = "acreditamientoIEPS")
public class AcreditamientoIEPS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TAR", required = true)
    protected String tar;

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
     * Gets the value of the tar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAR() {
        return tar;
    }

    /**
     * Sets the value of the tar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAR(String value) {
        this.tar = value;
    }

}
