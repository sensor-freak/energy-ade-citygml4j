//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractFeatureType;


/**
 * Household is a group of persons living in the same dwelling, in the case where occupant type is residents.
 * 
 * <p>Java-Klasse für HouseholdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HouseholdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="residenceType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ResidenceTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="householdType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}HouseholdTypeValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdType", propOrder = {
    "residenceType",
    "householdType"
})
public class HouseholdType
    extends AbstractFeatureType
{

    @XmlSchemaType(name = "string")
    protected ResidenceTypeValue residenceType;
    @XmlSchemaType(name = "string")
    protected HouseholdTypeValue householdType;

    /**
     * Ruft den Wert der residenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeValue }
     *     
     */
    public ResidenceTypeValue getResidenceType() {
        return residenceType;
    }

    /**
     * Legt den Wert der residenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeValue }
     *     
     */
    public void setResidenceType(ResidenceTypeValue value) {
        this.residenceType = value;
    }

    public boolean isSetResidenceType() {
        return (this.residenceType!= null);
    }

    /**
     * Ruft den Wert der householdType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdTypeValue }
     *     
     */
    public HouseholdTypeValue getHouseholdType() {
        return householdType;
    }

    /**
     * Legt den Wert der householdType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdTypeValue }
     *     
     */
    public void setHouseholdType(HouseholdTypeValue value) {
        this.householdType = value;
    }

    public boolean isSetHouseholdType() {
        return (this.householdType!= null);
    }

}
