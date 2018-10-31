package com.davidgassner.example.webservice;

public class MyWebServiceSoapProxy implements com.davidgassner.example.webservice.MyWebServiceSoap {
  private String _endpoint = null;
  private com.davidgassner.example.webservice.MyWebServiceSoap myWebServiceSoap = null;
  
  public MyWebServiceSoapProxy() {
    _initMyWebServiceSoapProxy();
  }
  
  public MyWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMyWebServiceSoapProxy();
  }
  
  private void _initMyWebServiceSoapProxy() {
    try {
      myWebServiceSoap = (new com.davidgassner.example.webservice.MyWebServiceLocator()).getMyWebServiceSoap();
      if (myWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)myWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)myWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (myWebServiceSoap != null)
      ((javax.xml.rpc.Stub)myWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.davidgassner.example.webservice.MyWebServiceSoap getMyWebServiceSoap() {
    if (myWebServiceSoap == null)
      _initMyWebServiceSoapProxy();
    return myWebServiceSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (myWebServiceSoap == null)
      _initMyWebServiceSoapProxy();
    return myWebServiceSoap.helloWorld();
  }
  
  public double addNumbers(double value1, double value2) throws java.rmi.RemoteException{
    if (myWebServiceSoap == null)
      _initMyWebServiceSoapProxy();
    return myWebServiceSoap.addNumbers(value1, value2);
  }
  
  
}