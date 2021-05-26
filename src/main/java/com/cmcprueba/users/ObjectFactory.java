//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.26 a las 05:58:16 PM COT 
//


package com.cmcprueba.users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmcprueba.users package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllUserDetailsRequest_QNAME = new QName("http://cmcprueba.com/users", "GetAllUserDetailsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmcprueba.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserDetailsRequest }
     * 
     */
    public GetUserDetailsRequest createGetUserDetailsRequest() {
        return new GetUserDetailsRequest();
    }

    /**
     * Create an instance of {@link GetUserDetailsResponse }
     * 
     */
    public GetUserDetailsResponse createGetUserDetailsResponse() {
        return new GetUserDetailsResponse();
    }

    /**
     * Create an instance of {@link UserDetails }
     * 
     */
    public UserDetails createUserDetails() {
        return new UserDetails();
    }

    /**
     * Create an instance of {@link GetAllUserDetailsResponse }
     * 
     */
    public GetAllUserDetailsResponse createGetAllUserDetailsResponse() {
        return new GetAllUserDetailsResponse();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cmcprueba.com/users", name = "GetAllUserDetailsRequest")
    public JAXBElement<Object> createGetAllUserDetailsRequest(Object value) {
        return new JAXBElement<Object>(_GetAllUserDetailsRequest_QNAME, Object.class, null, value);
    }

}
