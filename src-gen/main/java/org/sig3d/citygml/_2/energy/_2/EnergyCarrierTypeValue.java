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
 * <p>Java-Klasse für EnergyCarrierTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyCarrierTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="hotWater"/&gt;
 *     &lt;enumeration value="hotAir"/&gt;
 *     &lt;enumeration value="coldWater"/&gt;
 *     &lt;enumeration value="coldAir"/&gt;
 *     &lt;enumeration value="groundWater"/&gt;
 *     &lt;enumeration value="steam"/&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="naturalGas"/&gt;
 *     &lt;enumeration value="propane"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="wood"/&gt;
 *     &lt;enumeration value="coal"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnergyCarrierTypeValue")
@XmlEnum
public enum EnergyCarrierTypeValue {


    /**
     * Hot water
     * 
     */
    @XmlEnumValue("hotWater")
    HOT_WATER("hotWater"),

    /**
     * Hot air
     * 
     */
    @XmlEnumValue("hotAir")
    HOT_AIR("hotAir"),

    /**
     * Cold water
     * 
     */
    @XmlEnumValue("coldWater")
    COLD_WATER("coldWater"),

    /**
     * Cold air
     * 
     */
    @XmlEnumValue("coldAir")
    COLD_AIR("coldAir"),

    /**
     * Ground water
     * 
     */
    @XmlEnumValue("groundWater")
    GROUND_WATER("groundWater"),

    /**
     * Steam
     * 
     */
    @XmlEnumValue("steam")
    STEAM("steam"),

    /**
     * Electricity
     * 
     */
    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),

    /**
     * Natural gas
     * 
     */
    @XmlEnumValue("naturalGas")
    NATURAL_GAS("naturalGas"),

    /**
     * Propane
     * 
     */
    @XmlEnumValue("propane")
    PROPANE("propane"),

    /**
     * Oil
     * 
     */
    @XmlEnumValue("oil")
    OIL("oil"),

    /**
     * Wood
     * 
     */
    @XmlEnumValue("wood")
    WOOD("wood"),

    /**
     * Coal
     * 
     */
    @XmlEnumValue("coal")
    COAL("coal"),

    /**
     * Other energy carrier
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EnergyCarrierTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyCarrierTypeValue fromValue(String v) {
        for (EnergyCarrierTypeValue c: EnergyCarrierTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
