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
import net.opengis.gml.ReferenceType;


/**
 * Abstrac base class for all system consuming energy inside a building for a specific end use.
 * 
 * <p>Java-Klasse für AbstractEnergySystemConsumerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnergySystemConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endUse" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EndUseTypeValue"/&gt;
 *         &lt;element name="energyCarrier" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="consumedBy" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfAbstractEnergySystemConsumer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnergySystemConsumerType", propOrder = {
    "endUse",
    "energyCarrier",
    "consumedBy",
    "_GenericApplicationPropertyOfAbstractEnergySystemConsumer"
})
@XmlSeeAlso({
    EmitterType.class,
    OtherEnergyConsumerType.class
})
public abstract class AbstractEnergySystemConsumerType
    extends AbstractEnergySystemComponentType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EndUseTypeValue endUse;
    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrier;
    protected ReferenceType consumedBy;
    protected List<Object> _GenericApplicationPropertyOfAbstractEnergySystemConsumer;

    /**
     * Ruft den Wert der endUse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndUseTypeValue }
     *     
     */
    public EndUseTypeValue getEndUse() {
        return endUse;
    }

    /**
     * Legt den Wert der endUse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUseTypeValue }
     *     
     */
    public void setEndUse(EndUseTypeValue value) {
        this.endUse = value;
    }

    public boolean isSetEndUse() {
        return (this.endUse!= null);
    }

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
     * Ruft den Wert der consumedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getConsumedBy() {
        return consumedBy;
    }

    /**
     * Legt den Wert der consumedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setConsumedBy(ReferenceType value) {
        this.consumedBy = value;
    }

    public boolean isSetConsumedBy() {
        return (this.consumedBy!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfAbstractEnergySystemConsumer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfAbstractEnergySystemConsumer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfAbstractEnergySystemConsumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfAbstractEnergySystemConsumer() {
        if (_GenericApplicationPropertyOfAbstractEnergySystemConsumer == null) {
            _GenericApplicationPropertyOfAbstractEnergySystemConsumer = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfAbstractEnergySystemConsumer;
    }

    public boolean isSet_GenericApplicationPropertyOfAbstractEnergySystemConsumer() {
        return ((this._GenericApplicationPropertyOfAbstractEnergySystemConsumer!= null)&&(!this._GenericApplicationPropertyOfAbstractEnergySystemConsumer.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfAbstractEnergySystemConsumer() {
        this._GenericApplicationPropertyOfAbstractEnergySystemConsumer = null;
    }

}
