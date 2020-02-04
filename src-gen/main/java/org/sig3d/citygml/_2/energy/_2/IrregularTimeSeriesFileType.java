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


/**
 * Time series with a differing time increments, stored in textual format (e.g. CSV)  on an external device.
 * 
 * <p>Java-Klasse für IrregularTimeSeriesFileType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IrregularTimeSeriesFileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesFileType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeColumnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "IrregularTimeSeriesFileType", propOrder = {
    "timeColumnNumber",
    "valueColumnNumber"
})
public class IrregularTimeSeriesFileType
    extends AbstractTimeSeriesFileType
{

    @XmlElement(defaultValue = "0")
    protected Integer timeColumnNumber;
    @XmlElement(defaultValue = "1")
    protected Integer valueColumnNumber;

    /**
     * Ruft den Wert der timeColumnNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeColumnNumber() {
        return timeColumnNumber;
    }

    /**
     * Legt den Wert der timeColumnNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeColumnNumber(Integer value) {
        this.timeColumnNumber = value;
    }

    public boolean isSetTimeColumnNumber() {
        return (this.timeColumnNumber!= null);
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
