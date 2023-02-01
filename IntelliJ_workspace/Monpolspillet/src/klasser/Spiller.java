package klasser;

/**
 * Definerer en spiller i spillet
 * 
 * 	@author Sivert Sæter
 */



public class Spiller {
	
	private String navn;
	private Brikke brikke = new Brikke();
	private Brett brett;
	
	
	/**
	 * spille ett trekk med en spiller
	 * 
	 * @param kopp
	 */
	public void spillTrekk(Kopp kopp) {
		kopp.trill();
		Integer sum = kopp.getSum();
		Rute rute = brikke.getRute();
		rute = brett.flytt(rute, sum);
		brikke.setRute(rute);
	}
	

	
	
}
