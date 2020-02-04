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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.AngleType;
import net.opengis.gml.AreaType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.ScaleType;


/**
 * Thermal Boundaries delimit Thermal Zones. Thermal Boundaries represent physical relationships between two Thermal Zones, or a Thermal Zone and the outside environment, or a Thermal Zone and the ground. Their non-opening construction must be homogeneous.
 * 
 * <p>Java-Klasse für ThermalBoundaryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalBoundaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thermalBoundaryType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ThermalBoundaryTypeValue"/&gt;
 *         &lt;element name="azimuth" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="inclination" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceGeometry" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sharedAreaRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="refurbishmentMeasure" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}RefurbishmentMeasurePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="construction" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="contains" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ThermalOpeningPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ThermalBoundaryType", propOrder = {
    "thermalBoundaryType",
    "azimuth",
    "inclination",
    "area",
    "surfaceGeometry",
    "sharedAreaRatio",
    "refurbishmentMeasure",
    "construction",
    "contains",
    "relatesTo",
    "isAdjacentTo"
})
public class ThermalBoundaryType
    extends AbstractCityObjectType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ThermalBoundaryTypeValue thermalBoundaryType;
    protected AngleType azimuth;
    protected AngleType inclination;
    protected AreaType area;
    protected MultiSurfacePropertyType surfaceGeometry;
    protected ScaleType sharedAreaRatio;
    protected List<RefurbishmentMeasurePropertyType> refurbishmentMeasure;
    protected ReferenceType construction;
    protected List<ThermalOpeningPropertyType> contains;
    protected List<ReferenceType> relatesTo;
    protected ReferenceType isAdjacentTo;

    /**
     * Ruft den Wert der thermalBoundaryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ThermalBoundaryTypeValue }
     *     
     */
    public ThermalBoundaryTypeValue getThermalBoundaryType() {
        return thermalBoundaryType;
    }

    /**
     * Legt den Wert der thermalBoundaryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermalBoundaryTypeValue }
     *     
     */
    public void setThermalBoundaryType(ThermalBoundaryTypeValue value) {
        this.thermalBoundaryType = value;
    }

    public boolean isSetThermalBoundaryType() {
        return (this.thermalBoundaryType!= null);
    }

    /**
     * Ruft den Wert der azimuth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getAzimuth() {
        return azimuth;
    }

    /**
     * Legt den Wert der azimuth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setAzimuth(AngleType value) {
        this.azimuth = value;
    }

    public boolean isSetAzimuth() {
        return (this.azimuth!= null);
    }

    /**
     * Ruft den Wert der inclination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getInclination() {
        return inclination;
    }

    /**
     * Legt den Wert der inclination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setInclination(AngleType value) {
        this.inclination = value;
    }

    public boolean isSetInclination() {
        return (this.inclination!= null);
    }

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
     * Ruft den Wert der sharedAreaRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getSharedAreaRatio() {
        return sharedAreaRatio;
    }

    /**
     * Legt den Wert der sharedAreaRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setSharedAreaRatio(ScaleType value) {
        this.sharedAreaRatio = value;
    }

    public boolean isSetSharedAreaRatio() {
        return (this.sharedAreaRatio!= null);
    }

    /**
     * Gets the value of the refurbishmentMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refurbishmentMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefurbishmentMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefurbishmentMeasurePropertyType }
     * 
     * 
     */
    public List<RefurbishmentMeasurePropertyType> getRefurbishmentMeasure() {
        if (refurbishmentMeasure == null) {
            refurbishmentMeasure = new ArrayList<RefurbishmentMeasurePropertyType>();
        }
        return this.refurbishmentMeasure;
    }

    public boolean isSetRefurbishmentMeasure() {
        return ((this.refurbishmentMeasure!= null)&&(!this.refurbishmentMeasure.isEmpty()));
    }

    public void unsetRefurbishmentMeasure() {
        this.refurbishmentMeasure = null;
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
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThermalOpeningPropertyType }
     * 
     * 
     */
    public List<ThermalOpeningPropertyType> getContains() {
        if (contains == null) {
            contains = new ArrayList<ThermalOpeningPropertyType>();
        }
        return this.contains;
    }

    public boolean isSetContains() {
        return ((this.contains!= null)&&(!this.contains.isEmpty()));
    }

    public void unsetContains() {
        this.contains = null;
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
