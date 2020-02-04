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
 * <p>Java-Klasse für GasTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GasTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="argon"/&gt;
 *     &lt;enumeration value="krypton"/&gt;
 *     &lt;enumeration value="xenon"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GasTypeValue")
@XmlEnum
public enum GasTypeValue {


    /**
     * Air
     * 
     */
    @XmlEnumValue("air")
    AIR("air"),

    /**
     * Argon
     * 
     */
    @XmlEnumValue("argon")
    ARGON("argon"),

    /**
     * Krypton
     * 
     */
    @XmlEnumValue("krypton")
    KRYPTON("krypton"),

    /**
     * Xenon
     * 
     */
    @XmlEnumValue("xenon")
    XENON("xenon"),

    /**
     * Other gas
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GasTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GasTypeValue fromValue(String v) {
        for (GasTypeValue c: GasTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
