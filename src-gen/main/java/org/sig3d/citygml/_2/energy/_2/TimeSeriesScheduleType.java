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
 * Highest Level of Detail of the schedule representation, consisting in a time series.
 * 
 * <p>Java-Klasse für TimeSeriesScheduleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeDependingValues" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesScheduleType", propOrder = {
    "timeDependingValues"
})
public class TimeSeriesScheduleType
    extends AbstractScheduleType
{

    @XmlElement(required = true)
    protected AbstractTimeSeriesPropertyType timeDependingValues;

    /**
     * Ruft den Wert der timeDependingValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public AbstractTimeSeriesPropertyType getTimeDependingValues() {
        return timeDependingValues;
    }

    /**
     * Legt den Wert der timeDependingValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeSeriesPropertyType }
     *     
     */
    public void setTimeDependingValues(AbstractTimeSeriesPropertyType value) {
        this.timeDependingValues = value;
    }

    public boolean isSetTimeDependingValues() {
        return (this.timeDependingValues!= null);
    }

}
