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
 * <p>Java-Klasse für CompressorTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressorTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="reciprocatingCompressorHermetic"/&gt;
 *     &lt;enumeration value="reciprocatingCompressorSemiHermetic"/&gt;
 *     &lt;enumeration value="reciprocatingCompressorOpen"/&gt;
 *     &lt;enumeration value="rotaryVaneCompressor"/&gt;
 *     &lt;enumeration value="scrollCompressor"/&gt;
 *     &lt;enumeration value="screwCompressor"/&gt;
 *     &lt;enumeration value="centrifugalCompressor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompressorTypeValue")
@XmlEnum
public enum CompressorTypeValue {


    /**
     * A one-piece welded steel casing that cannot be opened for repair; if the hermetic fails it is simply replaced with an entire new unit.
     * 
     */
    @XmlEnumValue("reciprocatingCompressorHermetic")
    RECIPROCATING_COMPRESSOR_HERMETIC("reciprocatingCompressorHermetic"),

    /**
     * A semi-hermetic uses a large cast metal shell with gasketed covers that can be opened to replace motor and pump components.
     * 
     */
    @XmlEnumValue("reciprocatingCompressorSemiHermetic")
    RECIPROCATING_COMPRESSOR_SEMI_HERMETIC("reciprocatingCompressorSemiHermetic"),

    /**
     * Open compressors rely on shaft seals to retain the internal pressure, and these seals require a lubricant such as oil to retain their sealing properties.
     * 
     */
    @XmlEnumValue("reciprocatingCompressorOpen")
    RECIPROCATING_COMPRESSOR_OPEN("reciprocatingCompressorOpen"),

    /**
     * Rotary vane compressors consist of a rotor with a number of blades inserted in radial slots in the rotor. The rotor is mounted offset in a larger housing that is either circular or a more complex shape.
     * 
     */
    @XmlEnumValue("rotaryVaneCompressor")
    ROTARY_VANE_COMPRESSOR("rotaryVaneCompressor"),
    @XmlEnumValue("scrollCompressor")
    SCROLL_COMPRESSOR("scrollCompressor"),

    /**
     * Rotary screw compressors use two meshed rotating positive-displacement helical screws to force the gas into a smaller space.
     * 
     */
    @XmlEnumValue("screwCompressor")
    SCREW_COMPRESSOR("screwCompressor"),

    /**
     * Centrifugal compressors use a rotating disk or impeller in a shaped housing to force the gas to the rim of the impeller, increasing the velocity of the gas.
     * 
     */
    @XmlEnumValue("centrifugalCompressor")
    CENTRIFUGAL_COMPRESSOR("centrifugalCompressor");
    private final String value;

    CompressorTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressorTypeValue fromValue(String v) {
        for (CompressorTypeValue c: CompressorTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
