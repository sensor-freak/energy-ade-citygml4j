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
 * <p>Java-Klasse für DistributionTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="building"/&gt;
 *     &lt;enumeration value="dwelling"/&gt;
 *     &lt;enumeration value="groupOfBuildings"/&gt;
 *     &lt;enumeration value="room"/&gt;
 *     &lt;enumeration value="staircase"/&gt;
 *     &lt;enumeration value="storey"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistributionTypeValue")
@XmlEnum
public enum DistributionTypeValue {


    /**
     * Building with a unique energy conversion system.
     * 
     */
    @XmlEnumValue("building")
    BUILDING("building"),

    /**
     * One energy conversion system per dwelling.
     * 
     */
    @XmlEnumValue("dwelling")
    DWELLING("dwelling"),

    /**
     * Group of Building with a unique energy conversion system.The energy distribution runs between the buildings.
     * 
     */
    @XmlEnumValue("groupOfBuildings")
    GROUP_OF_BUILDINGS("groupOfBuildings"),

    /**
     * One energy conversion system per room.
     * 
     */
    @XmlEnumValue("room")
    ROOM("room"),

    /**
     * One energy conversion system per building stair-case, with a distribution system supplying vertically the premises of the different storeys.
     * 
     */
    @XmlEnumValue("staircase")
    STAIRCASE("staircase"),

    /**
     * One energy conversion system per storey, with a distribution system supplying horizontally the premises of whole storey.
     * 
     */
    @XmlEnumValue("storey")
    STOREY("storey");
    private final String value;

    DistributionTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionTypeValue fromValue(String v) {
        for (DistributionTypeValue c: DistributionTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
