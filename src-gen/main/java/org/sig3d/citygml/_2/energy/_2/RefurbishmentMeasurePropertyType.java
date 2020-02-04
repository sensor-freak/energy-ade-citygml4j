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
 * <p>Java-Klasse für RefurbishmentMeasurePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RefurbishmentMeasurePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}RefurbishmentMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefurbishmentMeasurePropertyType", propOrder = {
    "refurbishmentMeasure"
})
public class RefurbishmentMeasurePropertyType {

    @XmlElement(name = "RefurbishmentMeasure")
    protected RefurbishmentMeasureType refurbishmentMeasure;

    /**
     * Ruft den Wert der refurbishmentMeasure-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RefurbishmentMeasureType }
     *     
     */
    public RefurbishmentMeasureType getRefurbishmentMeasure() {
        return refurbishmentMeasure;
    }

    /**
     * Legt den Wert der refurbishmentMeasure-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefurbishmentMeasureType }
     *     
     */
    public void setRefurbishmentMeasure(RefurbishmentMeasureType value) {
        this.refurbishmentMeasure = value;
    }

    public boolean isSetRefurbishmentMeasure() {
        return (this.refurbishmentMeasure!= null);
    }

}
