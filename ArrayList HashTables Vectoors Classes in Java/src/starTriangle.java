import java.util.Scanner; 

public class starTriangle {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int x=0;
		
		System.out.println("----- ���������� �������� -----");
		System.out.println("���� �� ���� ��� ��������: ");
		x=input.nextInt();
		for (int i=0; i<x; i++)
		{
			   for (int j=0;j<=i;j++)  
			     {
				   System.out.print("*");
			     }
			   System.out.println();
				
		}
		System.out.println("----- ���� ������������ ;) -----");
		input.close();
	}
}
