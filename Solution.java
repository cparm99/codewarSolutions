package mypackage;

import java.util.Scanner;

public class Solution {

  public static int solution(int number) {
    if(number < 0) {
      return 0;
    }
    int sum=0;
    //check for multiples of 3 or 5 and add to sum
    for(int i=3; i<number; i++){
      if(i%3==0 | i%5==0){
        sum += i;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = input.nextInt();
	int s = solution(n);
	System.out.println(s);	

	}
}
