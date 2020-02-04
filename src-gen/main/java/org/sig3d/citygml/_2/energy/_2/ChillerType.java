//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A machine that removes heat from a liquid via a vapor-compression or absorption refrigeration cycle. A chiller is rated between one to 1000 tons of cooling energy.
 * 
 * <p>Java-Klasse für ChillerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChillerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="condensationType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}CondensationTypeValue"/&gt;
 *         &lt;element name="compressorType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}CompressorTypeValue"/&gt;
 *         &lt;element name="refrigerant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChillerType", propOrder = {
    "condensationType",
    "compressorType",
    "refrigerant"
})
public class ChillerType
    extends AbstractEnergySystemConversionType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CondensationTypeValue condensationType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CompressorTypeValue compressorType;
    protected String refrigerant;

    /**
     * Ruft den Wert der condensationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CondensationTypeValue }
     *     
     */
    public CondensationTypeValue getCondensationType() {
        return condensationType;
    }

    /**
     * Legt den Wert der condensationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CondensationTypeValue }
     *     
     */
    public void setCondensationType(CondensationTypeValue value) {
        this.condensationType = value;
    }

    public boolean isSetCondensationType() {
        return (this.condensationType!= null);
    }

    /**
     * Ruft den Wert der compressorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompressorTypeValue }
     *     
     */
    public CompressorTypeValue getCompressorType() {
        return compressorType;
    }

    /**
     * Legt den Wert der compressorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressorTypeValue }
     *     
     */
    public void setCompressorType(CompressorTypeValue value) {
        this.compressorType = value;
    }

    public boolean isSetCompressorType() {
        return (this.compressorType!= null);
    }

    /**
     * Ruft den Wert der refrigerant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrigerant() {
        return refrigerant;
    }

    /**
     * Legt den Wert der refrigerant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrigerant(String value) {
        this.refrigerant = value;
    }

    public boolean isSetRefrigerant() {
        return (this.refrigerant!= null);
    }

}
