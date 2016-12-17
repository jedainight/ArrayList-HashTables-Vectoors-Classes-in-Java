import java.util.Scanner; 
 
public class MKD { 
   public static void main(String[] args) { 
       Scanner input = new Scanner(System.in); 
       int x, y, D, temp; 
       System.out.print("Eisagete dyo arithmous gia na  ypologisete ton MKD: "); 
       x = input.nextInt(); 
       y = input.nextInt(); 
       if (x > y) { 
           temp = x; 
           x = y; 
           y = temp; 
       } 
       D = x; 
       while ((x%D != 0) || (y%D != 0)) 
            D--; 
       System.out.println("Megistos Koinos Diairetis: " + D); 
   input.close(); 
   } 
} 