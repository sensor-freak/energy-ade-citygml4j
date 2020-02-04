//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * Time series with a constant time increment, stored in textual format (e.g. CSV)  on an external device.
 * 
 * <p>Java-Klasse für RegularTimeSeriesFileType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegularTimeSeriesFileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesFileType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temporalExtent" type="{http://www.opengis.net/gml}TimePeriodPropertyType"/&gt;
 *         &lt;element name="timeInterval" type="{http://www.opengis.net/gml}TimeIntervalLengthType"/&gt;
 *         &lt;element name="valueColumnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularTimeSeriesFileType", propOrder = {
    "temporalExtent",
    "timeInterval",
    "valueColumnNumber"
})
public class RegularTimeSeriesFileType
    extends AbstractTimeSeriesFileType
{

    @XmlElement(required = true)
    protected TimePeriodPropertyType temporalExtent;
    @XmlElement(required = true)
    protected TimeIntervalLengthType timeInterval;
    @XmlElement(defaultValue = "0")
    protected Integer valueColumnNumber;

    /**
     * Ruft den Wert der temporalExtent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getTemporalExtent() {
        return temporalExtent;
    }

    /**
     * Legt den Wert der temporalExtent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setTemporalExtent(TimePeriodPropertyType value) {
        this.temporalExtent = value;
    }

    public boolean isSetTemporalExtent() {
        return (this.temporalExtent!= null);
    }

    /**
     * Ruft den Wert der timeInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getTimeInterval() {
        return timeInterval;
    }

    /**
     * Legt den Wert der timeInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setTimeInterval(TimeIntervalLengthType value) {
        this.timeInterval = value;
    }

    public boolean isSetTimeInterval() {
        return (this.timeInterval!= null);
    }

    /**
     * Ruft den Wert der valueColumnNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueColumnNumber() {
        return valueColumnNumber;
    }

    /**
     * Legt den Wert der valueColumnNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueColumnNumber(Integer value) {
        this.valueColumnNumber = value;
    }

    public boolean isSetValueColumnNumber() {
        return (this.valueColumnNumber!= null);
    }

}
