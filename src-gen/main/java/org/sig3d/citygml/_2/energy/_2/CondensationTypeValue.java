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
 * <p>Java-Klasse für CondensationTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CondensationTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dryCooling"/&gt;
 *     &lt;enumeration value="evaporativeCooling"/&gt;
 *     &lt;enumeration value="hybridCooling"/&gt;
 *     &lt;enumeration value="adiabaticCooling"/&gt;
 *     &lt;enumeration value="freeCooling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CondensationTypeValue")
@XmlEnum
public enum CondensationTypeValue {


    /**
     * The dry cooling alternative utilizes an air-cooled condenser to cool the exhaust steam using a large array of fans that force air over finned tube heat exchangers.
     * 
     */
    @XmlEnumValue("dryCooling")
    DRY_COOLING("dryCooling"),

    /**
     * An evaporative cooler (also swamp cooler, desert cooler and wet air cooler) is a device that cools air through the evaporation of water. Evaporative cooling differs from typical air conditioning systems, which use vapor-compression or absorption refrigeration cycles.
     * 
     */
    @XmlEnumValue("evaporativeCooling")
    EVAPORATIVE_COOLING("evaporativeCooling"),

    /**
     * Any combination of Air-Cooled Condensers, Cooling Towers, Surface Condensers and Air Cooled Heat Exchangers is commonly termed a “hybrid cooling system."
     * 
     */
    @XmlEnumValue("hybridCooling")
    HYBRID_COOLING("hybridCooling"),

    /**
     * Adiabatic cooling is the process of reducing heat through a change in air pressure caused by volume expansion.
     * 
     */
    @XmlEnumValue("adiabaticCooling")
    ADIABATIC_COOLING("adiabaticCooling"),

    /**
     * Free cooling is an economical method of using low external air temperatures to assist in chilling water, which can then be used for industrial processes, or air conditioning systems. 
     * 
     */
    @XmlEnumValue("freeCooling")
    FREE_COOLING("freeCooling");
    private final String value;

    CondensationTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CondensationTypeValue fromValue(String v) {
        for (CondensationTypeValue c: CondensationTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
