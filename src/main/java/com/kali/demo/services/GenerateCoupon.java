package com.kali.demo.services;

import org.springframework.stereotype.Component;

@Component
public class GenerateCoupon {

	public static String getCoupon() {
		final int n = 10;

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 

        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return "RC"+sb.toString().toUpperCase(); 
	}
}
