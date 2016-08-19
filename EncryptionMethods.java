package com.encrypt;

import java.util.Random;
import java.util.Scanner;

public class EncryptionMethods {

	static Scanner pw = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static String userInput = null;
	static String recoveryPass = null;
	
	public static void jumbleItUp() {
		
		userInput = sc2.nextLine().toLowerCase();

		StringBuilder sb = new StringBuilder(userInput);
		for (int i = 0; i < 1; i++) {
			jumbleMath(sb);
			System.out.println("Here is your Jumbled Up input: " + sb + "\n");

		} // for
	} // jumbleItUp

	public static void jumbleMath(StringBuilder sb) {
		Random rand = new Random(); // randomizer
		for (int i = sb.length() - 1; i > 1; i--) {
			int swapWith = rand.nextInt(i); // randomizing the int in the
											// stringbuilding and sets it to new
											// int swapWith?
			char tmp = sb.charAt(swapWith); // find the char that sits in the
											// random index location from int
											// swapWith?
			sb.setCharAt(swapWith, sb.charAt(i));
			sb.setCharAt(i, tmp);
		} // for
	} // jumbleMath

	public static void jumbleRecoveryPhrase() {
		
		System.out.println("'The Jumbler' works by rearranging the order of the letters in your message like an anagram.\n"
                        + "With this function, a password is needed for the user to reveal the original message.\n");
		System.out.println("Enter a recovery password for the Jumbler: ");
		recoveryPass = pw.nextLine();
		
			if (recoveryPass.isEmpty()) {
				System.out.println("You must enter a recovery password before entering the Jumbler!");
				System.out.println("You will now be returned to the main menu for your failure.\n");
			} else {
				System.out.println("Welcome to the Jumbler!\n");
				System.out.println("So you are ready to jumble it up like a boss? Enter your input below:");
				jumbleItUp();
			} 
	} //jumbleSecurityQuestion
	
	public static void switchItUp() {
		
		System.out.println("The switcher is an encryption method that has a \n"
                + "predetermined value for every letter in the alphabet. Share the 'key' \n"
                + "only with the message recipient, and you will be the only two people that can crack the code!");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Please input the message you would like to use the Switcher on:");
		String userInput1 = sc3.nextLine();
		String encryptString = userInput1.replace('a', '!').replace('b', '@').replace('c', '#').replace('d', '$')
				.replace('e', '%').replace('f', '^').replace('g', '&').replace('h', '*').replace('i', '(')
				.replace('j', ')').replace('k', '-').replace('l', '/').replace('m', ':').replace('n', 'a')
				.replace('o', 'b').replace('p', 'c').replace('q', 'd').replace('r', 'e').replace('s', 'f')
				.replace('t', 'g').replace('u', 'h').replace('v', 'i').replace('w', 'j').replace('x', 'k')
				.replace('y', 'l').replace('z', 'm').replace('!', 'n').replace('@', 'o').replace('#', 'p')
				.replace('$', 'q').replace('%', 'r').replace('^', 's').replace('&', 't').replace('*', 'u')
				.replace('(', 'v').replace(')', 'w').replace('-', 'x').replace('/', 'y').replace(':', 'z');

		System.out.println("Here is your encrypted message:\n" + encryptString + "\n");
	}
	
	public static void caesarEncryption() {
		System.out.println("Welcome to the Caesar Shifter!");
		System.out.println("This is an ancient and simple system that is \n"
				+ "quite efficient at passing hidden messages. The Caesar Shifter relies \n"
				+ "on a 'magic number' that is known only to the message writer and readers.");
		System.out.println();
		System.out.println("Enter the sentence that you would like to encrypt:");
		Scanner sc7 = new Scanner(System.in);
		String nonCodedCaesarSentence = sc7.nextLine();
		System.out.println("How many times would you like Caesar to shift your message?");
		System.out.println("Enter a whole number between 1 and 25:");
		Scanner sc8 = new Scanner(System.in);
		int shiftsToCaesar = sc8.nextInt();
		System.out.println("The 'magic number' to accompany this encrypted message is: " + shiftsToCaesar + ".");
		System.out.println("Make sure to give this number to the recipient of this message!");

		char[] caesarCharArray = nonCodedCaesarSentence.toCharArray();

		// Loop over characters.
		for (int i = 0; i < caesarCharArray.length; i++) {

			// Shift letter, moving back or forward 26 places if needed.
			char nonEncryptedLetter = caesarCharArray[i];
			if (nonEncryptedLetter != ' ') {
				nonEncryptedLetter = (char) (nonEncryptedLetter + shiftsToCaesar);
				if (nonEncryptedLetter > 'z') {
					nonEncryptedLetter = (char) (nonEncryptedLetter - 26);
				}
			}
			caesarCharArray[i] = nonEncryptedLetter;

		}
		String caesarEncryted = String.copyValueOf(caesarCharArray);
		System.out.println();
		System.out.println("Here is your encrypted message:");
		System.out.println(caesarEncryted + "\n");
	}
}// class
