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
import net.opengis.gml.VolumeType;


/**
 * Facilities for domestic hot water usage.
 * 
 * <p>Java-Klasse für DHWFacilitiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DHWFacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}FacilitiesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfBaths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfShowers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberOfWashBasins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="waterStorageVolume" type="{http://www.opengis.net/gml}VolumeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DHWFacilitiesType", propOrder = {
    "numberOfBaths",
    "numberOfShowers",
    "numberOfWashBasins",
    "waterStorageVolume"
})
public class DHWFacilitiesType
    extends FacilitiesType
{

    protected Integer numberOfBaths;
    protected Integer numberOfShowers;
    protected Integer numberOfWashBasins;
    protected VolumeType waterStorageVolume;

    /**
     * Ruft den Wert der numberOfBaths-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBaths() {
        return numberOfBaths;
    }

    /**
     * Legt den Wert der numberOfBaths-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBaths(Integer value) {
        this.numberOfBaths = value;
    }

    public boolean isSetNumberOfBaths() {
        return (this.numberOfBaths!= null);
    }

    /**
     * Ruft den Wert der numberOfShowers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfShowers() {
        return numberOfShowers;
    }

    /**
     * Legt den Wert der numberOfShowers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfShowers(Integer value) {
        this.numberOfShowers = value;
    }

    public boolean isSetNumberOfShowers() {
        return (this.numberOfShowers!= null);
    }

    /**
     * Ruft den Wert der numberOfWashBasins-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfWashBasins() {
        return numberOfWashBasins;
    }

    /**
     * Legt den Wert der numberOfWashBasins-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfWashBasins(Integer value) {
        this.numberOfWashBasins = value;
    }

    public boolean isSetNumberOfWashBasins() {
        return (this.numberOfWashBasins!= null);
    }

    /**
     * Ruft den Wert der waterStorageVolume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getWaterStorageVolume() {
        return waterStorageVolume;
    }

    /**
     * Legt den Wert der waterStorageVolume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setWaterStorageVolume(VolumeType value) {
        this.waterStorageVolume = value;
    }

    public boolean isSetWaterStorageVolume() {
        return (this.waterStorageVolume!= null);
    }

}
