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
 * <p>Java-Klasse für ResidenceTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mainResidence"/&gt;
 *     &lt;enumeration value="secondaryResidence"/&gt;
 *     &lt;enumeration value="vacant"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidenceTypeValue")
@XmlEnum
public enum ResidenceTypeValue {


    /**
     * Residence where a household lives for the greatest amount of time. Also called primary residence.
     * 
     */
    @XmlEnumValue("mainResidence")
    MAIN_RESIDENCE("mainResidence"),

    /**
     * Residence where a household lives part time or less than the majority of the calendar year.
     * 
     */
    @XmlEnumValue("secondaryResidence")
    SECONDARY_RESIDENCE("secondaryResidence"),

    /**
     * Residence where nobody lives.
     * 
     */
    @XmlEnumValue("vacant")
    VACANT("vacant");
    private final String value;

    ResidenceTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidenceTypeValue fromValue(String v) {
        for (ResidenceTypeValue c: ResidenceTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
