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
 * <p>Java-Klasse für VentilationControlType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VentilationControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minIndoorTemp" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="deltaTemp" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentilationControlType", propOrder = {
    "minIndoorTemp",
    "deltaTemp"
})
public class VentilationControlType {

    protected MeasureType minIndoorTemp;
    protected MeasureType deltaTemp;

    /**
     * Ruft den Wert der minIndoorTemp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinIndoorTemp() {
        return minIndoorTemp;
    }

    /**
     * Legt den Wert der minIndoorTemp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinIndoorTemp(MeasureType value) {
        this.minIndoorTemp = value;
    }

    public boolean isSetMinIndoorTemp() {
        return (this.minIndoorTemp!= null);
    }

    /**
     * Ruft den Wert der deltaTemp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDeltaTemp() {
        return deltaTemp;
    }

    /**
     * Legt den Wert der deltaTemp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDeltaTemp(MeasureType value) {
        this.deltaTemp = value;
    }

    public boolean isSetDeltaTemp() {
        return (this.deltaTemp!= null);
    }

}
