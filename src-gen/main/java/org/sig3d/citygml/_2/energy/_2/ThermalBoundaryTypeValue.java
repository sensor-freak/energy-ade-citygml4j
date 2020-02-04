//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ThermalBoundaryTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ThermalBoundaryTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="interiorWall"/&gt;
 *     &lt;enumeration value="sharedWall"/&gt;
 *     &lt;enumeration value="outerWall"/&gt;
 *     &lt;enumeration value="groundSlab"/&gt;
 *     &lt;enumeration value="roof"/&gt;
 *     &lt;enumeration value="floor"/&gt;
 *     &lt;enumeration value="ceiling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ThermalBoundaryTypeValue")
@XmlEnum
public enum ThermalBoundaryTypeValue {


    /**
     * Interior thermal boundary between two Thermal Zones on the same vertical height
     * 
     */
    @XmlEnumValue("interiorWall")
    INTERIOR_WALL("interiorWall"),

    /**
     * Exterior Thermal Boundary being totally shared with a Boundary Surface of an adjacent building.
     * 
     */
    @XmlEnumValue("sharedWall")
    SHARED_WALL("sharedWall"),

    /**
     * ThermalBoundary corresponding to the CityGML WallSurface
     * 
     */
    @XmlEnumValue("outerWall")
    OUTER_WALL("outerWall"),

    /**
     * ThermalBoundary corresponding to the CityGML GroundSurface.
     * 
     */
    @XmlEnumValue("groundSlab")
    GROUND_SLAB("groundSlab"),

    /**
     * ThermalBoundary corresponding to the CityGML RoofSurface.
     * 
     */
    @XmlEnumValue("roof")
    ROOF("roof"),

    /**
     * Lower, horizontal, interior Thermal Boundary surface
     * 
     */
    @XmlEnumValue("floor")
    FLOOR("floor"),

    /**
     * Upper, horizontal, interior Thermal Boundary surface
     * 
     */
    @XmlEnumValue("ceiling")
    CEILING("ceiling");
    private final String value;

    ThermalBoundaryTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalBoundaryTypeValue fromValue(String v) {
        for (ThermalBoundaryTypeValue c: ThermalBoundaryTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
