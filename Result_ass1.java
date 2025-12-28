package com.index;
import java.util.Scanner;

public class Result_ass1 {

	public static void main(String[] args) {
		System.out.println("Enter Your Mark");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=40) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
