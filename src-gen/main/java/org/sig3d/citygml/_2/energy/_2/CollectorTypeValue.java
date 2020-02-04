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
 * <p>Java-Klasse für CollectorTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectorTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="flatPlaneCollector"/&gt;
 *     &lt;enumeration value="evacuatedTubeCollector"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectorTypeValue")
@XmlEnum
public enum CollectorTypeValue {


    /**
     * A type of solar collector consisting of a series of flat glass or plastic plates with black metal surfaces that absorb solar energy.
     * 
     */
    @XmlEnumValue("flatPlaneCollector")
    FLAT_PLANE_COLLECTOR("flatPlaneCollector"),

    /**
     * Evacuated tube solar collectors convert energy from the sun into usable heat in a solar water heating system. This energy can be used for domestic and commercial hot water heating, pool heating, space heating or even air conditioning.
     * 
     */
    @XmlEnumValue("evacuatedTubeCollector")
    EVACUATED_TUBE_COLLECTOR("evacuatedTubeCollector");
    private final String value;

    CollectorTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectorTypeValue fromValue(String v) {
        for (CollectorTypeValue c: CollectorTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
