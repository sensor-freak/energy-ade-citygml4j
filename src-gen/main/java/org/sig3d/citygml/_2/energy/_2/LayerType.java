//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.LengthType;


/**
 * A Layer is a combination of one or more materials, referenced via a LayerComponent.
 * 
 * <p>Java-Klasse für LayerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thickness" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="layerComponent" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}LayerComponentPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayerType", propOrder = {
    "thickness",
    "layerComponent"
})
public class LayerType
    extends AbstractFeatureType
{

    protected LengthType thickness;
    @XmlElement(required = true)
    protected List<LayerComponentPropertyType> layerComponent;

    /**
     * Ruft den Wert der thickness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getThickness() {
        return thickness;
    }

    /**
     * Legt den Wert der thickness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setThickness(LengthType value) {
        this.thickness = value;
    }

    public boolean isSetThickness() {
        return (this.thickness!= null);
    }

    /**
     * Gets the value of the layerComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerComponentPropertyType }
     * 
     * 
     */
    public List<LayerComponentPropertyType> getLayerComponent() {
        if (layerComponent == null) {
            layerComponent = new ArrayList<LayerComponentPropertyType>();
        }
        return this.layerComponent;
    }

    public boolean isSetLayerComponent() {
        return ((this.layerComponent!= null)&&(!this.layerComponent.isEmpty()));
    }

    public void unsetLayerComponent() {
        this.layerComponent = null;
    }

}
