package com.davidgassner.example.webclient;

import java.rmi.RemoteException;

import com.davidgassner.example.webservice.MyWebServiceSoapProxy;

public class WebServiceClient {

	public static void main(String[] args) throws RemoteException {
		
		System.out.println("Hello world");
		
		MyWebServiceSoapProxy proxy = new MyWebServiceSoapProxy("http://localhost:11812/MyWebService.asmx");
		
		String helloString = proxy.helloWorld();
		System.out.println(helloString);
		
		double value1 = 35;
		double value2 = 26.5;
		double result = proxy.addNumbers(value1, value2);
		System.out.println("The answer is " + result);
		
	}

}
