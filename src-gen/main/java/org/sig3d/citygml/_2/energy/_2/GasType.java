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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * Gaseous material.
 * 
 * <p>Java-Klasse für GasType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractMaterialType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isVentilated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="gasType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}GasTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasType", propOrder = {
    "isVentilated",
    "rValue",
    "gasType"
})
public class GasType
    extends AbstractMaterialType
{

    @XmlElement(defaultValue = "false")
    protected Boolean isVentilated;
    protected MeasureType rValue;
    @XmlSchemaType(name = "string")
    protected GasTypeValue gasType;

    /**
     * Ruft den Wert der isVentilated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVentilated() {
        return isVentilated;
    }

    /**
     * Legt den Wert der isVentilated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVentilated(Boolean value) {
        this.isVentilated = value;
    }

    public boolean isSetIsVentilated() {
        return (this.isVentilated!= null);
    }

    /**
     * Ruft den Wert der rValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getRValue() {
        return rValue;
    }

    /**
     * Legt den Wert der rValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setRValue(MeasureType value) {
        this.rValue = value;
    }

    public boolean isSetRValue() {
        return (this.rValue!= null);
    }

    /**
     * Ruft den Wert der gasType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GasTypeValue }
     *     
     */
    public GasTypeValue getGasType() {
        return gasType;
    }

    /**
     * Legt den Wert der gasType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GasTypeValue }
     *     
     */
    public void setGasType(GasTypeValue value) {
        this.gasType = value;
    }

    public boolean isSetGasType() {
        return (this.gasType!= null);
    }

}
