import java.util.Hashtable;
import java.util.Properties;
import java.lang.System;

public class HashTableTest { 
 
    public static void main(String[] args) { 
         
        Hashtable hashtable = new Hashtable(); 
        Properties prop = System.getProperties();
        System.out.println ("JVM Vendor : " + prop.getProperty("java.vendor") );
        System.out.println ("JVM Vendor : " + prop.getProperty("user.home") );
        System.out.println ("JVM Vendor : " + prop.getProperty("user.dir") );
        hashtable.put("Device 1", "iphone"); 
        hashtable.put("Device 2", "ipad"); 
        hashtable.put("Device 3", "Android"); 
        hashtable.put("Device 4", "BlackBerry"); 
       
  
        
        if (hashtable.containsKey("Device 1"))
        {
        	Object device = hashtable.get("Device 2"); 
        
        	System.out.println("Value for the given key ==> "+device); 
        
        }
    } 
} 