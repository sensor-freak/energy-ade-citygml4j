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
 * A device for transferring heat from one medium to another.
 * 
 * <p>Java-Klasse für HeatExchangerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeatExchangerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="networkNodeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaryHeatSupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatExchangerType", propOrder = {
    "networkId",
    "networkNodeId",
    "primaryHeatSupplier"
})
public class HeatExchangerType
    extends AbstractEnergySystemConversionType
{

    @XmlElement(required = true)
    protected String networkId;
    @XmlElement(required = true)
    protected String networkNodeId;
    protected String primaryHeatSupplier;

    /**
     * Ruft den Wert der networkId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Legt den Wert der networkId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    public boolean isSetNetworkId() {
        return (this.networkId!= null);
    }

    /**
     * Ruft den Wert der networkNodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkNodeId() {
        return networkNodeId;
    }

    /**
     * Legt den Wert der networkNodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkNodeId(String value) {
        this.networkNodeId = value;
    }

    public boolean isSetNetworkNodeId() {
        return (this.networkNodeId!= null);
    }

    /**
     * Ruft den Wert der primaryHeatSupplier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryHeatSupplier() {
        return primaryHeatSupplier;
    }

    /**
     * Legt den Wert der primaryHeatSupplier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryHeatSupplier(String value) {
        this.primaryHeatSupplier = value;
    }

    public boolean isSetPrimaryHeatSupplier() {
        return (this.primaryHeatSupplier!= null);
    }

}
