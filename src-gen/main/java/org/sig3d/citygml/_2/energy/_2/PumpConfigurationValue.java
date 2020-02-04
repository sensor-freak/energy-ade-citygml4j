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
 * <p>Java-Klasse für PumpConfigurationValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PumpConfigurationValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="variableFlow"/&gt;
 *     &lt;enumeration value="constantFlow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PumpConfigurationValue")
@XmlEnum
public enum PumpConfigurationValue {


    /**
     * Simulates a pump with variable flow. A variable speed pump is defined with maximum and minimum flow rates that are the physical limits of the device. If there is no load on the loop and the pump is operating intermittently, then the pump can shutdown. For any other condition such as the loop having a load and the pump is operating intermittently or the pump is continuously operating (regardless of the loading condition), the pump will operate and select a flow somewhere between the minimum and maximum limits. In these cases where the pump is running, it will try to meet the flow request made by demand side components.
     * 
     */
    @XmlEnumValue("variableFlow")
    VARIABLE_FLOW("variableFlow"),

    /**
     * Simulates a pump with constant flow. The pump will run regardless of whether or not there is a load. If the pump is constant flow and operates intermittently, the pump will run at its capacity if a load is sensed and will shut off if there is no load on the loop.
     * 
     */
    @XmlEnumValue("constantFlow")
    CONSTANT_FLOW("constantFlow");
    private final String value;

    PumpConfigurationValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PumpConfigurationValue fromValue(String v) {
        for (PumpConfigurationValue c: PumpConfigurationValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
