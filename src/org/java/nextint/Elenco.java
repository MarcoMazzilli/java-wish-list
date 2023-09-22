
package org.java.nextint;


public class Elenco {

	private int[] arrayInt;
	private int counter;
	
	
	public Elenco(int[] array) {
		
		setArrayInt(array);
		setCounter(-1);
		
	}
	
	
	public int getCounter() {
		return counter;
	}




	public void setCounter(int counter) {
		this.counter = counter;
	}




	public int[] getArrayInt() {
		return this.arrayInt;
	}


	public void setArrayInt(int[] array) {
		this.arrayInt = array;
	}
	
	
	public int getElementoSuccessivo() {
		
		counter++;
		
		return arrayInt[counter];
	}
	
	public boolean hasAncoraElementi() {
		
		return counter < (arrayInt.length - 1);
		
	}
	
	
	
	
}
