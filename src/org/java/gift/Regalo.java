package org.java.gift;

public class Regalo {
	
	private String nomeRegalo;
	
	public Regalo(String regalo){
		
		setNomeRegalo(regalo);
	}

	public String getNomeRegalo() {
		return nomeRegalo;
	}

	public void setNomeRegalo(String nomeRegalo) {
		this.nomeRegalo = nomeRegalo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNomeRegalo();
	}
	

}
