
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int samples[] = new int [20]; 
		    int sample; 
		     
		    // Αρχικοποίηση 
		     
		    for (int i=0; i<20; i++) 
		      samples[i]=0; 
		     
		    // Αποθήκευση τυχαίων αριθμών 
		     
		    for (int i=0; i<20; i++) { 
		      sample = (int) (Math.random()*100)+1; 
		      samples[i]=sample; 
		    } 
		     
		    // Εκτύπωση 
		     
		    for (int i=0; i<samples.length; i++) 
		      System.out.println(samples[i]); 

	}

}
