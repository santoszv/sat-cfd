//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 11:14:21 PM CST 
//


package mx.gob.sat.cfd.bindings.valesdedespensa;

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
 *       &lt;sequence&gt;
 *         &lt;element name="Conceptos"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Concepto" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="identificador" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="20"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="fecha" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_RFC" /&gt;
 *                           &lt;attribute name="curp" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_CURP" /&gt;
 *                           &lt;attribute name="nombre" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="100"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="numSeguridadSocial"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="15"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="importe" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="tipoOperacion" use="required" fixed="monedero electrónico"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="registroPatronal"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="20"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numeroDeCuenta" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="20"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="total" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;fractionDigits value="2"/&gt;
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
@XmlType(name = "", propOrder = {
    "conceptos"
})
@XmlRootElement(name = "ValesDeDespensa")
public class ValesDeDespensa
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Conceptos", required = true)
    protected ValesDeDespensa.Conceptos conceptos;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "tipoOperacion", required = true)
    protected String tipoOperacion;
    @XmlAttribute(name = "registroPatronal")
    protected String registroPatronal;
    @XmlAttribute(name = "numeroDeCuenta", required = true)
    protected String numeroDeCuenta;
    @XmlAttribute(name = "total", required = true)
    protected BigDecimal total;

    /**
     * Gets the value of the conceptos property.
     * 
     * @return
     *     possible object is
     *     {@link ValesDeDespensa.Conceptos }
     *     
     */
    public ValesDeDespensa.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Sets the value of the conceptos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValesDeDespensa.Conceptos }
     *     
     */
    public void setConceptos(ValesDeDespensa.Conceptos value) {
        this.conceptos = value;
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
     * Gets the value of the tipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        if (tipoOperacion == null) {
            return "monedero electr\u00f3nico";
        } else {
            return tipoOperacion;
        }
    }

    /**
     * Sets the value of the tipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Gets the value of the registroPatronal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Sets the value of the registroPatronal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Gets the value of the numeroDeCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Sets the value of the numeroDeCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeCuenta(String value) {
        this.numeroDeCuenta = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
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
     *         &lt;element name="Concepto" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="identificador" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="20"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="fecha" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_RFC" /&gt;
     *                 &lt;attribute name="curp" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_CURP" /&gt;
     *                 &lt;attribute name="nombre" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="100"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="numSeguridadSocial"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="15"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="importe" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "concepto"
    })
    public static class Conceptos
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Concepto", required = true)
        protected List<ValesDeDespensa.Conceptos.Concepto> concepto;

        /**
         * Gets the value of the concepto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concepto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcepto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValesDeDespensa.Conceptos.Concepto }
         * 
         * 
         */
        public List<ValesDeDespensa.Conceptos.Concepto> getConcepto() {
            if (concepto == null) {
                concepto = new ArrayList<ValesDeDespensa.Conceptos.Concepto>();
            }
            return this.concepto;
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
         *       &lt;attribute name="identificador" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="20"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="fecha" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_RFC" /&gt;
         *       &lt;attribute name="curp" use="required" type="{http://www.sat.gob.mx/valesdedespensa}t_CURP" /&gt;
         *       &lt;attribute name="nombre" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="100"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="numSeguridadSocial"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="15"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="importe" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="2"/&gt;
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
        public static class Concepto
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "identificador", required = true)
            protected String identificador;
            @XmlAttribute(name = "fecha", required = true)
            protected XMLGregorianCalendar fecha;
            @XmlAttribute(name = "rfc", required = true)
            protected String rfc;
            @XmlAttribute(name = "curp", required = true)
            protected String curp;
            @XmlAttribute(name = "nombre", required = true)
            protected String nombre;
            @XmlAttribute(name = "numSeguridadSocial")
            protected String numSeguridadSocial;
            @XmlAttribute(name = "importe", required = true)
            protected BigDecimal importe;

            /**
             * Gets the value of the identificador property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificador() {
                return identificador;
            }

            /**
             * Sets the value of the identificador property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentificador(String value) {
                this.identificador = value;
            }

            /**
             * Gets the value of the fecha property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFecha() {
                return fecha;
            }

            /**
             * Sets the value of the fecha property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFecha(XMLGregorianCalendar value) {
                this.fecha = value;
            }

            /**
             * Gets the value of the rfc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRfc() {
                return rfc;
            }

            /**
             * Sets the value of the rfc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRfc(String value) {
                this.rfc = value;
            }

            /**
             * Gets the value of the curp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurp() {
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
            public void setCurp(String value) {
                this.curp = value;
            }

            /**
             * Gets the value of the nombre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Sets the value of the nombre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Gets the value of the numSeguridadSocial property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumSeguridadSocial() {
                return numSeguridadSocial;
            }

            /**
             * Sets the value of the numSeguridadSocial property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumSeguridadSocial(String value) {
                this.numSeguridadSocial = value;
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