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
 * Determines the usage of a Construction with the reverse order of layers.
 * 
 * <p>Java-Klasse für ReverseConstructionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReverseConstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractConstructionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseConstruction" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ConstructionPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseConstructionType", propOrder = {
    "baseConstruction"
})
public class ReverseConstructionType
    extends AbstractConstructionType
{

    @XmlElement(required = true)
    protected ConstructionPropertyType baseConstruction;

    /**
     * Ruft den Wert der baseConstruction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionPropertyType }
     *     
     */
    public ConstructionPropertyType getBaseConstruction() {
        return baseConstruction;
    }

    /**
     * Legt den Wert der baseConstruction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionPropertyType }
     *     
     */
    public void setBaseConstruction(ConstructionPropertyType value) {
        this.baseConstruction = value;
    }

    public boolean isSetBaseConstruction() {
        return (this.baseConstruction!= null);
    }

}
