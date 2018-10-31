/**
 * MyWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.davidgassner.example.webservice;

public interface MyWebService extends javax.xml.rpc.Service {
    public java.lang.String getMyWebServiceSoapAddress();

    public com.davidgassner.example.webservice.MyWebServiceSoap getMyWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.davidgassner.example.webservice.MyWebServiceSoap getMyWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
