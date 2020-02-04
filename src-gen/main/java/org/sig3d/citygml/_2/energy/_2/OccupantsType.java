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
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.CodeType;


/**
 * Occupants is an aggregated group of occupants of a usage zone or building unit, which can be residents, workers, visitors etc. 
 * 
 * <p>Java-Klasse für OccupantsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OccupantsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heatDissipation" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HeatExchangeTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOccupants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="occupancyRate" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSchedulePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="occupantType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="household" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HouseholdPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupantsType", propOrder = {
    "heatDissipation",
    "numberOfOccupants",
    "occupancyRate",
    "occupantType",
    "household"
})
public class OccupantsType
    extends AbstractFeatureType
{

    protected HeatExchangeTypePropertyType heatDissipation;
    protected Integer numberOfOccupants;
    protected AbstractSchedulePropertyType occupancyRate;
    protected CodeType occupantType;
    protected List<HouseholdPropertyType> household;

    /**
     * Ruft den Wert der heatDissipation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public HeatExchangeTypePropertyType getHeatDissipation() {
        return heatDissipation;
    }

    /**
     * Legt den Wert der heatDissipation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatExchangeTypePropertyType }
     *     
     */
    public void setHeatDissipation(HeatExchangeTypePropertyType value) {
        this.heatDissipation = value;
    }

    public boolean isSetHeatDissipation() {
        return (this.heatDissipation!= null);
    }

    /**
     * Ruft den Wert der numberOfOccupants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfOccupants() {
        return numberOfOccupants;
    }

    /**
     * Legt den Wert der numberOfOccupants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfOccupants(Integer value) {
        this.numberOfOccupants = value;
    }

    public boolean isSetNumberOfOccupants() {
        return (this.numberOfOccupants!= null);
    }

    /**
     * Ruft den Wert der occupancyRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public AbstractSchedulePropertyType getOccupancyRate() {
        return occupancyRate;
    }

    /**
     * Legt den Wert der occupancyRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSchedulePropertyType }
     *     
     */
    public void setOccupancyRate(AbstractSchedulePropertyType value) {
        this.occupancyRate = value;
    }

    public boolean isSetOccupancyRate() {
        return (this.occupancyRate!= null);
    }

    /**
     * Ruft den Wert der occupantType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupantType() {
        return occupantType;
    }

    /**
     * Legt den Wert der occupantType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupantType(CodeType value) {
        this.occupantType = value;
    }

    public boolean isSetOccupantType() {
        return (this.occupantType!= null);
    }

    /**
     * Gets the value of the household property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the household property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHousehold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdPropertyType }
     * 
     * 
     */
    public List<HouseholdPropertyType> getHousehold() {
        if (household == null) {
            household = new ArrayList<HouseholdPropertyType>();
        }
        return this.household;
    }

    public boolean isSetHousehold() {
        return ((this.household!= null)&&(!this.household.isEmpty()));
    }

    public void unsetHousehold() {
        this.household = null;
    }

}
