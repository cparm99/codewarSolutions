package mypackage;

import java.util.Arrays;

public class SimplePigLatin {
	public static String pigIt(String str) {
	      String[] words = str.split(" ");
	      String sentence = "";
	      for(String word : words){
	        char[] chars = word.toCharArray();
	        if(chars[0] != '!' && chars[0] != '.' && chars[0] != '?'){
	          char firstChar = chars[0];
	          char[] newArr = Arrays.copyOfRange(chars, 1, chars.length);
	          word = String.valueOf(newArr) + String.valueOf(firstChar) + "ay";
	        }
	        sentence = sentence + word + " ";
	      }
	      char[] s = Arrays.copyOfRange(sentence.toCharArray(), 0, sentence.length() - 1);
	      return String.valueOf(s);
	    }
}
