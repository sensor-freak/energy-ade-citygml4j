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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AreaType;


/**
 * System converting solar energy in electricity.
 * 
 * <p>Java-Klasse für PhotovoltaicSystemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PhotovoltaicSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractSolarEnergySystemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cellType" type="{http://www.sig3d.org/citygml/2.0/energy/2.0}CellTypeValue"/&gt;
 *         &lt;element name="moduleArea" type="{http://www.opengis.net/gml}AreaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotovoltaicSystemType", propOrder = {
    "cellType",
    "moduleArea"
})
public class PhotovoltaicSystemType
    extends AbstractSolarEnergySystemType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CellTypeValue cellType;
    protected AreaType moduleArea;

    /**
     * Ruft den Wert der cellType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CellTypeValue }
     *     
     */
    public CellTypeValue getCellType() {
        return cellType;
    }

    /**
     * Legt den Wert der cellType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CellTypeValue }
     *     
     */
    public void setCellType(CellTypeValue value) {
        this.cellType = value;
    }

    public boolean isSetCellType() {
        return (this.cellType!= null);
    }

    /**
     * Ruft den Wert der moduleArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getModuleArea() {
        return moduleArea;
    }

    /**
     * Legt den Wert der moduleArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setModuleArea(AreaType value) {
        this.moduleArea = value;
    }

    public boolean isSetModuleArea() {
        return (this.moduleArea!= null);
    }

}
