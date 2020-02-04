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
 * <p>Java-Klasse für FuelTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="naturalGas"/&gt;
 *     &lt;enumeration value="propane"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="coal"/&gt;
 *     &lt;enumeration value="gasoline"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="wood"/&gt;
 *     &lt;enumeration value="otherFuel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeValue")
@XmlEnum
public enum FuelTypeValue {

    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),
    @XmlEnumValue("naturalGas")
    NATURAL_GAS("naturalGas"),
    @XmlEnumValue("propane")
    PROPANE("propane"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("coal")
    COAL("coal"),
    @XmlEnumValue("gasoline")
    GASOLINE("gasoline"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("wood")
    WOOD("wood"),
    @XmlEnumValue("otherFuel")
    OTHER_FUEL("otherFuel");
    private final String value;

    FuelTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeValue fromValue(String v) {
        for (FuelTypeValue c: FuelTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
