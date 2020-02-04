//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * End unit which emits useful thermal energy (e.g. heat, cool) in the zone where it is required.
 * 
 * <p>Java-Klasse für EmitterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmitterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConsumerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emitterType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EmitterTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="installedPower" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="thermalExchange" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HeatExchangeTypePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmitterType", propOrder = {
    "emitterType",
    "installedPower",
    "thermalExchange"
})
public class EmitterType
    extends AbstractEnergySystemConsumerType
{

    protected String emitterType;
    protected MeasureType installedPower;
    protected HeatExchangeTypePropertyType thermalExchange;

    /**
     * Ruft den Wert der emitterType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmitterType() {
        return emitterType;
    }

    /**
     * Legt den Wert der emitterType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmitterType(String value) {
        this.emitterType = value;
    }

    public boolean isSetEmitterType() {
        return (this.emitterType!= null);
    }

    /**
     * Ruft den Wert der installedPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInstalledPower() {
        return installedPower;
    }

    /**
     * Legt den Wert der installedPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInstalledPower(MeasureType value) {
        this.installedPower = value;
    }

    public boolean isSetInstalledPower() {
        return (this.installedPower!= null);
    }

    /**
     * Ruft den Wert der thermalExchange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public HeatExchangeTypePropertyType getThermalExchange() {
        return thermalExchange;
    }

    /**
     * Legt den Wert der thermalExchange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public void setThermalExchange(HeatExchangeTypePropertyType value) {
        this.thermalExchange = value;
    }

    public boolean isSetThermalExchange() {
        return (this.thermalExchange!= null);
    }

}
