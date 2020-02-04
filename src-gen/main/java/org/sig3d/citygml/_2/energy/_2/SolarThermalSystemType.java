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
import net.opengis.gml.AreaType;
import net.opengis.gml.ScaleType;


/**
 * System converting solar energy in heat (hot water)
 * 
 * <p>Java-Klasse für SolarThermalSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SolarThermalSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSolarEnergySystemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectorType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}CollectorTypeValue"/&gt;
 *         &lt;element name="apertureArea" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="opticalEfficiency" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="linearHeatLossCoefficient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quadraticHeatLossCoefficient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolarThermalSystemType", propOrder = {
    "collectorType",
    "apertureArea",
    "opticalEfficiency",
    "linearHeatLossCoefficient",
    "quadraticHeatLossCoefficient"
})
public class SolarThermalSystemType
    extends AbstractSolarEnergySystemType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CollectorTypeValue collectorType;
    protected AreaType apertureArea;
    protected ScaleType opticalEfficiency;
    protected Double linearHeatLossCoefficient;
    protected Double quadraticHeatLossCoefficient;

    /**
     * Ruft den Wert der collectorType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollectorTypeValue }
     *     
     */
    public CollectorTypeValue getCollectorType() {
        return collectorType;
    }

    /**
     * Legt den Wert der collectorType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectorTypeValue }
     *     
     */
    public void setCollectorType(CollectorTypeValue value) {
        this.collectorType = value;
    }

    public boolean isSetCollectorType() {
        return (this.collectorType!= null);
    }

    /**
     * Ruft den Wert der apertureArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getApertureArea() {
        return apertureArea;
    }

    /**
     * Legt den Wert der apertureArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setApertureArea(AreaType value) {
        this.apertureArea = value;
    }

    public boolean isSetApertureArea() {
        return (this.apertureArea!= null);
    }

    /**
     * Ruft den Wert der opticalEfficiency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getOpticalEfficiency() {
        return opticalEfficiency;
    }

    /**
     * Legt den Wert der opticalEfficiency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setOpticalEfficiency(ScaleType value) {
        this.opticalEfficiency = value;
    }

    public boolean isSetOpticalEfficiency() {
        return (this.opticalEfficiency!= null);
    }

    /**
     * Ruft den Wert der linearHeatLossCoefficient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinearHeatLossCoefficient() {
        return linearHeatLossCoefficient;
    }

    /**
     * Legt den Wert der linearHeatLossCoefficient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinearHeatLossCoefficient(Double value) {
        this.linearHeatLossCoefficient = value;
    }

    public boolean isSetLinearHeatLossCoefficient() {
        return (this.linearHeatLossCoefficient!= null);
    }

    /**
     * Ruft den Wert der quadraticHeatLossCoefficient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuadraticHeatLossCoefficient() {
        return quadraticHeatLossCoefficient;
    }

    /**
     * Legt den Wert der quadraticHeatLossCoefficient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuadraticHeatLossCoefficient(Double value) {
        this.quadraticHeatLossCoefficient = value;
    }

    public boolean isSetQuadraticHeatLossCoefficient() {
        return (this.quadraticHeatLossCoefficient!= null);
    }

}
