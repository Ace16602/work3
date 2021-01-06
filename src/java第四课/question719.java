package javaµÚËÄ¿Î;

import java.util.Scanner;

public class question719 {
	public static void main(String[] args) {
		String[] Name=new String[10];
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int i=0;
		while(number>0) {
		Scanner sc=new Scanner(System.in);
		Name[i]=sc.next();
		String Grade=sc.next();
		number--;
		}
	}
}
