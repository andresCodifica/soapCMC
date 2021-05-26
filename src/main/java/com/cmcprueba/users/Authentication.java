//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.26 a las 05:58:16 PM COT 
//


package com.cmcprueba.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Authentication complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Authentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lasthour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentication", propOrder = {
    "lastDate",
    "lasthour",
    "attempts"
})
public class Authentication {

    @XmlElement(required = true)
    protected String lastDate;
    @XmlElement(required = true)
    protected String lasthour;
    protected int attempts;

    /**
     * Obtiene el valor de la propiedad lastDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDate() {
        return lastDate;
    }

    /**
     * Define el valor de la propiedad lastDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDate(String value) {
        this.lastDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lasthour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLasthour() {
        return lasthour;
    }

    /**
     * Define el valor de la propiedad lasthour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasthour(String value) {
        this.lasthour = value;
    }

    /**
     * Obtiene el valor de la propiedad attempts.
     * 
     */
    public int getAttempts() {
        return attempts;
    }

    /**
     * Define el valor de la propiedad attempts.
     * 
     */
    public void setAttempts(int value) {
        this.attempts = value;
    }

}
