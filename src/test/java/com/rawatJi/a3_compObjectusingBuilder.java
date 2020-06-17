package com.rawatJi;
import org.junit.*;

public class a3_compObjectusingBuilder {

static a1_AccountObject a11,b11;
	
	public static void main(String ...ccc)
	{
		
		
		
		
		a11=a2_BuilderPattern.builder().setEmail("yaminiMalhotra@gmail.com").setFirstName("pehlanamee").setLastName("akhir"
				+ "inaame:").setLogin("LoginId").setUniqueID(111).build();
		b11=a2_BuilderPattern.builder().setEmail("yaminiMalhotra@gmail.com").setFirstName("pehlanamee").setLastName("akhir"
				+ "inaame:").setLogin("LoginId").setUniqueID(111).build();
		

		
		Assert.assertTrue(a11.equals(b11));
		
		
	}
	
}
