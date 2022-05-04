package mypackage;

import java.util.Scanner;

public class GetTheMiddleCharacter {
	
	public static String getMiddle(String word) {
	    boolean even = word.length()%2 == 0;
	    if(even){
	      return word.substring(word.length()/2 - 1, word.length()/2 + 1);
	    }
	    return word.substring(word.length()/2, word.length()/2 + 1);
	}	
	 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputString = input.next();
		String s = getMiddle(inputString);
		System.out.println(s);	

	}
}
