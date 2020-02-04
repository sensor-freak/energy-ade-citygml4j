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


/**
 * Aggregation of energy system components belonging to an energy system network.
 * 
 * <p>Java-Klasse für EnergySystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergySystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyCarrier" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="systemType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergySystemTypeValue"/&gt;
 *         &lt;element name="systemComponent" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemComponentPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfEnergySystem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySystemType", propOrder = {
    "energyCarrier",
    "systemType",
    "systemComponent",
    "_GenericApplicationPropertyOfEnergySystem"
})
public class EnergySystemType
    extends AbstractCityObjectType
{

    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnergySystemTypeValue systemType;
    @XmlElement(required = true)
    protected List<AbstractEnergySystemComponentPropertyType> systemComponent;
    protected List<Object> _GenericApplicationPropertyOfEnergySystem;

    /**
     * Ruft den Wert der energyCarrier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public EnergyCarrierTypeValue getEnergyCarrier() {
        return energyCarrier;
    }

    /**
     * Legt den Wert der energyCarrier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCarrierTypeValue }
     *     
     */
    public void setEnergyCarrier(EnergyCarrierTypeValue value) {
        this.energyCarrier = value;
    }

    public boolean isSetEnergyCarrier() {
        return (this.energyCarrier!= null);
    }

    /**
     * Ruft den Wert der systemType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergySystemTypeValue }
     *     
     */
    public EnergySystemTypeValue getSystemType() {
        return systemType;
    }

    /**
     * Legt den Wert der systemType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySystemTypeValue }
     *     
     */
    public void setSystemType(EnergySystemTypeValue value) {
        this.systemType = value;
    }

    public boolean isSetSystemType() {
        return (this.systemType!= null);
    }

    /**
     * Gets the value of the systemComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractEnergySystemComponentPropertyType }
     * 
     * 
     */
    public List<AbstractEnergySystemComponentPropertyType> getSystemComponent() {
        if (systemComponent == null) {
            systemComponent = new ArrayList<AbstractEnergySystemComponentPropertyType>();
        }
        return this.systemComponent;
    }

    public boolean isSetSystemComponent() {
        return ((this.systemComponent!= null)&&(!this.systemComponent.isEmpty()));
    }

    public void unsetSystemComponent() {
        this.systemComponent = null;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfEnergySystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfEnergySystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfEnergySystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfEnergySystem() {
        if (_GenericApplicationPropertyOfEnergySystem == null) {
            _GenericApplicationPropertyOfEnergySystem = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfEnergySystem;
    }

    public boolean isSet_GenericApplicationPropertyOfEnergySystem() {
        return ((this._GenericApplicationPropertyOfEnergySystem!= null)&&(!this._GenericApplicationPropertyOfEnergySystem.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfEnergySystem() {
        this._GenericApplicationPropertyOfEnergySystem = null;
    }

}
