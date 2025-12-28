package com.index;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		if(pass.length()<8) {
			System.out.println("Week Password");
		}else {
			System.out.println("Password Submitted");
		}

	}

}
