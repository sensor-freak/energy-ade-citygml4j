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
import net.opengis.gml.ScaleType;


/**
 * A building ventilation system that uses powered fans or blowers to provide fresh air to rooms when the natural forces of air pressure and gravity are not enough to circulate air through a building.
 * 
 * <p>Java-Klasse für MechanicalVentilationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MechanicalVentilationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConversionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasHeatRecovery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="recuperationFactor" type="{http://www.opengis.net/gml}ScaleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MechanicalVentilationType", propOrder = {
    "hasHeatRecovery",
    "recuperationFactor"
})
public class MechanicalVentilationType
    extends AbstractEnergySystemConversionType
{

    protected boolean hasHeatRecovery;
    @XmlElement(required = true)
    protected ScaleType recuperationFactor;

    /**
     * Ruft den Wert der hasHeatRecovery-Eigenschaft ab.
     * 
     */
    public boolean isHasHeatRecovery() {
        return hasHeatRecovery;
    }

    /**
     * Legt den Wert der hasHeatRecovery-Eigenschaft fest.
     * 
     */
    public void setHasHeatRecovery(boolean value) {
        this.hasHeatRecovery = value;
    }

    public boolean isSetHasHeatRecovery() {
        return true;
    }

    /**
     * Ruft den Wert der recuperationFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getRecuperationFactor() {
        return recuperationFactor;
    }

    /**
     * Legt den Wert der recuperationFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setRecuperationFactor(ScaleType value) {
        this.recuperationFactor = value;
    }

    public boolean isSetRecuperationFactor() {
        return (this.recuperationFactor!= null);
    }

}
