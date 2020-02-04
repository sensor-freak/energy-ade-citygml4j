//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base class for modeling system storing energy by as pecific energy carrier. The same storage may store the energy of different end-users and different end-use.
 * 
 * <p>Java-Klasse für AbstractEnergySystemStorageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEnergySystemStorageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemComponentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energyCarrier" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyCarrierTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEnergySystemStorageType", propOrder = {
    "energyCarrier"
})
@XmlSeeAlso({
    OtherEnergyStorageType.class,
    PowerStorageType.class,
    ThermalStorageType.class
})
public abstract class AbstractEnergySystemStorageType
    extends AbstractEnergySystemComponentType
{

    @XmlSchemaType(name = "string")
    protected EnergyCarrierTypeValue energyCarrier;

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

}
