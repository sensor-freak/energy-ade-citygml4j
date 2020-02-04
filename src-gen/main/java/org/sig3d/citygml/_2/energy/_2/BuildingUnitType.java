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
import net.opengis.citygml._2.AddressPropertyType;
import net.opengis.gml.CodeType;


/**
 * A building unit is a part of usage zone, such as dwelling or workplace, which is related to a single occupant entity.
 * 
 * <p>Java-Klasse für BuildingUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BuildingUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="floorArea" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}FloorAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="energyPerformanceCertification" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyPerformanceCertificationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="occupiedBy" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}OccupantsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.opengis.net/citygml/2.0}AddressPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BuildingUnitType", propOrder = {
    "numberOfRooms",
    "ownerName",
    "ownershipType",
    "floorArea",
    "energyPerformanceCertification",
    "occupiedBy",
    "address",
    "equippedWith"
})
public class BuildingUnitType
    extends AbstractCityObjectType
{

    protected Integer numberOfRooms;
    protected String ownerName;
    protected CodeType ownershipType;
    protected List<FloorAreaPropertyType> floorArea;
    protected List<EnergyPerformanceCertificationPropertyType> energyPerformanceCertification;
    protected List<OccupantsPropertyType> occupiedBy;
    protected List<AddressPropertyType> address;
    protected List<FacilitiesPropertyType> equippedWith;

    /**
     * Ruft den Wert der numberOfRooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Legt den Wert der numberOfRooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    public boolean isSetNumberOfRooms() {
        return (this.numberOfRooms!= null);
    }

    /**
     * Ruft den Wert der ownerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Legt den Wert der ownerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    public boolean isSetOwnerName() {
        return (this.ownerName!= null);
    }

    /**
     * Ruft den Wert der ownershipType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOwnershipType() {
        return ownershipType;
    }

    /**
     * Legt den Wert der ownershipType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOwnershipType(CodeType value) {
        this.ownershipType = value;
    }

    public boolean isSetOwnershipType() {
        return (this.ownershipType!= null);
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
     * Gets the value of the energyPerformanceCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyPerformanceCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyPerformanceCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyPerformanceCertificationPropertyType }
     * 
     * 
     */
    public List<EnergyPerformanceCertificationPropertyType> getEnergyPerformanceCertification() {
        if (energyPerformanceCertification == null) {
            energyPerformanceCertification = new ArrayList<EnergyPerformanceCertificationPropertyType>();
        }
        return this.energyPerformanceCertification;
    }

    public boolean isSetEnergyPerformanceCertification() {
        return ((this.energyPerformanceCertification!= null)&&(!this.energyPerformanceCertification.isEmpty()));
    }

    public void unsetEnergyPerformanceCertification() {
        this.energyPerformanceCertification = null;
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
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPropertyType }
     * 
     * 
     */
    public List<AddressPropertyType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressPropertyType>();
        }
        return this.address;
    }

    public boolean isSetAddress() {
        return ((this.address!= null)&&(!this.address.isEmpty()));
    }

    public void unsetAddress() {
        this.address = null;
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
