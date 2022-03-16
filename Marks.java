package org.cdacnoida.course.Marks;
import java.util.Scanner;
public class Marks {

  static int marks;
  static String result;
  
  static void In() {
	  
	  Scanner h = new Scanner(System.in); 
	  
	  System.out.println("Enter the marks = ");
	  marks = h.nextInt();
	 
	  h.close();
	  }
 
  
  static void dispaly() {
	  
	 System.out.println(result = marks >= 40 ? "Pass" : "Fail");
  }
 public static void main(String[] args) {
	
	 In();
	 dispaly();
	 
}
}
