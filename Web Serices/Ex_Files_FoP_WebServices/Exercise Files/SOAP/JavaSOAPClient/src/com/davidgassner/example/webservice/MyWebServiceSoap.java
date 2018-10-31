/**
 * MyWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.davidgassner.example.webservice;

public interface MyWebServiceSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public double addNumbers(double value1, double value2) throws java.rmi.RemoteException;
}
