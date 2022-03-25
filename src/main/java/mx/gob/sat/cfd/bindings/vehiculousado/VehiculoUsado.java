//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:39:16 PM CST 
//


package mx.gob.sat.cfd.bindings.vehiculousado;

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
 *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/vehiculousado}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="montoAdquisicion" use="required" type="{http://www.sat.gob.mx/vehiculousado}t_Importe" /&gt;
 *       &lt;attribute name="montoEnajenacion" use="required" type="{http://www.sat.gob.mx/vehiculousado}t_Importe" /&gt;
 *       &lt;attribute name="claveVehicular" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="7"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="marca" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="tipo" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="50"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="modelo" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;pattern value="[0-9]{4}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numeroMotor"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="17"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numeroSerie"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="17"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NIV"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="17"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="valor" use="required" type="{http://www.sat.gob.mx/vehiculousado}t_Importe" /&gt;
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
@XmlRootElement(name = "VehiculoUsado")
public class VehiculoUsado
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InformacionAduanera")
    protected List<TInformacionAduanera> informacionAduanera;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "montoAdquisicion", required = true)
    protected BigDecimal montoAdquisicion;
    @XmlAttribute(name = "montoEnajenacion", required = true)
    protected BigDecimal montoEnajenacion;
    @XmlAttribute(name = "claveVehicular", required = true)
    protected String claveVehicular;
    @XmlAttribute(name = "marca", required = true)
    protected String marca;
    @XmlAttribute(name = "tipo", required = true)
    protected String tipo;
    @XmlAttribute(name = "modelo", required = true)
    protected String modelo;
    @XmlAttribute(name = "numeroMotor")
    protected String numeroMotor;
    @XmlAttribute(name = "numeroSerie")
    protected String numeroSerie;
    @XmlAttribute(name = "NIV")
    protected String niv;
    @XmlAttribute(name = "valor", required = true)
    protected BigDecimal valor;

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
     * Gets the value of the montoAdquisicion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoAdquisicion() {
        return montoAdquisicion;
    }

    /**
     * Sets the value of the montoAdquisicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoAdquisicion(BigDecimal value) {
        this.montoAdquisicion = value;
    }

    /**
     * Gets the value of the montoEnajenacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoEnajenacion() {
        return montoEnajenacion;
    }

    /**
     * Sets the value of the montoEnajenacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoEnajenacion(BigDecimal value) {
        this.montoEnajenacion = value;
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
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
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
     * Gets the value of the numeroMotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMotor() {
        return numeroMotor;
    }

    /**
     * Sets the value of the numeroMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMotor(String value) {
        this.numeroMotor = value;
    }

    /**
     * Gets the value of the numeroSerie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Sets the value of the numeroSerie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSerie(String value) {
        this.numeroSerie = value;
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
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
