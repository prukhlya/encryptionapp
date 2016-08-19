package com.encrypt;

import java.util.Scanner;

public class DecryptionMethods extends EncryptionMethods {

	public static void switchDecryption() {

		System.out.println("What sentence do you want to decrypt?");
		Scanner sc4 = new Scanner(System.in);
		String userInput2 = sc4.nextLine();

		String decryptString = userInput2.replace('n', '!').replace('o', '@').replace('p', '#').replace('q', '$')
				.replace('r', '%').replace('s', '^').replace('t', '&').replace('u', '*').replace('v', '(')
				.replace('w', ')').replace('x', '-').replace('y', '/').replace('z', ':').replace('a', 'n')
				.replace('b', 'o').replace('c', 'p').replace('d', 'q').replace('e', 'r').replace('f', 's')
				.replace('g', 't').replace('h', 'u').replace('i', 'v').replace('j', 'w').replace('k', 'x')
				.replace('l', 'y').replace('m', 'z').replace('!', 'a').replace('@', 'b').replace('#', 'c')
				.replace('$', 'd').replace('%', 'e').replace('^', 'f').replace('&', 'g').replace('*', 'h')
				.replace('(', 'i').replace(')', 'j').replace('-', 'k').replace('/', 'l').replace(':', 'm');
		System.out.println("Here is your decrypted message:");
		System.out.println(decryptString + "\n");
	} // switchDecryption method
	
	public static void jumbleDecryptionPhrase() {
		
		Scanner pw2 = new Scanner(System.in);
		System.out.println("Enter your password to recover your Jumbled Up entry:");
		String pwValidation = pw2.nextLine();
		
		if (pwValidation.equals(recoveryPass)) {
			System.out.println("System processing...");
			System.out.println("System processing...");
			System.out.println("Malware initiating...");
			System.out.println("Your de-Jumbled entry is: " + userInput + "\n");
			//System.out.println("Thank you for using the program, good bye.");
				//System.exit(0);
		} else {
			System.out.println("Your identity cannot be verified.\n");
			//System.out.println("Security features initialized. All data destroyed. Program terminated.");
			//System.exit(0);
		}
	} //jumbleDecryptionPhrase

	public static void ceaserDecryption() {
		
		System.out.println("Welcome to the Caesar Decrypter!");
		System.out.println();
		System.out.println("Enter the sentence that you would like to unscrammble:");
		System.out.println();
		Scanner sc9 = new Scanner(System.in);
		String nonDeCodedCaesarSentence = sc9.nextLine();
		System.out.println("What 'magic number' was provided with the message?");

		Scanner sc10 = new Scanner(System.in);
		int unShiftsToCaesar = sc10.nextInt();

		char[] caesarCharArrayToDeCrypt = nonDeCodedCaesarSentence.toCharArray();

		// Loop over characters.
		for (int i = 0; i < caesarCharArrayToDeCrypt.length; i++) {

			// Shift letter, moving back or forward 26 places if needed.
			char stillEncryptedLetter = caesarCharArrayToDeCrypt[i];
			if (stillEncryptedLetter != ' ') {
				stillEncryptedLetter = (char) (stillEncryptedLetter - unShiftsToCaesar);
				if (stillEncryptedLetter < 'a') {
					stillEncryptedLetter = (char) (stillEncryptedLetter + 26);
				}
			}
			caesarCharArrayToDeCrypt[i] = stillEncryptedLetter;
		}
		String caesarDecrypted = String.copyValueOf(caesarCharArrayToDeCrypt);
		System.out.println();
		System.out.println("Your decoded message is: ");
		System.out.println(caesarDecrypted + "\n");
	}

} // class