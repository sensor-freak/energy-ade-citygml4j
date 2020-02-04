//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.9.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Tue Feb 04 10:41:32 CET 2020
//


package org.sig3d.citygml._2.energy._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.UnitOfMeasureType;


/**
 * Irregular time series is the opposite of a regular time series. The data in the time series follows a temporal sequence, but the measurements might not happen at a regular time interval.
 * 
 * <p>Java-Klasse für IrregularTimeSeriesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IrregularTimeSeriesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uom" type="{http://www.opengis.net/gml}UnitOfMeasureType"/&gt;
 *         &lt;element name="contains" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}MeasurementPointPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IrregularTimeSeriesType", propOrder = {
    "uom",
    "contains"
})
@XmlSeeAlso({
    MonthlyTimeSeriesType.class
})
public class IrregularTimeSeriesType
    extends AbstractTimeSeriesType
{

    @XmlElement(required = true)
    protected UnitOfMeasureType uom;
    protected List<MeasurementPointPropertyType> contains;

    /**
     * Ruft den Wert der uom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUom() {
        return uom;
    }

    /**
     * Legt den Wert der uom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUom(UnitOfMeasureType value) {
        this.uom = value;
    }

    public boolean isSetUom() {
        return (this.uom!= null);
    }

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementPointPropertyType }
     * 
     * 
     */
    public List<MeasurementPointPropertyType> getContains() {
        if (contains == null) {
            contains = new ArrayList<MeasurementPointPropertyType>();
        }
        return this.contains;
    }

    public boolean isSetContains() {
        return ((this.contains!= null)&&(!this.contains.isEmpty()));
    }

    public void unsetContains() {
        this.contains = null;
    }

}
