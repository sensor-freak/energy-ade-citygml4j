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
import net.opengis.gml.VolumeType;


/**
 * Thermal storage system refers to the technology that allows the transfer and storage of heat energy or, alternatively, energy from ice or cold air or water.
 * 
 * <p>Java-Klasse für ThermalStorageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalStorageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemStorageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preparationTemperature" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="thermalLossesFactor" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.opengis.net/gml}VolumeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalStorageType", propOrder = {
    "preparationTemperature",
    "thermalLossesFactor",
    "volume"
})
public class ThermalStorageType
    extends AbstractEnergySystemStorageType
{

    protected MeasureType preparationTemperature;
    protected MeasureType thermalLossesFactor;
    protected VolumeType volume;

    /**
     * Ruft den Wert der preparationTemperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPreparationTemperature() {
        return preparationTemperature;
    }

    /**
     * Legt den Wert der preparationTemperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPreparationTemperature(MeasureType value) {
        this.preparationTemperature = value;
    }

    public boolean isSetPreparationTemperature() {
        return (this.preparationTemperature!= null);
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
     * Ruft den Wert der volume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * Legt den Wert der volume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    public boolean isSetVolume() {
        return (this.volume!= null);
    }

}
