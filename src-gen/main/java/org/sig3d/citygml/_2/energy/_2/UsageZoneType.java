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
import net.opengis.gml.CodeType;
import net.opengis.gml.SolidPropertyType;


/**
 * A usage zone is a zone of a building with homogeneous usage type.
 * 
 * <p>Java-Klasse für UsageZoneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UsageZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coolingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="heatingSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="usageZoneType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ventilationSchedule" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="ventilationControl" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}VentilationControlPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="floorArea" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}FloorAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="volumeGeometry" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="averageInternalGains" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HeatExchangeTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="contains" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}BuildingUnitPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="occupiedBy" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}OccupantsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="equippedWith" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}FacilitiesPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageZoneType", propOrder = {
    "coolingSchedule",
    "heatingSchedule",
    "usageZoneType",
    "ventilationSchedule",
    "ventilationControl",
    "floorArea",
    "volumeGeometry",
    "averageInternalGains",
    "contains",
    "occupiedBy",
    "equippedWith"
})
public class UsageZoneType
    extends AbstractCityObjectType
{

    protected AbstractSchedulePropertyType coolingSchedule;
    protected AbstractSchedulePropertyType heatingSchedule;
    protected CodeType usageZoneType;
    protected AbstractSchedulePropertyType ventilationSchedule;
    protected VentilationControlPropertyType ventilationControl;
    protected List<FloorAreaPropertyType> floorArea;
    protected SolidPropertyType volumeGeometry;
    protected HeatExchangeTypePropertyType averageInternalGains;
    protected List<BuildingUnitPropertyType> contains;
    protected List<OccupantsPropertyType> occupiedBy;
    protected List<FacilitiesPropertyType> equippedWith;

    /**
     * Ruft den Wert der coolingSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getCoolingSchedule() {
        return coolingSchedule;
    }

    /**
     * Legt den Wert der coolingSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setCoolingSchedule(AbstractSchedulePropertyType value) {
        this.coolingSchedule = value;
    }

    public boolean isSetCoolingSchedule() {
        return (this.coolingSchedule!= null);
    }

    /**
     * Ruft den Wert der heatingSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getHeatingSchedule() {
        return heatingSchedule;
    }

    /**
     * Legt den Wert der heatingSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setHeatingSchedule(AbstractSchedulePropertyType value) {
        this.heatingSchedule = value;
    }

    public boolean isSetHeatingSchedule() {
        return (this.heatingSchedule!= null);
    }

    /**
     * Ruft den Wert der usageZoneType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUsageZoneType() {
        return usageZoneType;
    }

    /**
     * Legt den Wert der usageZoneType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUsageZoneType(CodeType value) {
        this.usageZoneType = value;
    }

    public boolean isSetUsageZoneType() {
        return (this.usageZoneType!= null);
    }

    /**
     * Ruft den Wert der ventilationSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getVentilationSchedule() {
        return ventilationSchedule;
    }

    /**
     * Legt den Wert der ventilationSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setVentilationSchedule(AbstractSchedulePropertyType value) {
        this.ventilationSchedule = value;
    }

    public boolean isSetVentilationSchedule() {
        return (this.ventilationSchedule!= null);
    }

    /**
     * Ruft den Wert der ventilationControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VentilationControlPropertyType }
     *     
     */
    public VentilationControlPropertyType getVentilationControl() {
        return ventilationControl;
    }

    /**
     * Legt den Wert der ventilationControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VentilationControlPropertyType }
     *     
     */
    public void setVentilationControl(VentilationControlPropertyType value) {
        this.ventilationControl = value;
    }

    public boolean isSetVentilationControl() {
        return (this.ventilationControl!= null);
    }

    /**
     * Gets the value of the floorArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floorArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloorArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloorAreaPropertyType }
     * 
     * 
     */
    public List<FloorAreaPropertyType> getFloorArea() {
        if (floorArea == null) {
            floorArea = new ArrayList<FloorAreaPropertyType>();
        }
        return this.floorArea;
    }

    public boolean isSetFloorArea() {
        return ((this.floorArea!= null)&&(!this.floorArea.isEmpty()));
    }

    public void unsetFloorArea() {
        this.floorArea = null;
    }

    /**
     * Ruft den Wert der volumeGeometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getVolumeGeometry() {
        return volumeGeometry;
    }

    /**
     * Legt den Wert der volumeGeometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setVolumeGeometry(SolidPropertyType value) {
        this.volumeGeometry = value;
    }

    public boolean isSetVolumeGeometry() {
        return (this.volumeGeometry!= null);
    }

    /**
     * Ruft den Wert der averageInternalGains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public HeatExchangeTypePropertyType getAverageInternalGains() {
        return averageInternalGains;
    }

    /**
     * Legt den Wert der averageInternalGains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public void setAverageInternalGains(HeatExchangeTypePropertyType value) {
        this.averageInternalGains = value;
    }

    public boolean isSetAverageInternalGains() {
        return (this.averageInternalGains!= null);
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
     * {@link BuildingUnitPropertyType }
     * 
     * 
     */
    public List<BuildingUnitPropertyType> getContains() {
        if (contains == null) {
            contains = new ArrayList<BuildingUnitPropertyType>();
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
     * Gets the value of the occupiedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupiedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupiedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupantsPropertyType }
     * 
     * 
     */
    public List<OccupantsPropertyType> getOccupiedBy() {
        if (occupiedBy == null) {
            occupiedBy = new ArrayList<OccupantsPropertyType>();
        }
        return this.occupiedBy;
    }

    public boolean isSetOccupiedBy() {
        return ((this.occupiedBy!= null)&&(!this.occupiedBy.isEmpty()));
    }

    public void unsetOccupiedBy() {
        this.occupiedBy = null;
    }

    /**
     * Gets the value of the equippedWith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equippedWith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquippedWith().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilitiesPropertyType }
     * 
     * 
     */
    public List<FacilitiesPropertyType> getEquippedWith() {
        if (equippedWith == null) {
            equippedWith = new ArrayList<FacilitiesPropertyType>();
        }
        return this.equippedWith;
    }

    public boolean isSetEquippedWith() {
        return ((this.equippedWith!= null)&&(!this.equippedWith.isEmpty()));
    }

    public void unsetEquippedWith() {
        this.equippedWith = null;
    }

}
