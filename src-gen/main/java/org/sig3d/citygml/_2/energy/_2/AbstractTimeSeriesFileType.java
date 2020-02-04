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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.UnitOfMeasureType;


/**
 * Abstract base class for time series classes storing its values on an external file
 * 
 * <p>Java-Klasse für AbstractTimeSeriesFileType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeSeriesFileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sig3d.org/citygml/2.0/energy/2.0}AbstractTimeSeriesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uom" type="{http://www.opengis.net/gml}UnitOfMeasureType"/&gt;
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="numberOfHeaderLines" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fieldSeparator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decimalSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeSeriesFileType", propOrder = {
    "uom",
    "file",
    "numberOfHeaderLines",
    "fieldSeparator",
    "recordSeparator",
    "decimalSymbol"
})
@XmlSeeAlso({
    IrregularTimeSeriesFileType.class,
    RegularTimeSeriesFileType.class
})
public abstract class AbstractTimeSeriesFileType
    extends AbstractTimeSeriesType
{

    @XmlElement(required = true)
    protected UnitOfMeasureType uom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String file;
    @XmlElement(defaultValue = "0")
    protected Integer numberOfHeaderLines;
    @XmlElement(required = true)
    protected String fieldSeparator;
    @XmlElement(defaultValue = "\\n")
    protected String recordSeparator;
    @XmlElement(defaultValue = ".")
    protected String decimalSymbol;

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
     * Ruft den Wert der file-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    public boolean isSetFile() {
        return (this.file!= null);
    }

    /**
     * Ruft den Wert der numberOfHeaderLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfHeaderLines() {
        return numberOfHeaderLines;
    }

    /**
     * Legt den Wert der numberOfHeaderLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfHeaderLines(Integer value) {
        this.numberOfHeaderLines = value;
    }

    public boolean isSetNumberOfHeaderLines() {
        return (this.numberOfHeaderLines!= null);
    }

    /**
     * Ruft den Wert der fieldSeparator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldSeparator() {
        return fieldSeparator;
    }

    /**
     * Legt den Wert der fieldSeparator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldSeparator(String value) {
        this.fieldSeparator = value;
    }

    public boolean isSetFieldSeparator() {
        return (this.fieldSeparator!= null);
    }

    /**
     * Ruft den Wert der recordSeparator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSeparator() {
        return recordSeparator;
    }

    /**
     * Legt den Wert der recordSeparator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSeparator(String value) {
        this.recordSeparator = value;
    }

    public boolean isSetRecordSeparator() {
        return (this.recordSeparator!= null);
    }

    /**
     * Ruft den Wert der decimalSymbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSymbol() {
        return decimalSymbol;
    }

    /**
     * Legt den Wert der decimalSymbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSymbol(String value) {
        this.decimalSymbol = value;
    }

    public boolean isSetDecimalSymbol() {
        return (this.decimalSymbol!= null);
    }

}
