import java.util.Random;
class RandomTest {

public static void main (String args[]) {
	
int[] ndigits; // ������ 
ndigits = new int[10]; // ������� �����
double x;int n;

Random myRandom = new Random();
// ������������ ��� ������

for (int i = 0; i < 10; i++) 
{
	ndigits[i] = 0;
}

for (int i=0; i < 100000; i++) {
// ��������� ������� ������ ��� ������� 0-9
x = myRandom.nextDouble() * 10.0;
n = (int) x; //��������� ��� double �� int
ndigits[n]++;
}
for (int i = 0; i < 10; i++) {    
System.out.println(i+": " + ndigits[i]);
}
}
}