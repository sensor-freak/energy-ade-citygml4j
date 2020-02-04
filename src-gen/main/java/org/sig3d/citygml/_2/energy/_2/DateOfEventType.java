//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.gml.TimePositionType;


/**
 * Specifies either an exact time instant or a time span.
 * 
 * <p>Java-Klasse für DateOfEventType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DateOfEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="instant" type="{http://www.opengis.net/gml}TimePositionType"/&gt;
 *         &lt;element name="period" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOfEventType", propOrder = {
    "instant",
    "period"
})
public class DateOfEventType {

    protected TimePositionType instant;
    protected TimePeriodPropertyType period;

    /**
     * Ruft den Wert der instant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getInstant() {
        return instant;
    }

    /**
     * Legt den Wert der instant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setInstant(TimePositionType value) {
        this.instant = value;
    }

    public boolean isSetInstant() {
        return (this.instant!= null);
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setPeriod(TimePeriodPropertyType value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

}
