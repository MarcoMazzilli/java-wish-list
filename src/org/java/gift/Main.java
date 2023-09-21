package org.java.gift;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Regalo> arrayList  = new ArrayList<>();
		
		int feedback = 1;
		
		while(feedback != 0) {
			
			System.out.println("Vuoi inserire un regalo? SI[1] / NO[0] \n");
			
			feedback = Integer.valueOf(sc.nextLine());
			
			
			if(feedback == 1) {
				System.out.println("Inserisci il nome del regalo");
				
				String nome = String.valueOf(sc.nextLine());
				
				arrayList.add(new Regalo(nome));
				
				System.out.println("Tot. Regali inseriti: " + arrayList.size() + "\n") ;
			}else if(feedback == 0) {
				
				System.out.println("Affrettati a comprare i regali !!");
				
			}else {
				System.out.println("Digitare 1/0");
			}
			
			sc.close();
			
		}
	}
	
}
