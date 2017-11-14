package com.isuru.bmi;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Bmi {
	
	@WebMethod 
	String CalculateBmi(double weight, double height);

}
