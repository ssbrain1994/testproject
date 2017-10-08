package demo1;

import java.util.Scanner;

public class newreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number to reverse");
		int original= sc.nextInt();
		int reverse=0;
		int reminder;
		while(original !=0){
			reminder=original % 10;
			reverse=reverse * 10 + reminder;
			original=original /10;
			
		}
		System.out.println("reverse:--"+reverse);
	}
}
