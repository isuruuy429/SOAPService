package com.isuru.bmi;

import java.text.DecimalFormat;

import javax.jws.WebService;

@WebService(endpointInterface = "com.isuru.bmi.Bmi")
public class BmiImpl implements Bmi{

	@Override
	public String CalculateBmi(double weight, double height) {
		double bmi = weight/(height*height);
		DecimalFormat df = new DecimalFormat("#.##");      
		String bmi_formatted = df.format(bmi);
		return bmi_formatted;
	}

}
