//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:39:04 PM CST 
//


package mx.gob.sat.cfd.bindings.iedu;

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
 *       &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="nombreAlumno" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CURP" use="required" type="{http://www.sat.gob.mx/iedu}tCURP" /&gt;
 *       &lt;attribute name="nivelEducativo" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Preescolar"/&gt;
 *             &lt;enumeration value="Primaria"/&gt;
 *             &lt;enumeration value="Secundaria"/&gt;
 *             &lt;enumeration value="Profesional técnico"/&gt;
 *             &lt;enumeration value="Bachillerato o su equivalente"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="autRVOE" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rfcPago" type="{http://www.sat.gob.mx/iedu}tRFC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "instEducativas")
public class InstEducativas
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "nombreAlumno", required = true)
    protected String nombreAlumno;
    @XmlAttribute(name = "CURP", required = true)
    protected String curp;
    @XmlAttribute(name = "nivelEducativo", required = true)
    protected String nivelEducativo;
    @XmlAttribute(name = "autRVOE", required = true)
    protected String autRVOE;
    @XmlAttribute(name = "rfcPago")
    protected String rfcPago;

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
     * Gets the value of the nombreAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Sets the value of the nombreAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Gets the value of the curp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Sets the value of the curp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Gets the value of the nivelEducativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelEducativo() {
        return nivelEducativo;
    }

    /**
     * Sets the value of the nivelEducativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelEducativo(String value) {
        this.nivelEducativo = value;
    }

    /**
     * Gets the value of the autRVOE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutRVOE() {
        return autRVOE;
    }

    /**
     * Sets the value of the autRVOE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutRVOE(String value) {
        this.autRVOE = value;
    }

    /**
     * Gets the value of the rfcPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPago() {
        return rfcPago;
    }

    /**
     * Sets the value of the rfcPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPago(String value) {
        this.rfcPago = value;
    }

}
