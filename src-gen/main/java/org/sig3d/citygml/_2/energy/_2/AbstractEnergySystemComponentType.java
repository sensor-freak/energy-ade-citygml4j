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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.ReferenceType;


/**
 * Base class for all types of energy systems (conversion, distribution and storage systems).
 * 
 * <p>Java-Klasse für AbstractEnergySystemComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnergySystemComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfDevices" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceLife" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ServiceLifePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="yearOfManufacure" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="has" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}OperationSchedulePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installedIn" type="{http://www.opengis.net/gml}ReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="belongsToSystem" type="{http://www.opengis.net/gml}ReferenceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnergySystemComponentType", propOrder = {
    "numberOfDevices",
    "model",
    "serviceLife",
    "yearOfManufacure",
    "has",
    "installedIn",
    "belongsToSystem"
})
@XmlSeeAlso({
    AbstractEnergySystemSourceType.class,
    AbstractEnergySystemConsumerType.class,
    AbstractEnergySystemConversionType.class,
    AbstractEnergySystemDistributionType.class,
    AbstractEnergySystemStorageType.class
})
public abstract class AbstractEnergySystemComponentType
    extends AbstractCityObjectType
{

    protected Integer numberOfDevices;
    protected String model;
    protected ServiceLifePropertyType serviceLife;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfManufacure;
    protected List<OperationSchedulePropertyType> has;
    protected List<ReferenceType> installedIn;
    @XmlElement(required = true)
    protected List<ReferenceType> belongsToSystem;

    /**
     * Ruft den Wert der numberOfDevices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDevices() {
        return numberOfDevices;
    }

    /**
     * Legt den Wert der numberOfDevices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDevices(Integer value) {
        this.numberOfDevices = value;
    }

    public boolean isSetNumberOfDevices() {
        return (this.numberOfDevices!= null);
    }

    /**
     * Ruft den Wert der model-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Legt den Wert der model-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    public boolean isSetModel() {
        return (this.model!= null);
    }

    /**
     * Ruft den Wert der serviceLife-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLifePropertyType }
     *     
     */
    public ServiceLifePropertyType getServiceLife() {
        return serviceLife;
    }

    /**
     * Legt den Wert der serviceLife-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLifePropertyType }
     *     
     */
    public void setServiceLife(ServiceLifePropertyType value) {
        this.serviceLife = value;
    }

    public boolean isSetServiceLife() {
        return (this.serviceLife!= null);
    }

    /**
     * Ruft den Wert der yearOfManufacure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfManufacure() {
        return yearOfManufacure;
    }

    /**
     * Legt den Wert der yearOfManufacure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfManufacure(XMLGregorianCalendar value) {
        this.yearOfManufacure = value;
    }

    public boolean isSetYearOfManufacure() {
        return (this.yearOfManufacure!= null);
    }

    /**
     * Gets the value of the has property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the has property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationSchedulePropertyType }
     * 
     * 
     */
    public List<OperationSchedulePropertyType> getHas() {
        if (has == null) {
            has = new ArrayList<OperationSchedulePropertyType>();
        }
        return this.has;
    }

    public boolean isSetHas() {
        return ((this.has!= null)&&(!this.has.isEmpty()));
    }

    public void unsetHas() {
        this.has = null;
    }

    /**
     * Gets the value of the installedIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalledIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getInstalledIn() {
        if (installedIn == null) {
            installedIn = new ArrayList<ReferenceType>();
        }
        return this.installedIn;
    }

    public boolean isSetInstalledIn() {
        return ((this.installedIn!= null)&&(!this.installedIn.isEmpty()));
    }

    public void unsetInstalledIn() {
        this.installedIn = null;
    }

    /**
     * Gets the value of the belongsToSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the belongsToSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelongsToSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBelongsToSystem() {
        if (belongsToSystem == null) {
            belongsToSystem = new ArrayList<ReferenceType>();
        }
        return this.belongsToSystem;
    }

    public boolean isSetBelongsToSystem() {
        return ((this.belongsToSystem!= null)&&(!this.belongsToSystem.isEmpty()));
    }

    public void unsetBelongsToSystem() {
        this.belongsToSystem = null;
    }

}
