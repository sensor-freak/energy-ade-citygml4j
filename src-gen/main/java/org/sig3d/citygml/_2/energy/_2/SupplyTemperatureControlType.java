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
 * <p>Java-Klasse für SupplyTemperatureControlType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SupplyTemperatureControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outdoorTempLow" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="supplyTempAtOutdoorLow" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="outdoorTempHigh" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="supplyTempAtOutdoorHigh" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyTemperatureControlType", propOrder = {
    "outdoorTempLow",
    "supplyTempAtOutdoorLow",
    "outdoorTempHigh",
    "supplyTempAtOutdoorHigh"
})
public class SupplyTemperatureControlType {

    @XmlElement(required = true)
    protected MeasureType outdoorTempLow;
    @XmlElement(required = true)
    protected MeasureType supplyTempAtOutdoorLow;
    @XmlElement(required = true)
    protected MeasureType outdoorTempHigh;
    @XmlElement(required = true)
    protected MeasureType supplyTempAtOutdoorHigh;

    /**
     * Ruft den Wert der outdoorTempLow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOutdoorTempLow() {
        return outdoorTempLow;
    }

    /**
     * Legt den Wert der outdoorTempLow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOutdoorTempLow(MeasureType value) {
        this.outdoorTempLow = value;
    }

    public boolean isSetOutdoorTempLow() {
        return (this.outdoorTempLow!= null);
    }

    /**
     * Ruft den Wert der supplyTempAtOutdoorLow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSupplyTempAtOutdoorLow() {
        return supplyTempAtOutdoorLow;
    }

    /**
     * Legt den Wert der supplyTempAtOutdoorLow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSupplyTempAtOutdoorLow(MeasureType value) {
        this.supplyTempAtOutdoorLow = value;
    }

    public boolean isSetSupplyTempAtOutdoorLow() {
        return (this.supplyTempAtOutdoorLow!= null);
    }

    /**
     * Ruft den Wert der outdoorTempHigh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOutdoorTempHigh() {
        return outdoorTempHigh;
    }

    /**
     * Legt den Wert der outdoorTempHigh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOutdoorTempHigh(MeasureType value) {
        this.outdoorTempHigh = value;
    }

    public boolean isSetOutdoorTempHigh() {
        return (this.outdoorTempHigh!= null);
    }

    /**
     * Ruft den Wert der supplyTempAtOutdoorHigh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSupplyTempAtOutdoorHigh() {
        return supplyTempAtOutdoorHigh;
    }

    /**
     * Legt den Wert der supplyTempAtOutdoorHigh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSupplyTempAtOutdoorHigh(MeasureType value) {
        this.supplyTempAtOutdoorHigh = value;
    }

    public boolean isSetSupplyTempAtOutdoorHigh() {
        return (this.supplyTempAtOutdoorHigh!= null);
    }

}
