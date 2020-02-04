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
 * A device that transfers heat from a colder area to a hotter area by using mechanical energy, as in a refrigerator.
 * 
 * <p>Java-Klasse für HeatPumpType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeatPumpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heatSource" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HeatSourceTypeValue"/&gt;
 *         &lt;element name="copSourceTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="copOperationTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatPumpType", propOrder = {
    "heatSource",
    "copSourceTemperature",
    "copOperationTemperature"
})
public class HeatPumpType
    extends AbstractEnergySystemConversionType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HeatSourceTypeValue heatSource;
    protected MeasureType copSourceTemperature;
    protected MeasureType copOperationTemperature;

    /**
     * Ruft den Wert der heatSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatSourceTypeValue }
     *     
     */
    public HeatSourceTypeValue getHeatSource() {
        return heatSource;
    }

    /**
     * Legt den Wert der heatSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatSourceTypeValue }
     *     
     */
    public void setHeatSource(HeatSourceTypeValue value) {
        this.heatSource = value;
    }

    public boolean isSetHeatSource() {
        return (this.heatSource!= null);
    }

    /**
     * Ruft den Wert der copSourceTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCopSourceTemperature() {
        return copSourceTemperature;
    }

    /**
     * Legt den Wert der copSourceTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCopSourceTemperature(MeasureType value) {
        this.copSourceTemperature = value;
    }

    public boolean isSetCopSourceTemperature() {
        return (this.copSourceTemperature!= null);
    }

    /**
     * Ruft den Wert der copOperationTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCopOperationTemperature() {
        return copOperationTemperature;
    }

    /**
     * Legt den Wert der copOperationTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCopOperationTemperature(MeasureType value) {
        this.copOperationTemperature = value;
    }

    public boolean isSetCopOperationTemperature() {
        return (this.copOperationTemperature!= null);
    }

}
