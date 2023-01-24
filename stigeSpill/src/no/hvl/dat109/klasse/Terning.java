package no.hvl.dat109.klasse;

import no.hvl.dat109.klasse.Spiller;

public class Terning {
	
	Spiller spiller;
	
	private int antOyne;
	
	public int kastTerning() {
			
		antOyne = (int)(Math.random()* 6 + 1);
		
		return antOyne;
	}
}
