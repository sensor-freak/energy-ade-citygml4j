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
 * Optical properties of a material
 * 
 * <p>Java-Klasse für OpticalPropertiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OpticalPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="absorptance" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbsorptancePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="emissivity" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}EmissivityPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reflectance" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}ReflectancePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transmittance" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}TransmittancePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpticalPropertiesType", propOrder = {
    "absorptance",
    "emissivity",
    "reflectance",
    "transmittance"
})
public class OpticalPropertiesType {

    protected List<AbsorptancePropertyType> absorptance;
    protected List<EmissivityPropertyType> emissivity;
    protected List<ReflectancePropertyType> reflectance;
    protected List<TransmittancePropertyType> transmittance;

    /**
     * Gets the value of the absorptance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absorptance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsorptance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsorptancePropertyType }
     * 
     * 
     */
    public List<AbsorptancePropertyType> getAbsorptance() {
        if (absorptance == null) {
            absorptance = new ArrayList<AbsorptancePropertyType>();
        }
        return this.absorptance;
    }

    public boolean isSetAbsorptance() {
        return ((this.absorptance!= null)&&(!this.absorptance.isEmpty()));
    }

    public void unsetAbsorptance() {
        this.absorptance = null;
    }

    /**
     * Gets the value of the emissivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emissivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmissivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmissivityPropertyType }
     * 
     * 
     */
    public List<EmissivityPropertyType> getEmissivity() {
        if (emissivity == null) {
            emissivity = new ArrayList<EmissivityPropertyType>();
        }
        return this.emissivity;
    }

    public boolean isSetEmissivity() {
        return ((this.emissivity!= null)&&(!this.emissivity.isEmpty()));
    }

    public void unsetEmissivity() {
        this.emissivity = null;
    }

    /**
     * Gets the value of the reflectance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reflectance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReflectance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReflectancePropertyType }
     * 
     * 
     */
    public List<ReflectancePropertyType> getReflectance() {
        if (reflectance == null) {
            reflectance = new ArrayList<ReflectancePropertyType>();
        }
        return this.reflectance;
    }

    public boolean isSetReflectance() {
        return ((this.reflectance!= null)&&(!this.reflectance.isEmpty()));
    }

    public void unsetReflectance() {
        this.reflectance = null;
    }

    /**
     * Gets the value of the transmittance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transmittance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransmittance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransmittancePropertyType }
     * 
     * 
     */
    public List<TransmittancePropertyType> getTransmittance() {
        if (transmittance == null) {
            transmittance = new ArrayList<TransmittancePropertyType>();
        }
        return this.transmittance;
    }

    public boolean isSetTransmittance() {
        return ((this.transmittance!= null)&&(!this.transmittance.isEmpty()));
    }

    public void unsetTransmittance() {
        this.transmittance = null;
    }

}
