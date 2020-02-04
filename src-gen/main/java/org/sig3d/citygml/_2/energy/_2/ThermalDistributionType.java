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
 * System for distribution of thermal energy within a building
 * 
 * <p>Java-Klasse für ThermalDistributionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemDistributionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isCirculation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nominalFlow" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="returnTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="supplyTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="thermalLossesFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="pump" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ThermalDistributionPumpPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="control" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}SupplyTemperatureControlPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalDistributionType", propOrder = {
    "isCirculation",
    "nominalFlow",
    "returnTemperature",
    "supplyTemperature",
    "thermalLossesFactor",
    "pump",
    "control"
})
public class ThermalDistributionType
    extends AbstractEnergySystemDistributionType
{

    protected Boolean isCirculation;
    protected MeasureType nominalFlow;
    protected MeasureType returnTemperature;
    protected MeasureType supplyTemperature;
    protected MeasureType thermalLossesFactor;
    protected ThermalDistributionPumpPropertyType pump;
    protected SupplyTemperatureControlPropertyType control;

    /**
     * Ruft den Wert der isCirculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCirculation() {
        return isCirculation;
    }

    /**
     * Legt den Wert der isCirculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCirculation(Boolean value) {
        this.isCirculation = value;
    }

    public boolean isSetIsCirculation() {
        return (this.isCirculation!= null);
    }

    /**
     * Ruft den Wert der nominalFlow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalFlow() {
        return nominalFlow;
    }

    /**
     * Legt den Wert der nominalFlow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalFlow(MeasureType value) {
        this.nominalFlow = value;
    }

    public boolean isSetNominalFlow() {
        return (this.nominalFlow!= null);
    }

    /**
     * Ruft den Wert der returnTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getReturnTemperature() {
        return returnTemperature;
    }

    /**
     * Legt den Wert der returnTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setReturnTemperature(MeasureType value) {
        this.returnTemperature = value;
    }

    public boolean isSetReturnTemperature() {
        return (this.returnTemperature!= null);
    }

    /**
     * Ruft den Wert der supplyTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSupplyTemperature() {
        return supplyTemperature;
    }

    /**
     * Legt den Wert der supplyTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSupplyTemperature(MeasureType value) {
        this.supplyTemperature = value;
    }

    public boolean isSetSupplyTemperature() {
        return (this.supplyTemperature!= null);
    }

    /**
     * Ruft den Wert der thermalLossesFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getThermalLossesFactor() {
        return thermalLossesFactor;
    }

    /**
     * Legt den Wert der thermalLossesFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setThermalLossesFactor(MeasureType value) {
        this.thermalLossesFactor = value;
    }

    public boolean isSetThermalLossesFactor() {
        return (this.thermalLossesFactor!= null);
    }

    /**
     * Ruft den Wert der pump-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ThermalDistributionPumpPropertyType }
     *     
     */
    public ThermalDistributionPumpPropertyType getPump() {
        return pump;
    }

    /**
     * Legt den Wert der pump-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermalDistributionPumpPropertyType }
     *     
     */
    public void setPump(ThermalDistributionPumpPropertyType value) {
        this.pump = value;
    }

    public boolean isSetPump() {
        return (this.pump!= null);
    }

    /**
     * Ruft den Wert der control-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SupplyTemperatureControlPropertyType }
     *     
     */
    public SupplyTemperatureControlPropertyType getControl() {
        return control;
    }

    /**
     * Legt den Wert der control-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyTemperatureControlPropertyType }
     *     
     */
    public void setControl(SupplyTemperatureControlPropertyType value) {
        this.control = value;
    }

    public boolean isSetControl() {
        return (this.control!= null);
    }

}
