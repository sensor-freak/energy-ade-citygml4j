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
 * Energy demand is the useful energy required to satisfy a specific end-use, such as heating, cooling, domestic hot water etc.
 * 
 * <p>Java-Klasse für EnergyDemandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyDemandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyAmount" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesPropertyType"/&gt;
 *         &lt;element name="endUse" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EndUseTypeValue"/&gt;
 *         &lt;element name="maximumLoad" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="energyCarrierType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDemandType", propOrder = {
    "energyAmount",
    "endUse",
    "maximumLoad",
    "energyCarrierType"
})
public class EnergyDemandType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType energyAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EndUseTypeValue endUse;
    protected MeasureType maximumLoad;
    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrierType;

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
     * Ruft den Wert der maximumLoad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumLoad() {
        return maximumLoad;
    }

    /**
     * Legt den Wert der maximumLoad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumLoad(MeasureType value) {
        this.maximumLoad = value;
    }

    public boolean isSetMaximumLoad() {
        return (this.maximumLoad!= null);
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

}
