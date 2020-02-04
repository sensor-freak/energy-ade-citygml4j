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
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.citygml.building._2.InteriorRoomPropertyType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;
import net.opengis.gml.SolidPropertyType;


/**
 * A thermal zone is a zone of a building which serves as unit for the building heating and cooling simulation. For the simulation, a thermal zone is considered as isothermal. It is a semantic object, which may be or not related to a geometric entity. 
 * 
 * <p>Java-Klasse für ThermalZoneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ThermalZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contains" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}UsageZonePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalThermalBridgeUValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="effectiveThermalCapacity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="floorArea" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}FloorAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}VolumeTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indirectlyHeatedAreaRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="infiltrationRate" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="isCooled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isHeated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isMechanicallyVentilated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="volumeGeometry" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="interiorRoom" type="{http://www.opengis.net/citygml/building/2.0}InteriorRoomPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="boundedBy" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ThermalBoundaryPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermalZoneType", propOrder = {
    "contains",
    "additionalThermalBridgeUValue",
    "effectiveThermalCapacity",
    "floorArea",
    "volume",
    "indirectlyHeatedAreaRatio",
    "infiltrationRate",
    "isCooled",
    "isHeated",
    "isMechanicallyVentilated",
    "volumeGeometry",
    "interiorRoom",
    "thermalBoundary"
})
public class ThermalZoneType
    extends AbstractCityObjectType
{

    protected List<UsageZonePropertyType> contains;
    protected MeasureType additionalThermalBridgeUValue;
    protected MeasureType effectiveThermalCapacity;
    protected List<FloorAreaPropertyType> floorArea;
    protected List<VolumeTypePropertyType> volume;
    protected ScaleType indirectlyHeatedAreaRatio;
    protected MeasureType infiltrationRate;
    @XmlElement(defaultValue = "true")
    protected boolean isCooled;
    @XmlElement(defaultValue = "true")
    protected boolean isHeated;
    @XmlElement(defaultValue = "true")
    protected boolean isMechanicallyVentilated;
    protected SolidPropertyType volumeGeometry;
    protected List<InteriorRoomPropertyType> interiorRoom;
    @XmlElement(name = "boundedBy")
    protected List<ThermalBoundaryPropertyType> thermalBoundary;

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
     * {@link UsageZonePropertyType }
     * 
     * 
     */
    public List<UsageZonePropertyType> getContains() {
        if (contains == null) {
            contains = new ArrayList<UsageZonePropertyType>();
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
     * Ruft den Wert der additionalThermalBridgeUValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAdditionalThermalBridgeUValue() {
        return additionalThermalBridgeUValue;
    }

    /**
     * Legt den Wert der additionalThermalBridgeUValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAdditionalThermalBridgeUValue(MeasureType value) {
        this.additionalThermalBridgeUValue = value;
    }

    public boolean isSetAdditionalThermalBridgeUValue() {
        return (this.additionalThermalBridgeUValue!= null);
    }

    /**
     * Ruft den Wert der effectiveThermalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getEffectiveThermalCapacity() {
        return effectiveThermalCapacity;
    }

    /**
     * Legt den Wert der effectiveThermalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setEffectiveThermalCapacity(MeasureType value) {
        this.effectiveThermalCapacity = value;
    }

    public boolean isSetEffectiveThermalCapacity() {
        return (this.effectiveThermalCapacity!= null);
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
     * Gets the value of the volume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeTypePropertyType }
     * 
     * 
     */
    public List<VolumeTypePropertyType> getVolume() {
        if (volume == null) {
            volume = new ArrayList<VolumeTypePropertyType>();
        }
        return this.volume;
    }

    public boolean isSetVolume() {
        return ((this.volume!= null)&&(!this.volume.isEmpty()));
    }

    public void unsetVolume() {
        this.volume = null;
    }

    /**
     * Ruft den Wert der indirectlyHeatedAreaRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getIndirectlyHeatedAreaRatio() {
        return indirectlyHeatedAreaRatio;
    }

    /**
     * Legt den Wert der indirectlyHeatedAreaRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setIndirectlyHeatedAreaRatio(ScaleType value) {
        this.indirectlyHeatedAreaRatio = value;
    }

    public boolean isSetIndirectlyHeatedAreaRatio() {
        return (this.indirectlyHeatedAreaRatio!= null);
    }

    /**
     * Ruft den Wert der infiltrationRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInfiltrationRate() {
        return infiltrationRate;
    }

    /**
     * Legt den Wert der infiltrationRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInfiltrationRate(MeasureType value) {
        this.infiltrationRate = value;
    }

    public boolean isSetInfiltrationRate() {
        return (this.infiltrationRate!= null);
    }

    /**
     * Ruft den Wert der isCooled-Eigenschaft ab.
     * 
     */
    public boolean isIsCooled() {
        return isCooled;
    }

    /**
     * Legt den Wert der isCooled-Eigenschaft fest.
     * 
     */
    public void setIsCooled(boolean value) {
        this.isCooled = value;
    }

    public boolean isSetIsCooled() {
        return true;
    }

    /**
     * Ruft den Wert der isHeated-Eigenschaft ab.
     * 
     */
    public boolean isIsHeated() {
        return isHeated;
    }

    /**
     * Legt den Wert der isHeated-Eigenschaft fest.
     * 
     */
    public void setIsHeated(boolean value) {
        this.isHeated = value;
    }

    public boolean isSetIsHeated() {
        return true;
    }

    /**
     * Ruft den Wert der isMechanicallyVentilated-Eigenschaft ab.
     * 
     */
    public boolean isIsMechanicallyVentilated() {
        return isMechanicallyVentilated;
    }

    /**
     * Legt den Wert der isMechanicallyVentilated-Eigenschaft fest.
     * 
     */
    public void setIsMechanicallyVentilated(boolean value) {
        this.isMechanicallyVentilated = value;
    }

    public boolean isSetIsMechanicallyVentilated() {
        return true;
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
     * Gets the value of the interiorRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interiorRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteriorRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteriorRoomPropertyType }
     * 
     * 
     */
    public List<InteriorRoomPropertyType> getInteriorRoom() {
        if (interiorRoom == null) {
            interiorRoom = new ArrayList<InteriorRoomPropertyType>();
        }
        return this.interiorRoom;
    }

    public boolean isSetInteriorRoom() {
        return ((this.interiorRoom!= null)&&(!this.interiorRoom.isEmpty()));
    }

    public void unsetInteriorRoom() {
        this.interiorRoom = null;
    }

    /**
     * Gets the value of the thermalBoundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thermalBoundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThermalBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThermalBoundaryPropertyType }
     * 
     * 
     */
    public List<ThermalBoundaryPropertyType> getThermalBoundary() {
        if (thermalBoundary == null) {
            thermalBoundary = new ArrayList<ThermalBoundaryPropertyType>();
        }
        return this.thermalBoundary;
    }

    public boolean isSetThermalBoundary() {
        return ((this.thermalBoundary!= null)&&(!this.thermalBoundary.isEmpty()));
    }

    public void unsetThermalBoundary() {
        this.thermalBoundary = null;
    }

}
