public class Car {
    String model; 
    String color; 
    boolean engineState; 
     
 
    Car(String m, String c) { 
    	model = m; 
        color = c; 
        engineState = false; 
    }    
 
    void startEngine() { 
        if (engineState == true) 
            System.out.println("The engine is already on."); 
        else { 
            engineState = true; 
            System.out.println("The engine is now on."); 
        } 
    } 
 
    void showAttributes() { 
        System.out.println("This car is a " + color + " " + model); 
        if (engineState == true) 
           System.out.println("The engine is on."); 
        else System.out.println("The engine is off."); 
    } 
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Car c = new Car("Opel Corsa", "yellow"); 
	       System.out.println("Calling showAttributes..."); 
	       c.showAttributes(); 
	       System.out.println("----------------"); 
	       System.out.println("Starting engine..."); 
	       c.startEngine(); 
	       System.out.println("----------------"); 
	       System.out.println("Calling showAttributes..."); 
	       c.showAttributes(); 
	       System.out.println("----------------"); 
	       System.out.println("Starting engine..."); 
	       c.startEngine(); 
	   } 	
}
