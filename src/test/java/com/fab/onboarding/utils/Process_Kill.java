package com.fab.onboarding.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process_Kill {

	public static void main(String[] args) throws IOException {
		
			
		try {  
		      String line;  
		      Process process = Runtime.getRuntime().exec("lsof -t -i :4723");
		          
		      BufferedReader input =new BufferedReader(new InputStreamReader(process.getInputStream()));  
		      if ((line = input.readLine()) != null)
		      {  
		    	  System.out.println("Process ID on port 4723 : " + line);
		      }
		      String line1;
		      Process process1 = Runtime.getRuntime().exec("kill -9 " + line);
	          
		      BufferedReader input1 =new BufferedReader(new InputStreamReader(process1.getInputStream())); 
		      System.out.println("Process IDdsml on port 4723 : " + line);
		      
		      input.close();  
		     
		}
		    catch (Exception err) {  
		    	err.printStackTrace();  
		
	}

}}
