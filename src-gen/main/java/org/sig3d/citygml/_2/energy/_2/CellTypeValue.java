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
 * <p>Java-Klasse für CellTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CellTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="monocrystalline"/&gt;
 *     &lt;enumeration value="polycrystalline"/&gt;
 *     &lt;enumeration value="amorphous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CellTypeValue")
@XmlEnum
public enum CellTypeValue {


    /**
     * To make solar cells for monocrystalline solar panels, silicon is formed into bars and cut into wafers. These types of panels are called "monocrystalline" to indicate that the silicon used is single-crystal silicon.
     * 
     */
    @XmlEnumValue("monocrystalline")
    MONOCRYSTALLINE("monocrystalline"),

    /**
     * Polycrystalline solar panels are also referred to as "multi-crystalline", or many-crystal silicon.
     * 
     */
    @XmlEnumValue("polycrystalline")
    POLYCRYSTALLINE("polycrystalline"),

    /**
     * Amorphous silicon (a-Si) is the non-crystalline form of silicon used for solar cells and thin-film transistors in LCDs. Used as semiconductor material for a-Si solar cells, or thin-film silicon solar cells, it is deposited in thin films onto a variety of flexible substrates, such as glass, metal and plastic.
     * 
     */
    @XmlEnumValue("amorphous")
    AMORPHOUS("amorphous");
    private final String value;

    CellTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CellTypeValue fromValue(String v) {
        for (CellTypeValue c: CellTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
