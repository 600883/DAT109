package no.hvl.dat109.klasse;

public class Spiller {
	
	private int id;
	private int rute = 0;
	
	public Spiller(int id, int rute) {
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setRute(int rute) {
		this.rute = rute;
	}
	
	public int getRute() {
		return rute;
	}
	
	public int flytt(int antOyne) {
		return rute += antOyne;
	}
	
	public int gaaTilbake(int antOyne) {
		
		if(antOyne == 18) {
			rute = 0;
		}
		return rute;
	}
}
