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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * Shading system of the considered opening
 * 
 * <p>Java-Klasse für WindowShadingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WindowShadingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumCoverRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="controlSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="shadingMaterial" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}SolidMaterialPropertyType"/&gt;
 *         &lt;element name="thickness" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="glassDistance" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="outdoorTempSetpoint" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="solarIntensitySetpoint" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowShadingType", propOrder = {
    "name",
    "maximumCoverRatio",
    "controlSchedule",
    "shadingMaterial",
    "thickness",
    "glassDistance",
    "outdoorTempSetpoint",
    "solarIntensitySetpoint"
})
public class WindowShadingType {

    protected String name;
    protected ScaleType maximumCoverRatio;
    protected AbstractSchedulePropertyType controlSchedule;
    @XmlElement(required = true)
    protected SolidMaterialPropertyType shadingMaterial;
    @XmlElement(required = true)
    protected LengthType thickness;
    @XmlElement(required = true)
    protected LengthType glassDistance;
    protected MeasureType outdoorTempSetpoint;
    protected MeasureType solarIntensitySetpoint;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Ruft den Wert der maximumCoverRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getMaximumCoverRatio() {
        return maximumCoverRatio;
    }

    /**
     * Legt den Wert der maximumCoverRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setMaximumCoverRatio(ScaleType value) {
        this.maximumCoverRatio = value;
    }

    public boolean isSetMaximumCoverRatio() {
        return (this.maximumCoverRatio!= null);
    }

    /**
     * Ruft den Wert der controlSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getControlSchedule() {
        return controlSchedule;
    }

    /**
     * Legt den Wert der controlSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setControlSchedule(AbstractSchedulePropertyType value) {
        this.controlSchedule = value;
    }

    public boolean isSetControlSchedule() {
        return (this.controlSchedule!= null);
    }

    /**
     * Ruft den Wert der shadingMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidMaterialPropertyType }
     *     
     */
    public SolidMaterialPropertyType getShadingMaterial() {
        return shadingMaterial;
    }

    /**
     * Legt den Wert der shadingMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidMaterialPropertyType }
     *     
     */
    public void setShadingMaterial(SolidMaterialPropertyType value) {
        this.shadingMaterial = value;
    }

    public boolean isSetShadingMaterial() {
        return (this.shadingMaterial!= null);
    }

    /**
     * Ruft den Wert der thickness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getThickness() {
        return thickness;
    }

    /**
     * Legt den Wert der thickness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setThickness(LengthType value) {
        this.thickness = value;
    }

    public boolean isSetThickness() {
        return (this.thickness!= null);
    }

    /**
     * Ruft den Wert der glassDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getGlassDistance() {
        return glassDistance;
    }

    /**
     * Legt den Wert der glassDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setGlassDistance(LengthType value) {
        this.glassDistance = value;
    }

    public boolean isSetGlassDistance() {
        return (this.glassDistance!= null);
    }

    /**
     * Ruft den Wert der outdoorTempSetpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOutdoorTempSetpoint() {
        return outdoorTempSetpoint;
    }

    /**
     * Legt den Wert der outdoorTempSetpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOutdoorTempSetpoint(MeasureType value) {
        this.outdoorTempSetpoint = value;
    }

    public boolean isSetOutdoorTempSetpoint() {
        return (this.outdoorTempSetpoint!= null);
    }

    /**
     * Ruft den Wert der solarIntensitySetpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSolarIntensitySetpoint() {
        return solarIntensitySetpoint;
    }

    /**
     * Legt den Wert der solarIntensitySetpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSolarIntensitySetpoint(MeasureType value) {
        this.solarIntensitySetpoint = value;
    }

    public boolean isSetSolarIntensitySetpoint() {
        return (this.solarIntensitySetpoint!= null);
    }

}
