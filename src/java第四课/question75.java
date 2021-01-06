package javaµÚËÄ¿Î;

import java.util.Scanner;

public class question75 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] number=new int[10];
		int [] number1=new int[10];
		int i=0,j=0,sum=0;
		while(j<=9) {
			number[i]=input.nextInt();
			number1[number[i]]++;
			if(number1[number[i]]==1) {
				System.out.print(number[i]+" ");
			}
			i++;
			j++;
		}
		for(i=0;i<=9;i++) {
			if(number1[number[i]]!=1) {
				sum++;
			}
		}
		System.out.print(sum-1);
	}
}