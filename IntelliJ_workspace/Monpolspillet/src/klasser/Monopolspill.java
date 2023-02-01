package klasser;

import java.util.ArrayList;

/**
 * Klasse som simulerer et monopolspill
 * 
 * @author sivertsaeter
 *
 */

public class Monopolspill {
	
	private Kopp kopp = new Kopp();
	private ArrayList<Spiller> spillere = new ArrayList<>();
	private Brett brett = new Brett();
	
	
	/**
	 * Starter monopolspillet
	 */
	public void spill() {
		for(int i = 0; i < 20; i++) {
			spillRunde();
		}
	}
	
	public void spillRunde() {
		for(Spiller spiller : spillere) {
			
			spiller.spillTrekk(kopp);
		}
	}

}
