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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * Different kinds of building height above general ground-level. The general ground-level lies anywhere between the lowest and the highest ground points of the construction.
 * 
 * <p>Java-Klasse für HeightAboveGroundType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeightAboveGroundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="heightReference" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ElevationReferenceValue"/&gt;
 *         &lt;element name="value" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfHeightAboveGround" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightAboveGroundType", propOrder = {
    "heightReference",
    "value",
    "_GenericApplicationPropertyOfHeightAboveGround"
})
public class HeightAboveGroundType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElevationReferenceValue heightReference;
    @XmlElement(required = true)
    protected LengthType value;
    protected List<Object> _GenericApplicationPropertyOfHeightAboveGround;

    /**
     * Ruft den Wert der heightReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElevationReferenceValue }
     *     
     */
    public ElevationReferenceValue getHeightReference() {
        return heightReference;
    }

    /**
     * Legt den Wert der heightReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevationReferenceValue }
     *     
     */
    public void setHeightReference(ElevationReferenceValue value) {
        this.heightReference = value;
    }

    public boolean isSetHeightReference() {
        return (this.heightReference!= null);
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setValue(LengthType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfHeightAboveGround property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfHeightAboveGround property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfHeightAboveGround().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfHeightAboveGround() {
        if (_GenericApplicationPropertyOfHeightAboveGround == null) {
            _GenericApplicationPropertyOfHeightAboveGround = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfHeightAboveGround;
    }

    public boolean isSet_GenericApplicationPropertyOfHeightAboveGround() {
        return ((this._GenericApplicationPropertyOfHeightAboveGround!= null)&&(!this._GenericApplicationPropertyOfHeightAboveGround.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfHeightAboveGround() {
        this._GenericApplicationPropertyOfHeightAboveGround = null;
    }

}
