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
import net.opengis.gml.ScaleType;


/**
 * Solid material.
 * 
 * <p>Java-Klasse für SolidMaterialType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SolidMaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractMaterialType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conductivity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="permeance" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="porosity" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="specificHeat" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="embodiedCarbon" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="embodiedEnergy" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="opticalProperties" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}OpticalPropertiesPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidMaterialType", propOrder = {
    "conductivity",
    "density",
    "permeance",
    "porosity",
    "specificHeat",
    "embodiedCarbon",
    "embodiedEnergy",
    "opticalProperties"
})
public class SolidMaterialType
    extends AbstractMaterialType
{

    protected MeasureType conductivity;
    protected MeasureType density;
    protected MeasureType permeance;
    protected ScaleType porosity;
    protected MeasureType specificHeat;
    protected MeasureType embodiedCarbon;
    protected MeasureType embodiedEnergy;
    protected OpticalPropertiesPropertyType opticalProperties;

    /**
     * Ruft den Wert der conductivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getConductivity() {
        return conductivity;
    }

    /**
     * Legt den Wert der conductivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setConductivity(MeasureType value) {
        this.conductivity = value;
    }

    public boolean isSetConductivity() {
        return (this.conductivity!= null);
    }

    /**
     * Ruft den Wert der density-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDensity() {
        return density;
    }

    /**
     * Legt den Wert der density-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDensity(MeasureType value) {
        this.density = value;
    }

    public boolean isSetDensity() {
        return (this.density!= null);
    }

    /**
     * Ruft den Wert der permeance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPermeance() {
        return permeance;
    }

    /**
     * Legt den Wert der permeance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPermeance(MeasureType value) {
        this.permeance = value;
    }

    public boolean isSetPermeance() {
        return (this.permeance!= null);
    }

    /**
     * Ruft den Wert der porosity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getPorosity() {
        return porosity;
    }

    /**
     * Legt den Wert der porosity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setPorosity(ScaleType value) {
        this.porosity = value;
    }

    public boolean isSetPorosity() {
        return (this.porosity!= null);
    }

    /**
     * Ruft den Wert der specificHeat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpecificHeat() {
        return specificHeat;
    }

    /**
     * Legt den Wert der specificHeat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpecificHeat(MeasureType value) {
        this.specificHeat = value;
    }

    public boolean isSetSpecificHeat() {
        return (this.specificHeat!= null);
    }

    /**
     * Ruft den Wert der embodiedCarbon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEmbodiedCarbon() {
        return embodiedCarbon;
    }

    /**
     * Legt den Wert der embodiedCarbon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEmbodiedCarbon(MeasureType value) {
        this.embodiedCarbon = value;
    }

    public boolean isSetEmbodiedCarbon() {
        return (this.embodiedCarbon!= null);
    }

    /**
     * Ruft den Wert der embodiedEnergy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEmbodiedEnergy() {
        return embodiedEnergy;
    }

    /**
     * Legt den Wert der embodiedEnergy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEmbodiedEnergy(MeasureType value) {
        this.embodiedEnergy = value;
    }

    public boolean isSetEmbodiedEnergy() {
        return (this.embodiedEnergy!= null);
    }

    /**
     * Ruft den Wert der opticalProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public OpticalPropertiesPropertyType getOpticalProperties() {
        return opticalProperties;
    }

    /**
     * Legt den Wert der opticalProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public void setOpticalProperties(OpticalPropertiesPropertyType value) {
        this.opticalProperties = value;
    }

    public boolean isSetOpticalProperties() {
        return (this.opticalProperties!= null);
    }

}
