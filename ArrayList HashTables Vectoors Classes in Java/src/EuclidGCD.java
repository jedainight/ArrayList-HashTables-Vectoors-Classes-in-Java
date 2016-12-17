import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,z=0;
		System.out.println("----- Υπολογισμός ΜΚΔ -----");
		System.out.println("Δώσε τον πρώτο αριθμό(με Enter):");
		a= input.nextInt();
		System.out.println("Δώσε τον δεύτερο αριθμό(με Enter):");
		b= input.nextInt();
		z=a%b;
		while(z!=0)
		{
			a=b;
			b=z;
			z=a%b;
		}
		System.out.println("Ο ΜΚΔ είναι το: "+ b);
		input.close();
	}

}
