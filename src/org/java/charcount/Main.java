package org.java.charcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci una frase : ");
		
		String userInput = String.valueOf(sc.nextLine());
		
		Map<Character, Integer> charCounter = new HashMap<>();
		
		for (int x=0;x<userInput.length();x++) {
			
			char singleChar = userInput.charAt(x);
			
			if (charCounter.containsKey(singleChar)) {
				
				charCounter.put(singleChar, charCounter.get(singleChar) + 1);
			} else {
				
				charCounter.put(singleChar, 1);
			}
		}
		
		for (Character k : charCounter.keySet()) {
			
			Integer v = charCounter.get(k);
			
			System.out.println(k + " --> " + v);
		}
		
		
		System.out.println("Input utente : " + userInput);
		sc.close();
	}
}
