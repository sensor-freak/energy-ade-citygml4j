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
 * <p>Java-Klasse für EnergySystemTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergySystemTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="spaceHeatingSystem"/&gt;
 *     &lt;enumeration value="spaceCoolingSystem"/&gt;
 *     &lt;enumeration value="spaceHeatingCoolingSystem"/&gt;
 *     &lt;enumeration value="ventilationSystem"/&gt;
 *     &lt;enumeration value="electricalGrid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergySystemTypeValue")
@XmlEnum
public enum EnergySystemTypeValue {

    @XmlEnumValue("spaceHeatingSystem")
    SPACE_HEATING_SYSTEM("spaceHeatingSystem"),
    @XmlEnumValue("spaceCoolingSystem")
    SPACE_COOLING_SYSTEM("spaceCoolingSystem"),
    @XmlEnumValue("spaceHeatingCoolingSystem")
    SPACE_HEATING_COOLING_SYSTEM("spaceHeatingCoolingSystem"),
    @XmlEnumValue("ventilationSystem")
    VENTILATION_SYSTEM("ventilationSystem"),
    @XmlEnumValue("electricalGrid")
    ELECTRICAL_GRID("electricalGrid");
    private final String value;

    EnergySystemTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergySystemTypeValue fromValue(String v) {
        for (EnergySystemTypeValue c: EnergySystemTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
