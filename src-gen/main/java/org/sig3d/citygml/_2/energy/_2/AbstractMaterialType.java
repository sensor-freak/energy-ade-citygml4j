//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * Abstract base class for all Material classes. A Material is a homogeneous substance that can be used to form elements.
 * 
 * <p>Java-Klasse für AbstractMaterialType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractMaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageTexture" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ImageTexturePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMaterialType", propOrder = {
    "imageTexture"
})
@XmlSeeAlso({
    GasType.class,
    SolidMaterialType.class
})
public abstract class AbstractMaterialType
    extends AbstractFeatureType
{

    protected ImageTexturePropertyType imageTexture;

    /**
     * Ruft den Wert der imageTexture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImageTexturePropertyType }
     *     
     */
    public ImageTexturePropertyType getImageTexture() {
        return imageTexture;
    }

    /**
     * Legt den Wert der imageTexture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageTexturePropertyType }
     *     
     */
    public void setImageTexture(ImageTexturePropertyType value) {
        this.imageTexture = value;
    }

    public boolean isSetImageTexture() {
        return (this.imageTexture!= null);
    }

}
