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
import javax.xml.bind.annotation.XmlType;


/**
 * Closed vessel in which water is heated.
 * 
 * <p>Java-Klasse für BoilerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BoilerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasCondensation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fuelType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}FuelTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoilerType", propOrder = {
    "hasCondensation",
    "fuelType"
})
public class BoilerType
    extends AbstractEnergySystemConversionType
{

    protected boolean hasCondensation;
    @XmlSchemaType(name = "string")
    protected FuelTypeValue fuelType;

    /**
     * Ruft den Wert der hasCondensation-Eigenschaft ab.
     * 
     */
    public boolean isHasCondensation() {
        return hasCondensation;
    }

    /**
     * Legt den Wert der hasCondensation-Eigenschaft fest.
     * 
     */
    public void setHasCondensation(boolean value) {
        this.hasCondensation = value;
    }

    public boolean isSetHasCondensation() {
        return true;
    }

    /**
     * Ruft den Wert der fuelType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeValue }
     *     
     */
    public FuelTypeValue getFuelType() {
        return fuelType;
    }

    /**
     * Legt den Wert der fuelType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeValue }
     *     
     */
    public void setFuelType(FuelTypeValue value) {
        this.fuelType = value;
    }

    public boolean isSetFuelType() {
        return (this.fuelType!= null);
    }

}
