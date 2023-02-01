package klasser;

/**
 * Definerer en terning med 6 verdier
 * 
 * @author sivertsaeter
 *
 */

public class Terning {
	private Integer verdi = 0;
	private static final double MAX = 6;
	
	/**
	 * Triller terningen
	 */
	public void trill() {
		verdi = (int) ((Math.random() * MAX) + 1);
	}
	
	/**
	 * @return verdien
	 */
	public Integer getVerdi() {
		return verdi;
	}

}
