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
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.ScaleType;


/**
 * A Construction may be defined as an ordered combination of layers, themselves composed of one or more LayerComponent. A LayerComponent is a homogeneous part of a Layer (composed of a unique material) covering a given fraction (areaFraction) of it.
 * 
 * <p>Java-Klasse für LayerComponentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LayerComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaFraction" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="serviceLife" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ServiceLifePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="material" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractMaterialPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerComponentType", propOrder = {
    "areaFraction",
    "serviceLife",
    "material"
})
public class LayerComponentType
    extends AbstractFeatureType
{

    @XmlElement(defaultValue = "1.0")
    protected ScaleType areaFraction;
    protected ServiceLifePropertyType serviceLife;
    @XmlElement(required = true)
    protected AbstractMaterialPropertyType material;

    /**
     * Ruft den Wert der areaFraction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getAreaFraction() {
        return areaFraction;
    }

    /**
     * Legt den Wert der areaFraction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setAreaFraction(ScaleType value) {
        this.areaFraction = value;
    }

    public boolean isSetAreaFraction() {
        return (this.areaFraction!= null);
    }

    /**
     * Ruft den Wert der serviceLife-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLifePropertyType }
     *     
     */
    public ServiceLifePropertyType getServiceLife() {
        return serviceLife;
    }

    /**
     * Legt den Wert der serviceLife-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLifePropertyType }
     *     
     */
    public void setServiceLife(ServiceLifePropertyType value) {
        this.serviceLife = value;
    }

    public boolean isSetServiceLife() {
        return (this.serviceLife!= null);
    }

    /**
     * Ruft den Wert der material-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMaterialPropertyType }
     *     
     */
    public AbstractMaterialPropertyType getMaterial() {
        return material;
    }

    /**
     * Legt den Wert der material-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMaterialPropertyType }
     *     
     */
    public void setMaterial(AbstractMaterialPropertyType value) {
        this.material = value;
    }

    public boolean isSetMaterial() {
        return (this.material!= null);
    }

}
