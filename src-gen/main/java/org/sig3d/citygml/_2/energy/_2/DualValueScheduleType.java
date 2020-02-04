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
import net.opengis.gml.MeasureType;


/**
 * Schedule representation consisting of a two-state schedule related to an amount of usage time.
 * 
 * <p>Java-Klasse für DualValueScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DualValueScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageHoursPerDay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="usageDaysPerYear" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="usageValue" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="idleValue" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DualValueScheduleType", propOrder = {
    "usageHoursPerDay",
    "usageDaysPerYear",
    "usageValue",
    "idleValue"
})
public class DualValueScheduleType
    extends AbstractScheduleType
{

    @XmlElement(defaultValue = "24")
    protected Double usageHoursPerDay;
    @XmlElement(defaultValue = "365")
    protected Double usageDaysPerYear;
    @XmlElement(required = true)
    protected MeasureType usageValue;
    @XmlElement(required = true)
    protected MeasureType idleValue;

    /**
     * Ruft den Wert der usageHoursPerDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsageHoursPerDay() {
        return usageHoursPerDay;
    }

    /**
     * Legt den Wert der usageHoursPerDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsageHoursPerDay(Double value) {
        this.usageHoursPerDay = value;
    }

    public boolean isSetUsageHoursPerDay() {
        return (this.usageHoursPerDay!= null);
    }

    /**
     * Ruft den Wert der usageDaysPerYear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsageDaysPerYear() {
        return usageDaysPerYear;
    }

    /**
     * Legt den Wert der usageDaysPerYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsageDaysPerYear(Double value) {
        this.usageDaysPerYear = value;
    }

    public boolean isSetUsageDaysPerYear() {
        return (this.usageDaysPerYear!= null);
    }

    /**
     * Ruft den Wert der usageValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUsageValue() {
        return usageValue;
    }

    /**
     * Legt den Wert der usageValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUsageValue(MeasureType value) {
        this.usageValue = value;
    }

    public boolean isSetUsageValue() {
        return (this.usageValue!= null);
    }

    /**
     * Ruft den Wert der idleValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getIdleValue() {
        return idleValue;
    }

    /**
     * Legt den Wert der idleValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setIdleValue(MeasureType value) {
        this.idleValue = value;
    }

    public boolean isSetIdleValue() {
        return (this.idleValue!= null);
    }

}
