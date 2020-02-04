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
 * Power Storage Systems can actually store energy and use the stored energy whenever the need arises.
 * 
 * <p>Java-Klasse für PowerStorageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PowerStorageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemStorageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batteryTechnology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="powerCapacity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerStorageType", propOrder = {
    "batteryTechnology",
    "powerCapacity"
})
public class PowerStorageType
    extends AbstractEnergySystemStorageType
{

    protected String batteryTechnology;
    protected MeasureType powerCapacity;

    /**
     * Ruft den Wert der batteryTechnology-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryTechnology() {
        return batteryTechnology;
    }

    /**
     * Legt den Wert der batteryTechnology-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryTechnology(String value) {
        this.batteryTechnology = value;
    }

    public boolean isSetBatteryTechnology() {
        return (this.batteryTechnology!= null);
    }

    /**
     * Ruft den Wert der powerCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPowerCapacity() {
        return powerCapacity;
    }

    /**
     * Legt den Wert der powerCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPowerCapacity(MeasureType value) {
        this.powerCapacity = value;
    }

    public boolean isSetPowerCapacity() {
        return (this.powerCapacity!= null);
    }

}
