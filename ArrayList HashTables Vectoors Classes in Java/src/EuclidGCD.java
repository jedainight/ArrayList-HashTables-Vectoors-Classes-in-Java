import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,z=0;
		System.out.println("----- ����������� ��� -----");
		System.out.println("���� ��� ����� ������(�� Enter):");
		a= input.nextInt();
		System.out.println("���� ��� ������� ������(�� Enter):");
		b= input.nextInt();
		z=a%b;
		while(z!=0)
		{
			a=b;
			b=z;
			z=a%b;
		}
		System.out.println("� ��� ����� ��: "+ b);
		input.close();
	}

}
