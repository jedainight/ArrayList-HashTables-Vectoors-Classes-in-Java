import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("----- ����������� ������ -----");
		System.out.println("���� ��� ������(�� Enter):");
		int a= input.nextInt();
		boolean Prime=true;
	
		for(int i=2; i<=a/2; i++)
		{
			
	        if( a%i == 0)
	        {
	        	System.out.println("��� ����� ������");
	        	Prime=false;
	        	break;
	        }        
		}
		if(Prime)
			System.out.println("����� ������");
			
				

		input.close();
/*		���������� ��������� ����� ���� ��������� i < a
		����� ������ ��������� ��� a ��������� ��� � a ��� ����� ������
		�� ����������� �� i ����� �� ������ ���������, ���� � a ����� ������
		����������� ���� ���������� ��� ������� ������� a ��� ���� �������� ���������� ��� i/2, 
		������������ ��� �������� ��������� ����������� ����� ���� �������� i < a/2 
		*/
		
	}

}
