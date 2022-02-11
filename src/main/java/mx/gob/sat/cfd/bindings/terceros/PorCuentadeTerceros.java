//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 11:14:21 PM CST 
//


package mx.gob.sat.cfd.bindings.terceros;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="InformacionFiscalTercero"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.sat.gob.mx/terceros}t_UbicacionFiscal"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="InformacionAduanera" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.sat.gob.mx/terceros}t_InformacionAduanera"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/terceros}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="cantidad" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="unidad"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="noIdentificacion"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="descripcion" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
 *                           &lt;attribute name="importe" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CuentaPredial" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="numero" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" /&gt;
 *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/terceros}t_RFC" /&gt;
 *       &lt;attribute name="nombre" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
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
    "informacionFiscalTercero"
})
@XmlRootElement(name = "PorCuentadeTerceros")
public class PorCuentadeTerceros
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InformacionFiscalTercero", required = true)
    protected PorCuentadeTerceros.InformacionFiscalTercero informacionFiscalTercero;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "rfc", required = true)
    protected String rfc;
    @XmlAttribute(name = "nombre", required = true)
    protected String nombre;

    /**
     * Gets the value of the informacionFiscalTercero property.
     * 
     * @return
     *     possible object is
     *     {@link PorCuentadeTerceros.InformacionFiscalTercero }
     *     
     */
    public PorCuentadeTerceros.InformacionFiscalTercero getInformacionFiscalTercero() {
        return informacionFiscalTercero;
    }

    /**
     * Sets the value of the informacionFiscalTercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link PorCuentadeTerceros.InformacionFiscalTercero }
     *     
     */
    public void setInformacionFiscalTercero(PorCuentadeTerceros.InformacionFiscalTercero value) {
        this.informacionFiscalTercero = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.sat.gob.mx/terceros}t_UbicacionFiscal"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="InformacionAduanera" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.sat.gob.mx/terceros}t_InformacionAduanera"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/terceros}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="cantidad" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="unidad"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;minLength value="1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="noIdentificacion"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="descripcion" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
     *                 &lt;attribute name="importe" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CuentaPredial" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="numero" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;minLength value="1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "informacionAduanera",
        "parte",
        "cuentaPredial"
    })
    public static class InformacionFiscalTercero
        extends TUbicacionFiscal
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "InformacionAduanera")
        protected PorCuentadeTerceros.InformacionFiscalTercero.InformacionAduanera informacionAduanera;
        @XmlElement(name = "Parte")
        protected List<PorCuentadeTerceros.InformacionFiscalTercero.Parte> parte;
        @XmlElement(name = "CuentaPredial")
        protected PorCuentadeTerceros.InformacionFiscalTercero.CuentaPredial cuentaPredial;

        /**
         * Gets the value of the informacionAduanera property.
         * 
         * @return
         *     possible object is
         *     {@link PorCuentadeTerceros.InformacionFiscalTercero.InformacionAduanera }
         *     
         */
        public PorCuentadeTerceros.InformacionFiscalTercero.InformacionAduanera getInformacionAduanera() {
            return informacionAduanera;
        }

        /**
         * Sets the value of the informacionAduanera property.
         * 
         * @param value
         *     allowed object is
         *     {@link PorCuentadeTerceros.InformacionFiscalTercero.InformacionAduanera }
         *     
         */
        public void setInformacionAduanera(PorCuentadeTerceros.InformacionFiscalTercero.InformacionAduanera value) {
            this.informacionAduanera = value;
        }

        /**
         * Gets the value of the parte property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parte property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParte().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PorCuentadeTerceros.InformacionFiscalTercero.Parte }
         * 
         * 
         */
        public List<PorCuentadeTerceros.InformacionFiscalTercero.Parte> getParte() {
            if (parte == null) {
                parte = new ArrayList<PorCuentadeTerceros.InformacionFiscalTercero.Parte>();
            }
            return this.parte;
        }

        /**
         * Gets the value of the cuentaPredial property.
         * 
         * @return
         *     possible object is
         *     {@link PorCuentadeTerceros.InformacionFiscalTercero.CuentaPredial }
         *     
         */
        public PorCuentadeTerceros.InformacionFiscalTercero.CuentaPredial getCuentaPredial() {
            return cuentaPredial;
        }

        /**
         * Sets the value of the cuentaPredial property.
         * 
         * @param value
         *     allowed object is
         *     {@link PorCuentadeTerceros.InformacionFiscalTercero.CuentaPredial }
         *     
         */
        public void setCuentaPredial(PorCuentadeTerceros.InformacionFiscalTercero.CuentaPredial value) {
            this.cuentaPredial = value;
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
         *       &lt;attribute name="numero" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;minLength value="1"/&gt;
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
        public static class CuentaPredial
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "numero", required = true)
            protected String numero;

            /**
             * Gets the value of the numero property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero() {
                return numero;
            }

            /**
             * Sets the value of the numero property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero(String value) {
                this.numero = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.sat.gob.mx/terceros}t_InformacionAduanera"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InformacionAduanera
            extends TInformacionAduanera
            implements Serializable
        {

            private final static long serialVersionUID = 1L;

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
         *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/terceros}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="cantidad" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="unidad"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;minLength value="1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="noIdentificacion"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="descripcion" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
         *       &lt;attribute name="importe" type="{http://www.sat.gob.mx/terceros}t_Importe" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "informacionAduanera"
        })
        public static class Parte
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlElement(name = "InformacionAduanera")
            protected List<TInformacionAduanera> informacionAduanera;
            @XmlAttribute(name = "cantidad", required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(name = "unidad")
            protected String unidad;
            @XmlAttribute(name = "noIdentificacion")
            protected String noIdentificacion;
            @XmlAttribute(name = "descripcion", required = true)
            protected String descripcion;
            @XmlAttribute(name = "valorUnitario")
            protected BigDecimal valorUnitario;
            @XmlAttribute(name = "importe")
            protected BigDecimal importe;

            /**
             * Gets the value of the informacionAduanera property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInformacionAduanera().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TInformacionAduanera }
             * 
             * 
             */
            public List<TInformacionAduanera> getInformacionAduanera() {
                if (informacionAduanera == null) {
                    informacionAduanera = new ArrayList<TInformacionAduanera>();
                }
                return this.informacionAduanera;
            }

            /**
             * Gets the value of the cantidad property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Sets the value of the cantidad property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Gets the value of the unidad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Sets the value of the unidad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidad(String value) {
                this.unidad = value;
            }

            /**
             * Gets the value of the noIdentificacion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoIdentificacion() {
                return noIdentificacion;
            }

            /**
             * Sets the value of the noIdentificacion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoIdentificacion(String value) {
                this.noIdentificacion = value;
            }

            /**
             * Gets the value of the descripcion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Sets the value of the descripcion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Gets the value of the valorUnitario property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Sets the value of the valorUnitario property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorUnitario(BigDecimal value) {
                this.valorUnitario = value;
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
