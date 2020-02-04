//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AreaType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.ScaleType;


/**
 * Single opening or group of openings, possibly related to an _Opening, sharing common thermal and optical characteristics.
 * 
 * <p>Java-Klasse für ThermalOpeningType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalOpeningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="construction" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="indoorShading" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}WindowShadingPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="outdoorShading" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}WindowShadingPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="openableRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="relatesTo" type="{http://www.opengis.net/gml}ReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isAdjacentTo" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalOpeningType", propOrder = {
    "area",
    "construction",
    "indoorShading",
    "outdoorShading",
    "openableRatio",
    "surfaceGeometry",
    "relatesTo",
    "isAdjacentTo"
})
public class ThermalOpeningType
    extends AbstractCityObjectType
{

    protected AreaType area;
    protected ReferenceType construction;
    protected WindowShadingPropertyType indoorShading;
    protected WindowShadingPropertyType outdoorShading;
    protected ScaleType openableRatio;
    protected MultiSurfacePropertyType surfaceGeometry;
    protected List<ReferenceType> relatesTo;
    protected ReferenceType isAdjacentTo;

    /**
     * Ruft den Wert der area-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getArea() {
        return area;
    }

    /**
     * Legt den Wert der area-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setArea(AreaType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Ruft den Wert der construction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getConstruction() {
        return construction;
    }

    /**
     * Legt den Wert der construction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setConstruction(ReferenceType value) {
        this.construction = value;
    }

    public boolean isSetConstruction() {
        return (this.construction!= null);
    }

    /**
     * Ruft den Wert der indoorShading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WindowShadingPropertyType }
     *     
     */
    public WindowShadingPropertyType getIndoorShading() {
        return indoorShading;
    }

    /**
     * Legt den Wert der indoorShading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowShadingPropertyType }
     *     
     */
    public void setIndoorShading(WindowShadingPropertyType value) {
        this.indoorShading = value;
    }

    public boolean isSetIndoorShading() {
        return (this.indoorShading!= null);
    }

    /**
     * Ruft den Wert der outdoorShading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WindowShadingPropertyType }
     *     
     */
    public WindowShadingPropertyType getOutdoorShading() {
        return outdoorShading;
    }

    /**
     * Legt den Wert der outdoorShading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowShadingPropertyType }
     *     
     */
    public void setOutdoorShading(WindowShadingPropertyType value) {
        this.outdoorShading = value;
    }

    public boolean isSetOutdoorShading() {
        return (this.outdoorShading!= null);
    }

    /**
     * Ruft den Wert der openableRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getOpenableRatio() {
        return openableRatio;
    }

    /**
     * Legt den Wert der openableRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setOpenableRatio(ScaleType value) {
        this.openableRatio = value;
    }

    public boolean isSetOpenableRatio() {
        return (this.openableRatio!= null);
    }

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
     * Gets the value of the relatesTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatesTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatesTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRelatesTo() {
        if (relatesTo == null) {
            relatesTo = new ArrayList<ReferenceType>();
        }
        return this.relatesTo;
    }

    public boolean isSetRelatesTo() {
        return ((this.relatesTo!= null)&&(!this.relatesTo.isEmpty()));
    }

    public void unsetRelatesTo() {
        this.relatesTo = null;
    }

    /**
     * Ruft den Wert der isAdjacentTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getIsAdjacentTo() {
        return isAdjacentTo;
    }

    /**
     * Legt den Wert der isAdjacentTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setIsAdjacentTo(ReferenceType value) {
        this.isAdjacentTo = value;
    }

    public boolean isSetIsAdjacentTo() {
        return (this.isAdjacentTo!= null);
    }

}
