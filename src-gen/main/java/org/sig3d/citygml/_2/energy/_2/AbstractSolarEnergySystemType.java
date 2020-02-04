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
import net.opengis.citygml.building._2.BuildingInstallationPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.ReferenceType;


/**
 * Base class for modelling either solar thermal or photovoltaic system, using solar energy to generate heat or electricity.
 * 
 * <p>Java-Klasse für AbstractSolarEnergySystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractSolarEnergySystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="surfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="installedOnBoundarySurface" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="installedOnBuildingInstallation" type="{http://www.opengis.net/citygml/building/2.0}BuildingInstallationPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSolarEnergySystemType", propOrder = {
    "surfaceGeometry",
    "installedOnBoundarySurface",
    "installedOnBuildingInstallation"
})
@XmlSeeAlso({
    PhotovoltaicSystemType.class,
    PhotovoltaicThermalSystemType.class,
    SolarThermalSystemType.class
})
public abstract class AbstractSolarEnergySystemType
    extends AbstractEnergySystemConversionType
{

    protected MultiSurfacePropertyType surfaceGeometry;
    protected ReferenceType installedOnBoundarySurface;
    protected BuildingInstallationPropertyType installedOnBuildingInstallation;

    /**
     * Ruft den Wert der surfaceGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getSurfaceGeometry() {
        return surfaceGeometry;
    }

    /**
     * Legt den Wert der surfaceGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setSurfaceGeometry(MultiSurfacePropertyType value) {
        this.surfaceGeometry = value;
    }

    public boolean isSetSurfaceGeometry() {
        return (this.surfaceGeometry!= null);
    }

    /**
     * Ruft den Wert der installedOnBoundarySurface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getInstalledOnBoundarySurface() {
        return installedOnBoundarySurface;
    }

    /**
     * Legt den Wert der installedOnBoundarySurface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setInstalledOnBoundarySurface(ReferenceType value) {
        this.installedOnBoundarySurface = value;
    }

    public boolean isSetInstalledOnBoundarySurface() {
        return (this.installedOnBoundarySurface!= null);
    }

    /**
     * Ruft den Wert der installedOnBuildingInstallation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BuildingInstallationPropertyType }
     *     
     */
    public BuildingInstallationPropertyType getInstalledOnBuildingInstallation() {
        return installedOnBuildingInstallation;
    }

    /**
     * Legt den Wert der installedOnBuildingInstallation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingInstallationPropertyType }
     *     
     */
    public void setInstalledOnBuildingInstallation(BuildingInstallationPropertyType value) {
        this.installedOnBuildingInstallation = value;
    }

    public boolean isSetInstalledOnBuildingInstallation() {
        return (this.installedOnBuildingInstallation!= null);
    }

}
