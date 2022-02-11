//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 11:14:22 PM CST 
//


package mx.gob.sat.cfd.bindings.ventavehiculos11;

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
 *       &lt;choice&gt;
 *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                 &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" /&gt;
 *                 &lt;attribute name="importe" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.1" /&gt;
 *       &lt;attribute name="ClaveVehicular" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Niv" use="required"&gt;
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
    "informacionAduanera",
    "parte"
})
@XmlRootElement(name = "VentaVehiculos")
public class VentaVehiculos
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InformacionAduanera")
    protected List<TInformacionAduanera> informacionAduanera;
    @XmlElement(name = "Parte")
    protected List<VentaVehiculos.Parte> parte;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "ClaveVehicular", required = true)
    protected String claveVehicular;
    @XmlAttribute(name = "Niv", required = true)
    protected String niv;

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
     * {@link VentaVehiculos.Parte }
     * 
     * 
     */
    public List<VentaVehiculos.Parte> getParte() {
        if (parte == null) {
            parte = new ArrayList<VentaVehiculos.Parte>();
        }
        return this.parte;
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
            return "1.1";
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
     * Gets the value of the claveVehicular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveVehicular() {
        return claveVehicular;
    }

    /**
     * Sets the value of the claveVehicular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveVehicular(String value) {
        this.claveVehicular = value;
    }

    /**
     * Gets the value of the niv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiv() {
        return niv;
    }

    /**
     * Sets the value of the niv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiv(String value) {
        this.niv = value;
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
     *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/ventavehiculos}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
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
     *       &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" /&gt;
     *       &lt;attribute name="importe" type="{http://www.sat.gob.mx/ventavehiculos}t_Importe" /&gt;
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
