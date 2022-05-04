package mypackage;

import java.util.Scanner;

public class GrowthOfaPopulation {
	
	public static int nbYear(int p0, double percent, int aug, int p) {
        int ans=0;
        while(p0<p){
          p0 = p0 + (int)(p0*(percent/100)) + aug;
          ans++;
        }
        return ans;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a starting population");
		int p0 = input.nextInt();
		System.out.println("Enter a growth percent");
		double percent = input.nextDouble();
		System.out.println("Enter number of inhabitants coming/leaving");
		int aug = input.nextInt();
		System.out.println("Enter a final population");
		int p = input.nextInt();
		
		System.out.println("Number of years: ");
		int s = nbYear(p0, percent, aug, p);
		System.out.print(s);

	}

}
