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
 * <p>Java-Klasse für HeatSourceTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HeatSourceTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ambientAir"/&gt;
 *     &lt;enumeration value="aquifer"/&gt;
 *     &lt;enumeration value="exhaustAir"/&gt;
 *     &lt;enumeration value="horizontalGroundCollector"/&gt;
 *     &lt;enumeration value="verticalGroundCollector"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeatSourceTypeValue")
@XmlEnum
public enum HeatSourceTypeValue {


    /**
     * Heat is available for free from environment sources like the Sun for heating water, building material, or air.
     * 
     */
    @XmlEnumValue("ambientAir")
    AMBIENT_AIR("ambientAir"),

    /**
     * It is an underground layer of water bearing permeable rock from which ground water can be extracted using a water well.
     * 
     */
    @XmlEnumValue("aquifer")
    AQUIFER("aquifer"),

    /**
     * Extracts heat from the exhaust air of a building and transfer the heat to the supply air, hot tap water and/or hydronic heating system (underfloor heating, radiators).
     * 
     */
    @XmlEnumValue("exhaustAir")
    EXHAUST_AIR("exhaustAir"),

    /**
     * A central heating and/or cooling system that transfers heat to or from the ground (installed horizontally).
     * 
     */
    @XmlEnumValue("horizontalGroundCollector")
    HORIZONTAL_GROUND_COLLECTOR("horizontalGroundCollector"),

    /**
     * A central heating and/or cooling system that transfers heat to or from the ground (installed vertically).
     * 
     */
    @XmlEnumValue("verticalGroundCollector")
    VERTICAL_GROUND_COLLECTOR("verticalGroundCollector");
    private final String value;

    HeatSourceTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeatSourceTypeValue fromValue(String v) {
        for (HeatSourceTypeValue c: HeatSourceTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
