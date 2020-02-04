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
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.ReferenceType;


/**
 * Time dependent flow of energy between two components of the building's energy system, of between one component and its surrounding environment. Energy flowing from the <i>fromComponent </i>to the <i>toComponent</i>, or from the <i>fromComponent </i>to the environment, is measured with positive values, otherwise with negative values.
 * 
 * <p>Java-Klasse für EnergyFlowType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyFlowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesPropertyType"/&gt;
 *         &lt;element name="energyCarrierType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="endUse" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EndUseTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="fromComponent" type="{http://www.opengis.net/gml}ReferenceType"/&gt;
 *         &lt;element name="toComponent" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyFlowType", propOrder = {
    "energyAmount",
    "energyCarrierType",
    "endUse",
    "fromComponent",
    "toComponent"
})
public class EnergyFlowType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType energyAmount;
    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrierType;
    @XmlSchemaType(name = "string")
    protected EndUseTypeValue endUse;
    @XmlElement(required = true)
    protected ReferenceType fromComponent;
    protected ReferenceType toComponent;

    /**
     * Ruft den Wert der energyAmount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public AbstractTimeSeriesPropertyType getEnergyAmount() {
        return energyAmount;
    }

    /**
     * Legt den Wert der energyAmount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public void setEnergyAmount(AbstractTimeSeriesPropertyType value) {
        this.energyAmount = value;
    }

    public boolean isSetEnergyAmount() {
        return (this.energyAmount!= null);
    }

    /**
     * Ruft den Wert der energyCarrierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public EnergyCarrierTypeValue getEnergyCarrierType() {
        return energyCarrierType;
    }

    /**
     * Legt den Wert der energyCarrierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public void setEnergyCarrierType(EnergyCarrierTypeValue value) {
        this.energyCarrierType = value;
    }

    public boolean isSetEnergyCarrierType() {
        return (this.energyCarrierType!= null);
    }

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
     * Ruft den Wert der fromComponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFromComponent() {
        return fromComponent;
    }

    /**
     * Legt den Wert der fromComponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFromComponent(ReferenceType value) {
        this.fromComponent = value;
    }

    public boolean isSetFromComponent() {
        return (this.fromComponent!= null);
    }

    /**
     * Ruft den Wert der toComponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getToComponent() {
        return toComponent;
    }

    /**
     * Legt den Wert der toComponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setToComponent(ReferenceType value) {
        this.toComponent = value;
    }

    public boolean isSetToComponent() {
        return (this.toComponent!= null);
    }

}
