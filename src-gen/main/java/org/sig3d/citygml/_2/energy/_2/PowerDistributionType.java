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
 * System for distribution of electrical energy within a building
 * 
 * <p>Java-Klasse für PowerDistributionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PowerDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemDistributionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="current" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="voltage" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerDistributionType", propOrder = {
    "current",
    "voltage"
})
public class PowerDistributionType
    extends AbstractEnergySystemDistributionType
{

    protected MeasureType current;
    protected MeasureType voltage;

    /**
     * Ruft den Wert der current-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCurrent() {
        return current;
    }

    /**
     * Legt den Wert der current-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCurrent(MeasureType value) {
        this.current = value;
    }

    public boolean isSetCurrent() {
        return (this.current!= null);
    }

    /**
     * Ruft den Wert der voltage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getVoltage() {
        return voltage;
    }

    /**
     * Legt den Wert der voltage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setVoltage(MeasureType value) {
        this.voltage = value;
    }

    public boolean isSetVoltage() {
        return (this.voltage!= null);
    }

}
