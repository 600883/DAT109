package no.hvl.dat109.klasse;

public class Spiller {
	
	private int id;
	private int rute = 0;
	
	Spiller spiller;
	
	Terning terning;
	
	/**
	 * Lager en tom konstruktør
	 */
	public Spiller() {
		
	}
	
	
	/*
	 *  Konstruktør for spilleobjekt med id som identifiserer hvilken brikke det er. int rute holder kontroll på hvor 
	 *  den er på brettet
	 */
	public Spiller(int id, int rute) {
		this.id = id;
		this.rute = rute;
	}
	
	
	
	/*
	 * setter en id på spiller objektet
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * returnerer id'en til objektet
	 */
	public int getId() {
		return id;
	}
	
	
	/*
	 * setter objektet til en rute
	 */
	public void setRute(int rute) {
		this.rute = rute;
	}
	
	
	/*
	 * return ruten til objektet
	 */
	public int getRute() {
		return rute;
	}
	
	
	
	/*
	 * flytter spilleren et hvis antall ruter. Henter først brikken sin rute den står på. Så kjører kastTerning() og returner
	 * getRute() + kastTerning()	
	 */
	public int flytt() {
		
		return spiller.getRute() + terning.kastTerning();
		
		//return rute += antOyne;
	}
	
	
	/*
	 * metoden setter spilleren tilbake til rute 0 hvis han får tre 6'ere på rad
	 */
	public int gaaTilbake() {
		
		int antOyne = 0;
		
		while(terning.kastTerning() == 6) {
			antOyne += 6;
			terning.kastTerning();
		} 
		
		if(antOyne == 18) {
			rute = 0;
		}
		return rute;
	}
}
