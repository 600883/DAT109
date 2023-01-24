package no.hvl.dat109.klasse;

import no.hvl.dat109.klasse.Spiller;


public class Terning {
	
	
	
	private int antOyne;
	
	
	/*
	 * metode for å kaste terning
	 */
	public int kastTerning() {
			
		antOyne = (int)(Math.random()* 6 + 1);
		
		return antOyne;
	}
}
