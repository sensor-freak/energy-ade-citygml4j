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
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.ScaleType;


/**
 * Operation schedule of the energy system component for a specific end-use
 * 
 * <p>Java-Klasse für OperationScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OperationScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endUse" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EndUseTypeValue"/&gt;
 *         &lt;element name="operationTime" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="yearlyGlobalEfficiency" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationScheduleType", propOrder = {
    "endUse",
    "operationTime",
    "yearlyGlobalEfficiency"
})
public class OperationScheduleType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EndUseTypeValue endUse;
    protected AbstractSchedulePropertyType operationTime;
    protected ScaleType yearlyGlobalEfficiency;

    /**
     * Ruft den Wert der endUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndUseTypeValue }
     *     
     */
    public EndUseTypeValue getEndUse() {
        return endUse;
    }

    /**
     * Legt den Wert der endUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUseTypeValue }
     *     
     */
    public void setEndUse(EndUseTypeValue value) {
        this.endUse = value;
    }

    public boolean isSetEndUse() {
        return (this.endUse!= null);
    }

    /**
     * Ruft den Wert der operationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getOperationTime() {
        return operationTime;
    }

    /**
     * Legt den Wert der operationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setOperationTime(AbstractSchedulePropertyType value) {
        this.operationTime = value;
    }

    public boolean isSetOperationTime() {
        return (this.operationTime!= null);
    }

    /**
     * Ruft den Wert der yearlyGlobalEfficiency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getYearlyGlobalEfficiency() {
        return yearlyGlobalEfficiency;
    }

    /**
     * Legt den Wert der yearlyGlobalEfficiency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setYearlyGlobalEfficiency(ScaleType value) {
        this.yearlyGlobalEfficiency = value;
    }

    public boolean isSetYearlyGlobalEfficiency() {
        return (this.yearlyGlobalEfficiency!= null);
    }

}
