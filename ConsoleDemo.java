package com.cmpundhir;

import java.io.Console;

class ConsoleDemo{
	private static String savedUsername = "cmpundhir";
	private static char[] savedPassword = {'s','t','r','o','n','g'};
	
	private static boolean isVerified(String un,char[] ps){
		if(un.equals(savedUsername)){
			for(int i=0;i<savedPassword.length;i++){
				if(savedPassword[i]!=ps[i]){
					System.out.println("Incorrect Password");
					return false;
				}
			}
		}else{
			System.out.println("Incorrect username");
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String username;
		char[] password;
		System.out.println("Enter username : ");
		Console con = System.console();
		username = con.readLine();
		System.out.println("Enter password : ");
		password = con.readPassword();
		if(isVerified(username,password)){
			System.out.println("Welcome "+username);
		}
	
	}
}