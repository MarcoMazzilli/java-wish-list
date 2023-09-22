package org.java.nextint;


public class Main {
	
	public static void main(String[] args) {
	
		
		int[]array = {2,4,6} ;
		
		Elenco e1 = new Elenco(array);
		
		while(e1.hasAncoraElementi()) {
			System.out.println(e1.getElementoSuccessivo());
		}
	
		
		
	}

}
