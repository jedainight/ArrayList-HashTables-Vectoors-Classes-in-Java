import java.util.Random;
class RandomTest {

public static void main (String args[]) {
	
int[] ndigits; // δήλωση 
ndigits = new int[10]; // δέσµευση χώρου
double x;int n;

Random myRandom = new Random();
// αρχικοποίηση του πίνακα

for (int i = 0; i < 10; i++) 
{
	ndigits[i] = 0;
}

for (int i=0; i < 100000; i++) {
// δηµιουργία τυχαίου αριθµού στο διάστηµα 0-9
x = myRandom.nextDouble() * 10.0;
n = (int) x; //µετατροπή του double σε int
ndigits[n]++;
}
for (int i = 0; i < 10; i++) {    
System.out.println(i+": " + ndigits[i]);
}
}
}