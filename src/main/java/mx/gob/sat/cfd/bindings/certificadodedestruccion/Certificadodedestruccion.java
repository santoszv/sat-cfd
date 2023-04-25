//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.25 at 03:58:10 PM CST 
//


package mx.gob.sat.cfd.bindings.certificadodedestruccion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="VehiculoDestruido"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Marca" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="50"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TipooClase" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="50"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Año" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                       &lt;minInclusive value="1900"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Modelo"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NIV"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="17"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NumSerie"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="17"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NumPlacas" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="10"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NumMotor"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="17"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NumFolTarjCir" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="40"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InformacionAduanera" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NumPedImp" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;maxLength value="40"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="Aduana" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Serie" use="required" type="{http://www.sat.gob.mx/certificadodestruccion}c_TipoSerie" /&gt;
 *       &lt;attribute name="NumFolDesVeh" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="20"/&gt;
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
    "vehiculoDestruido",
    "informacionAduanera"
})
@XmlRootElement(name = "certificadodedestruccion")
public class Certificadodedestruccion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehiculoDestruido", required = true)
    protected Certificadodedestruccion.VehiculoDestruido vehiculoDestruido;
    @XmlElement(name = "InformacionAduanera")
    protected Certificadodedestruccion.InformacionAduanera informacionAduanera;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "Serie", required = true)
    protected String serie;
    @XmlAttribute(name = "NumFolDesVeh", required = true)
    protected String numFolDesVeh;

    /**
     * Gets the value of the vehiculoDestruido property.
     * 
     * @return
     *     possible object is
     *     {@link Certificadodedestruccion.VehiculoDestruido }
     *     
     */
    public Certificadodedestruccion.VehiculoDestruido getVehiculoDestruido() {
        return vehiculoDestruido;
    }

    /**
     * Sets the value of the vehiculoDestruido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificadodedestruccion.VehiculoDestruido }
     *     
     */
    public void setVehiculoDestruido(Certificadodedestruccion.VehiculoDestruido value) {
        this.vehiculoDestruido = value;
    }

    /**
     * Gets the value of the informacionAduanera property.
     * 
     * @return
     *     possible object is
     *     {@link Certificadodedestruccion.InformacionAduanera }
     *     
     */
    public Certificadodedestruccion.InformacionAduanera getInformacionAduanera() {
        return informacionAduanera;
    }

    /**
     * Sets the value of the informacionAduanera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificadodedestruccion.InformacionAduanera }
     *     
     */
    public void setInformacionAduanera(Certificadodedestruccion.InformacionAduanera value) {
        this.informacionAduanera = value;
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
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the numFolDesVeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFolDesVeh() {
        return numFolDesVeh;
    }

    /**
     * Sets the value of the numFolDesVeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFolDesVeh(String value) {
        this.numFolDesVeh = value;
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
     *       &lt;attribute name="NumPedImp" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="40"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Aduana" use="required"&gt;
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
    @XmlType(name = "")
    public static class InformacionAduanera
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "NumPedImp", required = true)
        protected String numPedImp;
        @XmlAttribute(name = "Fecha", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;
        @XmlAttribute(name = "Aduana", required = true)
        protected String aduana;

        /**
         * Gets the value of the numPedImp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumPedImp() {
            return numPedImp;
        }

        /**
         * Sets the value of the numPedImp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumPedImp(String value) {
            this.numPedImp = value;
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
         * Gets the value of the aduana property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAduana() {
            return aduana;
        }

        /**
         * Sets the value of the aduana property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAduana(String value) {
            this.aduana = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Marca" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="50"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TipooClase" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="50"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Año" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *             &lt;minInclusive value="1900"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Modelo"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NIV"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="17"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NumSerie"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="17"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NumPlacas" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="10"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NumMotor"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="17"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NumFolTarjCir" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
     *             &lt;maxLength value="40"/&gt;
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
    public static class VehiculoDestruido
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "Marca", required = true)
        protected String marca;
        @XmlAttribute(name = "TipooClase", required = true)
        protected String tipooClase;
        @XmlAttribute(name = "A\u00f1o", required = true)
        protected int año;
        @XmlAttribute(name = "Modelo")
        protected String modelo;
        @XmlAttribute(name = "NIV")
        protected String niv;
        @XmlAttribute(name = "NumSerie")
        protected String numSerie;
        @XmlAttribute(name = "NumPlacas", required = true)
        protected String numPlacas;
        @XmlAttribute(name = "NumMotor")
        protected String numMotor;
        @XmlAttribute(name = "NumFolTarjCir", required = true)
        protected String numFolTarjCir;

        /**
         * Gets the value of the marca property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarca() {
            return marca;
        }

        /**
         * Sets the value of the marca property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarca(String value) {
            this.marca = value;
        }

        /**
         * Gets the value of the tipooClase property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipooClase() {
            return tipooClase;
        }

        /**
         * Sets the value of the tipooClase property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipooClase(String value) {
            this.tipooClase = value;
        }

        /**
         * Gets the value of the año property.
         * 
         */
        public int getAño() {
            return año;
        }

        /**
         * Sets the value of the año property.
         * 
         */
        public void setAño(int value) {
            this.año = value;
        }

        /**
         * Gets the value of the modelo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelo() {
            return modelo;
        }

        /**
         * Sets the value of the modelo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelo(String value) {
            this.modelo = value;
        }

        /**
         * Gets the value of the niv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNIV() {
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
        public void setNIV(String value) {
            this.niv = value;
        }

        /**
         * Gets the value of the numSerie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumSerie() {
            return numSerie;
        }

        /**
         * Sets the value of the numSerie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumSerie(String value) {
            this.numSerie = value;
        }

        /**
         * Gets the value of the numPlacas property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumPlacas() {
            return numPlacas;
        }

        /**
         * Sets the value of the numPlacas property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumPlacas(String value) {
            this.numPlacas = value;
        }

        /**
         * Gets the value of the numMotor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumMotor() {
            return numMotor;
        }

        /**
         * Sets the value of the numMotor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumMotor(String value) {
            this.numMotor = value;
        }

        /**
         * Gets the value of the numFolTarjCir property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumFolTarjCir() {
            return numFolTarjCir;
        }

        /**
         * Sets the value of the numFolTarjCir property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumFolTarjCir(String value) {
            this.numFolTarjCir = value;
        }

    }

}
