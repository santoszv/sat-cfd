//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.25 at 03:58:19 PM CST 
//


package mx.gob.sat.cfd.bindings.ine11;

import java.io.Serializable;
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
 *         &lt;element name="Entidad" maxOccurs="76" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="IdContabilidad" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;totalDigits value="6"/&gt;
 *                                 &lt;fractionDigits value="0"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ClaveEntidad" use="required" type="{http://www.sat.gob.mx/ine}t_ClaveEntidad" /&gt;
 *                 &lt;attribute name="Ambito"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.sat.gob.mx/ine}t_Ambito"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" fixed="1.1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TipoProceso" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_TipoProc"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TipoComite"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_TipoComite"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="IdContabilidad"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;totalDigits value="6"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
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
    "entidad"
})
@XmlRootElement(name = "INE")
public class INE
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Entidad")
    protected List<INE.Entidad> entidad;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TipoProceso", required = true)
    protected String tipoProceso;
    @XmlAttribute(name = "TipoComite")
    protected String tipoComite;
    @XmlAttribute(name = "IdContabilidad")
    protected Integer idContabilidad;

    /**
     * Gets the value of the entidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INE.Entidad }
     * 
     * 
     */
    public List<INE.Entidad> getEntidad() {
        if (entidad == null) {
            entidad = new ArrayList<INE.Entidad>();
        }
        return this.entidad;
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
     * Gets the value of the tipoProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Sets the value of the tipoProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Gets the value of the tipoComite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComite() {
        return tipoComite;
    }

    /**
     * Sets the value of the tipoComite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComite(String value) {
        this.tipoComite = value;
    }

    /**
     * Gets the value of the idContabilidad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdContabilidad() {
        return idContabilidad;
    }

    /**
     * Sets the value of the idContabilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdContabilidad(Integer value) {
        this.idContabilidad = value;
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
     *         &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="IdContabilidad" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;totalDigits value="6"/&gt;
     *                       &lt;fractionDigits value="0"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ClaveEntidad" use="required" type="{http://www.sat.gob.mx/ine}t_ClaveEntidad" /&gt;
     *       &lt;attribute name="Ambito"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_Ambito"&gt;
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
        "contabilidad"
    })
    public static class Entidad
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Contabilidad")
        protected List<INE.Entidad.Contabilidad> contabilidad;
        @XmlAttribute(name = "ClaveEntidad", required = true)
        protected String claveEntidad;
        @XmlAttribute(name = "Ambito")
        protected String ambito;

        /**
         * Gets the value of the contabilidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contabilidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContabilidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INE.Entidad.Contabilidad }
         * 
         * 
         */
        public List<INE.Entidad.Contabilidad> getContabilidad() {
            if (contabilidad == null) {
                contabilidad = new ArrayList<INE.Entidad.Contabilidad>();
            }
            return this.contabilidad;
        }

        /**
         * Gets the value of the claveEntidad property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaveEntidad() {
            return claveEntidad;
        }

        /**
         * Sets the value of the claveEntidad property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaveEntidad(String value) {
            this.claveEntidad = value;
        }

        /**
         * Gets the value of the ambito property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmbito() {
            return ambito;
        }

        /**
         * Sets the value of the ambito property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmbito(String value) {
            this.ambito = value;
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
         *       &lt;attribute name="IdContabilidad" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;totalDigits value="6"/&gt;
         *             &lt;fractionDigits value="0"/&gt;
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
        public static class Contabilidad
            implements Serializable
        {

            private final static long serialVersionUID = 1L;
            @XmlAttribute(name = "IdContabilidad", required = true)
            protected int idContabilidad;

            /**
             * Gets the value of the idContabilidad property.
             * 
             */
            public int getIdContabilidad() {
                return idContabilidad;
            }

            /**
             * Sets the value of the idContabilidad property.
             * 
             */
            public void setIdContabilidad(int value) {
                this.idContabilidad = value;
            }

        }

    }

}
