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
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimePositionType;


/**
 * Information of product life time and maintenance intervals.
 * 
 * <p>Java-Klasse für ServiceLifeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceLifeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startOfLife" type="{http://www.opengis.net/gml}TimePositionType" minOccurs="0"/&gt;
 *         &lt;element name="lifeExpectancy" type="{http://www.opengis.net/gml}TimeIntervalLengthType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaintenanceInterval" type="{http://www.opengis.net/gml}TimeIntervalLengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLifeType", propOrder = {
    "startOfLife",
    "lifeExpectancy",
    "mainMaintenanceInterval"
})
public class ServiceLifeType
    extends AbstractGMLType
{

    protected TimePositionType startOfLife;
    protected TimeIntervalLengthType lifeExpectancy;
    protected TimeIntervalLengthType mainMaintenanceInterval;

    /**
     * Ruft den Wert der startOfLife-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getStartOfLife() {
        return startOfLife;
    }

    /**
     * Legt den Wert der startOfLife-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setStartOfLife(TimePositionType value) {
        this.startOfLife = value;
    }

    public boolean isSetStartOfLife() {
        return (this.startOfLife!= null);
    }

    /**
     * Ruft den Wert der lifeExpectancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     * Legt den Wert der lifeExpectancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setLifeExpectancy(TimeIntervalLengthType value) {
        this.lifeExpectancy = value;
    }

    public boolean isSetLifeExpectancy() {
        return (this.lifeExpectancy!= null);
    }

    /**
     * Ruft den Wert der mainMaintenanceInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getMainMaintenanceInterval() {
        return mainMaintenanceInterval;
    }

    /**
     * Legt den Wert der mainMaintenanceInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setMainMaintenanceInterval(TimeIntervalLengthType value) {
        this.mainMaintenanceInterval = value;
    }

    public boolean isSetMainMaintenanceInterval() {
        return (this.mainMaintenanceInterval!= null);
    }

}
