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
 * Other energy consumption devicewithin a building
 * 
 * <p>Java-Klasse für OtherEnergyConsumerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OtherEnergyConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractEnergySystemConsumerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sig3d.org/citygml/2.0/energy/2.0}_GenericApplicationPropertyOfOtherEnergyConsumer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEnergyConsumerType", propOrder = {
    "_GenericApplicationPropertyOfOtherEnergyConsumer"
})
public class OtherEnergyConsumerType
    extends AbstractEnergySystemConsumerType
{

    protected List<Object> _GenericApplicationPropertyOfOtherEnergyConsumer;

    /**
     * Gets the value of the genericApplicationPropertyOfOtherEnergyConsumer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfOtherEnergyConsumer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfOtherEnergyConsumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfOtherEnergyConsumer() {
        if (_GenericApplicationPropertyOfOtherEnergyConsumer == null) {
            _GenericApplicationPropertyOfOtherEnergyConsumer = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfOtherEnergyConsumer;
    }

    public boolean isSet_GenericApplicationPropertyOfOtherEnergyConsumer() {
        return ((this._GenericApplicationPropertyOfOtherEnergyConsumer!= null)&&(!this._GenericApplicationPropertyOfOtherEnergyConsumer.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfOtherEnergyConsumer() {
        this._GenericApplicationPropertyOfOtherEnergyConsumer = null;
    }

}
