/**
 * Lesson: String Manipulation
 * Author: Nithin.A
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		
	}
	
	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String str = s.nextLine();
		System.out.println(str.contains("on"));
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String str = s.nextLine();
		System.out.println(str.equalsIgnoreCase("mango"));
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		System.out.print("Input a letter: ");
		String letter = s.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
		
	}
	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		System.out.println("Your sentence is " + sentence.length() + " characters long");
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		System.out.print("Input a word to replace: ");
		String word = s.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String wordR = s.nextLine();
		System.out.println(sentence.replaceAll(word, wordR));
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		sentence = sentence.trim();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
	}

	public static void q7() {
		//Write question 7 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		int wordLast = word.length() - 4;
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(wordLast, word.length()));
	}

	public static void q8() {
		//Write question 8 code here
	}

}
