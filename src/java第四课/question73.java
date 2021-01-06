package javaµÚËÄ¿Î;

import java.util.Scanner;

public class question73 {
	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100:");
		int [] number1=new int[101];
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		while(number!=0) {
			number1[number]++;
			number=input.nextInt();
		}
		int i=0;
		for(i=0;i<=100;i++) {
			if(number1[i]!=0) {
			System.out.println(i+" occurs "+number1[i]+" times ");
			}
		}
	}
}
