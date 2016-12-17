import java.util.ArrayList;
import java.util.Iterator;

public class ArrListTest {

	public static void main(String[] args) {
		 ArrayList <String> myFruits = new ArrayList <String>(); 
		 
		 ArrayList <Car> mycars = new ArrayList <Car>();
		 Car fiat = new Car("Fiat Brava", "Yellow"); 
		 	mycars.add(new Car("Opel Astra", "Black "));
		 	mycars.add(new Car("Opel Vectra", "Black "));
		 	mycars.add(1, fiat);
		 	//mycars.remove(fiat);
		 	//mycars.remove(2);
		    myFruits.add("apple"); 
		    myFruits.remove("apple"); 
		    myFruits.add("orange"); 
		    myFruits.add("pear"); 
		    myFruits.add(1,"apricot"); 
		    Iterator <Car> itr = mycars.iterator();
		    for (int i=0; i < myFruits.size(); i++) { 
		      String aFruit = myFruits.get(i); 
		      System.out.println(aFruit); 
		    } 
/*		    for (int i=0; i < mycars.size(); i++) { 
			      Car s = mycars.get(i); 
			      s.showAttributes(); 
			    } */
		     
		    while (itr.hasNext()) {  
		    	Car s = (Car) itr.next();  
		        s.showAttributes(); 
		    } 
		    

	}
}

