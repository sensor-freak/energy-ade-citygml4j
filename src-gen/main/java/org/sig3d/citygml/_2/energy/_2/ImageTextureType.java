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
import net.opengis.gml.AbstractFeatureType;


/**
 * This is an X3D element to map a texture to this material. From X3D specification: The ImageTexture node defines a texture map by specifying an image file and general parameters for mapping to geometry. Texture maps are defined in a 2D coordinate system (s, t) that ranges from [0.0, 1.0] in both directions. The bottom edge of the image corresponds to the S-axis of the texture map, and left edge of the image corresponds to the T-axis of the texture map. The lower-left pixel of the image corresponds to s=0, t=0, and the top-right pixel of the image corresponds to s=1, t=1. 
 * 
 * <p>Java-Klasse für ImageTextureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageTextureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="repeatS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="repeatT" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageTextureType", propOrder = {
    "url",
    "repeatS",
    "repeatT"
})
public class ImageTextureType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected boolean repeatS;
    protected boolean repeatT;

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Ruft den Wert der repeatS-Eigenschaft ab.
     * 
     */
    public boolean isRepeatS() {
        return repeatS;
    }

    /**
     * Legt den Wert der repeatS-Eigenschaft fest.
     * 
     */
    public void setRepeatS(boolean value) {
        this.repeatS = value;
    }

    public boolean isSetRepeatS() {
        return true;
    }

    /**
     * Ruft den Wert der repeatT-Eigenschaft ab.
     * 
     */
    public boolean isRepeatT() {
        return repeatT;
    }

    /**
     * Legt den Wert der repeatT-Eigenschaft fest.
     * 
     */
    public void setRepeatT(boolean value) {
        this.repeatT = value;
    }

    public boolean isSetRepeatT() {
        return true;
    }

}
