//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EnergyPerformanceCertificationPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnergyPerformanceCertificationPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}EnergyPerformanceCertification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyPerformanceCertificationPropertyType", propOrder = {
    "energyPerformanceCertification"
})
public class EnergyPerformanceCertificationPropertyType {

    @XmlElement(name = "EnergyPerformanceCertification")
    protected EnergyPerformanceCertificationType energyPerformanceCertification;

    /**
     * Ruft den Wert der energyPerformanceCertification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyPerformanceCertificationType }
     *     
     */
    public EnergyPerformanceCertificationType getEnergyPerformanceCertification() {
        return energyPerformanceCertification;
    }

    /**
     * Legt den Wert der energyPerformanceCertification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPerformanceCertificationType }
     *     
     */
    public void setEnergyPerformanceCertification(EnergyPerformanceCertificationType value) {
        this.energyPerformanceCertification = value;
    }

    public boolean isSetEnergyPerformanceCertification() {
        return (this.energyPerformanceCertification!= null);
    }

}
