package org.cdacnoida.course.Marks;

import java.util.Scanner;

public class Number {
        
	static int num;
	
	static void Show() {
		
		Scanner j = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		num = j.nextInt();
		j.close();
		
	}
	
	static void print() {
		
		System.out.println(num <= 0 ? "negative ": "positvie ");
	}
	public static void main(String[] args) {
		
		
		Show();
		print();
		
	}

}
