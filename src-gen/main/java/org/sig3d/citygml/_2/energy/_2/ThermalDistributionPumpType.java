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
import net.opengis.gml.MeasureType;


/**
 * <p>Java-Klasse für ThermalDistributionPumpType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalDistributionPumpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pumpControlType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}PumpControlTypeValue"/&gt;
 *         &lt;element name="pumpConfiguration" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}PumpConfigurationValue"/&gt;
 *         &lt;element name="pumpRatedHead" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="minimalFlow" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="maximalFlow" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalDistributionPumpType", propOrder = {
    "pumpControlType",
    "pumpConfiguration",
    "pumpRatedHead",
    "minimalFlow",
    "maximalFlow"
})
public class ThermalDistributionPumpType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PumpControlTypeValue pumpControlType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PumpConfigurationValue pumpConfiguration;
    @XmlElement(required = true)
    protected MeasureType pumpRatedHead;
    protected MeasureType minimalFlow;
    protected MeasureType maximalFlow;

    /**
     * Ruft den Wert der pumpControlType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PumpControlTypeValue }
     *     
     */
    public PumpControlTypeValue getPumpControlType() {
        return pumpControlType;
    }

    /**
     * Legt den Wert der pumpControlType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PumpControlTypeValue }
     *     
     */
    public void setPumpControlType(PumpControlTypeValue value) {
        this.pumpControlType = value;
    }

    public boolean isSetPumpControlType() {
        return (this.pumpControlType!= null);
    }

    /**
     * Ruft den Wert der pumpConfiguration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PumpConfigurationValue }
     *     
     */
    public PumpConfigurationValue getPumpConfiguration() {
        return pumpConfiguration;
    }

    /**
     * Legt den Wert der pumpConfiguration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PumpConfigurationValue }
     *     
     */
    public void setPumpConfiguration(PumpConfigurationValue value) {
        this.pumpConfiguration = value;
    }

    public boolean isSetPumpConfiguration() {
        return (this.pumpConfiguration!= null);
    }

    /**
     * Ruft den Wert der pumpRatedHead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPumpRatedHead() {
        return pumpRatedHead;
    }

    /**
     * Legt den Wert der pumpRatedHead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPumpRatedHead(MeasureType value) {
        this.pumpRatedHead = value;
    }

    public boolean isSetPumpRatedHead() {
        return (this.pumpRatedHead!= null);
    }

    /**
     * Ruft den Wert der minimalFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimalFlow() {
        return minimalFlow;
    }

    /**
     * Legt den Wert der minimalFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimalFlow(MeasureType value) {
        this.minimalFlow = value;
    }

    public boolean isSetMinimalFlow() {
        return (this.minimalFlow!= null);
    }

    /**
     * Ruft den Wert der maximalFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximalFlow() {
        return maximalFlow;
    }

    /**
     * Legt den Wert der maximalFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximalFlow(MeasureType value) {
        this.maximalFlow = value;
    }

    public boolean isSetMaximalFlow() {
        return (this.maximalFlow!= null);
    }

}
