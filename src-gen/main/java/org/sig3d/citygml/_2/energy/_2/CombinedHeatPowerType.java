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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.ScaleType;


/**
 * Also called cogeneration. Heat engine or power station generating electricity and useful heat at the same time.
 * 
 * <p>Java-Klasse für CombinedHeatPowerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CombinedHeatPowerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="technologyType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="thermalEfficiency" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="electricalEfficiency" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedHeatPowerType", propOrder = {
    "technologyType",
    "thermalEfficiency",
    "electricalEfficiency"
})
public class CombinedHeatPowerType
    extends AbstractEnergySystemConversionType
{

    @XmlElement(required = true)
    protected String technologyType;
    protected ScaleType thermalEfficiency;
    protected ScaleType electricalEfficiency;

    /**
     * Ruft den Wert der technologyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyType() {
        return technologyType;
    }

    /**
     * Legt den Wert der technologyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyType(String value) {
        this.technologyType = value;
    }

    public boolean isSetTechnologyType() {
        return (this.technologyType!= null);
    }

    /**
     * Ruft den Wert der thermalEfficiency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getThermalEfficiency() {
        return thermalEfficiency;
    }

    /**
     * Legt den Wert der thermalEfficiency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setThermalEfficiency(ScaleType value) {
        this.thermalEfficiency = value;
    }

    public boolean isSetThermalEfficiency() {
        return (this.thermalEfficiency!= null);
    }

    /**
     * Ruft den Wert der electricalEfficiency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getElectricalEfficiency() {
        return electricalEfficiency;
    }

    /**
     * Legt den Wert der electricalEfficiency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setElectricalEfficiency(ScaleType value) {
        this.electricalEfficiency = value;
    }

    public boolean isSetElectricalEfficiency() {
        return (this.electricalEfficiency!= null);
    }

}
