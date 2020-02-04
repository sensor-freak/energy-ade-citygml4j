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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.ScaleType;


/**
 * A Construction is a combination of layers, such as a wall or a roof.
 * 
 * <p>Java-Klasse für ConstructionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractConstructionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="opticalProperties" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}OpticalPropertiesPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="serviceLife" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ServiceLifePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="glazingRatio" type="{http://www.opengis.net/gml}ScaleType" minOccurs="0"/&gt;
 *         &lt;element name="outsideConvectionCoefficient" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="insideConvectionCoefficient" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="layer" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}LayerPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionType", propOrder = {
    "uValue",
    "opticalProperties",
    "serviceLife",
    "glazingRatio",
    "outsideConvectionCoefficient",
    "insideConvectionCoefficient",
    "layer"
})
public class ConstructionType
    extends AbstractConstructionType
{

    protected MeasureType uValue;
    protected OpticalPropertiesPropertyType opticalProperties;
    protected ServiceLifePropertyType serviceLife;
    protected ScaleType glazingRatio;
    protected MeasureType outsideConvectionCoefficient;
    protected MeasureType insideConvectionCoefficient;
    protected List<LayerPropertyType> layer;

    /**
     * Ruft den Wert der uValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getUValue() {
        return uValue;
    }

    /**
     * Legt den Wert der uValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setUValue(MeasureType value) {
        this.uValue = value;
    }

    public boolean isSetUValue() {
        return (this.uValue!= null);
    }

    /**
     * Ruft den Wert der opticalProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public OpticalPropertiesPropertyType getOpticalProperties() {
        return opticalProperties;
    }

    /**
     * Legt den Wert der opticalProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalPropertiesPropertyType }
     *     
     */
    public void setOpticalProperties(OpticalPropertiesPropertyType value) {
        this.opticalProperties = value;
    }

    public boolean isSetOpticalProperties() {
        return (this.opticalProperties!= null);
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
     * Ruft den Wert der glazingRatio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getGlazingRatio() {
        return glazingRatio;
    }

    /**
     * Legt den Wert der glazingRatio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setGlazingRatio(ScaleType value) {
        this.glazingRatio = value;
    }

    public boolean isSetGlazingRatio() {
        return (this.glazingRatio!= null);
    }

    /**
     * Ruft den Wert der outsideConvectionCoefficient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOutsideConvectionCoefficient() {
        return outsideConvectionCoefficient;
    }

    /**
     * Legt den Wert der outsideConvectionCoefficient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOutsideConvectionCoefficient(MeasureType value) {
        this.outsideConvectionCoefficient = value;
    }

    public boolean isSetOutsideConvectionCoefficient() {
        return (this.outsideConvectionCoefficient!= null);
    }

    /**
     * Ruft den Wert der insideConvectionCoefficient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInsideConvectionCoefficient() {
        return insideConvectionCoefficient;
    }

    /**
     * Legt den Wert der insideConvectionCoefficient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInsideConvectionCoefficient(MeasureType value) {
        this.insideConvectionCoefficient = value;
    }

    public boolean isSetInsideConvectionCoefficient() {
        return (this.insideConvectionCoefficient!= null);
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayerPropertyType }
     * 
     * 
     */
    public List<LayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<LayerPropertyType>();
        }
        return this.layer;
    }

    public boolean isSetLayer() {
        return ((this.layer!= null)&&(!this.layer.isEmpty()));
    }

    public void unsetLayer() {
        this.layer = null;
    }

}
