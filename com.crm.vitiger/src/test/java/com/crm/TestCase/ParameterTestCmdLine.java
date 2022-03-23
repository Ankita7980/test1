package com.crm.TestCase;

import org.testng.annotations.Test;

public class ParameterTestCmdLine {

	@Test
	
	public void getData() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		
	}


}
