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
 * <p>Java-Klasse für HouseholdTypeValue.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseholdTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="loneAdult"/&gt;
 *     &lt;enumeration value="multiFamily"/&gt;
 *     &lt;enumeration value="oneFamily"/&gt;
 *     &lt;enumeration value="pensionerCouple"/&gt;
 *     &lt;enumeration value="unrelatedAdults"/&gt;
 *     &lt;enumeration value="vacant"/&gt;
 *     &lt;enumeration value="workerCouple"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HouseholdTypeValue")
@XmlEnum
public enum HouseholdTypeValue {


    /**
     * An adult living alone (age above 18).
     * 
     */
    @XmlEnumValue("loneAdult")
    LONE_ADULT("loneAdult"),

    /**
     * Two or more families living in a building.
     * 
     */
    @XmlEnumValue("multiFamily")
    MULTI_FAMILY("multiFamily"),

    /**
     * Only one family living in a building.
     * 
     */
    @XmlEnumValue("oneFamily")
    ONE_FAMILY("oneFamily"),

    /**
     * An old couple living in a building (age above 60).
     * 
     */
    @XmlEnumValue("pensionerCouple")
    PENSIONER_COUPLE("pensionerCouple"),

    /**
     * Two or more adults having no family relation living together.
     * 
     */
    @XmlEnumValue("unrelatedAdults")
    UNRELATED_ADULTS("unrelatedAdults"),

    /**
     * No one living in a building. An empty household.
     * 
     */
    @XmlEnumValue("vacant")
    VACANT("vacant"),

    /**
     * A working couple living in a household. A couple having a job.
     * 
     */
    @XmlEnumValue("workerCouple")
    WORKER_COUPLE("workerCouple");
    private final String value;

    HouseholdTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HouseholdTypeValue fromValue(String v) {
        for (HouseholdTypeValue c: HouseholdTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
