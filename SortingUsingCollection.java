package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

//	Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
//	get the length of the array		
//	sort the array			
//	Iterate it in the reverse order
//	print the array
//	Required Output: Wipro, HCL , CTS, Aspire Systems

		
		  String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" }; 
		  
		  //Method 1 - as per Pseudo Code
			/*
			 * //int len =input.length; Arrays.sort(input); //for (int i=len-1; i>=0; i--) {
			 * System.out.println(input[i]); }
			 */		 
		  
		  //Method 2 - Using reverse method in Collections
		  List<String> obj = new ArrayList<String>();
		  for(String str: input) {
			  obj.add(str);
		  }
		  Collections.reverse(obj);
		  
		  for(String str2: obj)
		  {
			  System.out.println(str2);
		  }
		 

	}
}
