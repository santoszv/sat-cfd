//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.10 at 11:13:46 PM CST 
//


package mx.gob.sat.cfd.bindings.cfdv1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.sat.cfd.bindings.cfdv1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DomicilioFiscal_QNAME = new QName("", "DomicilioFiscal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.sat.cfd.bindings.cfdv1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Comprobante }
     * 
     */
    public Comprobante createComprobante() {
        return new Comprobante();
    }

    /**
     * Create an instance of {@link Concepto }
     * 
     */
    public Concepto createConcepto() {
        return new Concepto();
    }

    /**
     * Create an instance of {@link Comprobante.Impuestos }
     * 
     */
    public Comprobante.Impuestos createComprobanteImpuestos() {
        return new Comprobante.Impuestos();
    }

    /**
     * Create an instance of {@link Comprobante.Impuestos.Traslados }
     * 
     */
    public Comprobante.Impuestos.Traslados createComprobanteImpuestosTraslados() {
        return new Comprobante.Impuestos.Traslados();
    }

    /**
     * Create an instance of {@link Comprobante.Impuestos.Retenciones }
     * 
     */
    public Comprobante.Impuestos.Retenciones createComprobanteImpuestosRetenciones() {
        return new Comprobante.Impuestos.Retenciones();
    }

    /**
     * Create an instance of {@link Comprobante.Emisor }
     * 
     */
    public Comprobante.Emisor createComprobanteEmisor() {
        return new Comprobante.Emisor();
    }

    /**
     * Create an instance of {@link Comprobante.Receptor }
     * 
     */
    public Comprobante.Receptor createComprobanteReceptor() {
        return new Comprobante.Receptor();
    }

    /**
     * Create an instance of {@link Comprobante.Conceptos }
     * 
     */
    public Comprobante.Conceptos createComprobanteConceptos() {
        return new Comprobante.Conceptos();
    }

    /**
     * Create an instance of {@link Comprobante.Addenda }
     * 
     */
    public Comprobante.Addenda createComprobanteAddenda() {
        return new Comprobante.Addenda();
    }

    /**
     * Create an instance of {@link TUbicacionFiscal }
     * 
     */
    public TUbicacionFiscal createTUbicacionFiscal() {
        return new TUbicacionFiscal();
    }

    /**
     * Create an instance of {@link Concepto.InformacionAduanera }
     * 
     */
    public Concepto.InformacionAduanera createConceptoInformacionAduanera() {
        return new Concepto.InformacionAduanera();
    }

    /**
     * Create an instance of {@link Concepto.CuentaPredial }
     * 
     */
    public Concepto.CuentaPredial createConceptoCuentaPredial() {
        return new Concepto.CuentaPredial();
    }

    /**
     * Create an instance of {@link TUbicacion }
     * 
     */
    public TUbicacion createTUbicacion() {
        return new TUbicacion();
    }

    /**
     * Create an instance of {@link Comprobante.Impuestos.Traslados.Traslado }
     * 
     */
    public Comprobante.Impuestos.Traslados.Traslado createComprobanteImpuestosTrasladosTraslado() {
        return new Comprobante.Impuestos.Traslados.Traslado();
    }

    /**
     * Create an instance of {@link Comprobante.Impuestos.Retenciones.Retencion }
     * 
     */
    public Comprobante.Impuestos.Retenciones.Retencion createComprobanteImpuestosRetencionesRetencion() {
        return new Comprobante.Impuestos.Retenciones.Retencion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TUbicacionFiscal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TUbicacionFiscal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DomicilioFiscal")
    public JAXBElement<TUbicacionFiscal> createDomicilioFiscal(TUbicacionFiscal value) {
        return new JAXBElement<TUbicacionFiscal>(_DomicilioFiscal_QNAME, TUbicacionFiscal.class, null, value);
    }

}