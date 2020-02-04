//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Non-HVAC electrical devices/appliances inside the building unit or building zone.
 * 
 * <p>Java-Klasse für ElectricalAppliancesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ElectricalAppliancesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}FacilitiesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="electricalPower" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricalAppliancesType", propOrder = {
    "electricalPower"
})
public class ElectricalAppliancesType
    extends FacilitiesType
{

    protected MeasureType electricalPower;

    /**
     * Ruft den Wert der electricalPower-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getElectricalPower() {
        return electricalPower;
    }

    /**
     * Legt den Wert der electricalPower-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setElectricalPower(MeasureType value) {
        this.electricalPower = value;
    }

    public boolean isSetElectricalPower() {
        return (this.electricalPower!= null);
    }

}