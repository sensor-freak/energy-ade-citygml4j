//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Abstract base class for all types of energy conversion systems. An energy conversion system belongs to at least two energy system networks and converts energy between different energy carriers. 
 * 
 * <p>Java-Klasse für AbstractEnergySystemConversionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnergySystemConversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="efficiencyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installedPower" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="nominalEfficiency" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnergySystemConversionType", propOrder = {
    "efficiencyIndicator",
    "installedPower",
    "nominalEfficiency"
})
@XmlSeeAlso({
    AirCompressorType.class,
    BoilerType.class,
    ChillerType.class,
    CombinedHeatPowerType.class,
    ElectricalResistanceType.class,
    GenericConversionSystemType.class,
    HeatExchangerType.class,
    HeatPumpType.class,
    MechanicalVentilationType.class,
    AbstractSolarEnergySystemType.class
})
public abstract class AbstractEnergySystemConversionType
    extends AbstractEnergySystemComponentType
{

    protected String efficiencyIndicator;
    protected MeasureType installedPower;
    protected MeasureType nominalEfficiency;

    /**
     * Ruft den Wert der efficiencyIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiencyIndicator() {
        return efficiencyIndicator;
    }

    /**
     * Legt den Wert der efficiencyIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiencyIndicator(String value) {
        this.efficiencyIndicator = value;
    }

    public boolean isSetEfficiencyIndicator() {
        return (this.efficiencyIndicator!= null);
    }

    /**
     * Ruft den Wert der installedPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInstalledPower() {
        return installedPower;
    }

    /**
     * Legt den Wert der installedPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInstalledPower(MeasureType value) {
        this.installedPower = value;
    }

    public boolean isSetInstalledPower() {
        return (this.installedPower!= null);
    }

    /**
     * Ruft den Wert der nominalEfficiency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalEfficiency() {
        return nominalEfficiency;
    }

    /**
     * Legt den Wert der nominalEfficiency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalEfficiency(MeasureType value) {
        this.nominalEfficiency = value;
    }

    public boolean isSetNominalEfficiency() {
        return (this.nominalEfficiency!= null);
    }

}
