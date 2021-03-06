/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2009-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.grizzly.http.webxml.schema.version_3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	The port-component element associates a WSDL port with a web service
 * 	interface and implementation.  It defines the name of the port as a
 * 	component, optional description, optional display name, optional iconic
 * 	representations, WSDL port QName, Service Endpoint Interface, Service
 * 	Implementation Bean.
 * 
 * 	This element also associates a WSDL service with a JAX-WS Provider
 * 	implementation.
 * 
 *       
 * 
 * <p>Java class for port-componentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="port-componentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/javaee}descriptionType" minOccurs="0"/>
 *         &lt;element name="display-name" type="{http://java.sun.com/xml/ns/javaee}display-nameType" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://java.sun.com/xml/ns/javaee}iconType" minOccurs="0"/>
 *         &lt;element name="port-component-name" type="{http://java.sun.com/xml/ns/javaee}string"/>
 *         &lt;element name="wsdl-service" type="{http://java.sun.com/xml/ns/javaee}xsdQNameType" minOccurs="0"/>
 *         &lt;element name="wsdl-port" type="{http://java.sun.com/xml/ns/javaee}xsdQNameType" minOccurs="0"/>
 *         &lt;element name="enable-mtom" type="{http://java.sun.com/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="protocol-binding" type="{http://java.sun.com/xml/ns/javaee}protocol-bindingType" minOccurs="0"/>
 *         &lt;element name="service-endpoint-interface" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *         &lt;element name="service-impl-bean" type="{http://java.sun.com/xml/ns/javaee}service-impl-beanType"/>
 *         &lt;choice>
 *           &lt;element name="handler" type="{http://java.sun.com/xml/ns/javaee}port-component_handlerType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="handler-chains" type="{http://java.sun.com/xml/ns/javaee}handler-chainsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "port-componentType", propOrder = {
    "description",
    "displayName",
    "icon",
    "portComponentName",
    "wsdlService",
    "wsdlPort",
    "enableMtom",
    "protocolBinding",
    "serviceEndpointInterface",
    "serviceImplBean",
    "handler",
    "handlerChains"
})
public class PortComponentType {

    protected DescriptionType description;
    @XmlElement(name = "display-name")
    protected DisplayNameType displayName;
    protected IconType icon;
    @XmlElement(name = "port-component-name", required = true)
    protected com.sun.grizzly.http.webxml.schema.version_3_0.String portComponentName;
    @XmlElement(name = "wsdl-service")
    protected XsdQNameType wsdlService;
    @XmlElement(name = "wsdl-port")
    protected XsdQNameType wsdlPort;
    @XmlElement(name = "enable-mtom")
    protected TrueFalseType enableMtom;
    @XmlElement(name = "protocol-binding")
    protected java.lang.String protocolBinding;
    @XmlElement(name = "service-endpoint-interface")
    protected FullyQualifiedClassType serviceEndpointInterface;
    @XmlElement(name = "service-impl-bean", required = true)
    protected ServiceImplBeanType serviceImplBean;
    protected List<PortComponentHandlerType> handler;
    @XmlElement(name = "handler-chains")
    protected HandlerChainsType handlerChains;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayNameType }
     *     
     */
    public DisplayNameType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayNameType }
     *     
     */
    public void setDisplayName(DisplayNameType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconType }
     *     
     */
    public IconType getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconType }
     *     
     */
    public void setIcon(IconType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the portComponentName property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.grizzly.http.webxml.schema.version_3_0.String }
     *     
     */
    public com.sun.grizzly.http.webxml.schema.version_3_0.String getPortComponentName() {
        return portComponentName;
    }

    /**
     * Sets the value of the portComponentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.grizzly.http.webxml.schema.version_3_0.String }
     *     
     */
    public void setPortComponentName(com.sun.grizzly.http.webxml.schema.version_3_0.String value) {
        this.portComponentName = value;
    }

    /**
     * Gets the value of the wsdlService property.
     * 
     * @return
     *     possible object is
     *     {@link XsdQNameType }
     *     
     */
    public XsdQNameType getWsdlService() {
        return wsdlService;
    }

    /**
     * Sets the value of the wsdlService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdQNameType }
     *     
     */
    public void setWsdlService(XsdQNameType value) {
        this.wsdlService = value;
    }

    /**
     * Gets the value of the wsdlPort property.
     * 
     * @return
     *     possible object is
     *     {@link XsdQNameType }
     *     
     */
    public XsdQNameType getWsdlPort() {
        return wsdlPort;
    }

    /**
     * Sets the value of the wsdlPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdQNameType }
     *     
     */
    public void setWsdlPort(XsdQNameType value) {
        this.wsdlPort = value;
    }

    /**
     * Gets the value of the enableMtom property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getEnableMtom() {
        return enableMtom;
    }

    /**
     * Sets the value of the enableMtom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setEnableMtom(TrueFalseType value) {
        this.enableMtom = value;
    }

    /**
     * Gets the value of the protocolBinding property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProtocolBinding() {
        return protocolBinding;
    }

    /**
     * Sets the value of the protocolBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProtocolBinding(java.lang.String value) {
        this.protocolBinding = value;
    }

    /**
     * Gets the value of the serviceEndpointInterface property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getServiceEndpointInterface() {
        return serviceEndpointInterface;
    }

    /**
     * Sets the value of the serviceEndpointInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setServiceEndpointInterface(FullyQualifiedClassType value) {
        this.serviceEndpointInterface = value;
    }

    /**
     * Gets the value of the serviceImplBean property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceImplBeanType }
     *     
     */
    public ServiceImplBeanType getServiceImplBean() {
        return serviceImplBean;
    }

    /**
     * Sets the value of the serviceImplBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceImplBeanType }
     *     
     */
    public void setServiceImplBean(ServiceImplBeanType value) {
        this.serviceImplBean = value;
    }

    /**
     * Gets the value of the handler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortComponentHandlerType }
     * 
     * 
     */
    public List<PortComponentHandlerType> getHandler() {
        if (handler == null) {
            handler = new ArrayList<PortComponentHandlerType>();
        }
        return this.handler;
    }

    /**
     * Gets the value of the handlerChains property.
     * 
     * @return
     *     possible object is
     *     {@link HandlerChainsType }
     *     
     */
    public HandlerChainsType getHandlerChains() {
        return handlerChains;
    }

    /**
     * Sets the value of the handlerChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlerChainsType }
     *     
     */
    public void setHandlerChains(HandlerChainsType value) {
        this.handlerChains = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
