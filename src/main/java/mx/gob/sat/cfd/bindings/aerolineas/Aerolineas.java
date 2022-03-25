//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:38:49 PM CST 
//


package mx.gob.sat.cfd.bindings.aerolineas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="OtrosCargos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Cargo" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CodigoCargo" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="8"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Importe" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TotalCargos" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="TUA" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "otrosCargos"
})
@XmlRootElement(name = "Aerolineas")
public class Aerolineas
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OtrosCargos")
    protected Aerolineas.OtrosCargos otrosCargos;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TUA", required = true)
    protected BigDecimal tua;

    /**
     * Gets the value of the otrosCargos property.
     * 
     * @return
     *     possible object is
     *     {@link Aerolineas.OtrosCargos }
     *     
     */
    public Aerolineas.OtrosCargos getOtrosCargos() {
        return otrosCargos;
    }

    /**
     * Sets the value of the otrosCargos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aerolineas.OtrosCargos }
     *     
     */
    public void setOtrosCargos(Aerolineas.OtrosCargos value) {
        this.otrosCargos = value;
    }

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
     * Gets the value of the tua property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTUA() {
        return tua;
    }

    /**
     * Sets the value of the tua property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTUA(BigDecimal value) {
        this.tua = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Cargo" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CodigoCargo" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="8"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Importe" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TotalCargos" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cargo"
    })
    public static class OtrosCargos
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Cargo", required = true)
        protected List<Aerolineas.OtrosCargos.Cargo> cargo;
        @XmlAttribute(name = "TotalCargos", required = true)
        protected BigDecimal totalCargos;

        /**
         * Gets the value of the cargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Aerolineas.OtrosCargos.Cargo }
         * 
         * 
         */
        public List<Aerolineas.OtrosCargos.Cargo> getCargo() {
            if (cargo == null) {
                cargo = new ArrayList<Aerolineas.OtrosCargos.Cargo>();
            }
            return this.cargo;
        }

        /**
         * Gets the value of the totalCargos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalCargos() {
            return totalCargos;
        }

        /**
         * Sets the value of the totalCargos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalCargos(BigDecimal value) {
            this.totalCargos = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="CodigoCargo" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="8"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Importe" use="required" type="{http://www.sat.gob.mx/aerolineas}t_Importe" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Cargo
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "CodigoCargo", required = true)
            protected String codigoCargo;
            @XmlAttribute(name = "Importe", required = true)
            protected BigDecimal importe;

            /**
             * Gets the value of the codigoCargo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoCargo() {
                return codigoCargo;
            }

            /**
             * Sets the value of the codigoCargo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoCargo(String value) {
                this.codigoCargo = value;
            }

            /**
             * Gets the value of the importe property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporte() {
                return importe;
            }

            /**
             * Sets the value of the importe property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporte(BigDecimal value) {
                this.importe = value;
            }

        }

    }

}
