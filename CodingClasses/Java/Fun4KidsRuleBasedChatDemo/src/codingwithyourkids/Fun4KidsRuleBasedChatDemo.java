// Author: Caio Moreno
// https://github.com/caiomsouza/codingwithyourkids


package codingwithyourkids;

import java.util.Scanner;

public class Fun4KidsRuleBasedChatDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("What is your name? ");  
		
		String name = sc.nextLine();
		System.out.println("Nice to meet you: "+name);
		
		System.out.print("How old are you? ");  		
		int age = sc.nextInt();
		
		System.out.println("Oh, well done. You are already : "+age+ " years old");
		
		if (age > 6) {
			  System.out.println("That's great news! Keep up the good work and keep learning and obeying your parents and your school teachers");			  
			}	  
		}
}
