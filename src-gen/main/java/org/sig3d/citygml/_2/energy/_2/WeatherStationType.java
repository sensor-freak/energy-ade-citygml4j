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
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.PointPropertyType;


/**
 * Aggregation of different time series (WeatherData) of meteorological or radiation parameters, e,g, measured by a specific weather station.
 * 
 * <p>Java-Klasse für WeatherStationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WeatherStationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{http://www.opengis.net/gml}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfWeatherStation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherStationType", propOrder = {
    "position",
    "_GenericApplicationPropertyOfWeatherStation"
})
public class WeatherStationType
    extends AbstractCityObjectType
{

    protected PointPropertyType position;
    protected List<Object> _GenericApplicationPropertyOfWeatherStation;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPosition(PointPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    /**
     * Gets the value of the genericApplicationPropertyOfWeatherStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfWeatherStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfWeatherStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfWeatherStation() {
        if (_GenericApplicationPropertyOfWeatherStation == null) {
            _GenericApplicationPropertyOfWeatherStation = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfWeatherStation;
    }

    public boolean isSet_GenericApplicationPropertyOfWeatherStation() {
        return ((this._GenericApplicationPropertyOfWeatherStation!= null)&&(!this._GenericApplicationPropertyOfWeatherStation.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfWeatherStation() {
        this._GenericApplicationPropertyOfWeatherStation = null;
    }

}
