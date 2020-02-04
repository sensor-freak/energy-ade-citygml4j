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
import net.opengis.gml.ScaleType;


/**
 * Percentaged infrared emissivity
 * 
 * <p>Java-Klasse für EmissivityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmissivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fraction" type="{http://www.opengis.net/gml}ScaleType"/&gt;
 *         &lt;element name="surface" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}SurfaceSide"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmissivityType", propOrder = {
    "fraction",
    "surface"
})
public class EmissivityType {

    @XmlElement(required = true)
    protected ScaleType fraction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SurfaceSide surface;

    /**
     * Ruft den Wert der fraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getFraction() {
        return fraction;
    }

    /**
     * Legt den Wert der fraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setFraction(ScaleType value) {
        this.fraction = value;
    }

    public boolean isSetFraction() {
        return (this.fraction!= null);
    }

    /**
     * Ruft den Wert der surface-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceSide }
     *     
     */
    public SurfaceSide getSurface() {
        return surface;
    }

    /**
     * Legt den Wert der surface-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceSide }
     *     
     */
    public void setSurface(SurfaceSide value) {
        this.surface = value;
    }

    public boolean isSetSurface() {
        return (this.surface!= null);
    }

}
