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
import net.opengis.gml.MeasureType;


/**
 * A device that converts power (using an electric motor, diesel or gasoline engine, etc.) into potential energy stored in pressurized air (i.e., compressed air).
 * 
 * <p>Java-Klasse für AirCompressorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AirCompressorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compressorType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}CompressorTypeValue"/&gt;
 *         &lt;element name="pressure" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirCompressorType", propOrder = {
    "compressorType",
    "pressure"
})
public class AirCompressorType
    extends AbstractEnergySystemConversionType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CompressorTypeValue compressorType;
    protected MeasureType pressure;

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
     * Ruft den Wert der pressure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPressure() {
        return pressure;
    }

    /**
     * Legt den Wert der pressure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPressure(MeasureType value) {
        this.pressure = value;
    }

    public boolean isSetPressure() {
        return (this.pressure!= null);
    }

}
