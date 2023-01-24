package no.hvl.dat109.klasse;

public class Brett {
	
	
	
	public static void main(String[] args) {
		
		int bredde = 10;
		
		int brett[][] = new int[bredde][bredde]; 
		
		int teller = 0;
	
		for(int i = 0; i < brett.length; i++) {
			for( int j = 0; j < brett.length; j++) {
				teller++;
				System.out.print("[" + teller + "]"+ " ");
			}
	
			System.out.println();
			
		}
	}
}