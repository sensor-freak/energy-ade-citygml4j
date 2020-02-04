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


/**
 * Other energy distribution system
 * 
 * <p>Java-Klasse für OtherEnergyDistributionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OtherEnergyDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemDistributionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfOtherEnergyDistribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEnergyDistributionType", propOrder = {
    "_GenericApplicationPropertyOfOtherEnergyDistribution"
})
public class OtherEnergyDistributionType
    extends AbstractEnergySystemDistributionType
{

    protected List<Object> _GenericApplicationPropertyOfOtherEnergyDistribution;

    /**
     * Gets the value of the genericApplicationPropertyOfOtherEnergyDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfOtherEnergyDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfOtherEnergyDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfOtherEnergyDistribution() {
        if (_GenericApplicationPropertyOfOtherEnergyDistribution == null) {
            _GenericApplicationPropertyOfOtherEnergyDistribution = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfOtherEnergyDistribution;
    }

    public boolean isSet_GenericApplicationPropertyOfOtherEnergyDistribution() {
        return ((this._GenericApplicationPropertyOfOtherEnergyDistribution!= null)&&(!this._GenericApplicationPropertyOfOtherEnergyDistribution.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfOtherEnergyDistribution() {
        this._GenericApplicationPropertyOfOtherEnergyDistribution = null;
    }

}
