package com.index;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		System.out.println("Enter Username");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		if(user.equals("Priya")&&password.equals("java123")) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Invalid Credentials");
		}
		
	}

}
