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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Abstract base class for specific classes representing external source for the building's energy system (e.g. electricity net, gas distribution system, district heating system)
 * 
 * <p>Java-Klasse für AbstractEnergySystemSourceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnergySystemSourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyCarrier" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue"/&gt;
 *         &lt;element name="co2EmissionFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="energyDensity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="primaryEnergyFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnergySystemSourceType", propOrder = {
    "energyCarrier",
    "co2EmissionFactor",
    "energyDensity",
    "primaryEnergyFactor"
})
@XmlSeeAlso({
    EnergySourceType.class
})
public abstract class AbstractEnergySystemSourceType
    extends AbstractEnergySystemComponentType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrier;
    protected MeasureType co2EmissionFactor;
    protected MeasureType energyDensity;
    protected MeasureType primaryEnergyFactor;

    /**
     * Ruft den Wert der energyCarrier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public EnergyCarrierTypeValue getEnergyCarrier() {
        return energyCarrier;
    }

    /**
     * Legt den Wert der energyCarrier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public void setEnergyCarrier(EnergyCarrierTypeValue value) {
        this.energyCarrier = value;
    }

    public boolean isSetEnergyCarrier() {
        return (this.energyCarrier!= null);
    }

    /**
     * Ruft den Wert der co2EmissionFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCo2EmissionFactor() {
        return co2EmissionFactor;
    }

    /**
     * Legt den Wert der co2EmissionFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCo2EmissionFactor(MeasureType value) {
        this.co2EmissionFactor = value;
    }

    public boolean isSetCo2EmissionFactor() {
        return (this.co2EmissionFactor!= null);
    }

    /**
     * Ruft den Wert der energyDensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEnergyDensity() {
        return energyDensity;
    }

    /**
     * Legt den Wert der energyDensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEnergyDensity(MeasureType value) {
        this.energyDensity = value;
    }

    public boolean isSetEnergyDensity() {
        return (this.energyDensity!= null);
    }

    /**
     * Ruft den Wert der primaryEnergyFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPrimaryEnergyFactor() {
        return primaryEnergyFactor;
    }

    /**
     * Legt den Wert der primaryEnergyFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPrimaryEnergyFactor(MeasureType value) {
        this.primaryEnergyFactor = value;
    }

    public boolean isSetPrimaryEnergyFactor() {
        return (this.primaryEnergyFactor!= null);
    }

}
