package no.hvl.dat109;

public class Spiller {
	
	private String navn;
	private String id;
	
	public Spiller(String navn, String id) {
		this.navn = navn;
		this.id = id;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
