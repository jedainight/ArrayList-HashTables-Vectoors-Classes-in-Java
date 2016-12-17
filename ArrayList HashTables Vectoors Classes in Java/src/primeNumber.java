import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("----- Υπολογισμός Πρώτου -----");
		System.out.println("Δώσε τον αριθμό(με Enter):");
		int a= input.nextInt();
		boolean Prime=true;
	
		for(int i=2; i<=a/2; i++)
		{
			
	        if( a%i == 0)
	        {
	        	System.out.println("Δεν είναι πρώτος");
	        	Prime=false;
	        	break;
	        }        
		}
		if(Prime)
			System.out.println("Είναι πρώτος");
			
				

		input.close();
/*		Εξετάζουμε διαδοχικά όλους τους ακέραιους i < a
		Μόλις βρεθεί διαιρέτης του a σταματάμε και ο a δεν είναι πρώτος
		Αν εξαντληθούν οι i χωρίς να βρεθεί διαιρέτης, τότε ο a είναι πρώτος
		Βασιζόμενοι στην παρατήρηση ότι κανένας αριθμός a δεν έχει διαιρέτη μεγαλύτερο του i/2, 
		τροποποιούμε τον παραπάνω αλγόριθμο εξετάζοντας όλους τους αριθμούς i < a/2 
		*/
		
	}

}
