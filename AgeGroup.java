package com.index;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		System.out.println("Enter the Age:");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=18) {
			System.out.println("Child");
		}else if(num>=18 && num<=60) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}

	}

}
