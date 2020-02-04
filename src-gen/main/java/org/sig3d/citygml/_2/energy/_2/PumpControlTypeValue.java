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
 * <p>Java-Klasse für PumpControlTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PumpControlTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intermittent"/&gt;
 *     &lt;enumeration value="continuous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PumpControlTypeValue")
@XmlEnum
public enum PumpControlTypeValue {


    /**
     * The pump will run if a load is sensed and will shut off if there is no load on the loop
     * 
     */
    @XmlEnumValue("intermittent")
    INTERMITTENT("intermittent"),

    /**
     * The pump will run according to the Heating Availability Schedule of the corresponding UsageZone
     * 
     */
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous");
    private final String value;

    PumpControlTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PumpControlTypeValue fromValue(String v) {
        for (PumpControlTypeValue c: PumpControlTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
