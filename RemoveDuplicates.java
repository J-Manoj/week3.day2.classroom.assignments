package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {		
		
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print each character for charSet
		
		String name = "PayPal Indiaa";
		char[] ch = name.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet();
		Set<Character> dupCharSet = new LinkedHashSet();
		
		for (char eachValue: ch) {
			boolean cs = charSet.add(eachValue);
			if(cs==false) {
				dupCharSet.add(eachValue);
			}
		}
		
		for(char eachDatachar:charSet)
		{
			if(eachDatachar!=' ')
			System.out.print(eachDatachar);
		}
			
		
}
}
